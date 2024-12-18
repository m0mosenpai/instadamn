package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4M1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4M1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4M1[] A01;
    public static final C4M1 A02;
    public static final C4M1 A03;
    public static final C4M1 A04;

    static {
        C4M1 c4m1 = new C4M1("ORDERED", 0);
        A02 = c4m1;
        C4M1 c4m12 = new C4M1("UNORDERED", 1);
        A04 = c4m12;
        C4M1 c4m13 = new C4M1("REQUESTING_SNAPSHOT", 2);
        A03 = c4m13;
        C4M1[] c4m1Arr = {c4m1, c4m12, c4m13};
        A01 = c4m1Arr;
        A00 = AbstractC12190kN.A00(c4m1Arr);
    }

    public static C4M1 valueOf(String str) {
        return (C4M1) Enum.valueOf(C4M1.class, str);
    }

    public static C4M1[] values() {
        return (C4M1[]) A01.clone();
    }

    public C4M1(String str, int i) {
    }
}
