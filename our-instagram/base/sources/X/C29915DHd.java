package X;

/* renamed from: X.DHd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29915DHd extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16660sJ A02;
    public final /* synthetic */ C5Hc A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29915DHd(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, long j, boolean z) {
        super(1);
        this.A01 = interfaceC16820sZ;
        this.A00 = j;
        this.A03 = c5Hc;
        this.A02 = interfaceC16660sJ;
        this.A04 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
        AbstractC25230BEn.A19(interfaceC1129057z);
        float f = ((C66625UPn) this.A01.invoke()).A02;
        long j = this.A00;
        C5Hc<C51752Mtb> c5Hc = this.A03;
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        boolean z = this.A04;
        for (C51752Mtb c51752Mtb : c5Hc) {
            C114205Dh c114205Dh = (C114205Dh) c51752Mtb.A02;
            float f2 = c114205Dh.A02 - c114205Dh.A01;
            if (f2 >= 0.0f) {
                int i2 = c51752Mtb.A00;
                if (f <= i2 && i2 > (i = c51752Mtb.A01)) {
                    float f3 = i;
                    float f4 = ((f - f3) * f2) / (i2 - i);
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f >= f3) {
                        AbstractC25226BEj.A1T(interfaceC16660sJ, c114205Dh.A00);
                    }
                    float f5 = c114205Dh.A01;
                    if (!z) {
                        f5 += f4;
                    }
                    float f6 = c114205Dh.A03;
                    interfaceC1129057z.AR1(null, C119815bf.A00, 1.0f, 5, j, AbstractC119395aw.A00(f5, f6), C5YB.A00(f2 - f4, c114205Dh.A00 - f6));
                }
            }
        }
        return C0eB.A00;
    }
}
