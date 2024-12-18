package X;

import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class BL6 extends C0T6 implements InterfaceC31047Dkl, InterfaceC30864Dhd {
    public final MVN A00;
    public final C25377BKu A01;
    public final C120985dq A02;
    public final C37644Ghd A03;
    public final C38321qM A04;
    public final User A05;
    public final InterfaceC30865Dhe A06;
    public final InterfaceC30866Dhf A07;
    public final InterfaceC30867Dhg A08;
    public final InterfaceC30868Dhh A09;
    public final InterfaceC30869Dhi A0A;
    public final InterfaceC30871Dhk A0B;
    public final InterfaceC30872Dhl A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BL6) {
                BL6 bl6 = (BL6) obj;
                if (!C14360o3.A0K(this.A02, bl6.A02) || !C14360o3.A0K(this.A03, bl6.A03) || !C14360o3.A0K(this.A01, bl6.A01) || !C14360o3.A0K(this.A04, bl6.A04) || !C14360o3.A0K(this.A05, bl6.A05) || !C14360o3.A0K(this.A08, bl6.A08) || !C14360o3.A0K(this.A0C, bl6.A0C) || !C14360o3.A0K(this.A0B, bl6.A0B) || !C14360o3.A0K(this.A07, bl6.A07) || !C14360o3.A0K(this.A0A, bl6.A0A) || !C14360o3.A0K(this.A09, bl6.A09) || !C14360o3.A0K(this.A00, bl6.A00) || this.A0H != bl6.A0H || this.A0J != bl6.A0J || this.A0K != bl6.A0K || this.A0E != bl6.A0E || this.A0F != bl6.A0F || this.A0G != bl6.A0G || this.A0D != bl6.A0D || !C14360o3.A0K(this.A06, bl6.A06) || this.A0I != bl6.A0I) {
                }
            }
            return false;
        }
        return true;
    }

    public BL6(MVN mvn, C25377BKu c25377BKu, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, User user, InterfaceC30865Dhe interfaceC30865Dhe, InterfaceC30866Dhf interfaceC30866Dhf, InterfaceC30867Dhg interfaceC30867Dhg, InterfaceC30868Dhh interfaceC30868Dhh, InterfaceC30869Dhi interfaceC30869Dhi, InterfaceC30871Dhk interfaceC30871Dhk, InterfaceC30872Dhl interfaceC30872Dhl, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C14360o3.A0B(interfaceC30866Dhf, 9);
        this.A02 = c120985dq;
        this.A03 = c37644Ghd;
        this.A01 = c25377BKu;
        this.A04 = c38321qM;
        this.A05 = user;
        this.A08 = interfaceC30867Dhg;
        this.A0C = interfaceC30872Dhl;
        this.A0B = interfaceC30871Dhk;
        this.A07 = interfaceC30866Dhf;
        this.A0A = interfaceC30869Dhi;
        this.A09 = interfaceC30868Dhh;
        this.A00 = mvn;
        this.A0H = z;
        this.A0J = z2;
        this.A0K = z3;
        this.A0E = z4;
        this.A0F = z5;
        this.A0G = z6;
        this.A0D = z7;
        this.A06 = interfaceC30865Dhe;
        this.A0I = z8;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0I, AbstractC166997dE.A0J(this.A06, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0H, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0J(this.A0C, AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A02)))))))))))))))))))));
    }

    @Override // X.InterfaceC31047Dkl
    public final C120985dq BMy() {
        return this.A02;
    }

    @Override // X.InterfaceC31047Dkl
    public final C25377BKu BMz() {
        return this.A01;
    }

    @Override // X.InterfaceC31047Dkl
    public final C37644Ghd BN0() {
        return this.A03;
    }
}
