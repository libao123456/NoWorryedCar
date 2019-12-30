package entity;

public class User {
     private   int uid;
    private  String uname;
    private  String upwd;
    private  int age;
    private  int IDcard;
    private  String photo;
    private  String phonenumber;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIDcard() {
        return IDcard;
    }

    public void setIDcard(int IDcard) {
        this.IDcard = IDcard;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", age=" + age +
                ", IDcard=" + IDcard +
                ", photo='" + photo + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
