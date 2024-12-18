package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8I1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8I1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8I1[] A01;
    public static final C8I1 A02;
    public static final C8I1 A03;
    public static final C8I1 A04;

    static {
        C8I1 c8i1 = new C8I1("NORMAL", 0);
        A03 = c8i1;
        C8I1 c8i12 = new C8I1("EASING", 1);
        A02 = c8i12;
        C8I1 c8i13 = new C8I1("STUCK", 2);
        A04 = c8i13;
        C8I1[] c8i1Arr = {c8i1, c8i12, c8i13};
        A01 = c8i1Arr;
        A00 = AbstractC12190kN.A00(c8i1Arr);
    }

    public static C8I1 valueOf(String str) {
        return (C8I1) Enum.valueOf(C8I1.class, str);
    }

    public static C8I1[] values() {
        return (C8I1[]) A01.clone();
    }

    public C8I1(String str, int i) {
    }
}
