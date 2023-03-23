package task3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("ivan");
        Cat cat = new Cat("Кнопка", "черная");

        System.out.print("Ivan ");
        person.voice();
        cat.fawn();
        System.out.print("Ivan ");
        person.giveFood();
        System.out.print("Кнопка ");
        cat.eat();
        cat.voice();
        
    }
}

