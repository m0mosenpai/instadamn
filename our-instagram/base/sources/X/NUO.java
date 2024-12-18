package X;

/* loaded from: classes9.dex */
public final class NUO extends AbstractC65924TwV {
    public final XFL A00;

    public NUO(XFL xfl) {
        C14360o3.A0B(xfl, 1);
        this.A00 = xfl;
    }

    @Override // X.AbstractC65924TwV
    public final boolean A05(String str) {
        C14360o3.A0B(str, 0);
        return U12.A03(((C51794Muy) this.A00).A02, str);
    }

    @Override // X.AbstractC65924TwV
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NUO) && C14360o3.A0K(this.A00, ((NUO) obj).A00));
    }

    @Override // X.AbstractC65924TwV
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.AbstractC65924TwV
    public final Object A00() {
        return this.A00;
    }

    @Override // X.AbstractC65924TwV
    public final String A01() {
        return String.valueOf(((C51794Muy) this.A00).A00);
    }

    @Override // X.AbstractC65924TwV
    public final String A02() {
        return ((C51794Muy) this.A00).A02;
    }

    @Override // X.AbstractC65924TwV
    public final String A04() {
        return AbstractC111324zv.A00(1691);
    }

    @Override // X.AbstractC65924TwV
    public final String A03() {
        return A01();
    }
}
