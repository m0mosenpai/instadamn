package X;

/* renamed from: X.DRi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30178DRi extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C5Y1 A06;
    public final /* synthetic */ InterfaceC74953Yl A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30178DRi(C5Y1 c5y1, InterfaceC74953Yl interfaceC74953Yl, float f, float f2, float f3, float f4, float f5, long j) {
        super(1);
        this.A06 = c5y1;
        this.A05 = j;
        this.A00 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A01 = f4;
        this.A04 = f5;
        this.A07 = interfaceC74953Yl;
    }

    public static float A00(float f, int i) {
        return (float) ((Number) C17s.A09(Double.valueOf(f - (Math.abs(i) * 0.2d)), new M9M(0.0d))).doubleValue();
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A01;
        InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
        AbstractC27445C9n abstractC27445C9n = (AbstractC27445C9n) this.A07.getValue();
        if (C14360o3.A0K(abstractC27445C9n, C27274C1z.A00)) {
            float A012 = AbstractC25232BEp.A01(this.A06);
            long j = this.A05;
            float f = this.A00;
            float f2 = this.A02;
            float f3 = this.A03;
            int i = 0;
            do {
                int i2 = i - 2;
                float A00 = A00(A012, i2);
                A0c.AQe(null, C119815bf.A00, CYw.A00(A00) * f, 1.0f, 3, j, AbstractC119395aw.A00(C119365at.A01(A0c.Amh()) + (i2 * f2), f3 - (A00 * f3)));
                i++;
            } while (i < 5);
        } else {
            if (C14360o3.A0K(abstractC27445C9n, C22.A00)) {
                A01 = AbstractC25232BEp.A01(this.A06);
            } else if (C14360o3.A0K(abstractC27445C9n, C23.A00)) {
                A01 = 2.0f - AbstractC25232BEp.A01(this.A06);
            } else if (C14360o3.A0K(abstractC27445C9n, C20.A00)) {
                float A013 = AbstractC25232BEp.A01(this.A06);
                long j2 = this.A05;
                float f4 = this.A00;
                float f5 = this.A02;
                float f6 = this.A03;
                int i3 = 0;
                do {
                    int i4 = i3 - 2;
                    float A002 = A00(A013, i4);
                    A0c.AQe(null, C119815bf.A00, CYw.A00(1.0f - A002) * f4, 1.0f, 3, j2, AbstractC119395aw.A00(C119365at.A01(A0c.Amh()) + (i4 * f5), -(A002 * f6)));
                    i3++;
                } while (i3 < 5);
            } else if (abstractC27445C9n instanceof NU6) {
                if (((NU6) abstractC27445C9n).A01) {
                    long j3 = this.A05;
                    float f7 = this.A00;
                    float f8 = this.A02;
                    int i5 = 0;
                    do {
                        A0c.AQe(null, C119815bf.A00, f7, 1.0f, 3, j3, AbstractC119395aw.A00(C119365at.A01(A0c.Amh()) + ((i5 - 2) * f8), 0.0f));
                        i5++;
                    } while (i5 < 5);
                }
            } else if (!C14360o3.A0K(abstractC27445C9n, C21.A00)) {
                throw B4Z.A00();
            }
            long j4 = this.A05;
            float f9 = this.A01;
            float f10 = this.A00;
            float f11 = this.A04;
            float f12 = this.A02;
            int i6 = 0;
            do {
                float cos = (float) ((Math.cos(((float) C17s.A00(A01 - (i6 * 0.25d), 0.0d, 1.0d)) * 2.0f * 3.141592653589793d) * (-0.5d)) + 0.5d);
                float f13 = (i6 - 2) * f12;
                float f14 = -(cos * f9);
                long A003 = AbstractC119395aw.A00(C119365at.A01(A0c.Amh()) + f13, f14);
                C119815bf c119815bf = C119815bf.A00;
                A0c.AQe(null, c119815bf, f10 * (1.0f - cos), 1.0f, 3, j4, A003);
                A0c.AQw(null, CK1.A00(cos * f11, AbstractC119395aw.A00(C119365at.A01(A0c.Amh()) + f13, f14)), c119815bf, 1.0f, 3, j4);
                i6++;
            } while (i6 < 5);
        }
        return C0eB.A00;
    }
}
