package Projectschool;

public class School {
    public static void main(String[] args) {


        Teacher t1= new Teacher("urmila","maths");
        Teacher t2= new Teacher("Jptiwari","english");

        Student s1 = new Student("ram",101,new int[]{10,2,4,5},t1);
        Student s2 = new Student("sam",102,new int[]{10,5,4,6},t2);
        Student s3=new Student("rohan",103,new int[]{10,7,4,5},t2);
        Student s4= new Student("rahim",104,new int[]{15,2,4,0},t1);

        t1.getTeacherInfo();
        t2.getTeacherInfo();

        s1.getStudentInfo();
        s2.getStudentInfo();
        s3.getStudentInfo();
        s4.getStudentInfo();
    }
}
