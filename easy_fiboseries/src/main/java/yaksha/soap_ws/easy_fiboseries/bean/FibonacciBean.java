package yaksha.soap_ws.easy_fiboseries.bean;

public class FibonacciBean {
	private int serialNumber;
	private int fibonacciNumber;
	public FibonacciBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FibonacciBean(int serialNumber, int fibonacciNumber) {
		super();
		this.serialNumber = serialNumber;
		this.fibonacciNumber = fibonacciNumber;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getFibonacciNumber() {
		return fibonacciNumber;
	}
	public void setFibonacciNumber(int fibonacciNumber) {
		this.fibonacciNumber = fibonacciNumber;
	}
	@Override
	public String toString() {
		return "FibonacciBean [serialNumber=" + serialNumber + ", fibonacciNumber=" + fibonacciNumber + "]";
	}
	

}
