package Event.Module;

import Common.IScriptEventHandler;
import org.nwnx.nwnx2.jvm.NWObject;
import org.nwnx.nwnx2.jvm.NWScript;

public class OnAcquireItem implements IScriptEventHandler {
    @Override
    public void runScript(NWObject objSelf) {
        // Bioware Default
        NWScript.executeScript("x2_mod_def_aqu", objSelf);
    }
}
