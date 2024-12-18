package X;

/* loaded from: classes5.dex */
public final class BT7 extends C0T6 implements InterfaceC31047Dkl, InterfaceC30857DhW {
    public final C38321qM A00;
    public final C75113Zb A01;
    public final InterfaceC30859DhY A02;
    public final InterfaceC30860DhZ A03;
    public final InterfaceC30861Dha A04;
    public final InterfaceC30863Dhc A05;
    public final boolean A06;
    public final C25377BKu A07;
    public final C120985dq A08;
    public final C37644Ghd A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BT7) {
                BT7 bt7 = (BT7) obj;
                if (!C14360o3.A0K(this.A08, bt7.A08) || !C14360o3.A0K(this.A09, bt7.A09) || !C14360o3.A0K(this.A07, bt7.A07) || !C14360o3.A0K(this.A00, bt7.A00) || !C14360o3.A0K(this.A01, bt7.A01) || !C14360o3.A0K(this.A03, bt7.A03) || this.A06 != bt7.A06 || !C14360o3.A0K(this.A04, bt7.A04) || !C14360o3.A0K(this.A05, bt7.A05) || !C14360o3.A0K(this.A02, bt7.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public BT7(C25377BKu c25377BKu, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC30859DhY interfaceC30859DhY, InterfaceC30860DhZ interfaceC30860DhZ, InterfaceC30861Dha interfaceC30861Dha, InterfaceC30863Dhc interfaceC30863Dhc, boolean z) {
        AbstractC25229BEm.A1L(interfaceC30860DhZ, 10, interfaceC30861Dha);
        C14360o3.A0B(interfaceC30859DhY, 14);
        this.A08 = c120985dq;
        this.A09 = c37644Ghd;
        this.A07 = c25377BKu;
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
        this.A03 = interfaceC30860DhZ;
        this.A06 = z;
        this.A04 = interfaceC30861Dha;
        this.A05 = interfaceC30863Dhc;
        this.A02 = interfaceC30859DhY;
    }

    public final int hashCode() {
        int A0J = AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A09, AbstractC166987dD.A0G(this.A08)))));
        int A00 = AbstractC53644Nnp.A00();
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A03, (((((((A0J + A00) * 31) + A00) * 31) + A00) * 31) + A00) * 31)))));
    }

    @Override // X.InterfaceC31047Dkl
    public final C120985dq BMy() {
        throw C00O.createAndThrow();
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
