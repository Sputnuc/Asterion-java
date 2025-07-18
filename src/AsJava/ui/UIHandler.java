package AsJava.ui;

import arc.scene.Element;
import arc.scene.Group;
import arc.scene.ui.ImageButton;
import arc.scene.ui.layout.Table;
import mindustry.game.Team;
import mindustry.gen.Tex;
import mindustry.ui.Styles;

import static mindustry.Vars.*;
import static mindustry.Vars.ui;

public class UIHandler{
    public static void init() {

        // more team buttons in editor UI
        MyTeamsInEditorUI();
    }

    /* Code from FOS because I'm too dumb for this shi- :| */
    static void MyTeamsInEditorUI(){
        ui.editor.shown(() -> {
            Element teambuttons = ui.editor.getChildren().get(0);
            teambuttons = ((Group)teambuttons).getChildren().get(0);

            ((Table)teambuttons).row();

            for (int i = 60; i <= 64; i++){
                Team team = Team.get(i);

                ImageButton button = new ImageButton(Tex.whiteui, Styles.clearNoneTogglei);
                button.margin(4f);
                button.getImageCell().grow();
                button.getStyle().imageUpColor = team.color;
                button.clicked(() -> editor.drawTeam = team);
                button.update(() -> button.setChecked(editor.drawTeam == team));

                ((Table)teambuttons).add(button);
            }
        });
    }
}
