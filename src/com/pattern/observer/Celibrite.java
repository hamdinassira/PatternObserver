package com.pattern.observer;
/***
 * @author Hamdi Nassira
 */

public interface Celibrite {
	public void addFolowers(Abonnee a);
	public void removeFolowers(Abonnee a);
	public void notifyFolowers();

}
