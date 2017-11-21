public class PersonTest {
    public static void main(String[] args){
        Person felix = new Person("Felix", 23, 2.0);
        System.out.println(felix.getName());
        felix.setName("JanMichaelVincent");
        System.out.println(felix.getName());
    }
}