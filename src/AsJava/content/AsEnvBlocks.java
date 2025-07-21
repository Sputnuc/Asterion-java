package AsJava.content;

import AsJava.content.AsFx;
import AsJava.world.blocks.environment.BiggerVent;
import AsJava.world.blocks.environment.EffectFloor;
import arc.graphics.Color;
import mindustry.Vars;
import mindustry.world.Block;
import mindustry.world.blocks.environment.*;

import static AsJava.content.AsItems.*;
import static AsJava.content.AsLiquids.*;
import static mindustry.Vars.tilesize;

/* Environment for all planets of mod */
public class AsEnvBlocks{
    public static Block

            // Quartz biome
            quartzFloor, quartzSandPatch, quartzVent, quartzBoulder, quartzWall, quartzCrystall,

            // Column biome
            columnFloor, columnFloorCracked, columnVent, columnVentAlt, columnBoulder, columnWall, columnRockStructure, columnRockTree,

            // Ash...
            ashPatch, ashPatchCracked, igneousAsh, ashLump, ashWall,

            // Puzzle biome
            puzzleFloor, puzzleGrowth, puzzleWall, puzzleCrystall, puzzleCrystallBig,

            // Endomine biome
            endomineFloor, endomineFloorCracked, endomineMagma, endomineLiquid, extinguishedCrater, flamingCrater,

            // Other biomes & blocks
            lumite, lumiteWall, paleCrystalFloor, unevenSlate, kryolineLiquid,

            // Factions' "biomes" (TODO)
            // Orion
            sealedFloor,
            // Pyro
            // Extinguished
            // Techno
            technoFloor,

            // Ghentron' nest
            ghetronFloor, ghetronDecayedFloor, eggSmallDeadDecor, ghetronRottenFloor, ghetronWall, ghetronDeadWall, ghetronTree, poisonAccumulation,


            // Ores
            whiteoriteOre, pyriteOre, zincumOre, cobaltOre;
    public static void load(){
        /*
        testBiggerVent = new BiggerVent("test-bigger-vent"){{variants = 2;
            blendGroup = parent = stone;
            attributes.set(Attribute.steam, 1f);
        }};
        */

        // Ores
        whiteoriteOre = new OreBlock("whitorite-ore"){{variants = 4;
            itemDrop = whitorite;
            wallOre = false;
        }};
        pyriteOre = new OreBlock("pyrite-ore"){{variants = 4;
            itemDrop = pyrite;
            wallOre = false;
        }};
        zincumOre = new OreBlock("zincum-leak"){{variants = 4;
            itemDrop = zincum;
            wallOre = false;
        }};
        cobaltOre = new OreBlock("cobalt-ore"){{variants = 4;
            itemDrop = cobalt;
            wallOre = false;
        }};
    }
}