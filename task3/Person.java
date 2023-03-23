package task3;

public class Person {
    
    private String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void voice() {
        System.out.println("Позвал кошку: кис кис");
    }


    public void giveFood() {
        System.out.println("Положил еду кошки в миску");
    }
}
