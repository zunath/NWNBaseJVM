package Event.Module;

import Common.IScriptEventHandler;
import org.nwnx.nwnx2.jvm.NWObject;
import org.nwnx.nwnx2.jvm.NWScript;

public class OnClientEnter implements IScriptEventHandler {
    @Override
    public void runScript(NWObject objSelf) {
        NWScript.executeScript("x3_mod_def_enter", objSelf); // Bioware Default
    }

}
