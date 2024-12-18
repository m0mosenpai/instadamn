package X;

/* renamed from: X.BFl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25251BFl implements C62D {
    public final long A00;
    public final AbstractC118405Xc A01;
    public final AbstractC118405Xc A02;
    public final AbstractC118405Xc A03;
    public final InterfaceC118485Xk A04;
    public final InterfaceC30899DiC A05;
    public final Object A06;
    public final Object A07;

    @Override // X.C62D
    public final boolean CWV() {
        return false;
    }

    public C25251BFl(AbstractC118405Xc abstractC118405Xc, C6MY c6my, InterfaceC118485Xk interfaceC118485Xk, Object obj) {
        BFq bFq = new BFq(((C6MX) c6my).A00);
        this.A05 = bFq;
        this.A04 = interfaceC118485Xk;
        this.A06 = obj;
        AbstractC118405Xc abstractC118405Xc2 = (AbstractC118405Xc) ((C118475Xj) interfaceC118485Xk).A01.invoke(obj);
        this.A02 = abstractC118405Xc2;
        this.A03 = AbstractC137336Kc.A00(abstractC118405Xc);
        this.A07 = ((C118475Xj) this.A04).A00.invoke(bFq.A00(abstractC118405Xc2, abstractC118405Xc));
        AbstractC118405Xc abstractC118405Xc3 = bFq.A01;
        if (abstractC118405Xc3 == null) {
            abstractC118405Xc3 = AbstractC137336Kc.A01(abstractC118405Xc2);
            bFq.A01 = abstractC118405Xc3;
        }
        if (abstractC118405Xc3 == null) {
            C14360o3.A0F("velocityVector");
            throw C00O.createAndThrow();
        }
        int A01 = abstractC118405Xc3.A01();
        long j = 0;
        for (int i = 0; i < A01; i++) {
            j = Math.max(j, ((long) (Math.exp(C6MV.A00(((C6MT) bFq.A03).A00, abstractC118405Xc.A00(i)) / (C6MW.A00 - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.A00 = j;
        AbstractC118405Xc A00 = AbstractC137336Kc.A00(bFq.CEk(abstractC118405Xc2, abstractC118405Xc, j));
        this.A01 = A00;
        int A012 = A00.A01();
        for (int i2 = 0; i2 < A012; i2++) {
            AbstractC118405Xc abstractC118405Xc4 = this.A01;
            abstractC118405Xc4.A03(i2, C17s.A02(abstractC118405Xc4.A00(i2), -0.0f, 0.0f));
        }
    }

    @Override // X.C62D
    public final Object CEW(long j) {
        float f;
        if (!CUo(j)) {
            InterfaceC16660sJ interfaceC16660sJ = ((C118475Xj) this.A04).A00;
            InterfaceC30899DiC interfaceC30899DiC = this.A05;
            AbstractC118405Xc abstractC118405Xc = this.A02;
            AbstractC118405Xc abstractC118405Xc2 = this.A03;
            BFq bFq = (BFq) interfaceC30899DiC;
            AbstractC118405Xc abstractC118405Xc3 = bFq.A00;
            if (abstractC118405Xc3 == null) {
                abstractC118405Xc3 = AbstractC137336Kc.A01(abstractC118405Xc);
                bFq.A00 = abstractC118405Xc3;
            }
            int i = 0;
            if (abstractC118405Xc3 != null) {
                int A01 = abstractC118405Xc3.A01();
                while (true) {
                    if (i < A01) {
                        AbstractC118405Xc abstractC118405Xc4 = bFq.A00;
                        if (abstractC118405Xc4 == null) {
                            break;
                        }
                        C6MU c6mu = bFq.A03;
                        float A00 = abstractC118405Xc.A00(i);
                        float A002 = abstractC118405Xc2.A00(i);
                        long j2 = j / 1000000;
                        double A003 = C6MV.A00(((C6MT) c6mu).A00, A002);
                        double d = C6MW.A00;
                        double d2 = d - 1.0d;
                        float exp = (float) (r0.A00 * r0.A01 * Math.exp((d / d2) * A003));
                        long exp2 = (long) (Math.exp(A003 / d2) * 1000.0d);
                        if (exp2 > 0) {
                            f = ((float) j2) / ((float) exp2);
                        } else {
                            f = 1.0f;
                        }
                        float signum = exp * Math.signum(A002);
                        float f2 = 1.0f;
                        float A02 = C17s.A02(f, 0.0f, 1.0f);
                        int i2 = (int) (100.0f * A02);
                        if (i2 < 100) {
                            float f3 = i2 / 100.0f;
                            int i3 = i2 + 1;
                            float[] fArr = BG7.A00;
                            float f4 = fArr[i2];
                            f2 = ((A02 - f3) * ((fArr[i3] - f4) / ((i3 / 100.0f) - f3))) + f4;
                        }
                        abstractC118405Xc4.A03(i, A00 + (signum * f2));
                        i++;
                    } else {
                        AbstractC118405Xc abstractC118405Xc5 = bFq.A00;
                        if (abstractC118405Xc5 != null) {
                            return interfaceC16660sJ.invoke(abstractC118405Xc5);
                        }
                    }
                }
            }
            C14360o3.A0F("valueVector");
            throw C00O.createAndThrow();
        }
        return this.A07;
    }

    @Override // X.C62D
    public final /* synthetic */ boolean CUo(long j) {
        if (j < this.A00) {
            return false;
        }
        return true;
    }

    @Override // X.C62D
    public final long Azo() {
        return this.A00;
    }

    @Override // X.C62D
    public final Object C5Z() {
        return this.A07;
    }

    @Override // X.C62D
    public final InterfaceC118485Xk CBw() {
        return this.A04;
    }

    @Override // X.C62D
    public final AbstractC118405Xc CEl(long j) {
        if (!CUo(j)) {
            return this.A05.CEk(this.A02, this.A03, j);
        }
        return this.A01;
    }
}
