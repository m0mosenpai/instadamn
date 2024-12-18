package X;

/* renamed from: X.NVa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52737NVa extends NV0 {
    public final InterfaceC57989PnZ A00;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52737NVa) && C14360o3.A0K(this.A00, ((C52737NVa) obj).A00));
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C52737NVa(InterfaceC57989PnZ interfaceC57989PnZ) {
        this.A00 = interfaceC57989PnZ;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC55145Od4.A03(A1C, super.toString());
        return AbstractC55145Od4.A02(this.A00, A1C);
    }
}
