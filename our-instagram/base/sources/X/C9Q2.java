package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9Q2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Q2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C9Q2[] A01;
    public static final C9Q2 A02;
    public static final C9Q2 A03;
    public static final C9Q2 A04;
    public static final C9Q2 A05;
    public static final C9Q2 A06;
    public static final C9Q2 A07;
    public static final C9Q2 A08;
    public static final C9Q2 A09;

    static {
        C9Q2 c9q2 = new C9Q2("NUM_OF_THREADS", 0);
        A08 = c9q2;
        C9Q2 c9q22 = new C9Q2("NUM_OF_SCANNED_MESSAGES", 1);
        A07 = c9q22;
        C9Q2 c9q23 = new C9Q2("NUM_OF_MESSAGES", 2);
        A06 = c9q23;
        C9Q2 c9q24 = new C9Q2("GLOBAL_DICTIONARIES_ENABLED", 3);
        A04 = c9q24;
        C9Q2 c9q25 = new C9Q2("CUSTOM_DICTIONARY_ENABLED", 4);
        A03 = c9q25;
        C9Q2 c9q26 = new C9Q2("IS_CREATOR", 5);
        A05 = c9q26;
        C9Q2 c9q27 = new C9Q2("CREATOR_SEGMENTATION", 6);
        A02 = c9q27;
        C9Q2 c9q28 = new C9Q2("THREAD_TYPE", 7);
        A09 = c9q28;
        C9Q2[] c9q2Arr = {c9q2, c9q22, c9q23, c9q24, c9q25, c9q26, c9q27, c9q28};
        A01 = c9q2Arr;
        A00 = AbstractC12190kN.A00(c9q2Arr);
    }

    public static C9Q2 valueOf(String str) {
        return (C9Q2) Enum.valueOf(C9Q2.class, str);
    }

    public static C9Q2[] values() {
        return (C9Q2[]) A01.clone();
    }

    public C9Q2(String str, int i) {
    }
}
