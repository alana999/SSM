package com.alana.spring6.iocxml.di2;

import java.util.Arrays;

public class Emp {
    private Dept dept;
    private String ename;
    private int age;

    private String[] loves;

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public Emp() {
    }

    public Emp(Dept dept, String ename, int age) {
        this.dept = dept;
        this.ename = ename;
        this.age = age;
    }

    public void work(){
        System.out.println(ename+"emp work"+age);
        dept.info();
        System.out.println(Arrays.toString(loves));
    }

    /**
     * 获取
     * @return dept
     */
    public Dept getDept() {
        return dept;
    }

    /**
     * 设置
     * @param dept
     */
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    /**
     * 获取
     * @return ename
     */
    public String getEname() {
        return ename;
    }

    /**
     * 设置
     * @param ename
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Emp{dept = " + dept + ", ename = " + ename + ", age = " + age + "}";
    }
}
