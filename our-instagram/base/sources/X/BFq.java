package X;

/* loaded from: classes5.dex */
public final class BFq implements InterfaceC30899DiC {
    public AbstractC118405Xc A00;
    public AbstractC118405Xc A01;
    public AbstractC118405Xc A02;
    public final C6MU A03;

    public final AbstractC118405Xc A00(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2) {
        AbstractC118405Xc abstractC118405Xc3 = this.A02;
        if (abstractC118405Xc3 == null) {
            abstractC118405Xc3 = AbstractC137336Kc.A01(abstractC118405Xc);
            this.A02 = abstractC118405Xc3;
        }
        if (abstractC118405Xc3 == null) {
            C14360o3.A0F("targetVector");
            throw C00O.createAndThrow();
        }
        int A01 = abstractC118405Xc3.A01();
        for (int i = 0; i < A01; i++) {
            C6MU c6mu = this.A03;
            float A00 = abstractC118405Xc.A00(i);
            float A002 = abstractC118405Xc2.A00(i);
            double A003 = C6MV.A00(((C6MT) c6mu).A00, A002);
            double d = C6MW.A00;
            abstractC118405Xc3.A03(i, A00 + (((float) (r2.A00 * r2.A01 * Math.exp((d / (d - 1.0d)) * A003))) * Math.signum(A002)));
        }
        return abstractC118405Xc3;
    }

    @Override // X.InterfaceC30899DiC
    public final AbstractC118405Xc CEk(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, long j) {
        float f;
        AbstractC118405Xc abstractC118405Xc3 = this.A01;
        if (abstractC118405Xc3 == null) {
            abstractC118405Xc3 = AbstractC137336Kc.A01(abstractC118405Xc);
            this.A01 = abstractC118405Xc3;
        }
        int i = 0;
        if (abstractC118405Xc3 != null) {
            int A01 = abstractC118405Xc3.A01();
            while (true) {
                if (i < A01) {
                    AbstractC118405Xc abstractC118405Xc4 = this.A01;
                    if (abstractC118405Xc4 == null) {
                        break;
                    }
                    C6MU c6mu = this.A03;
                    float A00 = abstractC118405Xc2.A00(i);
                    long j2 = j / 1000000;
                    double A002 = C6MV.A00(((C6MT) c6mu).A00, A00);
                    double d = C6MW.A00;
                    double d2 = d - 1.0d;
                    float exp = (float) (r0.A00 * r0.A01 * Math.exp((d / d2) * A002));
                    long exp2 = (long) (Math.exp(A002 / d2) * 1000.0d);
                    if (exp2 > 0) {
                        f = ((float) j2) / ((float) exp2);
                    } else {
                        f = 1.0f;
                    }
                    float f2 = 0.0f;
                    int A02 = (int) (C17s.A02(f, 0.0f, 1.0f) * 100.0f);
                    if (A02 < 100) {
                        int i2 = A02 + 1;
                        float[] fArr = BG7.A00;
                        f2 = (fArr[i2] - fArr[A02]) / ((i2 / 100.0f) - (A02 / 100.0f));
                    }
                    abstractC118405Xc4.A03(i, (((f2 * Math.signum(A00)) * exp) / ((float) exp2)) * 1000.0f);
                    i++;
                } else {
                    AbstractC118405Xc abstractC118405Xc5 = this.A01;
                    if (abstractC118405Xc5 != null) {
                        return abstractC118405Xc5;
                    }
                }
            }
        }
        C14360o3.A0F("velocityVector");
        throw C00O.createAndThrow();
    }

    public BFq(C6MU c6mu) {
        this.A03 = c6mu;
    }
}
