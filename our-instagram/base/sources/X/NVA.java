package X;

/* loaded from: classes9.dex */
public final class NVA extends AbstractC55145Od4 {
    public final Object A00;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NVA) && C14360o3.A0K(this.A00, ((NVA) obj).A00));
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public NVA(Object obj) {
        this.A00 = obj;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC55145Od4.A03(A1C, super.toString());
        return AbstractC55145Od4.A02(this.A00, A1C);
    }
}
