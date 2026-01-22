package Observer;

import java.util.ArrayList;

public class Mom extends Observer {

 public Mom(ArrayList<Baby> babies) {
        super(babies);
    }
}
    @Override
    public void update(Cry, cry Baby baby){
        if (cry == Cry.ANGRY) {
            baby.receiveLove();
        } else if (cry == Cry.HUNGRY) {
            baby.eat();
        } else if (ry == Cry.WET){
            baby.getChanged();
        }      
    }
}
    
