package AsJava.content;

import arc.graphics.Color;
import mindustry.type.Liquid;

public class AsLiquids {
    public static Liquid
    /* liquids */
    endomine, kryoline, ghetron,

    /* Gases*/
    zion, methane, oxylene, verdyne;
    public static void load(){
        /* liquids */
        endomine = new Liquid("endomine", Color.valueOf("f39560")){{
            gas = false;
            gasColor = barColor = Color.valueOf("f39560");
            lightColor = Color.valueOf("cf6f46d5");

            explosiveness = 0f;
            flammability = 0f;
            heatCapacity = 0.5f;
            viscosity = 0.65f;
            temperature = 0.9f;

            coolant = false;
        }};
        kryoline = new Liquid("kryoline", Color.valueOf("579adc")){{
            gas = false;
            gasColor = barColor = Color.valueOf("579adc");
            lightColor = Color.valueOf("476fbfd3");

            explosiveness = 0f;
            flammability = 0f;
            heatCapacity = 0.75f;
            viscosity = 0.3f;
            temperature = 0.4f;

            coolant = true;
        }};
        ghetron = new Liquid("ghetron", Color.valueOf("a47ce6")){{
            gas = false;
            gasColor = barColor = Color.valueOf("liquidLava");
            //lightColor = Color.valueOf("e37644a6");

            explosiveness = 0f;
            flammability = 0.2f;
            heatCapacity = 0.4f;
            viscosity = 0.65f;
            temperature = 0.6f;

            coolant = false;
        }};

        /* gases */
        methane = new Liquid("methane", Color.valueOf("828282")){{
            gas = true;
            gasColor = barColor = Color.valueOf("liquidLava");

            explosiveness = 1.1f;
            flammability = 0.65f;
            heatCapacity = 0.7f;
            viscosity = 0.5f;
            temperature = 0.65f;

            coolant = false;
        }};
        zion = new Liquid("zion", Color.valueOf("f1778c")){{
            gas = true;
            gasColor = barColor = Color.valueOf("liquidLava");

            explosiveness = 0f;
            flammability = 0.1f;
            heatCapacity = 0.35f;
            viscosity = 0.35f;
            temperature = 0.4f;

            coolant = true;
        }};
        oxylene = new Liquid("oxylene", Color.valueOf("c365df")){{
            gas = true;
            gasColor = barColor = Color.valueOf("c365df");

            explosiveness = 0f;
            flammability = 0.6f;
            heatCapacity = 0f;
            viscosity = 0.5f;
            temperature = 0.15f;

            coolant = false;
        }};
        verdyne = new Liquid("verdyne", Color.valueOf("5283ef")){{
            gas = true;
            gasColor = barColor = Color.valueOf("liquidLava");

            explosiveness = 1.35f;
            flammability = 0f;
            heatCapacity = 0.7f;
            viscosity = 0.6f;
            temperature = 0.5f;

            coolant = false;
        }};
    }
}
