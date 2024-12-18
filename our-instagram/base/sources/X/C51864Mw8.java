package X;

/* renamed from: X.Mw8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51864Mw8 extends C0T6 implements InterfaceC57855PlL {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51864Mw8) {
                C51864Mw8 c51864Mw8 = (C51864Mw8) obj;
                if (this.A00 != c51864Mw8.A00 || this.A03 != c51864Mw8.A03 || this.A01 != c51864Mw8.A01 || this.A02 != c51864Mw8.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC25225BEi.A08(this.A00))));
    }

    public C51864Mw8(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }
}
