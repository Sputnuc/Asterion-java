package AsJava;

import arc.Core;
import arc.struct.Seq;

public class AsterionVars{
    private static final Seq<String> sectorVars = Seq.with(
      "test"
    );
    //will the warn dialog be displayed
    public static boolean  hideWarning = Core.settings.getBool("hide-warning");
}
