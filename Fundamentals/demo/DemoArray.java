import java.util.ArrayList;
public class DemoArray {
    public void itArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void itArr(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        for (Integer num : arr){
            System.out.println(num);
        }
    }
}