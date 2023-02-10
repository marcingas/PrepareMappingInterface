package dev.marcin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Dom kultury", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Boisko miejskie", UsageType.SPORTS));

        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));

        for (var m : mappables){
            Mappable.mapIt(m);
        }
    }
}