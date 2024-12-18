package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1X2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1X2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1X2[] A01;
    public static final C1X2 A02;
    public static final C1X2 A03;
    public static final C1X2 A04;

    static {
        C1X2 c1x2 = new C1X2("LOW", 0);
        A03 = c1x2;
        C1X2 c1x22 = new C1X2("MEDIUM", 1);
        A04 = c1x22;
        C1X2 c1x23 = new C1X2("HIGH", 2);
        A02 = c1x23;
        C1X2[] c1x2Arr = {c1x2, c1x22, c1x23};
        A01 = c1x2Arr;
        A00 = AbstractC12190kN.A00(c1x2Arr);
    }

    public static C1X2 valueOf(String str) {
        return (C1X2) Enum.valueOf(C1X2.class, str);
    }

    public static C1X2[] values() {
        return (C1X2[]) A01.clone();
    }

    public C1X2(String str, int i) {
    }
}
