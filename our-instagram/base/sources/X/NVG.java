package X;

/* loaded from: classes9.dex */
public final class NVG extends AbstractC55145Od4 {
    public final InterfaceC57989PnZ A00;
    public final InterfaceC16510rw A01;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NVG) {
                NVG nvg = (NVG) obj;
                if (!C14360o3.A0K(this.A00, nvg.A00) || !C14360o3.A0K(this.A01, nvg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + this.A01.hashCode();
    }

    public NVG(InterfaceC57989PnZ interfaceC57989PnZ, InterfaceC16510rw interfaceC16510rw) {
        this.A00 = interfaceC57989PnZ;
        this.A01 = interfaceC16510rw;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC55145Od4.A03(A1C, super.toString());
        return AbstractC55145Od4.A02(this.A00, A1C);
    }
}
