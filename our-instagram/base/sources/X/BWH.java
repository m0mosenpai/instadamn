package X;

/* loaded from: classes5.dex */
public final class BWH implements InterfaceC31113Dlv {
    public final C5Y6 A00 = C25245BFe.A01(new C25243BFc(0.25f, 0.1f, 0.25f, 1.0f), 125, 0);

    @Override // X.InterfaceC31113Dlv
    public final float AFH(float f, float f2, float f3) {
        float A01 = AbstractC166987dD.A01(f2 + f, f);
        boolean z = false;
        if (A01 <= f3) {
            z = true;
        }
        float f4 = (0.3f * f3) - (0.0f * A01);
        float f5 = f3 - f4;
        if (z && f5 < A01) {
            f4 = f3 - A01;
        }
        return f - f4;
    }

    @Override // X.InterfaceC31113Dlv
    public final C5Y6 Bqy() {
        return this.A00;
    }
}
