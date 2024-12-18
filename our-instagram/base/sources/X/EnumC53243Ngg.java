package X;

import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53243Ngg {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53243Ngg[] A03;
    public static final EnumC53243Ngg A04;
    public static final EnumC53243Ngg A05;
    public static final EnumC53243Ngg A06;
    public static final EnumC53243Ngg A07;
    public static final EnumC53243Ngg A08;
    public static final EnumC53243Ngg A09;
    public static final EnumC53243Ngg A0A;
    public static final EnumC53243Ngg A0B;
    public static final EnumC53243Ngg A0C;
    public static final EnumC53243Ngg A0D;
    public static final EnumC53243Ngg A0E;
    public static final EnumC53243Ngg A0F;
    public static final EnumC53243Ngg A0G;
    public final String A00;

    static {
        EnumC53243Ngg enumC53243Ngg = new EnumC53243Ngg("ARCHIVE", 0, "archive");
        A04 = enumC53243Ngg;
        EnumC53243Ngg enumC53243Ngg2 = new EnumC53243Ngg("CREATE_STORY_LONG_PRESS", 1, "create_story_long_press");
        A05 = enumC53243Ngg2;
        EnumC53243Ngg enumC53243Ngg3 = new EnumC53243Ngg("DIRECT_RECIPIENT_PICKER", 2, "direct_recipient_picker");
        A06 = enumC53243Ngg3;
        EnumC53243Ngg enumC53243Ngg4 = new EnumC53243Ngg("SELF_PROFILE", 3, "self_profile");
        A09 = enumC53243Ngg4;
        EnumC53243Ngg enumC53243Ngg5 = new EnumC53243Ngg("EDIT_HIGHLIGHTS", 4, "edit_highlights");
        A07 = enumC53243Ngg5;
        EnumC53243Ngg enumC53243Ngg6 = new EnumC53243Ngg("STORY_VIEWER_ARCHIVE", 5, "story_viewer_archive");
        A0A = enumC53243Ngg6;
        EnumC53243Ngg enumC53243Ngg7 = new EnumC53243Ngg("STORY_VIEWER_DEFAULT", 6, "story_viewer_default");
        A0B = enumC53243Ngg7;
        EnumC53243Ngg enumC53243Ngg8 = new EnumC53243Ngg("STORY_VIEWER_FEED", 7, "story_viewer_feed");
        A0D = enumC53243Ngg8;
        EnumC53243Ngg enumC53243Ngg9 = new EnumC53243Ngg("STORY_VIEWER_PROFILE", 8, "story_viewer_profile");
        A0E = enumC53243Ngg9;
        EnumC53243Ngg enumC53243Ngg10 = new EnumC53243Ngg("STORY_VIEWER_SUGGESTED_HIGHLIGHT", 9, "story_viewer_suggested_highlight");
        A0F = enumC53243Ngg10;
        EnumC53243Ngg enumC53243Ngg11 = new EnumC53243Ngg("STORY_VIEWER_EDIT_SUGGESTED_HIGHLIGHT", 10, "story_viewer_edit_suggested_highlight");
        A0C = enumC53243Ngg11;
        EnumC53243Ngg enumC53243Ngg12 = new EnumC53243Ngg("UNIVERSAL_CREATION_MENU", 11, "universal_creation_menu");
        A0G = enumC53243Ngg12;
        EnumC53243Ngg enumC53243Ngg13 = new EnumC53243Ngg("HIGHLIGHTS_MANAGEMENT_SCREEN", 12, "manage_highlights");
        A08 = enumC53243Ngg13;
        EnumC53243Ngg[] enumC53243NggArr = {enumC53243Ngg, enumC53243Ngg2, enumC53243Ngg3, enumC53243Ngg4, enumC53243Ngg5, enumC53243Ngg6, enumC53243Ngg7, enumC53243Ngg8, enumC53243Ngg9, enumC53243Ngg10, enumC53243Ngg11, enumC53243Ngg12, enumC53243Ngg13};
        A03 = enumC53243NggArr;
        A02 = AbstractC12190kN.A00(enumC53243NggArr);
        A01 = AbstractC166987dD.A1G();
        for (EnumC53243Ngg enumC53243Ngg14 : values()) {
            A01.put(enumC53243Ngg14.A00, enumC53243Ngg14);
        }
    }

    public static EnumC53243Ngg valueOf(String str) {
        return (EnumC53243Ngg) Enum.valueOf(EnumC53243Ngg.class, str);
    }

    public static EnumC53243Ngg[] values() {
        return (EnumC53243Ngg[]) A03.clone();
    }

    public EnumC53243Ngg(String str, int i, String str2) {
        this.A00 = str2;
    }
}
