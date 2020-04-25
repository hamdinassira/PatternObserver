package com.pattern.observer;
/***
 * @author Hamdi Nassira
 */

import java.util.ArrayList;

public class CelebriteImp implements Celibrite{
	int state;
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyFolowers();
	}

	 ArrayList<Abonnee> abonnees=new ArrayList<>();

	public void addFolowers(Abonnee a) {
		abonnees.add(a);
		
	}

	@Override
	public void removeFolowers(Abonnee a) {
		// TODO Auto-generated method stub
		abonnees.remove(a);
	}

	@Override
	public void notifyFolowers() {
		// TODO Auto-generated method stub
		for(Abonnee a:abonnees) {
			a.update(this);
		}
		System.out.println("on a maintenant "+state+" abonnee");
	}

}
