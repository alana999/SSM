package com.alana.spring6.iocxml.di2;

import java.util.List;

public class Dept {
    private String dname;
    private List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public Dept() {
    }

    public Dept(String dname) {
        this.dname = dname;
    }

    public void info(){
        System.out.println("deptmentname:"+dname);
        for(Emp  emp    : empList){
            System.out.println(emp.getEname());
        }
    }

    /**
     * 获取
     * @return dname
     */
    public String getDname() {
        return dname;
    }

    /**
     * 设置
     * @param dname
     */
    public void setDname(String dname) {
        this.dname = dname;
    }

    public String toString() {
        return "Dept{dname = " + dname + "}";
    }
}
