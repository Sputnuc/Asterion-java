package AsJava.world.meta;

import arc.graphics.Color;
import mindustry.game.Team;

public class AsterionTeams {
    public static Team orion, pyro, extinguished, techno, ghetron;

    public static void load() {
        orion = newTeam(60, "faction-orion", Color.valueOf("c0e0f5"));
        pyro = newTeam(61, "faction-pyro", Color.valueOf("dc7135"));
        extinguished = newTeam(62, "faction-extinguished", Color.valueOf("cb6064"));
        techno = newTeam(63, "faction-techno", Color.valueOf("79bbf0"));
        ghetron = newTeam(64, "ghetron", Color.valueOf("bf92f9"));
    }

    /* Modify any of 256 teams' properties. Code yoinked from FOS :P */
    private static Team newTeam(int id, String name, Color color) {
        Team team = Team.get(id);
        team.name = name;
        team.color.set(color);

        team.palette[0] = color;
        team.palette[1] = color.cpy().mul(0.75f);
        team.palette[2] = color.cpy().mul(0.5f);

        for(int i = 0; i < 3; i++){
            team.palettei[i] = team.palette[i].rgba();
        }

        return team;
    }
}
