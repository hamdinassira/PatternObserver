package com.pattern.observer;
/***
 * @author Hamdi Nassira
 */

public class Main {
	
    public static void main(String[] args) {
    	CelebriteImp c1=new CelebriteImp();
    	Abonnee a1=new AbonneeImp1();
    	AbonneeImp2 a2=new AbonneeImp2();
	    c1.addFolowers(a1);
	    c1.setState(30);
	    c1.removeFolowers(a1);
    	System.out.println("*****************************");    
	    c1.addFolowers(a2);
	    c1.setState(55); 
	    System.out.println("*****************************");
	    c1.addFolowers(a1);
	    c1.setState(83);
    }
}
