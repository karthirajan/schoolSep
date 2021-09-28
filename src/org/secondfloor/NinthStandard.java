package org.secondfloor;

import org.firstfloor.EigthStandard;
import org.firstfloor.EigthStandardB;

public class NinthStandard extends EigthStandard{
	
	
	public void tester() {
		System.out.println("tester");

	}
	
	public void tester(String name) {
       
		System.out.println("student name is :"+name);

	}
	
	public  void tester(int mail) {
	       
		System.out.println("student id is :"+mail);

	}
	
	public void tester(String mail,long phno) {
	       
		System.out.println("student mail is :"+mail);
		System.out.println("student phno is :"+phno);

	}
	
	public static void main(String[] args) {
		
		NinthStandard n = new NinthStandard();
		n.tester("karthi");
		n.tester(3334244);
		n.tester("fhgfg@hdmb", 53534343435l);
		
	}

}
