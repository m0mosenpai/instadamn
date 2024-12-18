package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8A3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8A3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8A3[] A01;
    public static final C8A3 A02;
    public static final C8A3 A03;
    public static final C8A3 A04;

    static {
        C8A3 c8a3 = new C8A3("FLAT", 0);
        A03 = c8a3;
        C8A3 c8a32 = new C8A3("BOOK", 1);
        A02 = c8a32;
        C8A3 c8a33 = new C8A3("TABLE_TOP", 2);
        A04 = c8a33;
        C8A3[] c8a3Arr = {c8a3, c8a32, c8a33};
        A01 = c8a3Arr;
        A00 = AbstractC12190kN.A00(c8a3Arr);
    }

    public static C8A3 valueOf(String str) {
        return (C8A3) Enum.valueOf(C8A3.class, str);
    }

    public static C8A3[] values() {
        return (C8A3[]) A01.clone();
    }

    public C8A3(String str, int i) {
    }
}
