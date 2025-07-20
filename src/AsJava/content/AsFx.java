package AsJava.content;

import arc.Core;
import arc.graphics.Color;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.Time;
import mindustry.Vars;
import mindustry.entities.Effect;
import mindustry.entities.effect.MultiEffect;
import mindustry.entities.effect.ParticleEffect;
import mindustry.graphics.*;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.randLenVectors;
import static mindustry.Vars.tilesize;

public class AsFx{
    public static final Effect
    craterSmoke = new MultiEffect(
            new ParticleEffect(){{
                particles = 4;
                lifetime = 150;
                length = 12f * tilesize;
                cone = 15f; baseRotation = 30f;
                sizeFrom = 0f; sizeTo = 7f; sizeInterp = Interp.pow3Out;
                colorFrom = Color.valueOf("52392f90"); colorTo = Color.valueOf("2e282210");
                interp = Interp.pow3Out;
            }},
            new ParticleEffect(){{
                startDelay = 16;
                particles = 4;
                lifetime = 180;
                length =  13f * tilesize;
                cone = 15f; baseRotation = 30f;
                sizeFrom = 0f; sizeTo = 9f; sizeInterp = Interp.pow3Out;
                colorFrom = Color.valueOf("52392f90"); colorTo = Color.valueOf("2e282210");
                interp = Interp.pow3Out;
            }},
            new ParticleEffect(){{
                startDelay = 26;
                particles = 3;
                lifetime = 210;
                length = 19f * tilesize;
                cone = 15f; baseRotation = 30f;
                sizeFrom = 0f; sizeTo = 13f; sizeInterp = Interp.pow3Out;
                colorFrom = Color.valueOf("52392f90"); colorTo = Color.valueOf("2e282210");
                interp = Interp.pow3Out;
            }}
    ),
    ventColumnSmoke = new ParticleEffect(){{
        particles = 3;
        lifetime = 430;
        length = 26f * tilesize;
        cone = 15f; baseRotation = 30f;
        sizeFrom = 0f; sizeTo = 18f; sizeInterp = Interp.pow3Out;
        colorFrom = Color.valueOf("52392f90"); colorTo = Color.valueOf("2e282210");
        interp = Interp.pow2Out;
    }},
    ventColumnAltSmoke = new MultiEffect(
            new ParticleEffect(){{
                particles = 6;
                lifetime = 430;
                length = 31f * tilesize;
                cone = 40f; baseRotation = 30f;
                sizeFrom = 3f; sizeTo = 22f; sizeInterp = Interp.pow3Out;
                colorFrom = Color.valueOf("52392f90"); colorTo = Color.valueOf("2e282210");
                interp = Interp.pow4Out;
            }}
    ),
    ventQuartzSmoke = new ParticleEffect(){{
        particles = 1;
        lifetime = 360;
        length = 21f * tilesize;
        cone = 10f; baseRotation = 30f;
        sizeFrom = 0f; sizeTo = 15f; sizeInterp = Interp.pow3Out;
        colorFrom = Color.valueOf("54383f90"); colorTo = Color.valueOf("382b3310");
        interp = Interp.pow2Out;
    }};
};