package X;

/* loaded from: classes4.dex */
public final class AWA implements BEI {
    public final A5U A00;
    public final A71 A01;
    public final float[] A02;
    public final float[] A03;

    @Override // X.InterfaceC1122755a
    public final float[] C6v() {
        return this.A02;
    }

    @Override // X.BBQ
    public final float[] CEr() {
        return this.A03;
    }

    public AWA(Integer num, float f, int i, int i2) {
        A71 a71 = new A71(num, i, i2);
        this.A01 = a71;
        BDM bdm = a71.A01;
        A5U a5u = new A5U(f, bdm.BqS(), bdm.BqT(), i, i2);
        this.A00 = a5u;
        this.A03 = a71.A00.A01;
        this.A02 = a5u.A00.A01;
    }
}
