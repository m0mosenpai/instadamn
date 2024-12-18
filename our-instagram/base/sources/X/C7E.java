package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7E {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7E[] A01;
    public static final C7E A02;
    public static final C7E A03;
    public static final C7E A04;
    public static final C7E A05;
    public static final C7E A06;
    public static final C7E A07;
    public static final C7E A08;
    public static final C7E A09;
    public static final C7E A0A;
    public static final C7E A0B;
    public static final C7E A0C;

    public static C7E valueOf(String str) {
        return (C7E) Enum.valueOf(C7E.class, str);
    }

    public static C7E[] values() {
        return (C7E[]) A01.clone();
    }

    static {
        C7E c7e = new C7E("FOLLOW", 0);
        A04 = c7e;
        C7E c7e2 = new C7E("FOLLOWING", 1);
        A05 = c7e2;
        C7E c7e3 = new C7E("LOADING", 2);
        A07 = c7e3;
        C7E c7e4 = new C7E("REQUESTED", 3);
        A09 = c7e4;
        C7E c7e5 = new C7E("CANCEL", 4);
        A03 = c7e5;
        C7E c7e6 = new C7E("FOLLOW_BACK", 5);
        A06 = c7e6;
        C7E c7e7 = new C7E("REMOVE", 6);
        A08 = c7e7;
        C7E c7e8 = new C7E("UNBLOCK", 7);
        A0A = c7e8;
        C7E c7e9 = new C7E("BlOCK", 8);
        A02 = c7e9;
        C7E c7e10 = new C7E("UNKNOWN", 9);
        A0B = c7e10;
        C7E c7e11 = new C7E("UNRESTRICT", 10);
        A0C = c7e11;
        C7E[] c7eArr = {c7e, c7e2, c7e3, c7e4, c7e5, c7e6, c7e7, c7e8, c7e9, c7e10, c7e11, new C7E("RESTRICT", 11)};
        A01 = c7eArr;
        A00 = AbstractC12190kN.A00(c7eArr);
    }

    public C7E(String str, int i) {
    }
}
