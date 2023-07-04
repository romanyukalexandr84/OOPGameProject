package units;

import java.util.ArrayList;

public interface Actions {
    void step(ArrayList<BasicHero> enemies);

    String getInfo();
}
