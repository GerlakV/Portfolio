package animals;

import java.util.Objects;

public class Cat extends Animal {
    public String game;

    public Cat(String name, int age, String color, String game) {
        super(name, color, age);
        this.game = game;
    }
    public Cat(String newName, int age, String newColor) {
        super(newName, newColor, age);
    }
    public Cat(Cat cat) {
        super(cat.name, cat.color, cat.age);
    }
    public Cat() {}
    @Override
    public void sound() {
        System.out.println("meow");
    }
    public void aaa(String a, int b) {}
    public void aaa(int b, String a) {}
    public void eat(String food) {
        System.out.println("Cat " + name + " eats " + food);
    }
    public void eat(String food, String food2) {
        System.out.println("Cat " + name + " eats " + food + " and " + food2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}
