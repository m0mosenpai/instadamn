package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1WW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WW {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1WW[] A01;
    public static final C1WW A02;
    public static final C1WW A03;
    public static final C1WW A04;
    public static final C1WW A05;
    public static final C1WW A06;

    static {
        C1WW c1ww = new C1WW("GRID", 0);
        A03 = c1ww;
        C1WW c1ww2 = new C1WW("PROFILE_CIRCULAR", 1);
        A04 = c1ww2;
        C1WW c1ww3 = new C1WW("VIDEO_COVER", 2);
        A06 = c1ww3;
        C1WW c1ww4 = new C1WW("ADS_NON_9_16", 3);
        A02 = c1ww4;
        C1WW c1ww5 = new C1WW("UNIDENTIFIED", 4);
        A05 = c1ww5;
        C1WW[] c1wwArr = {c1ww, c1ww2, c1ww3, c1ww4, c1ww5};
        A01 = c1wwArr;
        A00 = AbstractC12190kN.A00(c1wwArr);
    }

    public static C1WW valueOf(String str) {
        return (C1WW) Enum.valueOf(C1WW.class, str);
    }

    public static C1WW[] values() {
        return (C1WW[]) A01.clone();
    }

    public C1WW(String str, int i) {
    }
}
