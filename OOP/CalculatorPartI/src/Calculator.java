import java.io.Serializable;
public class Calculator implements java.io.Serializable {
	private double operand1;
	private double operand2;
	private String operation;
	private double results;
	
	public Calculator() {
		results = 0;
	}
	
	public void performOperation() {
		switch (operation) {
			case "+":
				results = getOperand1() + getOperand2();
				break;
			case "-":
				results = getOperand1() - getOperand2();
				break;
			default:
				results = 0;
				break;
		}
	}
	
	public double getResults() {
		return results;
	}
	
	public double getOperand1() {
		return operand1;
	}

	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}

	public double getOperand2() {
		return operand2;
	}

	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
}
