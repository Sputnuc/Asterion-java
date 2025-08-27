package AsJava.content;

import AsJava.type.AsCellLiquid;
import AsJava.type.AsLiquid;
import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.type.Liquid;
//import mindustry.type.Liquid;

public class AsLiquids {
    public static Liquid
    /* liquids */
    endomine, oxylene, kryoline, ghetron,

    /* Gases*/
    zion, methane, verdyne;
    public static void load(){
        /* liquids */
        endomine = new AsLiquid("endomine", Color.valueOf("f39560")){{
            gas = false;
            gasColor = barColor = Color.valueOf("f39560");
            lightColor = Color.valueOf("cf6f46d5");
            coolant = false;

            explosiveness = 0f;
            flammability = 0f;
            heatCapacity = 0.5f;
            viscosity = 0.65f;
            temperature = 0.9f;

            radioactivity = 0f;
            aggressiveness = 0.4f;
        }};
        oxylene = new AsLiquid("oxylene", Color.valueOf("c365df")){{
            gas = false;
            gasColor = barColor = Color.valueOf("c365df");
            coolant = false;

            explosiveness = 0f;
            flammability = 0.6f;
            heatCapacity = 0f;
            viscosity = 0.5f;
            temperature = 0.15f;

            radioactivity = 0f;
            aggressiveness = 0.4f;
        }};
        kryoline = new AsLiquid("kryoline", Color.valueOf("579adc")){{
            gas = false;
            gasColor = barColor = Color.valueOf("579adc");
            lightColor = Color.valueOf("476fbfd3");
            coolant = true;

            explosiveness = 0f;
            flammability = 0f;
            heatCapacity = 0.75f;
            viscosity = 0.3f;
            temperature = 0.4f;

            radioactivity = 0f;
            aggressiveness = 0.7f;
        }};
        ghetron = new AsCellLiquid("ghetron", Color.valueOf("a47ce6")){{
            gas = false;
            gasColor = barColor = Color.valueOf("a47ce6");
            //lightColor = Color.valueOf("a47ce6");
            coolant = false;

            explosiveness = 0f;
            flammability = 0.2f;
            heatCapacity = 0.4f;
            viscosity = 0.65f;
            temperature = 0.6f;

            radioactivity = 0.6f;
            aggressiveness = 0.95f;

            cells = 5;
            boilPoint = 1.53f;
            colorFrom = Color.valueOf("ca9cfa");
            colorTo = Color.valueOf("7b5ccb");
            maxSpread = 1.9f;
            spreadConversion = 1.5f;
            spreadDamage = 0.007f;
            removeScaling = 0.3f;
            moveThroughBlocks = true;
            blockReactive = true;
        }};

        /* gases */
        methane = new AsLiquid("methane", Color.valueOf("828282")){{
            gas = true;
            gasColor = barColor = Color.valueOf("828282");
            coolant = false;

            explosiveness = 1.1f;
            flammability = 0.65f;
            heatCapacity = 0.7f;
            viscosity = 0.5f;
            temperature = 0.65f;

            radioactivity = 0f;
            aggressiveness = 0f;
        }};
        zion = new AsLiquid("zion", Color.valueOf("f1778c")){{
            gas = true;
            gasColor = barColor = Color.valueOf("f1778c");
            coolant = true;

            explosiveness = 0.35f;
            flammability = 0.55f;
            heatCapacity = 0.35f;
            viscosity = 0.35f;
            temperature = 0.4f;

            radioactivity = 0f;
            aggressiveness = 0.15f;
        }};
        verdyne = new AsLiquid("verdyne", Color.valueOf("5283ef")){{
            gas = true;
            gasColor = barColor = Color.valueOf("5283ef");
            coolant = false;

            explosiveness = 1.35f;
            flammability = 0f;
            heatCapacity = 0.7f;
            viscosity = 0.6f;
            temperature = 0.5f;

            radioactivity = 0.25f;
            aggressiveness = 0.7f;
        }};
    }
}
