package task2;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("ivan");
        Cupboard cupboard = new Cupboard("шкаф двустворчатый Куба", "орех");

        System.out.println(person.toString());
        person.openDoor();
        cupboard.openDoor();
        person.closeDoor();
        cupboard.closeDoor();
    }
}
