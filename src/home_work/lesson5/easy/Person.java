package home_work.lesson5.easy;

public class Person {

    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void move() {
        System.out.printf("%s ходит\n", fullName);
    }

    void talk() {
        System.out.printf("%s, %d лет, говорит\n", fullName, age);
    }
}
