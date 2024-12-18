package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VD1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VD1[] A01;
    public static final VD1 A02;
    public static final VD1 A03;
    public static final VD1 A04;
    public static final VD1 A05;

    static {
        VD1 vd1 = new VD1("POST_TYPE", 0);
        A04 = vd1;
        VD1 vd12 = new VD1("POST_TIME_FRAME", 1);
        A03 = vd12;
        VD1 vd13 = new VD1("STORY_TIME_FRAME", 2);
        A05 = vd13;
        VD1 vd14 = new VD1("ELIGIBILITY", 3);
        A02 = vd14;
        VD1[] vd1Arr = {vd1, vd12, vd13, vd14};
        A01 = vd1Arr;
        A00 = AbstractC12190kN.A00(vd1Arr);
    }

    public static VD1 valueOf(String str) {
        return (VD1) Enum.valueOf(VD1.class, str);
    }

    public static VD1[] values() {
        return (VD1[]) A01.clone();
    }

    public VD1(String str, int i) {
    }
}
