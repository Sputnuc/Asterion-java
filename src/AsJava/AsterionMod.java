package AsJava;

import AsJava.content.*;
import AsJava.content.Asterion.AsBlockLoader;
import AsJava.ui.AsUIHandler;
import AsJava.world.meta.AsterionTeams;
import AsJava.world.meta.AsterionVars;
import arc.Core;
import arc.Events;
import arc.util.*;
import mindustry.game.EventType;
import mindustry.gen.Icon;
import mindustry.mod.*;
import mindustry.ui.dialogs.BaseDialog;

import static mindustry.Vars.ui;

public class AsterionMod extends Mod{

    public AsterionMod(){
        Log.info("Loaded Asterion (Java) constructor.");

        Events.on(EventType.ClientLoadEvent.class, e -> {
            loadSettings();
            if(!AsterionVars.hideWarning){
                Time.runTask(10f, () -> {
                    BaseDialog dialog = new BaseDialog("Asterion");
                    dialog.cont.add(Core.bundle.get("menu-warning")).row();
                    dialog.cont.image(Core.atlas.find("as-java-frog")).pad(20f).row();
                    dialog.cont.button("OK", dialog::hide).size(100f, 50f);
                    dialog.show();
                });
            };
        });
    }

    @Override
    public void init(){
        super.init();
        AsUIHandler.init();
    }

    @Override
    public void loadContent(){
        Log.info("Loading Asterion content.");
        AsterionTeams.load();
        AsItems.load();
        AsLiquids.load();
        AsBlockLoader.load();
    }

    private void loadSettings(){
        ui.settings.addCategory(Core.bundle.get("settings.asterion-settings"), Icon.book, t -> {
            t.checkPref("hide-warning", false);
        });
    }
}
