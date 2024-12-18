package X;

/* renamed from: X.BjA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26241BjA extends C0T6 implements InterfaceC31167DnB {
    public final C120985dq A00;
    public final InterfaceC30896Di9 A01;
    public final C51688MsJ A02;
    public final C25434BMz A03;
    public final C25377BKu A04;
    public final C37644Ghd A05;
    public final BLE A06;

    @Override // X.InterfaceC31167DnB
    public final C25586BSz Atl() {
        return null;
    }

    @Override // X.InterfaceC31167DnB
    public final BLG Bbg() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26241BjA) {
                C26241BjA c26241BjA = (C26241BjA) obj;
                if (!C14360o3.A0K(this.A00, c26241BjA.A00) || !C14360o3.A0K(this.A05, c26241BjA.A05) || !C14360o3.A0K(this.A04, c26241BjA.A04) || !C14360o3.A0K(this.A02, c26241BjA.A02) || !C14360o3.A0K(this.A03, c26241BjA.A03) || !C14360o3.A0K(this.A06, c26241BjA.A06) || !C14360o3.A0K(this.A01, c26241BjA.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26241BjA(C51688MsJ c51688MsJ, C25434BMz c25434BMz, C25377BKu c25377BKu, C120985dq c120985dq, C37644Ghd c37644Ghd, BLE ble, InterfaceC30896Di9 interfaceC30896Di9) {
        C14360o3.A0B(interfaceC30896Di9, 9);
        this.A00 = c120985dq;
        this.A05 = c37644Ghd;
        this.A04 = c25377BKu;
        this.A02 = c51688MsJ;
        this.A03 = c25434BMz;
        this.A06 = ble;
        this.A01 = interfaceC30896Di9;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0G(this.A00)))))) * 31 * 31);
    }

    @Override // X.InterfaceC31047Dkl
    public final C120985dq BMy() {
        return this.A00;
    }

    @Override // X.InterfaceC31047Dkl
    public final C25377BKu BMz() {
        return this.A04;
    }

    @Override // X.InterfaceC31047Dkl
    public final C37644Ghd BN0() {
        return this.A05;
    }

    @Override // X.InterfaceC31167DnB
    public final C25434BMz BR5() {
        return this.A03;
    }

    @Override // X.InterfaceC31167DnB
    public final BLE CCE() {
        return this.A06;
    }
}
