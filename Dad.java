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

        int choice = rand.nextInt(3);

        if (choice == 0) {
            System.out.println("Dad plays with nudges mom to help with " + baby.getName() + ".");

        } else if (choice == 1) {
            System.out.println("Dad yells for mom... to help with " + baby.getName() + ".");

        } else {
            System.out.println("Dad screams in frustration!");
        }
    }
}
