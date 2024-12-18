package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VD9 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VD9[] A01;
    public static final VD9 A02;
    public static final VD9 A03;
    public static final VD9 A04;
    public static final VD9 A05;
    public static final VD9 A06;
    public static final VD9 A07;
    public static final VD9 A08;

    static {
        VD9 vd9 = new VD9("MAIN_FEED", 0);
        A06 = vd9;
        VD9 vd92 = new VD9("STORY", 1);
        A08 = vd92;
        VD9 vd93 = new VD9("CLIPS", 2);
        A02 = vd93;
        VD9 vd94 = new VD9("EXPLORE", 3);
        A04 = vd94;
        VD9 vd95 = new VD9("CONTEXTUAL_FEED", 4);
        A03 = vd95;
        VD9 vd96 = new VD9("IGTV", 5);
        A05 = vd96;
        VD9 vd97 = new VD9("OTHER", 6);
        A07 = vd97;
        VD9[] vd9Arr = {vd9, vd92, vd93, vd94, vd95, vd96, vd97};
        A01 = vd9Arr;
        A00 = AbstractC12190kN.A00(vd9Arr);
    }

    public static VD9 valueOf(String str) {
        return (VD9) Enum.valueOf(VD9.class, str);
    }

    public static VD9[] values() {
        return (VD9[]) A01.clone();
    }

    public VD9(String str, int i) {
    }
}
