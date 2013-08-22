package ru.tsu.csd;

public class Client {
	public static void main(String[] args) {
		Context c = new Context();
		c.setAccountant(new MulAccountant());
		c.execute(12, 25);
	}
}

interface Accountant {
	public void count(int a, int b);
}

class SumAccountant implements Accountant {
	public void count(int a, int b) {
		System.out.println(a + b + a + b + " reslut is taken by sums");
	}
}

class MulAccountant implements Accountant {
	public void count(int a, int b) {
		System.out.println(a*2 + b*2 + " result is taken by muls");
	}
}

class Context {
	Accountant a;
	
	public void setAccountant(Accountant acc) {
		a = acc;
	}
	
	public void execute(int b, int c) {
		a.count(b, c);
	}
}