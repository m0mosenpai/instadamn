package X;

/* renamed from: X.Sf9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63205Sf9 {
    public final int A00;
    public final C64531TIl A01;
    public final C64531TIl A02;
    public static final C64531TIl A03 = C64531TIl.A02(":");
    public static final C64531TIl A04 = C64531TIl.A02(":status");
    public static final C64531TIl A06 = C64531TIl.A02(":method");
    public static final C64531TIl A07 = C64531TIl.A02(":path");
    public static final C64531TIl A08 = C64531TIl.A02(":scheme");
    public static final C64531TIl A05 = C64531TIl.A02(":authority");

    public final boolean equals(Object obj) {
        if (!(obj instanceof C63205Sf9)) {
            return false;
        }
        C63205Sf9 c63205Sf9 = (C63205Sf9) obj;
        if (!this.A01.equals(c63205Sf9.A01)) {
            return false;
        }
        return AbstractC58320PtC.A1X(this.A02, c63205Sf9.A02);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, JQ0.A01(this.A01.hashCode()));
    }

    public final String toString() {
        return AbstractC58321PtD.A0x("%s: %s", new Object[]{this.A01.A07(), this.A02.A07()});
    }

    public C63205Sf9(C64531TIl c64531TIl, C64531TIl c64531TIl2) {
        this.A01 = c64531TIl;
        this.A02 = c64531TIl2;
        this.A00 = c64531TIl.A05() + 32 + c64531TIl2.A05();
    }

    public C63205Sf9(String str, C64531TIl c64531TIl) {
        this(c64531TIl, C64531TIl.A02(str));
    }
}
