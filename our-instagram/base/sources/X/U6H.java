package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class U6H {
    public static final U6H[] A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ U6H[] A04;
    public static final U6H A05;
    public static final U6H A06;
    public static final U6H A07;
    public static final U6H A08;
    public static final U6H A09;
    public static final U6H A0A;
    public static final U6H A0B;
    public final String A00;
    public final boolean A01;

    public static U6H valueOf(String str) {
        return (U6H) Enum.valueOf(U6H.class, str);
    }

    public static U6H[] values() {
        return (U6H[]) A04.clone();
    }

    static {
        U6H u6h = new U6H("FULL_SHEET", "full_sheet", 0, false);
        A08 = u6h;
        U6H u6h2 = new U6H("HALF_SHEET", "half_sheet", 1, false);
        A09 = u6h2;
        U6H u6h3 = new U6H("AUTO_SHEET", "auto_sheet", 2, false);
        A05 = u6h3;
        U6H u6h4 = new U6H("FULL_SCREEN", "full_screen", 3, false);
        A07 = u6h4;
        U6H u6h5 = new U6H("FLEXIBLE_SHEET", "flexible_sheet", 4, true);
        A06 = u6h5;
        U6H u6h6 = new U6H("HALF_SHEET_WITH_UNDERLAY", "half_sheet_with_underlay", 5, false);
        A0A = u6h6;
        U6H u6h7 = new U6H("WRAP_CONTENT_SHEET", "wrap_content_sheet", 6, true);
        A0B = u6h7;
        U6H[] u6hArr = {u6h, u6h2, u6h3, u6h4, u6h5, u6h6, u6h7};
        A04 = u6hArr;
        C020508b A00 = AbstractC12190kN.A00(u6hArr);
        A03 = A00;
        A02 = (U6H[]) A00.toArray(new U6H[0]);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public U6H(String str, String str2, int i, boolean z) {
        this.A00 = str2;
        this.A01 = z;
    }
}
