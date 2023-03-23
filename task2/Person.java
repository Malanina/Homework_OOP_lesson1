package task2;

public class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

   
    public void openDoor() {
        System.out.println("Открывает дверь");
    }

    public void closeDoor() {
        System.out.println("Закрывает дверь");
    }


}
