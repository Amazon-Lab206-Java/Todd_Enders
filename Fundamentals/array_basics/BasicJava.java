import java.util.ArrayList;
public class BasicJava {
    public void print1to255(){
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    public void printOdds(){
        for (int i = 1; i <= 255; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    public void printSum(){
        int sum = 0;
        for (int i = 0; i <= 255; i++){
            sum+=i;
            System.out.println(String.format("New number: %d Sum: %d", i, sum));
        }
    }

    public void iterateArray(int[] nums){
        for (int num : nums){
            System.out.println(num);
        }
    }

    public void findMax(int[] nums){
        int max = nums[0];
        for (int num: nums){
            if (num > max){
                max = num;
            }
        }
        System.out.println(max);
    }

    public void getAverage(int[] nums){
        int sum = 0;
        for (int num: nums){
            sum += num;
        }
        System.out.println(sum/nums.length);
    }

    public ArrayList<Integer> oddArray(){
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i+=2){
            odds.add(i);
        }
        return odds;
    }

    public int greaterThanY(int[] nums, int y){
        int count = 0;
        for (int num: nums){
            if (num > y){
                count++;
            }
        }
        return count;
    }

    public void squareValues(int[] nums){
        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
            System.out.println(nums[i]);
        }
    }

    public void noNegatives(int[] nums){
        for (int num: nums){
            if (num < 0){
                num = 0;
            }
        }
        System.out.println(nums);
    }

    public double[] minMaxAvg(int[] nums){
        int sum = 0;
        int max = nums[0];
        int min = nums[0];
        for (int num: nums){
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
            sum += num;
        }
        double[] results = {max, min, (sum/nums.length)};
        return results;
    }

    public void shiftArray(int[] nums){
        for (int i = 0; i < nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = 0;
        System.out.println(nums);
    }
}