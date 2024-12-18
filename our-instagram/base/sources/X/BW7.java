package X;

/* loaded from: classes5.dex */
public final class BW7 implements InterfaceC31113Dlv {
    public final BVY A00;
    public final C5Y6 A01;
    public final InterfaceC31113Dlv A02;

    @Override // X.InterfaceC31113Dlv
    public final float AFH(float f, float f2, float f3) {
        float AFH = this.A02.AFH(f, f2, f3);
        if (AFH == 0.0f) {
            BVY bvy = this.A00;
            int i = bvy.A03;
            if (i == 0) {
                return 0.0f;
            }
            float f4 = i * (-1.0f);
            if (AbstractC25230BEn.A1X(bvy.A0T)) {
                f4 += bvy.A05();
            }
            return C17s.A02(f4, -f3, f3);
        }
        BVY bvy2 = this.A00;
        float f5 = bvy2.A03 * (-1.0f);
        while (AFH > 0.0f && f5 < AFH) {
            f5 += bvy2.A05();
        }
        while (AFH < 0.0f && f5 > AFH) {
            f5 -= bvy2.A05();
        }
        return f5;
    }

    public BW7(InterfaceC31113Dlv interfaceC31113Dlv, BVY bvy) {
        this.A00 = bvy;
        this.A02 = interfaceC31113Dlv;
        this.A01 = interfaceC31113Dlv.Bqy();
    }

    @Override // X.InterfaceC31113Dlv
    public final C5Y6 Bqy() {
        return this.A01;
    }
}
