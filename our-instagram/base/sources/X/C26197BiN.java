package X;

/* renamed from: X.BiN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26197BiN extends C0T6 implements InterfaceC30817Dgs {
    public final InterfaceC30813Dgo A00;
    public final L2X A01;
    public final C77 A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26197BiN) {
                C26197BiN c26197BiN = (C26197BiN) obj;
                if (this.A02 != c26197BiN.A02 || !C14360o3.A0K(this.A01, c26197BiN.A01) || !C14360o3.A0K(this.A00, c26197BiN.A00) || this.A03 != c26197BiN.A03 || this.A06 != c26197BiN.A06 || this.A07 != c26197BiN.A07 || this.A05 != c26197BiN.A05 || this.A04 != c26197BiN.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A00, (AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31))))));
    }

    public C26197BiN(InterfaceC30813Dgo interfaceC30813Dgo, L2X l2x, C77 c77, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AbstractC167017dG.A1Q(c77, interfaceC30813Dgo);
        this.A02 = c77;
        this.A01 = l2x;
        this.A00 = interfaceC30813Dgo;
        this.A03 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A05 = z4;
        this.A04 = z5;
    }
}
