package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BP9 extends C0T6 implements InterfaceC31047Dkl, InterfaceC30857DhW {
    public final C120985dq A00;
    public final C38321qM A01;
    public final InterfaceC30858DhX A02;
    public final InterfaceC30860DhZ A03;
    public final InterfaceC30861Dha A04;
    public final List A05;
    public final boolean A06;
    public final C25377BKu A07;
    public final C37644Ghd A08;
    public final C75113Zb A09;

    public BP9(C25377BKu c25377BKu, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC30858DhX interfaceC30858DhX, InterfaceC30860DhZ interfaceC30860DhZ, InterfaceC30861Dha interfaceC30861Dha, List list, boolean z) {
        C14360o3.A0B(interfaceC30860DhZ, 7);
        C14360o3.A0B(interfaceC30861Dha, 9);
        this.A00 = c120985dq;
        this.A08 = c37644Ghd;
        this.A07 = c25377BKu;
        this.A01 = c38321qM;
        this.A09 = c75113Zb;
        this.A02 = interfaceC30858DhX;
        this.A03 = interfaceC30860DhZ;
        this.A05 = list;
        this.A04 = interfaceC30861Dha;
        this.A06 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BP9) {
                BP9 bp9 = (BP9) obj;
                if (!C14360o3.A0K(this.A00, bp9.A00) || !C14360o3.A0K(this.A08, bp9.A08) || !C14360o3.A0K(this.A07, bp9.A07) || !C14360o3.A0K(this.A01, bp9.A01) || !C14360o3.A0K(this.A09, bp9.A09) || !C14360o3.A0K(this.A02, bp9.A02) || !C14360o3.A0K(this.A03, bp9.A03) || !C14360o3.A0K(this.A05, bp9.A05) || !C14360o3.A0K(this.A04, bp9.A04) || this.A06 != bp9.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A08, AbstractC166987dD.A0G(this.A00))))))))));
    }

    @Override // X.InterfaceC31047Dkl
    public final C120985dq BMy() {
        return this.A00;
    }

    @Override // X.InterfaceC31047Dkl
    public final C25377BKu BMz() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31047Dkl
    public final C37644Ghd BN0() {
        throw C00O.createAndThrow();
    }
}
