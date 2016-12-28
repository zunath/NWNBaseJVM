package Event.Module;

import Common.IScriptEventHandler;
import Helper.ErrorHelper;
import NWNX.NWNX_Events;
import org.nwnx.nwnx2.jvm.NWObject;
import org.nwnx.nwnx2.jvm.NWScript;
import org.nwnx.nwnx2.jvm.Scheduler;

public class OnUseItem implements IScriptEventHandler {
    @Override
    public void runScript(NWObject oPC) {
        NWObject oItem = NWNX_Events.GetEventItem();
        String className = NWScript.getLocalString(oItem, "JAVA_SCRIPT");
        boolean bypassEvent = NWScript.getLocalInt(oItem, "BYPASS_EVENT") == 1;

        if(bypassEvent) NWNX_Events.BypassEvent();
        if(className.equals("")) return;

        try{
            NWNX_Events.BypassEvent();
            Class scriptClass = Class.forName("Item." + className);
            IScriptEventHandler script = (IScriptEventHandler)scriptClass.newInstance();
            script.runScript(oPC);
            Scheduler.flushQueues();
        }
        catch (Exception ex)
        {
            ErrorHelper.HandleException(ex, "Module.OnUseItem failed for Java Script: " + className);
        }

    }
}
