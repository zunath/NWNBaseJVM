package Event.Module;

import Common.IScriptEventHandler;
import org.nwnx.nwnx2.jvm.NWObject;
import org.nwnx.nwnx2.jvm.NWScript;

public class OnActivateItem implements IScriptEventHandler {
    @Override
    public void runScript(final NWObject objSelf) {
        NWScript.executeScript("x2_mod_def_act", objSelf);
        NWScript.executeScript("jvm_item_use", objSelf);
    }
}
