package com.random.practice;

public class HashCodeAndEquals {

	String c = "Tripti";

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	private String name;

	public HashCodeAndEquals(String s) {
		this.name = s;
	}

	public void setName(String s) {
		this.name = s;
	}

	private void test(final HashCodeAndEquals n) {
		n.setName("test");
	}

	public static void method(Object o) {
		System.out.println("object: ");
		System.out.println((String)o);
	}

	public static void method(String o) {
		System.out.println("string: ");
		System.out.println(o);
	}

	public static void main(String[] args) {
		
		method("hello");
		String c = "Tripti";
		String a = c;
		String b = new String("Tripti");

//		System.out.println(a.equals(b));
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());

	}

}

class A{
	public static void method(Object o) {
		System.out.println("object: ");
		System.out.println((String)o);
	}

	
}

class B extends A{
	public static void method(String o) {
		System.out.println("string: ");
		System.out.println(o);
	}
}
