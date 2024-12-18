package X;

/* renamed from: X.E6e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32052E6e extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C5QE A04;
    public final C5QE A05;
    public final C5QE A06;
    public final C5QE A07;
    public final C5QE A08;
    public final C5QE A09;
    public final InterfaceC37092GWb A0A;
    public final InterfaceC37092GWb A0B;
    public final InterfaceC37092GWb A0C;

    public /* synthetic */ C32052E6e(C5QE c5qe, C5QE c5qe2, C5QE c5qe3, C5QE c5qe4, C5QE c5qe5, InterfaceC37092GWb interfaceC37092GWb, InterfaceC37092GWb interfaceC37092GWb2, InterfaceC37092GWb interfaceC37092GWb3, int i, int i2, int i3, int i4) {
        BHS A00 = BHS.A00(new Object[0], 2131955087);
        this.A03 = i;
        this.A06 = c5qe;
        this.A00 = i2;
        this.A07 = c5qe2;
        this.A0A = interfaceC37092GWb;
        this.A01 = i3;
        this.A08 = c5qe3;
        this.A0B = interfaceC37092GWb2;
        this.A02 = i4;
        this.A09 = c5qe4;
        this.A0C = interfaceC37092GWb3;
        this.A05 = A00;
        this.A04 = c5qe5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32052E6e) {
                C32052E6e c32052E6e = (C32052E6e) obj;
                if (this.A03 != c32052E6e.A03 || !C14360o3.A0K(this.A06, c32052E6e.A06) || this.A00 != c32052E6e.A00 || !C14360o3.A0K(this.A07, c32052E6e.A07) || !C14360o3.A0K(this.A0A, c32052E6e.A0A) || this.A01 != c32052E6e.A01 || !C14360o3.A0K(this.A08, c32052E6e.A08) || !C14360o3.A0K(this.A0B, c32052E6e.A0B) || this.A02 != c32052E6e.A02 || !C14360o3.A0K(this.A09, c32052E6e.A09) || !C14360o3.A0K(this.A0C, c32052E6e.A0C) || !C14360o3.A0K(this.A05, c32052E6e.A05) || !C14360o3.A0K(this.A04, c32052E6e.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A0C, AbstractC166997dE.A0J(this.A09, (AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0J(this.A08, (AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A07, (AbstractC166997dE.A0J(this.A06, this.A03 * 31) + this.A00) * 31)) + this.A01) * 31)) + this.A02) * 31))) + AbstractC167017dG.A0M(this.A04);
    }
}
