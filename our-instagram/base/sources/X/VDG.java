package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDG {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VDG[] A01;
    public static final VDG A02;
    public static final VDG A03;
    public static final VDG A04;
    public static final VDG A05;
    public static final VDG A06;
    public static final VDG A07;
    public static final VDG A08;
    public static final VDG A09;
    public static final VDG A0A;
    public static final VDG A0B;
    public static final VDG A0C;
    public static final VDG A0D;
    public static final VDG A0E;

    static {
        VDG vdg = new VDG("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A0C = vdg;
        VDG vdg2 = new VDG("UNKNOWN", 1);
        A0B = vdg2;
        VDG vdg3 = new VDG("IMAGE", 2);
        A08 = vdg3;
        VDG vdg4 = new VDG("VIDEO", 3);
        A0D = vdg4;
        VDG vdg5 = new VDG("ALBUM", 4);
        A02 = vdg5;
        VDG vdg6 = new VDG("WEBVIEW", 5);
        A0E = vdg6;
        VDG vdg7 = new VDG("BUNDLE", 6);
        A05 = vdg7;
        VDG vdg8 = new VDG("MONTHLY_ACTIVE_CARD", 7);
        A09 = vdg8;
        VDG vdg9 = new VDG("BROADCAST", 8);
        A04 = vdg9;
        VDG vdg10 = new VDG("CAROUSEL_V2", 9);
        A06 = vdg10;
        VDG vdg11 = new VDG("COLLECTION", 10);
        A07 = vdg11;
        VDG vdg12 = new VDG("AUDIO", 11);
        A03 = vdg12;
        VDG vdg13 = new VDG("SHOPPING", 12);
        A0A = vdg13;
        VDG[] vdgArr = {vdg, vdg2, vdg3, vdg4, vdg5, vdg6, vdg7, vdg8, vdg9, vdg10, vdg11, vdg12, vdg13, new VDG("STORY", 13)};
        A01 = vdgArr;
        A00 = AbstractC12190kN.A00(vdgArr);
    }

    public static VDG valueOf(String str) {
        return (VDG) Enum.valueOf(VDG.class, str);
    }

    public static VDG[] values() {
        return (VDG[]) A01.clone();
    }

    public VDG(String str, int i) {
    }
}
