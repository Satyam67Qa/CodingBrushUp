package Projectschool;

public class Student {

    String name;
    int rollNo;

    int[] marks;

   Teacher classTeacher;

     Student(String name, int rollNo, int[] marks, Teacher classTeacher){
         this.name= name;
         this.rollNo=rollNo;
         this.marks=marks;
         this.classTeacher=classTeacher;

     }
   public void getStudentInfo(){
       System.out.println("student Name is:" +name+ " roll No is:" +rollNo);
       System.out.println("totalMarks are :" +getTotalMarks()+ " classTeacher name  is:" +classTeacher.name);

   }
public  int getTotalMarks(){

       int totalMarks= 0;
       for (int i : marks){
           totalMarks=totalMarks+i;
       }
       return totalMarks;
}













}
