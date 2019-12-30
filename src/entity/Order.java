package entity;

import java.util.Date;

public class Order {
    private  int oid;
    private int o_did;
    private  int o_uid;
    private  String start_location;
    private  String end_location;
    private Date start_time;
    private  Date end_time;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getO_did() {
        return o_did;
    }

    public void setO_did(int o_did) {
        this.o_did = o_did;
    }

    public int getO_uid() {
        return o_uid;
    }

    public void setO_uid(int o_uid) {
        this.o_uid = o_uid;
    }

    public String getStart_location() {
        return start_location;
    }

    public void setStart_location(String start_location) {
        this.start_location = start_location;
    }

    public String getEnd_location() {
        return end_location;
    }

    public void setEnd_location(String end_location) {
        this.end_location = end_location;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", o_did=" + o_did +
                ", o_uid=" + o_uid +
                ", start_location='" + start_location + '\'' +
                ", end_location='" + end_location + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                '}';
    }
}
