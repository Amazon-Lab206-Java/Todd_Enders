import java.util.ArrayList;

public class DemoArrayTest{
    public static void main(String[] args){
        DemoArray da = new DemoArray();
        int[] testArr = {1,2,3};
        da.itArr(testArr);
        ArrayList<Integer> testArr2 = new ArrayList<Integer>();
        testArr2.add(1);
        testArr2.add(2);
        testArr2.add(3);
        da.itArr(testArr2);
    }
}