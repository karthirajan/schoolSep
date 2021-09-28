package org.secondfloor;

public class tenthstandard extends NinthStandard{
	
	
	@Override
	public void tester(String name) {
		
		System.out.println("additional logics");
		super.tester(name);
		
	}
	
	public static void main(String[] args) {
		tenthstandard t = new tenthstandard();
		t.tester("karthi");
	}
	
}
