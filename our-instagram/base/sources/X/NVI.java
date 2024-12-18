package X;

/* loaded from: classes9.dex */
public final class NVI extends AbstractC55145Od4 {
    public final C51757Mtg A00;
    public final InterfaceC16510rw A01;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NVI) {
                NVI nvi = (NVI) obj;
                if (!C14360o3.A0K(this.A00, nvi.A00) || !C14360o3.A0K(this.A01, nvi.A01)) {
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

    public NVI(C51757Mtg c51757Mtg, InterfaceC16510rw interfaceC16510rw) {
        this.A00 = c51757Mtg;
        this.A01 = interfaceC16510rw;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        return AnonymousClass001.A0u(super.toString(), ": { ", this.A00.A02, " }");
    }
}
