package AsJava;

import AsJava.content.*;
import arc.util.*;
import mindustry.mod.*;

public class AsterionMod extends Mod{

    public AsterionMod(){
        Log.info("Loaded Asterion (Java) constructor.");

        //listen for game load event
        /*Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });*/
    }

    @Override
    public void loadContent(){
        Log.info("Loading Asterion content.");
        AsItems.load();
        AsLiquids.load();
    }

}
