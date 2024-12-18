package X;

/* loaded from: classes8.dex */
public final class MI0 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ L4R A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI0(L4R l4r, int i, int i2, int i3) {
        super(1);
        this.A03 = l4r;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
        L4R l4r = this.A03;
        float A01 = AbstractC25232BEp.A01(l4r.A02);
        float A012 = AbstractC25232BEp.A01(l4r.A05);
        if (!AbstractC167007dF.A1N((A01 > 0.0f ? 1 : (A01 == 0.0f ? 0 : -1)))) {
            int i = this.A00;
            int i2 = 0;
            do {
                double d = ((i2 * 3.141592653589793d) / 3.0d) + 0.5235987755982988d;
                long j2 = C1132359l.A07;
                float EqT = A0c.EqT(AbstractC25232BEp.A01(l4r.A03));
                long Bxc = A0c.Bxc();
                A0c.AQe(null, C119815bf.A00, EqT, 1.0f, 3, i << 32, AbstractC119395aw.A00((C5YC.A02(Bxc) / 2.0f) + (A0c.EqT(A01) * ((float) Math.cos(d))), (C5YC.A00(Bxc) / 2.0f) + (A0c.EqT(A01) * ((float) Math.sin(d)))));
                i2++;
            } while (i2 < 6);
        }
        if (A012 != 0.0f) {
            int i3 = this.A01;
            int i4 = this.A02;
            int i5 = 0;
            do {
                double d2 = ((i5 * 3.141592653589793d) / 3.0d) + 0.8726646259971648d;
                if (i5 % 2 == 0) {
                    j = i3;
                } else {
                    j = i4;
                }
                long j3 = C1132359l.A07;
                float EqT2 = A0c.EqT(AbstractC25232BEp.A01(l4r.A06));
                long Bxc2 = A0c.Bxc();
                A0c.AQe(null, C119815bf.A00, EqT2, 1.0f, 3, j << 32, AbstractC119395aw.A00((C5YC.A02(Bxc2) / 2.0f) - (A0c.EqT(A012) * ((float) Math.cos(d2))), (C5YC.A00(Bxc2) / 2.0f) - (A0c.EqT(A012) * ((float) Math.sin(d2)))));
                i5++;
            } while (i5 < 6);
        }
        return C0eB.A00;
    }
}
