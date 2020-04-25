package com.pattern.observer;
/***
 * @author Hamdi Nassira
 */

public class AbonneeImp1 implements Abonnee{

	@Override
	public void update(Celibrite c) {
		// TODO Auto-generated method stub
		System.out.println("*******AbonneeImp1****");
		int state=((CelebriteImp)c).getState();
		System.out.println("On a une nouvelle mise a jour pour vous: "+state);
		
	}

}
