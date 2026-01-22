package Observer;

import java.util.ArrayList;

/**
 * Dad is another concrete Observer.
 */
public class Dad extends Observer {

    public Dad(ArrayList<Baby> babies) {
        super(babies);
    }

    @Override
    public void update(Cry cry, Baby baby) {

        if (cry == Cry.ANGRY) {
            System.out.println("Dad plays with " + baby.getName());
            baby.receiveLove();

        } else if (cry == Cry.HUNGRY) {
            System.out.println("Dad waits...");

        } else if (cry == Cry.WET) {
            System.out.println("Dad calls Mom");
        }
    }
}
