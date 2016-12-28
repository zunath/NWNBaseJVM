package NWNX;

import org.nwnx.nwnx2.jvm.NWObject;
import org.nwnx.nwnx2.jvm.NWScript;

public class NWNX_Visibility {


    public static void SetVisibilityOverride(NWObject oTarget, int nVisibilityType)
    {
        NWScript.setLocalInt(oTarget, "TEMP_VISIBILITY_METHOD_TYPE", 1);
        NWScript.setLocalInt(oTarget, "TEMP_VISIBILITY_TYPE", nVisibilityType);
        NWScript.executeScript("jvm_visibility", oTarget);
    }

    public static void SetVisibility(NWObject oShowOrHideObject, NWObject oTarget, int nVisibilityType)
    {
        NWScript.setLocalInt(oTarget, "TEMP_VISIBILITY_METHOD_TYPE", 1);
        NWScript.setLocalInt(oTarget, "TEMP_VISIBILITY_TYPE", nVisibilityType);
        NWScript.setLocalObject(oTarget, "TEMP_SHOW_OR_HIDE_OBJECT", oShowOrHideObject);

        NWScript.executeScript("jvm_visibility", oTarget);
    }

}
