package X;

/* renamed from: X.BMz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25434BMz extends C0T6 implements InterfaceC31047Dkl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;

    public C25434BMz(C25377BKu c25377BKu, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC30855DhU interfaceC30855DhU, InterfaceC30857DhW interfaceC30857DhW, InterfaceC30864Dhd interfaceC30864Dhd, InterfaceC30874Dhn interfaceC30874Dhn, InterfaceC30876Dhp interfaceC30876Dhp, InterfaceC30877Dhq interfaceC30877Dhq, boolean z, boolean z2) {
        this.A00 = 1;
        AbstractC167007dF.A1H(interfaceC30857DhW, 4, interfaceC30874Dhn);
        C14360o3.A0B(interfaceC30855DhU, 11);
        this.A06 = c120985dq;
        this.A08 = c37644Ghd;
        this.A07 = c25377BKu;
        this.A01 = interfaceC30857DhW;
        this.A02 = interfaceC30864Dhd;
        this.A09 = interfaceC30877Dhq;
        this.A03 = interfaceC30874Dhn;
        this.A05 = interfaceC30876Dhp;
        this.A0A = z;
        this.A0B = z2;
        this.A04 = interfaceC30855DhU;
    }

    @Override // X.InterfaceC31047Dkl
    public final C120985dq BMy() {
        return (C120985dq) this.A06;
    }

    @Override // X.InterfaceC31047Dkl
    public final C25377BKu BMz() {
        return (C25377BKu) this.A07;
    }

    @Override // X.InterfaceC31047Dkl
    public final C37644Ghd BN0() {
        return (C37644Ghd) this.A08;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C25434BMz) {
                    C25434BMz c25434BMz = (C25434BMz) obj;
                    if (c25434BMz.A00 != 1 || !C14360o3.A0K(this.A06, c25434BMz.A06) || !C14360o3.A0K(this.A08, c25434BMz.A08) || !C14360o3.A0K(this.A07, c25434BMz.A07) || !C14360o3.A0K(this.A01, c25434BMz.A01) || !C14360o3.A0K(this.A02, c25434BMz.A02) || !C14360o3.A0K(this.A09, c25434BMz.A09) || !C14360o3.A0K(this.A03, c25434BMz.A03) || !C14360o3.A0K(this.A05, c25434BMz.A05) || this.A0A != c25434BMz.A0A || this.A0B != c25434BMz.A0B || !C14360o3.A0K(this.A04, c25434BMz.A04)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C25434BMz)) {
                return false;
            }
            C25434BMz c25434BMz2 = (C25434BMz) obj;
            if (c25434BMz2.A00 != 0 || !C14360o3.A0K(this.A06, c25434BMz2.A06) || !C14360o3.A0K(this.A08, c25434BMz2.A08) || !C14360o3.A0K(this.A07, c25434BMz2.A07) || !C14360o3.A0K(this.A01, c25434BMz2.A01) || !C14360o3.A0K(this.A02, c25434BMz2.A02) || !C14360o3.A0K(this.A09, c25434BMz2.A09) || !C14360o3.A0K(this.A03, c25434BMz2.A03) || !C14360o3.A0K(this.A05, c25434BMz2.A05) || this.A0A != c25434BMz2.A0A || !C14360o3.A0K(this.A04, c25434BMz2.A04) || this.A0B != c25434BMz2.A0B) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int i;
        int i2 = this.A00;
        int A0D = AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A08, AbstractC166987dD.A0G(this.A06)))))))));
        if (i2 != 0) {
            A0J = AbstractC167007dF.A0D(this.A0B, A0D);
            i = this.A04.hashCode();
        } else {
            A0J = AbstractC166997dE.A0J(this.A04, A0D);
            i = 1237;
            if (this.A0B) {
                i = 1231;
            }
        }
        return A0J + i;
    }

    public C25434BMz(C25377BKu c25377BKu, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC30855DhU interfaceC30855DhU, InterfaceC30857DhW interfaceC30857DhW, InterfaceC30864Dhd interfaceC30864Dhd, InterfaceC30874Dhn interfaceC30874Dhn, InterfaceC30876Dhp interfaceC30876Dhp, InterfaceC30877Dhq interfaceC30877Dhq, boolean z) {
        this.A00 = 0;
        this.A00 = 0;
        C14360o3.A0B(interfaceC30857DhW, 4);
        C14360o3.A0B(interfaceC30874Dhn, 7);
        C14360o3.A0B(interfaceC30855DhU, 10);
        this.A06 = c120985dq;
        this.A08 = c37644Ghd;
        this.A07 = c25377BKu;
        this.A01 = interfaceC30857DhW;
        this.A02 = interfaceC30864Dhd;
        this.A09 = interfaceC30877Dhq;
        this.A03 = interfaceC30874Dhn;
        this.A05 = interfaceC30876Dhp;
        this.A0A = z;
        this.A04 = interfaceC30855DhU;
        this.A0B = false;
    }
}
