package Lab_3_java;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String name;
    private int id;
    private int teach_id;

    public static List<Subject> subjects = new ArrayList<>();

    public Subject() { }

    public Subject(int id, String Name, int teach_id) {
        this.id = id;
        this.name = Name;
        this.teach_id = teach_id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getTeach_id() {
        return teach_id;
    }

    public void setTeach_id(int id) {
        this.teach_id = teach_id;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getName() {
        return name;
    }
}
