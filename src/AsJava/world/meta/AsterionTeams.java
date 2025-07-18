package AsJava.world.meta;

import arc.graphics.Color;
import mindustry.game.Team;

public class AsterionTeams {
    public static Team factionOrion, factionPyro, factionExtinguished, factionTechno, ghetron;

    public static void load() {
        factionOrion = newTeam(60, "faction-orion", Color.valueOf("6bebcd"));
        factionPyro = newTeam(61, "faction-pyro", Color.valueOf("524b7e"));
        factionExtinguished = newTeam(62, "faction-extinguished", Color.valueOf("473639"));
        factionTechno = newTeam(63, "faction-techno", Color.valueOf("473639"));
        ghetron = newTeam(64, "faction-ghetron", Color.valueOf("473639"));
    }

    /* modify any of 256 teams' properties. Code yoinked from FOS :P */
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
