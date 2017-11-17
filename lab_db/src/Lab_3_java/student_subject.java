package Lab_3_java;

import java.util.ArrayList;
import java.util.List;

public class student_subject {

    private int stud_id;
    private int subj_id;

    public static List<student_subject> student_subjects = new ArrayList<>();

    public student_subject() { }

    public student_subject(int St_id, int Sub_id) {
        this.stud_id = St_id;
        this.subj_id = Sub_id;
    }

    public void setSubj_id(int id) {
        this.subj_id = id;
    }

    public int getSubId() {
        return subj_id;
    }

    public void setStud_id(int id) {
        this.stud_id = id;
    }

    public int getStud_Id() {
        return stud_id;
    }
}


