public class ProjectTest {
    public static void main(String[] args){
        Project pj1 = new Project("Django", "Framework of mystification");
        Project pj2 = new Project("Spring");
        Project pj3 = new Project();
        System.out.println(pj1.elevatorPitch());
        System.out.println(pj2.elevatorPitch());
        System.out.println(pj3.elevatorPitch());
        pj1.setName("Da Funk");
        pj2.setName("Summer");
        pj3.setName("Not Default");
        System.out.println(pj1.getName());
        System.out.println(pj2.getName());
        System.out.println(pj3.getName());
        pj1.setDescription("Daft Punk is playing at my house, my house.");
        pj2.setDescription("Summer breeze, makes me feel fine");
        pj3.setDescription("There once was a man from Nantucket");
        System.out.println(pj1.getDescription());
        System.out.println(pj2.getDescription());
        System.out.println(pj3.getDescription());
    }
}