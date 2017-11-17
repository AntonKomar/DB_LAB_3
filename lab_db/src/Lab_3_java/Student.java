package Lab_3_java;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String sName;
    private int id;
    private int fac_id;

    public static List<Student> students = new ArrayList<>();

    public Student() { }

    public Student(int id, String Name, String SName, int fac_id) {
        this.id = id;
        this.name = Name;
        this.sName = SName;
        this.fac_id = fac_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFac_id(int f){
        this.fac_id = f;
    }

    public int getFac_id(){
        return fac_id;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getName() {
        return name;
    }

    public void setSName(String SName) {
        this.sName = SName;
    }

    public String getSName() {
        return sName;
    }
}

