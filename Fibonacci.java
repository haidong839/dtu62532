package dtu62532;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci ff = new Fibonacci();
		System.out.print(ff.getFibonacci(10));
	}
	
	public int getFibonacci(int i) {
		if(i == 0) return 0;
		if(i == 1) return 1;
		return getFibonacci(i-2) + getFibonacci(i-1);
	}

}
