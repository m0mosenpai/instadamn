package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7C {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7C[] A01;
    public static final C7C A02;
    public static final C7C A03;
    public static final C7C A04;
    public static final C7C A05;
    public static final C7C A06;
    public static final C7C A07;
    public static final C7C A08;
    public static final C7C A09;

    static {
        C7C c7c = new C7C("NUX", 0);
        A08 = c7c;
        C7C c7c2 = new C7C("CAPTURE_CONSENT", 1);
        A02 = c7c2;
        C7C c7c3 = new C7C("ONBOARDING", 2);
        A09 = c7c3;
        C7C c7c4 = new C7C("FINISH_NO_CONSENT", 3);
        A06 = c7c4;
        C7C c7c5 = new C7C("FINISH_INCOMPLETE", 4);
        A05 = c7c5;
        C7C c7c6 = new C7C("FINISH_SUCCESS", 5);
        A07 = c7c6;
        C7C c7c7 = new C7C("FINISH_FAILURE", 6);
        A04 = c7c7;
        C7C c7c8 = new C7C("EXTENDED_CAPTURE", 7);
        A03 = c7c8;
        C7C[] c7cArr = {c7c, c7c2, c7c3, c7c4, c7c5, c7c6, c7c7, c7c8};
        A01 = c7cArr;
        A00 = AbstractC12190kN.A00(c7cArr);
    }

    public static C7C valueOf(String str) {
        return (C7C) Enum.valueOf(C7C.class, str);
    }

    public static C7C[] values() {
        return (C7C[]) A01.clone();
    }

    public C7C(String str, int i) {
    }
}
