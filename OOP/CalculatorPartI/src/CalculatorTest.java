
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOperand1(5);
		c.setOperand2(4);
		c.setOperation("+");
		c.performOperation();
		System.out.println(c.getResults());
	}

}
