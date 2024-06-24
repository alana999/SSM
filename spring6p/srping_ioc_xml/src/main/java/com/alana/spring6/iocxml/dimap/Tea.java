package com.alana.spring6.iocxml.dimap;

public class Tea {
    private String tid;
    private String tname;

    public Tea() {
    }

    public Tea(String tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    /**
     * 获取
     * @return tid
     */
    public String getTid() {
        return tid;
    }

    /**
     * 设置
     * @param tid
     */
    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * 获取
     * @return tname
     */
    public String getTname() {
        return tname;
    }

    /**
     * 设置
     * @param tname
     */
    public void setTname(String tname) {
        this.tname = tname;
    }

    public String toString() {
        return "Tea{tid = " + tid + ", tname = " + tname + "}";
    }
}
