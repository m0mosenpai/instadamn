package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4M3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4M3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4M3[] A01;
    public static final C4M3 A02;
    public static final C4M3 A03;
    public static final C4M3 A04;
    public static final C4M3 A05;
    public static final C4M3 A06;

    static {
        C4M3 c4m3 = new C4M3("VALID_MESSAGE", 0);
        A06 = c4m3;
        C4M3 c4m32 = new C4M3("HOLE_DETECTED", 1);
        A03 = c4m32;
        C4M3 c4m33 = new C4M3("GAP_TOLERANCE_EXCEEDED", 2);
        A02 = c4m33;
        C4M3 c4m34 = new C4M3("TIMEOUT", 3);
        A05 = c4m34;
        C4M3 c4m35 = new C4M3("SNAPSHOT_SUCCESS", 4);
        A04 = c4m35;
        C4M3[] c4m3Arr = {c4m3, c4m32, c4m33, c4m34, c4m35};
        A01 = c4m3Arr;
        A00 = AbstractC12190kN.A00(c4m3Arr);
    }

    public static C4M3 valueOf(String str) {
        return (C4M3) Enum.valueOf(C4M3.class, str);
    }

    public static C4M3[] values() {
        return (C4M3[]) A01.clone();
    }

    public C4M3(String str, int i) {
    }
}
