package edu.esprit.ci.demo;

public class Calculator {
	
	public int add( int... params){
		
		int s = 0;
		for(int param:params){
			
			s += param;
		}
		
		return s;
		
	}
	

}
