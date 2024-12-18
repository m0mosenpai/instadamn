package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7A {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7A[] A01;
    public static final C7A A02;
    public static final C7A A03;
    public static final C7A A04;
    public static final C7A A05;
    public static final C7A A06;
    public static final C7A A07;
    public static final C7A A08;
    public static final C7A A09;

    static {
        C7A c7a = new C7A("PostNotAvailable", 0);
        A05 = c7a;
        C7A c7a2 = new C7A("ReplyNotAvailable", 1);
        A09 = c7a2;
        C7A c7a3 = new C7A("PostHidden", 2);
        A02 = c7a3;
        C7A c7a4 = new C7A("PostHiddenTifu", 3);
        A03 = c7a4;
        C7A c7a5 = new C7A("PostReportedTifu", 4);
        A06 = c7a5;
        C7A c7a6 = new C7A("PostHiddenTifu1x1", 5);
        A04 = c7a6;
        C7A c7a7 = new C7A("PostReportedTifu1x1", 6);
        A07 = c7a7;
        C7A c7a8 = new C7A("ReplyHushed", 7);
        A08 = c7a8;
        C7A[] c7aArr = {c7a, c7a2, c7a3, c7a4, c7a5, c7a6, c7a7, c7a8};
        A01 = c7aArr;
        A00 = AbstractC12190kN.A00(c7aArr);
    }

    public static C7A valueOf(String str) {
        return (C7A) Enum.valueOf(C7A.class, str);
    }

    public static C7A[] values() {
        return (C7A[]) A01.clone();
    }

    public C7A(String str, int i) {
    }
}
