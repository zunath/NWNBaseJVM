package Event.NPC;

import Common.IScriptEventHandler;
import org.nwnx.nwnx2.jvm.NWObject;
import org.nwnx.nwnx2.jvm.NWScript;

public class OnBlocked implements IScriptEventHandler {
    @Override
    public void runScript(NWObject objSelf) {
        NWScript.executeScript("nw_c2_defaulte", objSelf);
    }
}
