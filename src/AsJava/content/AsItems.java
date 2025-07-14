package AsJava.content;

import arc.graphics.*;
import mindustry.type.*;

//import static Thezsia.world.graphics.ThezPal.*;

public class AsItems {
    public static Item
            // Common items
            whitorite, pyrite, quartz, zincum, blacktite, magnetite, ghetronFlesh,

            /* Orion */
            irmenite, silicate,

            /* Pyro */
            ashotite, graphene,

            /* Extinguished */
            cobalt, zionitium,

            /* Techno */
            verdyneSteel, fractone;

    public static void load(){
        whitorite = new Item("whitorite", Color.valueOf("cbc5c2")){{
            hardness = 1;
            cost = 1f;

            explosiveness = flammability = radioactivity = charge = 0f;
        }};
        pyrite = new Item("pyrite", Color.valueOf("ffe4a0")){{
            hardness = 1;
            cost = 1.2f;

            explosiveness = flammability = radioactivity = 0f;
            charge = 0.25f;
        }};
        quartz = new Item("quartz", Color.valueOf("383574")){{
            hardness = 1;
            cost = 0.7f;

            explosiveness = flammability = radioactivity = charge = 0f;
        }};
        zincum = new Item("zincum", Color.valueOf("90ada7")){{
            hardness = 2;
            cost = 2.5f;

            explosiveness = flammability = radioactivity = charge = 0f;
        }};
        blacktite = new Item("blacktite", Color.valueOf("4f4965")){{
            hardness = 4;
            cost = 4.1f;

            explosiveness = flammability = radioactivity = charge = 0f;
        }};
        magnetite = new Item("magnetite", Color.valueOf("d1d1d6")){{
            hardness = 3;
            cost = 3.4f;

            explosiveness = flammability = radioactivity = 0f;
            charge = 0.5f;
        }};
        ghetronFlesh = new Item("ghetron-flesh", Color.valueOf("bf92f9")){{
            hardness = 1;
            cost = 0.2f;

            explosiveness = flammability = radioactivity = charge = 0f;
        }};

        /* Orion */
        irmenite = new Item("irmenite", Color.valueOf("a1b1d0")){{
            hardness = 2;
            cost = 2.7f;

            explosiveness = flammability = radioactivity = charge = 0f;
        }};
        silicate = new Item("silicate", Color.valueOf("90ada7")){{
            hardness = 5;
            cost = 5.5f;

            explosiveness = 0.15f;
            flammability = 0f;
            radioactivity = 0.6f;
            charge = 1.4f;
        }};

        /* Pyro */
        ashotite = new Item("ashotite", Color.valueOf("b94c34")){{
            hardness = 1;
            cost = 1.3f;

            explosiveness = 0.35f;
            flammability = 1.6f;
            radioactivity = charge = 0f;
        }};
        graphene = new Item("graphene", Color.valueOf("403e4e")){{
            hardness = 3;
            cost = 4.1f;

            explosiveness = flammability = radioactivity = charge = 0f;
        }};

        /* Extinguished */
        cobalt = new Item("cobalt", Color.valueOf("6d3a9b")){{
            hardness = 3;
            cost = 2.6f;

            explosiveness = flammability = radioactivity = charge = 0f;
        }};
        zionitium = new Item("zionitium", Color.valueOf("dd7171")){{
            hardness = 1;
            cost = 4.2f;

            explosiveness = 1.45f;
            flammability = radioactivity = charge = 0f;
        }};

        /* Techno */
        verdyneSteel = new Item("verdyne-steel", Color.valueOf("383574")){{
            hardness = 3;
            cost = 4.4f;

            explosiveness = flammability = 0f;
            radioactivity = 0.6f;
            charge = 0.15f;
        }};
        fractone = new Item("fractone", Color.valueOf("5c5b69")){{
            hardness = 4;
            cost = 5.7f;

            explosiveness = flammability = radioactivity = charge = 0f;
        }};
    }
}
