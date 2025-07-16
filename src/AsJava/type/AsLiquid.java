package AsJava.type;

import AsJava.AsterionStat;
import arc.graphics.Color;
import mindustry.type.Liquid;
import mindustry.world.meta.Stat;

public class AsLiquid extends Liquid{
    /** Radioactivity but for liquid :3 */
    public float radioactivity = 0f;
    /** New stat. Planning to use it with new game mechanic. Old idea by Lethal Employe, stolen from Snaer :P */
    public float aggressiveness = 0f;

    public AsLiquid(String name){
        this(name, new Color(Color.black));
    }

    public AsLiquid(String name, Color color) {
        super(name, color);
    }

    @Override
    public void setStats(){
        //** Just adding all vanilla stats... */
        super.setStats();
        stats.addPercent(AsterionStat.aggressiveness, aggressiveness);
        stats.addPercent(Stat.radioactivity, radioactivity);
    }
    }
