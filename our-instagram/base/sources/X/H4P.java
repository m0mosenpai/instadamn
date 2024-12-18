package X;

/* loaded from: classes7.dex */
public final class H4P extends C0T6 implements InterfaceC31120Dm2 {
    public final JJP A00;
    public final InterfaceC58265Ps9 A01;

    @Override // X.InterfaceC31120Dm2
    public final H4P ExZ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4P) {
                H4P h4p = (H4P) obj;
                if (!C14360o3.A0K(this.A00, h4p.A00) || !C14360o3.A0K(this.A01, h4p.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31120Dm2
    public final JJP BE9() {
        return this.A00;
    }

    @Override // X.InterfaceC31120Dm2
    public final InterfaceC58265Ps9 BRT() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public H4P(JJP jjp, InterfaceC58265Ps9 interfaceC58265Ps9) {
        AbstractC167017dG.A1P(jjp, interfaceC58265Ps9);
        this.A00 = jjp;
        this.A01 = interfaceC58265Ps9;
    }
}
