package AsJava.world.meta;

import mindustry.world.meta.Stat;
import mindustry.world.meta.StatCat;

public class AsterionStat {
    public static final Stat
            /** Just stats. What should I say? */
            aggressiveness = new Stat("aggressiveness"),
            steadiness = new Stat("steadiness"),
            faction = new Stat("faction", StatCat.general);
}