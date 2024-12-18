package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5L6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5L6 {
    public static final C5L6[] A05;
    public static final /* synthetic */ EnumEntries A06;
    public static final /* synthetic */ C5L6[] A07;
    public static final C5L6 A08;
    public static final C5L6 A09;
    public static final C5L6 A0A;
    public static final C5L6 A0B;
    public static final C5L6 A0C;
    public static final C5L6 A0D;
    public static final C5L6 A0E;
    public final float A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public static C5L6 valueOf(String str) {
        return (C5L6) Enum.valueOf(C5L6.class, str);
    }

    public static C5L6[] values() {
        return (C5L6[]) A07.clone();
    }

    static {
        C5L6 c5l6 = new C5L6("SQUARE", 1.0f, 0, 0, 2131962442, false, false);
        A0E = c5l6;
        C5L6 c5l62 = new C5L6("FOUR_BY_FIVE", 0.8f, 1, 1, 2131962437, true, false);
        A08 = c5l62;
        C5L6 c5l63 = new C5L6("NINE_BY_SIXTEEN", 0.5625f, 2, 2, 2131962439, false, false);
        A0A = c5l63;
        C5L6 c5l64 = new C5L6("SIXTEEN_BY_NINE", 1.7778f, 3, 3, 2131962441, true, false);
        A0D = c5l64;
        C5L6 c5l65 = new C5L6("ORIGINAL", 1.0f, 4, 4, 2131962443, true, true);
        A0B = c5l65;
        C5L6 c5l66 = new C5L6("LANDSCAPE", 1.2f, 5, 1, 2131962438, true, true);
        A09 = c5l66;
        C5L6 c5l67 = new C5L6("PORTRAIT", 0.8f, 6, 2, 2131962440, false, true);
        A0C = c5l67;
        C5L6[] c5l6Arr = {c5l6, c5l62, c5l63, c5l64, c5l65, c5l66, c5l67};
        A07 = c5l6Arr;
        A06 = AbstractC12190kN.A00(c5l6Arr);
        A05 = values();
    }

    public C5L6(String str, float f, int i, int i2, int i3, boolean z, boolean z2) {
        this.A01 = i2;
        this.A00 = f;
        this.A03 = z;
        this.A02 = i3;
        this.A04 = z2;
    }
}
