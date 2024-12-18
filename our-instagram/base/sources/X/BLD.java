package X;

/* loaded from: classes5.dex */
public final class BLD extends C0T6 implements InterfaceC30884Dhx {
    public final C38321qM A00;
    public final C75113Zb A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BLD) {
                BLD bld = (BLD) obj;
                if (!C14360o3.A0K(this.A00, bld.A00) || !C14360o3.A0K(this.A01, bld.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public BLD(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
    }
}
