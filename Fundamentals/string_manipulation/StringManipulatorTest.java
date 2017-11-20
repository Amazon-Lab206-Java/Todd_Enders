public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator sm = new StringManipulator();
        System.out.println(sm.trimAndConcat("  Hello   ", "    Dawg Fans   "));
        System.out.println(sm.getIndexOrNull("Coding", 'g'));
        System.out.println(sm.getIndexOrNull("Coding", 'x'));
        System.out.println(sm.getIndexOrNull("Coding", "ding"));
        System.out.println(sm.getIndexOrNull("Coding", "go"));
        System.out.println(sm.concatSubstring("Coding", 1, 3, "djob"));
    }
}