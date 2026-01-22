package Observer;

import java.util.Random;
import java.util.ArrayList;


public abstract class Observer {
    protected Random rand;

    public Observer(ArrayList<Baby> babies) {
        this.rand = new Random();
      
    
    for (Baby baby : babies) {
            baby.registerObserver(this); 
        }
    }   
    public abstract void update(Cry cry, Baby baby);
}

