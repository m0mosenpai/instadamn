package X;

/* loaded from: classes5.dex */
public final class DIX extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C6MC A05;
    public final /* synthetic */ C6M8 A06;
    public final /* synthetic */ C14510oO A07;
    public final /* synthetic */ C15080pO A08;
    public final /* synthetic */ C15100pQ A09;
    public final /* synthetic */ C15370ps A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIX(C6MC c6mc, C6M8 c6m8, C14510oO c14510oO, C15080pO c15080pO, C15100pQ c15100pQ, C15370ps c15370ps, float f, float f2, int i, int i2, int i3, boolean z) {
        super(1);
        this.A06 = c6m8;
        this.A02 = i;
        this.A01 = f;
        this.A08 = c15080pO;
        this.A05 = c6mc;
        this.A07 = c14510oO;
        this.A0B = z;
        this.A00 = f2;
        this.A09 = c15100pQ;
        this.A03 = i2;
        this.A04 = i3;
        this.A0A = c15370ps;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C62T c62t = (C62T) obj;
        C6M8 c6m8 = this.A06;
        int i2 = this.A02;
        int B6n = c6m8.B6n();
        boolean z = false;
        if (i2 <= c6m8.BM2() && B6n <= i2) {
            z = true;
        }
        if (!z) {
            float f = this.A01;
            InterfaceC74953Yl interfaceC74953Yl = c62t.A06;
            float A04 = AbstractC25231BEo.A04(interfaceC74953Yl);
            if (f <= 0.0f ? A04 < f : A04 > f) {
                A04 = f;
            }
            C15080pO c15080pO = this.A08;
            float f2 = A04 - c15080pO.A00;
            C6MC c6mc = this.A05;
            float EMD = c6mc.EMD(f2);
            int B6n2 = c6m8.B6n();
            if (i2 > c6m8.BM2() || B6n2 > i2) {
                boolean z2 = this.A0B;
                int i3 = this.A04;
                int B6n3 = c6m8.B6n();
                if (!z2 ? !(B6n3 < i2 || (c6m8.B6n() == i2 && c6m8.B6o() < i3)) : !(B6n3 > i2 || (c6m8.B6n() == i2 && c6m8.B6o() > i3))) {
                    if (f2 == EMD) {
                        c15080pO.A00 += f2;
                        float A042 = AbstractC25231BEo.A04(interfaceC74953Yl);
                        float f3 = this.A00;
                        if (!z2 ? A042 < (-f3) : A042 > f3) {
                            c62t.A00();
                        }
                        int i4 = this.A09.A00;
                        if (z2) {
                            if (i4 >= 2) {
                                int BM2 = i2 - c6m8.BM2();
                                int i5 = this.A03;
                                if (BM2 > i5) {
                                    i = i2 - i5;
                                    c6m8.EmI(c6mc, i, 0);
                                }
                            }
                        } else if (i4 >= 2) {
                            int B6n4 = c6m8.B6n() - i2;
                            int i6 = this.A03;
                            if (B6n4 > i6) {
                                i = i6 + i2;
                                c6m8.EmI(c6mc, i, 0);
                            }
                        }
                        return C0eB.A00;
                    }
                    c62t.A00();
                    this.A07.A00 = false;
                    return C0eB.A00;
                }
            }
        }
        boolean z3 = this.A0B;
        int i7 = this.A04;
        int B6n5 = c6m8.B6n();
        if (!z3 ? B6n5 < i2 || (c6m8.B6n() == i2 && c6m8.B6o() < i7) : B6n5 > i2 || (c6m8.B6n() == i2 && c6m8.B6o() > i7)) {
            c6m8.EmI(this.A05, i2, i7);
            this.A07.A00 = false;
            c62t.A00();
        } else {
            int B6n6 = c6m8.B6n();
            if (i2 <= c6m8.BM2() && B6n6 <= i2) {
                throw new D3Y((C5Y2) this.A0A.A00, C1H4.A01(c6m8.AF6(i2)));
            }
        }
        return C0eB.A00;
    }
}
