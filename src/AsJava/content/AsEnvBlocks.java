package AsJava.content;

import AsJava.world.blocks.environment.EffectFloor;
import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.gen.Sounds;
import mindustry.graphics.CacheLayer;
import mindustry.world.Block;
import mindustry.world.blocks.environment.*;
import mindustry.world.meta.Attribute;

import static AsJava.content.AsItems.*;
import static AsJava.content.AsLiquids.*;
import static mindustry.Vars.tilesize;

/* Environment for all planets of mod */
public class AsEnvBlocks{
    public static Block

            // Quartz biome
            quartzSandPatch, quartzFloor, quartzVent, quartzBoulder, quartzWall, quartzCrystall,

            // Column biome
            columnFloor, columnFloorCracked, columnVent, columnVentAlt, columnBoulder, columnWall, columnRockStructure, columnRockTree,

            // Ash...
            ashPatch, ashPatchCracked, igneousAsh, ashLump, ashWall,

            // Endomine Biome (lava :3)
            endomineRock, endomineRockCracked, endomineMagma, endomineLiquid, endomineLiquidDeep, endomineRockWall, endomineIgneousWall, extinguishedCrater, flamingCrater,

            // Puzzle ~~slime~~ Biome
            puzzleFloor, puzzleGrowth, puzzleWall, puzzleCrystall, puzzleCrystallMedium, puzzleCrystallBig,

            // Other biomes & blocks
            lumite, lumiteWall, paleCrystalFloor, unevenSlate, kryolineLiquid,

            // Ghentron' nest
            ghetronFloor, ghetronDecayedFloor, ghetronRottenFloor, eggSmallDeadDecor, ghetronWall, ghetronDeadWall, poisonAccumulation, ghetronTree, ghetronDeadTree,


            // Ores
            whiteoriteOre, pyriteOre, zincumOre, cobaltOre;
    public static void load(){
        /* Quartz biome */
        quartzSandPatch = new Floor("quartz-sand-patch"){{variants = 5;}};
        quartzFloor =  new Floor("quartz-floor"){{variants = 5;
            itemDrop = quartz;
        }};
        quartzVent = new SteamVent(""){{variants = 3;
            attributes.set(Attribute.steam, 0.6f);
            effect = AsFx.ventQuartzSmoke;
            parent = blendGroup = quartzFloor;
        }};
        quartzBoulder = new Prop("quartz-boulder"){{variants = 3;}};
        quartzWall = new StaticWall("quartz-wall"){{variants = 5;}};
        quartzCrystall = new TallBlock(("quartz-crystall")){{variants = 0;
            shadowOffset = -1.3f;
        }};

        /* Column Biome */
        columnFloor = new Floor("column-floor"){{variants = 5;}};
        columnFloorCracked = new EffectFloor("cracked-column-floor"){{variants = 4;
            effect = AsFx.craterSmoke; effectChance = 0.0004f;
        }};
        columnVent = new SteamVent("column-vent"){{variants = 3;
            attributes.set(Attribute.steam, 1f);
            effect = AsFx.ventColumnSmoke;
            parent = blendGroup = columnFloor;
        }};
        columnVentAlt = new SteamVent("column-vent-alt"){{variants = 3;
            attributes.set(Attribute.steam, 1.2f);
            effect = AsFx.ventColumnAltSmoke;
            parent = blendGroup = columnFloor;
        }};
        columnBoulder = new Prop("column-boulder"){{variants = 3;}};
        columnWall = new StaticWall("column-wall"){{variants = 5;}};
        // TODO make clumn structure look like actual column with semi-3d looking shadow
        columnRockStructure = new TallBlock("column-structure"){{variants = 4;
            shadowOffset = 0f; shadowAlpha = 1f;
        }};
        columnRockTree = new TreeBlock("column-rock-tree"){{variants = 4;
            shadowOffset = -1.5f;
        }};

        /* Ash... */
        ashPatch = new Floor("ash-patch"){{variants = 5;}};
        ashPatchCracked = new EffectFloor("cracked-ash-patch"){{variants = 4;
            effect = AsFx.craterSmoke; effectChance = 0.0004f;
        }};
        igneousAsh = new EffectFloor("igneous-ash"){{variants = 5;
            effect = Fx.fire; effectChance = 0.0007f;
        }};
        ashLump = new Prop("ash-lump"){{variants = 3;}};
        ashWall = new Prop("ash-wall"){{variants = 5;}};

        /* Puzzle ~~slime~~ Biome */
        puzzleFloor = new Floor("puzzle-floor"){{variants = 5;
            emitLight = true; lightColor = Color.valueOf("648ea15c"); lightRadius = 1.3f * tilesize;
        }};
        puzzleGrowth = new Prop("puzzle-growth"){{variants = 3;
            breakSound = destroySound = Sounds.click;
            emitLight = true; lightColor = Color.valueOf("60a1b56d"); lightRadius = 1.5f * tilesize;
        }};
        puzzleWall = new StaticWall("puzzle-wall"){{variants = 5;
            emitLight = true; lightColor = Color.valueOf("60a1b56d"); lightRadius = 1.5f * tilesize;
        }};
        puzzleCrystall = new TallBlock("puzzle-crystall1"){{variants = 2;
            shadowOffset = -0.9f; shadowAlpha = 0.75f;
            emitLight = true; lightColor = Color.valueOf("76b8cc7e"); lightRadius = 2.0f * tilesize;
        }};
        puzzleCrystallMedium = new TallBlock("medium-puzzle-crystall"){{variants = 0;
            shadowOffset = -1.3f; shadowAlpha = 0.5f;
            emitLight = true; lightColor = Color.valueOf("80c8d997"); lightRadius = 2.5f * tilesize;
        }};
        puzzleCrystallBig = new TallBlock("big-puzzle-crystall"){{variants = 0;
            shadowOffset = -1.8f; shadowAlpha = 0.15f;
            emitLight = true; lightColor = Color.valueOf("8fd9e39e"); lightRadius = 3.2f * tilesize;
        }};

        /* Endomine Biome (lava :3) */
        endomineRock = new Floor("endomine-rock"){{variants = 5;}};
        endomineRockCracked = new EffectFloor("cracked-endomine-rock"){{variants = 4;
            blendGroup = endomineRock;
            effect = AsFx.craterSmoke; effectChance = 0.0004f;
        }};
        endomineMagma = new EffectFloor("endomine-magma"){{variants = 0;
            liquidDrop = endomine; liquidMultiplier = 0.4f;
            speedMultiplier = 0.75f;
            effect = Fx.fire; effectChance = 0.0005f;
            emitLight = true; lightColor = Color.valueOf("a858408d"); lightRadius = 1.3f * tilesize;
        }};
        endomineLiquid = new EffectFloor("endomine-liquid"){{variants = 0;
            liquidDrop = endomine; liquidMultiplier = 1f;
            speedMultiplier = 0.5f;
            effect = Fx.fire; effectChance = 0.0008f;
            emitLight = true; lightColor = Color.valueOf("cf6f46d5"); lightRadius = 1.8f * tilesize;
            cacheLayer = CacheLayer.ShaderLayer.slag;
        }};
        endomineLiquidDeep = new EffectFloor("deep-endomine-liquid"){{variants = 0;
            liquidDrop = endomine; liquidMultiplier = 1.5f;
            speedMultiplier = 0.1f;
            effect = Fx.fire; effectChance = 0.001f;
            emitLight = true; lightColor = Color.valueOf("f39560"); lightRadius = 1.4f * tilesize;
            cacheLayer = CacheLayer.ShaderLayer.slag;
        }};
        // TODO
        extinguishedCrater = new SteamVent("extinguished-crater"){{variants = 3;
            attributes.set(Attribute.steam, 0.1f);
        }};
        // TODO
        flamingCrater = new SteamVent("flaming-crater"){{variants = 3;
            attributes.set(Attribute.steam, 1.35f);
        }};
        endomineRockWall = new StaticWall("endomine-rock-wall"){{variants = 4;}};
        endomineIgneousWall = new StaticWall("endomine-igneous-wall"){{variants = 4;}};

        /* Other biomes & blocks (// TODO) */
        lumite = new Floor("lumite"){{variants = 5;}};
        lumiteWall = new StaticWall("lumite-wall"){{variants = 5;}};
        paleCrystalFloor = new Floor("pale-crystal-floor"){{variants = 5;}};
        unevenSlate = new Floor("uneven-slate"){{variants = 5;}};

        kryolineLiquid = new Floor("kryoline-liquid"){{variants = 0;
            liquidDrop = kryoline;
            status = StatusEffects.melting; statusDuration = 182f;
        }};

        /* Ghentron' nest (// TODO) */
        ghetronFloor = new Floor("ghetron-floor"){{variants = 4;}};
        ghetronDecayedFloor = new Floor("decayed-ghetron-floor"){{variants = 4;}};
        ghetronRottenFloor = new Floor("rotten-ghetron-floor"){{variants = 4;}};
        eggSmallDeadDecor = new Prop("egg-small-dead-decor"){{variants = 3;
            hasShadow = false;
            breakSound = destroySound = Sounds.mud;
        }};
        ghetronWall = new StaticWall("getron-wall"){{variants = 4;}};
        ghetronDeadWall = new StaticWall("getron-dead-wall"){{variants = 4;}};
        ghetronTree = new TreeBlock("ghetron-tree"){{variants = 0;}};
        ghetronDeadTree = new TreeBlock("dead-ghetron-tree"){{variants = 0;}};

        /* Ores */
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