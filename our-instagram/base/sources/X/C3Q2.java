package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Q2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Q2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C3Q2[] A01;
    public static final C3Q2 A02;
    public static final C3Q2 A03;

    static {
        C3Q2 c3q2 = new C3Q2("FREE", 0);
        A02 = c3q2;
        C3Q2 c3q22 = new C3Q2("PAID", 1);
        A03 = c3q22;
        C3Q2[] c3q2Arr = {c3q2, c3q22};
        A01 = c3q2Arr;
        A00 = AbstractC12190kN.A00(c3q2Arr);
    }

    public static C3Q2 valueOf(String str) {
        return (C3Q2) Enum.valueOf(C3Q2.class, str);
    }

    public static C3Q2[] values() {
        return (C3Q2[]) A01.clone();
    }

    public C3Q2(String str, int i) {
    }
}
