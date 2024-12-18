package X;

/* renamed from: X.K2u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45292K2u extends C0T6 implements MNW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final EnumC92974Es A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45292K2u) {
                C45292K2u c45292K2u = (C45292K2u) obj;
                if (this.A03 != c45292K2u.A03 || this.A0A != c45292K2u.A0A || this.A0B != c45292K2u.A0B || this.A08 != c45292K2u.A08 || this.A04 != c45292K2u.A04 || this.A02 != c45292K2u.A02 || this.A06 != c45292K2u.A06 || this.A05 != c45292K2u.A05 || this.A00 != c45292K2u.A00 || this.A01 != c45292K2u.A01 || this.A07 != c45292K2u.A07 || this.A09 != c45292K2u.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A07, (((AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0A, AbstractC166987dD.A0G(this.A03))))) + this.A02) * 31)) + this.A00) * 31) + this.A01) * 31));
    }

    public C45292K2u(EnumC92974Es enumC92974Es, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A03 = enumC92974Es;
        this.A0A = z;
        this.A0B = z2;
        this.A08 = z3;
        this.A04 = z4;
        this.A02 = i;
        this.A06 = z5;
        this.A05 = z6;
        this.A00 = i2;
        this.A01 = i3;
        this.A07 = z7;
        this.A09 = z8;
    }

    public C45292K2u() {
        this(EnumC92974Es.A0A, 0, 0, 0, false, true, false, false, false, false, false, false);
    }
}
