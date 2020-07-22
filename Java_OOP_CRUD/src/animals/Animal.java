package animals;

public class Animal {
    public String name;
    public String color;
    public int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal() {}

    public void go() {
        System.out.println(name + " goes to ....");
    }
    public void sound() {}
}
