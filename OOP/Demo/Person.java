public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String your_name, int your_age, double your_height){
        name = your_name;
        age = your_age;
        height = your_height;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}