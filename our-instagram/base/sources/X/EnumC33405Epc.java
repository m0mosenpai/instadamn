package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33405Epc {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33405Epc[] A02;
    public static final EnumC33405Epc A03;
    public static final EnumC33405Epc A04;
    public static final EnumC33405Epc A05;
    public static final EnumC33405Epc A06;
    public static final EnumC33405Epc A07;
    public static final EnumC33405Epc A08;
    public static final EnumC33405Epc A09;
    public static final EnumC33405Epc A0A;
    public static final EnumC33405Epc A0B;
    public static final EnumC33405Epc A0C;
    public static final EnumC33405Epc A0D;
    public final String A00;

    public static EnumC33405Epc valueOf(String str) {
        return (EnumC33405Epc) Enum.valueOf(EnumC33405Epc.class, str);
    }

    public static EnumC33405Epc[] values() {
        return (EnumC33405Epc[]) A02.clone();
    }

    static {
        EnumC33405Epc enumC33405Epc = new EnumC33405Epc("PROFILE_NAV_ICON", 0, "profile_nav_icon");
        A09 = enumC33405Epc;
        EnumC33405Epc enumC33405Epc2 = new EnumC33405Epc("PROFILE_ACTION_BAR_ICON", 1, "profile_action_bar_icon");
        A08 = enumC33405Epc2;
        EnumC33405Epc enumC33405Epc3 = new EnumC33405Epc("PROFILE_NUX_DIALOG", 2, "profile_nux_dialog");
        A0A = enumC33405Epc3;
        EnumC33405Epc enumC33405Epc4 = new EnumC33405Epc("EXPLORE_NAV_ICON", 3, "explore_nav_icon");
        A07 = enumC33405Epc4;
        EnumC33405Epc enumC33405Epc5 = new EnumC33405Epc("DISCOVER_PEOPLE", 4, "discover_people");
        A03 = enumC33405Epc5;
        EnumC33405Epc enumC33405Epc6 = new EnumC33405Epc("DISCOVER_PEOPLE_INTERSTITIAL", 5, "discover_people_interstitial");
        A04 = enumC33405Epc6;
        EnumC33405Epc enumC33405Epc7 = new EnumC33405Epc("STORY_CAMERA", 6, "story_camera");
        A0D = enumC33405Epc7;
        EnumC33405Epc enumC33405Epc8 = new EnumC33405Epc("DOGFOOD_ASSISTANT", 7, "dogfood_assistant");
        A05 = enumC33405Epc8;
        EnumC33405Epc enumC33405Epc9 = new EnumC33405Epc("EXPANDED_PROFILE_PIC", 8, "expanded_profile_pic");
        A06 = enumC33405Epc9;
        EnumC33405Epc enumC33405Epc10 = new EnumC33405Epc("SHARE_PROFILE_PUSH", 9, "share_profile_push");
        A0C = enumC33405Epc10;
        EnumC33405Epc enumC33405Epc11 = new EnumC33405Epc("SHARE_PROFILE_AF", 10, "share_profile_af");
        A0B = enumC33405Epc11;
        EnumC33405Epc[] enumC33405EpcArr = {enumC33405Epc, enumC33405Epc2, enumC33405Epc3, enumC33405Epc4, enumC33405Epc5, enumC33405Epc6, enumC33405Epc7, enumC33405Epc8, enumC33405Epc9, enumC33405Epc10, enumC33405Epc11};
        A02 = enumC33405EpcArr;
        A01 = AbstractC12190kN.A00(enumC33405EpcArr);
    }

    public EnumC33405Epc(String str, int i, String str2) {
        this.A00 = str2;
    }
}
