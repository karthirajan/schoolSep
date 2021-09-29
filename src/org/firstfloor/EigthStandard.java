package org.firstfloor;

public class EigthStandard {

	public void infantLeo(){
		
		System.out.println("Hi This is Leo");
		
	}
	
	
	public void satyan(){
		
		System.out.println("Hi This is satyan");
		
	}
	
	
	
	 void defa(){
		 System.out.println("default");
		
	}
	 
	private void restricted(){
		System.out.println("private");
	}
	
	
	public static void main(String[] args){
		
		EigthStandard a = new EigthStandard();
		a.infantLeo();
		a.satyan();
		a.restricted();
		
	}
	
}



