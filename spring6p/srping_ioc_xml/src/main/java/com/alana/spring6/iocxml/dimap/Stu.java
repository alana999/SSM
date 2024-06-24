package com.alana.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

public class Stu {
    private String sid;
    private String sname;

    private Map<String,Tea> teaMap;

    private List<Lesson> lessonList;

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public Map<String, Tea> getTeaMap() {
        return teaMap;
    }

    public void setTeaMap(Map<String, Tea> teaMap) {
        this.teaMap = teaMap;
    }

    public Stu() {
    }

    public Stu(String sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    /**
     * 获取
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * 设置
     * @param sid
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * 获取
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    public String toString() {
        return "Stu{sid = " + sid + ", sname = " + sname + "}";
    }

    public void run(){
        System.out.println("studentID:"+sid+"student name:"+sname);
        System.out.println(teaMap);
        System.out.println(lessonList);
   }
}
