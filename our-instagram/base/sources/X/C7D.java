package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7D {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7D[] A01;
    public static final C7D A02;
    public static final C7D A03;
    public static final C7D A04;
    public static final C7D A05;
    public static final C7D A06;
    public static final C7D A07;
    public static final C7D A08;
    public static final C7D A09;

    static {
        C7D c7d = new C7D("GOOD_CHIP", 0);
        A09 = c7d;
        C7D c7d2 = new C7D("BAD_NOT_RELEVANT_CHIP", 1);
        A04 = c7d2;
        C7D c7d3 = new C7D("BAD_NOT_ACCURATE_CHIP", 2);
        A03 = c7d3;
        C7D c7d4 = new C7D("BAD_TOO_REPETITIVE_CHIP", 3);
        A07 = c7d4;
        C7D c7d5 = new C7D("BAD_HARMFUL_OR_OFFENSIVE_CHIP", 4);
        A02 = c7d5;
        C7D c7d6 = new C7D("BAD_NOT_VISUALLY_APPEALING", 5);
        A05 = c7d6;
        C7D c7d7 = new C7D("BAD_OTHER_CHIP", 6);
        A06 = c7d7;
        C7D c7d8 = new C7D("DISMISS_ON_REASON_SCREEN", 7);
        A08 = c7d8;
        C7D[] c7dArr = {c7d, c7d2, c7d3, c7d4, c7d5, c7d6, c7d7, c7d8};
        A01 = c7dArr;
        A00 = AbstractC12190kN.A00(c7dArr);
    }

    public static C7D valueOf(String str) {
        return (C7D) Enum.valueOf(C7D.class, str);
    }

    public static C7D[] values() {
        return (C7D[]) A01.clone();
    }

    public C7D(String str, int i) {
    }
}
