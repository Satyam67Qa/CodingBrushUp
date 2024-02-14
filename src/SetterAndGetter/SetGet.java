package SetterAndGetter;

public class SetGet {
    int age;

    public static void main(String[] args) {
        SetGet sg= new SetGet();
        sg.setAge(30);
        System.out.println(sg.getAge());

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
