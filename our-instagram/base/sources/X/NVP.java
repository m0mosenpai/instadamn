package X;

/* loaded from: classes9.dex */
public final class NVP extends AbstractC52734NUx {
    public final AbstractC55145Od4 A00;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NVP) && C14360o3.A0K(this.A00, ((NVP) obj).A00));
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public NVP(AbstractC55145Od4 abstractC55145Od4) {
        this.A00 = abstractC55145Od4;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC55145Od4.A03(A1C, super.toString());
        return AbstractC55145Od4.A02(this.A00, A1C);
    }
}
