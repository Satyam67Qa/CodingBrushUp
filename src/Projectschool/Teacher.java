package Projectschool;

public class Teacher {

    String name;

    String subject;


    Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }

    public  void getTeacherInfo(){
        System.out.println("teacherName is:" +name+ " subjectName is:" +subject);



    }


}
