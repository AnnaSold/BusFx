package anna.busfx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Briudge {
    int height;

    public Briudge(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public boolean calculate(List<Briudge> heightBridges){
        boolean safe = true;
        for (Briudge b: heightBridges) {
            int height1 = 437;

            if (height1 >= b.height) {
                safe = false;
                System.out.println("Crush");
                break;
            }
            if (height1 < b.height) {
                continue;
            }
        }
        if (safe == true)    //if (safe) или если наоборот нужно значение - if(!crashed)

            System.out.println("No crush");

    if (safe == true) return true;
    else  return false;
}
}
