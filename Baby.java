package Observer;

import java.util.ArrayList;
import java.util.Random;

/* baby.java follows the subject rules, 
baby name is private so only baby knows it and cna 
change it. list observers (mom and dad). 
implements random generation to sim random behaviors (crying etc)*/

public class Baby implements Subject {

    private String name;
    private ArrayList<Observer> observers; // A list of observers or people (Mom/Dad) watching the baby or subject
	private Random rand;
    

/* Baby Contrsuctor, sets baby's name, creates new array 
list for observers, and inits randomness */

    public Baby(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
        this.rand = new Random();
    }
    public String getName() { 
        return name;
    }
    public void receiveLove() {
        System.out.println(name + " is recieving love and is happy!!!");
    }
    public void eat() {
        System.out.println(name + "is eating.");
    }
    public void getChanged() {
         System.out.println(name + "is getting a diaper change.");
    }
     /* baby following rubes from subject */
    
    @Override
    public void registerObserver(Observer observer) { 
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
    }
    @Override
	public void notifyObservers(Cry cry) {
		for(Observer observer : observers) {
			observer.update(cry, this); 
        }
    }
    /* crying methods triggers notifcations for observers. angry, hugnry, wet */
    public void angryCry() {
        System.out.println( name + " is ANGRY!");
        notifyObservers(Cry.ANGRY);
    }
     public void hungryCry() {
        System.out.println( name + " is HUNGRY!");
        notifyObservers(Cry.HUNGRY);
    }

     public void wetCry() {
        System.out.println( name + " is WET!");
        notifyObservers(Cry.WET);
    }
}



    


