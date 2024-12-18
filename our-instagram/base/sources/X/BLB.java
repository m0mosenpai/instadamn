package X;

/* loaded from: classes5.dex */
public final class BLB extends C0T6 implements InterfaceC30882Dhv {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final C38321qM A02;
    public final int A03;
    public final EnumC129395t1 A04;

    public BLB(C120985dq c120985dq, EnumC129395t1 enumC129395t1, C37644Ghd c37644Ghd, C38321qM c38321qM, int i) {
        C14360o3.A0B(enumC129395t1, 4);
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = c38321qM;
        this.A04 = enumC129395t1;
        this.A03 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BLB) {
                BLB blb = (BLB) obj;
                if (!C14360o3.A0K(this.A00, blb.A00) || !C14360o3.A0K(this.A01, blb.A01) || !C14360o3.A0K(this.A02, blb.A02) || this.A04 != blb.A04 || this.A03 != blb.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)))) + this.A03;
    }
}
