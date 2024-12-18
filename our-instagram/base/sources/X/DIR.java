package X;

/* loaded from: classes5.dex */
public final class DIR extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ InterfaceC74953Yl A07;
    public final /* synthetic */ C6L5 A08;
    public final /* synthetic */ C26006Beu A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIR(InterfaceC74953Yl interfaceC74953Yl, C6L5 c6l5, C26006Beu c26006Beu, float f, float f2, float f3, float f4, float f5, float f6, long j) {
        super(1);
        this.A06 = j;
        this.A01 = f;
        this.A05 = f2;
        this.A09 = c26006Beu;
        this.A00 = f3;
        this.A04 = f4;
        this.A02 = f5;
        this.A03 = f6;
        this.A08 = c6l5;
        this.A07 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        int i;
        float f2;
        InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
        long j = this.A06;
        float f3 = this.A01;
        float f4 = this.A05;
        C26006Beu c26006Beu = this.A09;
        float f5 = this.A00;
        float f6 = this.A04;
        float f7 = this.A02;
        float f8 = this.A03;
        C6L5 c6l5 = this.A08;
        InterfaceC74953Yl interfaceC74953Yl = this.A07;
        AnonymousClass585 A0C = AbstractC25233BEq.A0C(A0c);
        try {
            A0C.ELk(AbstractC119355as.A01(0L, A0c.Bxc()), new C5AN());
            long A0H = AbstractC25228BEl.A0H(A0c);
            C119815bf c119815bf = C119815bf.A00;
            A0c.AR1(null, c119815bf, 1.0f - f3, 3, j, 0L, A0H);
            float f9 = 1.0f - f4;
            int i2 = c26006Beu.A05;
            loop0: for (int i3 = 0; i3 < i2; i3++) {
                int i4 = c26006Beu.A06;
                for (int i5 = 0; i5 < i4; i5++) {
                    C25990Bee c25990Bee = c26006Beu.A07[i3][i5];
                    if (c25990Bee == null) {
                        break loop0;
                    }
                    int i6 = 1;
                    if (c25990Bee.A02) {
                        i6 = 5;
                    }
                    boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
                    boolean z = c25990Bee.A02;
                    float f10 = f5;
                    if (!z && f5 > 1.0f) {
                        f10 = 0.0f;
                    } else if (f5 > 1.0f) {
                        if (!A1X) {
                            f10 = ((f5 - 1.0f) * 0.8f) + 0.2f;
                        } else {
                            f10 = f5 - 1.0f;
                        }
                    } else if (z) {
                        f10 = (f5 * 1.0f) / 5.0f;
                    }
                    float f11 = c25990Bee.A00;
                    float f12 = c26006Beu.A02;
                    float f13 = i6 * 2.0f * f12;
                    boolean z2 = c25990Bee.A03;
                    if (z2) {
                        f = f12 * 0.1f;
                    } else {
                        f = 0.0f;
                    }
                    float f14 = f11 - f;
                    int i7 = (int) (f13 / ((2.0f * f14) + f));
                    float f15 = (f10 * f13) - f;
                    float f16 = 0.0f;
                    if (f15 < 0.0f) {
                        i = 0;
                    } else {
                        i = (int) (f15 / f14);
                    }
                    if (i <= (i7 * 2) - 1) {
                        float f17 = f15 % f14;
                        if (i % 2 != 0) {
                            f16 = f11 - f17;
                        } else {
                            f16 = f + f17;
                        }
                    }
                    if (z) {
                        if (f10 > 0.05f) {
                            f16 = C17s.A02(f16, f12 * 0.1f, f11);
                        }
                        f2 = (f6 - f16) * f7;
                    } else {
                        f2 = (f6 / 2.0f) * f8;
                    }
                    if (z2) {
                        A0c.AQv(c6l5, null, CK1.A00(f16 + f2, c25990Bee.A01), c119815bf, f9, 1);
                    } else {
                        A0c.AQd(c6l5, null, c119815bf, f2 + f16, f9, 1, c25990Bee.A01);
                    }
                }
            }
            A0C.EKS();
            return C0eB.A00;
        } catch (Throwable th) {
            A0C.EKS();
            throw th;
        }
    }
}
