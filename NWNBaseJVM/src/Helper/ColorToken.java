package Helper;

import org.nwnx.nwnx2.jvm.NWObject;
import org.nwnx.nwnx2.jvm.NWScript;

public class ColorToken {

    /*
 * colors_inc.nss
 *
 * Access to the color tokens provided by The Krit.
 ************************************************************
 * Please use these judiciously to enhance the gaming
 * experience. (Overuse of colors detracts from it.)
 ************************************************************
 * Color tokens in a String will change the color from that
 * point on when the String is displayed on the screen.
 * Every color change should be ended by an end token,
 * supplied by ColorTokenEnd().
 ************************************************************/


///////////////////////////////////////////////////////////////////////////////
// Constants
///////////////////////////////////////////////////////////////////////////////

    static final String ColorArray = "     !##$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]]^_`abcdefghijklmnopqrstuvwxyz{|}~€�?‚ƒ„…†‡ˆ‰Š‹Œ�?Ž�?�?‘’“�?•–—˜™š›œ�?žŸ ¡¢£¤¥¦§¨©ª«¬­®¯°±²³´µ¶·¸¹º»¼½¾¿À�?ÂÃÄÅÆÇÈÉÊËÌ�?Î�?�?ÑÒÓÔÕÖ×ØÙÚÛÜ�?Þßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþþ";

///////////////////////////////////////////////////////////////////////////////
// Basic Functions
///////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////
    // ColorToken()
    //
    // Supplies a String that changes the text to the given RGB values.
    // Valid parameter values are 0-255.
    //
    public static String Custom(int nRed, int nGreen, int nBlue)
    {
        return "<c" + NWScript.getSubString(ColorArray, nRed, 1) +
                NWScript.getSubString(ColorArray, nGreen, 1) +
                NWScript.getSubString(ColorArray, nBlue, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenEnd()
//
// Supplies a String that ends an earlier color change.
//
    public static String End()
    {
        return "</c>";
    }



///////////////////////////////////////////////////////////////////////////////
// Functions by Color
///////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenBlack()
//
// Supplies a String that changes the text to black.
//
    public static String Black()
    {
        return "<c" + NWScript.getSubString(ColorArray, 0, 1) +
                NWScript.getSubString(ColorArray, 0, 1) +
                NWScript.getSubString(ColorArray, 0, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenBlue()
//
// Supplies a String that changes the text to blue.
//
    public static String Blue()
    {
        return "<c" + NWScript.getSubString(ColorArray, 0, 1) +
                NWScript.getSubString(ColorArray, 0, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenGray()
//
// Supplies a String that changes the text to gray.
//
    public static String Gray()
    {
        return "<c" + NWScript.getSubString(ColorArray, 127, 1) +
                NWScript.getSubString(ColorArray, 127, 1) +
                NWScript.getSubString(ColorArray, 127, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenGreen()
//
// Supplies a String that changes the text to green.
//
    public static String Green()
    {
        return "<c" + NWScript.getSubString(ColorArray, 0, 1) +
                NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 0, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenLightPurple()
//
// Supplies a String that changes the text to light purple.
//
    public static String LightPurple()
    {
        return "<c" + NWScript.getSubString(ColorArray, 175, 1) +
                NWScript.getSubString(ColorArray, 48, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenOrange()
//
// Supplies a String that changes the text to orange.
//
    public static String Orange()
    {
        return "<c" + NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 127, 1) +
                NWScript.getSubString(ColorArray, 0, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenPink()
//
// Supplies a String that changes the text to pink.
//
    public static String Pink()
    {
        return "<c" + NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 0, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenPurple()
//
// Supplies a String that changes the text to purple.
//
    public static String Purple()
    {
        return "<c" + NWScript.getSubString(ColorArray, 127, 1) +
                NWScript.getSubString(ColorArray, 0, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenRed()
//
// Supplies a String that changes the text to red.
//
    public static String Red()
    {
        return "<c" + NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 0, 1) +
                NWScript.getSubString(ColorArray, 0, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenWhite()
//
// Supplies a String that changes the text to white.
//
    public static String White()
    {
        return "<c" + NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenYellow()
//
// Supplies a String that changes the text to yellow.
//
    public static String Yellow()
    {
        return "<c" + NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 0, 1) + ">";
    }



///////////////////////////////////////////////////////////////////////////////
// Functions by Purpose
///////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenCombat()
//
// Supplies a String that changes the text to the color of
// combat messages.
//
    public static String Combat()
    {
        return "<c" + NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 102, 1) +
                NWScript.getSubString(ColorArray, 0, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenDialog()
//
// Supplies a String that changes the text to the color of
// dialog.
//
    public static String Dialog()
    {
        return "<c" + NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenDialogAction()
//
// Supplies a String that changes the text to the color of
// dialog actions.
//
    public static String DialogAction()
    {
        return "<c" + NWScript.getSubString(ColorArray, 1, 1) +
                NWScript.getSubString(ColorArray, 254, 1) +
                NWScript.getSubString(ColorArray, 1, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenDialogCheck()
//
// Supplies a String that changes the text to the color of
// dialog checks.
//
    public static String DialogCheck()
    {
        return "<c" + NWScript.getSubString(ColorArray, 254, 1) +
                NWScript.getSubString(ColorArray, 1, 1) +
                NWScript.getSubString(ColorArray, 1, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenDialogHighlight()
//
// Supplies a String that changes the text to the color of
// dialog highlighting.
//
    public static String DialogHighlight()
    {
        return "<c" + NWScript.getSubString(ColorArray, 1, 1) +
                NWScript.getSubString(ColorArray, 1, 1) +
                NWScript.getSubString(ColorArray, 254, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenDialogReply()
//
// Supplies a String that changes the text to the color of
// replies in the dialog window.
//
    public static String DialogReply()
    {
        return "<c" + NWScript.getSubString(ColorArray, 102, 1) +
                NWScript.getSubString(ColorArray, 178, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenDM()
//
// Supplies a String that changes the text to the color of
// the DM channel.
//
    public static String DM()
    {
        return "<c" + NWScript.getSubString(ColorArray, 16, 1) +
                NWScript.getSubString(ColorArray, 223, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenGameEngine()
//
// Supplies a String that changes the text to the color of
// many game engine messages.
//
    public static String GameEngine()
    {
        return "<c" + NWScript.getSubString(ColorArray, 204, 1) +
                NWScript.getSubString(ColorArray, 119, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenSavingThrow()
//
// Supplies a String that changes the text to the color of
// saving throw messages.
//
    public static String SavingThrow()
    {
        return "<c" + NWScript.getSubString(ColorArray, 102, 1) +
                NWScript.getSubString(ColorArray, 204, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenScript()
//
// Supplies a String that changes the text to the color of
// messages sent from scripts.
//
    public static String Script()
    {
        return "<c" + NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 0, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenServer()
//
// Supplies a String that changes the text to the color of
// server messages.
//
    public static String Server()
    {
        return "<c" + NWScript.getSubString(ColorArray, 176, 1) +
                NWScript.getSubString(ColorArray, 176, 1) +
                NWScript.getSubString(ColorArray, 176, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenShout()
//
// Supplies a String that changes the text to the color of
// shouts.
//
    public static String Shout()
    {
        return "<c" + NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 239, 1) +
                NWScript.getSubString(ColorArray, 80, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenSkillCheck()
//
// Supplies a String that changes the text to the color of
// skill check messages.
//
    public static String SkillCheck()
    {
        return "<c" + NWScript.getSubString(ColorArray, 0, 1) +
                NWScript.getSubString(ColorArray, 102, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenTalk()
//
// Supplies a String that changes the text to the color of
// the talk and party talk channels.
//
    public static String Talk()
    {
        return "<c" + NWScript.getSubString(ColorArray, 240, 1) +
                NWScript.getSubString(ColorArray, 240, 1) +
                NWScript.getSubString(ColorArray, 240, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenTell()
//
// Supplies a String that changes the text to the color of
// tells.
//
    public static String Tell()
    {
        return "<c" + NWScript.getSubString(ColorArray, 32, 1) +
                NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 32, 1) + ">";
    }

    ///////////////////////////////////////////////////////////////////////////////
// ColorTokenWhisper()
//
// Supplies a String that changes the text to the color of
// whispers.
//
    public static String Whisper()
    {
        return "<c" + NWScript.getSubString(ColorArray, 128, 1) +
                NWScript.getSubString(ColorArray, 128, 1) +
                NWScript.getSubString(ColorArray, 128, 1) + ">";
    }



///////////////////////////////////////////////////////////////////////////////
// Colored Name Functions
///////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////
// GetNamePCColor()
//
// Returns the name of oPC, surrounded by color tokens, so the color of
// the name is the lighter blue often used in NWN game engine messages.
//
//
    String GetNamePCColor(NWObject oPC)
    {
        return "<c" + NWScript.getSubString(ColorArray, 153, 1) +
                NWScript.getSubString(ColorArray, 255, 1) +
                NWScript.getSubString(ColorArray, 255, 1) + ">" +
                NWScript.getName(oPC, false) + "</c>";
    }

    ///////////////////////////////////////////////////////////////////////////////
// GetNameNPCColor()
//
// Returns the name of oNPC, surrounded by color tokens, so the color of
// the name is the shade of purple often used in NWN game engine messages.
//
    String GetNameNPCColor(NWObject oNPC)
    {
        return "<c" + NWScript.getSubString(ColorArray, 204, 1) +
                NWScript.getSubString(ColorArray, 153, 1) +
                NWScript.getSubString(ColorArray, 204, 1) + ">" +
                NWScript.getName(oNPC, false) + "</c>";
    }

}
