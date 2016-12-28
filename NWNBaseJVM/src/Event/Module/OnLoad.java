package Event.Module;

import Common.IScriptEventHandler;
import NWNX.*;
import org.nwnx.nwnx2.jvm.NWObject;
import org.nwnx.nwnx2.jvm.NWScript;

public class OnLoad implements IScriptEventHandler {
    @Override
    public void runScript(NWObject objSelf) {

        AddModuleEventHandlers();
        AddGlobalEventHandlers();
        AddAreaEventHandlers();

        // NWNX Setup
        NWScript.setLocalString(objSelf, "NWNX!INIT", "1");
        NWScript.getLocalObject(objSelf, "NWNX!INIT");
        NWScript.deleteLocalString(objSelf, "NWNX!INIT");

        NWScript.executeScript("x2_mod_def_load", objSelf); // Bioware Default
        NWScript.executeScript("fky_chat_modload", objSelf); // SIMTools and NWNX
    }


    private void AddAreaEventHandlers()
    {
        NWObject area = NWNX_Funcs.GetFirstArea();
        while(NWScript.getIsObjectValid(area))
        {
            NWNX_Funcs.SetEventHandler(area, AreaScript.OnEnter, "area_enter");
            NWNX_Funcs.SetEventHandler(area, AreaScript.OnExit, "area_exit");
            NWNX_Funcs.SetEventHandler(area, AreaScript.OnHeartbeat, "area_heartbeat");
            NWNX_Funcs.SetEventHandler(area, AreaScript.OnUserDefinedEvent, "area_user");

            area = NWNX_Funcs.GetNextArea();
        }
    }

    private void AddModuleEventHandlers()
    {
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnAcquireItem, "mod_acquire");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnActivateItem, "mod_activate");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnClientEnter, "mod_enter");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnClientExit, "mod_leave");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnPlayerCancelCutscene, "mod_cutscene");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnHeartbeat, "mod_heartbeat");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnModuleLoad, "mod_load");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnPlayerDeath, "mod_death");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnPlayerDying, "mod_dying");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnEquipItem, "mod_equip");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnPlayerLevelUp, "mod_level");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnRespawnButtonPressed, "mod_respawn");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnPlayerRest, "mod_rest");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnUnequipItem, "mod_unequip");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnLoseItem, "mod_unacquire");
        NWNX_Funcs.SetEventHandler(NWObject.MODULE, ModuleScripts.OnUserDefinedEvent, "mod_user");
    }

    private void AddGlobalEventHandlers()
    {
        NWNX_Events.SetGlobalEventHandler(NWNX_Events.EVENT_TYPE_ATTACK, "mod_attacked");
        NWNX_Events.SetGlobalEventHandler(NWNX_Events.EVENT_TYPE_CAST_SPELL, "mod_castspell");
        NWNX_Events.SetGlobalEventHandler(NWNX_Events.EVENT_TYPE_EXAMINE, "mod_examine");
        NWNX_Events.SetGlobalEventHandler(NWNX_Events.EVENT_TYPE_PICKPOCKET, "mod_pickpocket");
        NWNX_Events.SetGlobalEventHandler(NWNX_Events.EVENT_TYPE_SAVE_CHAR, "mod_savechar");
        NWNX_Events.SetGlobalEventHandler(NWNX_Events.EVENT_TYPE_TOGGLE_MODE, "mod_togglemode");
        NWNX_Events.SetGlobalEventHandler(NWNX_Events.EVENT_TYPE_TOGGLE_PAUSE, "mod_togglepause");
        NWNX_Events.SetGlobalEventHandler(NWNX_Events.EVENT_TYPE_USE_FEAT, "mod_usefeat");
        NWNX_Events.SetGlobalEventHandler(NWNX_Events.EVENT_TYPE_USE_ITEM, "mod_useitem");

        NWNX_DMActions.SetDMActionScript(DMActionType.CREATE_ITEM_ON_AREA, "dm_item_area");
        NWNX_DMActions.SetDMActionScript(DMActionType.CREATE_ITEM_ON_OBJECT, "dm_item_obj");
        NWNX_DMActions.SetDMActionScript(DMActionType.CREATE_PLACEABLE, "dm_placeable");
        NWNX_DMActions.SetDMActionScript(DMActionType.GIVE_GOLD, "dm_gold");
        NWNX_DMActions.SetDMActionScript(DMActionType.GIVE_LEVEL, "dm_level");
        NWNX_DMActions.SetDMActionScript(DMActionType.GIVE_XP, "dm_xp");
        NWNX_DMActions.SetDMActionScript(DMActionType.HEAL_CREATURE, "dm_heal");
        NWNX_DMActions.SetDMActionScript(DMActionType.REST_CREATURE, "dm_rest");
        NWNX_DMActions.SetDMActionScript(DMActionType.RUNSCRIPT, "dm_runscript");
        NWNX_DMActions.SetDMActionScript(DMActionType.SPAWN_CREATURE, "dm_spawn");
        NWNX_DMActions.SetDMActionScript(DMActionType.TOGGLE_IMMORTALITY, "dm_immortal");
        NWNX_DMActions.SetDMActionScript(DMActionType.TOGGLE_INVULNERABILITY, "dm_invuln");
    }
}