package com.pattern.observer;
/***
 * @author Hamdi Nassira
 */

public class AbonneeImp2 implements Abonnee{

	@Override
	public void update(Celibrite c) {
		// TODO Auto-generated method stub
		System.out.println("*******AbonneeImp2****");
		int state1=((CelebriteImp)c).getState();
		System.out.println("Binevenue vous etes l'abonne n° :"+state1);
		
	}

}
