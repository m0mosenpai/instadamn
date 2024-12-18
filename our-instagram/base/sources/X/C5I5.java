package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5I5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5I5 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C5I5[] A02;
    public static final C5I5 A03;
    public static final C5I5 A04;
    public static final C5I5 A05;
    public static final C5I5 A06;
    public static final C5I5 A07;
    public final int A00;

    static {
        C5I5 c5i5 = new C5I5("IN_AD_POOL", 0, 0);
        A05 = c5i5;
        C5I5 c5i52 = new C5I5("INSERTED_SUCCESSFULLY", 1, 1);
        A03 = c5i52;
        C5I5 c5i53 = new C5I5("INVALIDATED", 2, 2);
        A04 = c5i53;
        C5I5 c5i54 = new C5I5("SEEN", 3, 3);
        A06 = c5i54;
        C5I5 c5i55 = new C5I5("UNDEFINED", 4, 4);
        A07 = c5i55;
        C5I5[] c5i5Arr = {c5i5, c5i52, c5i53, c5i54, c5i55};
        A02 = c5i5Arr;
        A01 = AbstractC12190kN.A00(c5i5Arr);
    }

    public static C5I5 valueOf(String str) {
        return (C5I5) Enum.valueOf(C5I5.class, str);
    }

    public static C5I5[] values() {
        return (C5I5[]) A02.clone();
    }

    public C5I5(String str, int i, int i2) {
        this.A00 = i2;
    }
}
