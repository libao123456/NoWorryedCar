package dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
    static Connection con=null;
    PreparedStatement ps=null;
   static ComboPooledDataSource dataSource=new ComboPooledDataSource("c3p0-config.xml");
    static {
        try {
            con=dataSource.getConnection();
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet query(String sql,Object...prams){
        ResultSet rs=null;
        try {
            ps=con.prepareStatement(sql);
            for(int i=0;i<prams.length;i++){
                ps.setObject(i+1,prams[i]);
            }
            rs=ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }
    public int update(String sql,Object...prams){
        int rs=0;
        try {
            ps=con.prepareStatement(sql);
            for (int i=0;i<prams.length;i++){
                ps.setObject(i+1,prams[i]);
            }
            rs=ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
