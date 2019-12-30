package entity;

public class Driver {
    private int did;
    private String d_name;
    private String d_pwd;
    private int d_idnumber;
    private int d_phonenumber;
    private String d_licence;
    private String d_photo;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_pwd() {
        return d_pwd;
    }

    public void setD_pwd(String d_pwd) {
        this.d_pwd = d_pwd;
    }

    public int getD_idnumber() {
        return d_idnumber;
    }

    public void setD_idnumber(int d_idnumber) {
        this.d_idnumber = d_idnumber;
    }

    public int getD_phonenumber() {
        return d_phonenumber;
    }

    public void setD_phonenumber(int d_phonenumber) {
        this.d_phonenumber = d_phonenumber;
    }

    public String getD_licence() {
        return d_licence;
    }

    public void setD_licence(String d_licence) {
        this.d_licence = d_licence;
    }

    public String getD_photo() {
        return d_photo;
    }

    public void setD_photo(String d_photo) {
        this.d_photo = d_photo;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "did=" + did +
                ", d_name='" + d_name + '\'' +
                ", d_pwd='" + d_pwd + '\'' +
                ", d_idnumber=" + d_idnumber +
                ", d_phonenumber=" + d_phonenumber +
                ", d_licence='" + d_licence + '\'' +
                ", d_photo='" + d_photo + '\'' +
                '}';
    }
}
