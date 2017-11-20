public class BasicTest {
    public static void main(String[] args){
        BasicJava bjava = new BasicJava();
        bjava.print1to255();
        bjava.printOdds();
        bjava.printSum();
        int[] numList = {1,2,3,4,5};
        bjava.iterateArray(numList);
        bjava.findMax(numList);
        bjava.getAverage(numList);
        System.out.println(bjava.oddArray());
        System.out.println(bjava.greaterThanY(numList, 2));
        bjava.squareValues(numList);
        int[] numListNegatives = {-1,3,-5};
        bjava.noNegatives(numListNegatives);
        System.out.println(bjava.minMaxAvg(numList));
        bjava.shiftArray(numList);
    }
}