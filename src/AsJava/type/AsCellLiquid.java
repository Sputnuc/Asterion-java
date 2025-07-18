package AsJava.type;

import arc.graphics.Color;
import AsJava.world.meta.AsterionStat;
import mindustry.type.CellLiquid;
import mindustry.world.meta.Stat;

public class AsCellLiquid extends CellLiquid {
    /** Radioactivity but for liquid :3 */
    public float radioactivity = 0f;
    /** New stat. Planning to use it with new game mechanic. Old idea by Lethal Employe, stolen from Snaer :P */
    public float aggressiveness = 0f;

    public AsCellLiquid(String name){
        this(name, new Color(Color.black));
    }

    public AsCellLiquid(String name, Color color) {
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
