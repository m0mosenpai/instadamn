package X;

/* renamed from: X.62W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62W extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C6L5 A05;
    public final /* synthetic */ C62V A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62W(C6L5 c6l5, C62V c62v, float f, float f2, long j, long j2, long j3, boolean z) {
        super(1);
        this.A07 = z;
        this.A05 = c6l5;
        this.A03 = j;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = j2;
        this.A02 = j3;
        this.A06 = c62v;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C6L5 c6l5;
        long j;
        long A00;
        AbstractC119825bg abstractC119825bg;
        C5YV c5yv;
        float f;
        int i;
        long j2;
        InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
        interfaceC1129057z.AQf();
        if (this.A07) {
            c6l5 = this.A05;
            long j3 = this.A03;
            c5yv = null;
            j = 0;
            j2 = C62U.A00(interfaceC1129057z.Bxc(), 0L);
            f = 1.0f;
            abstractC119825bg = C119815bf.A00;
            i = 3;
            A00 = j3;
        } else {
            long j4 = this.A03;
            long j5 = AbstractC137646Lk.A00;
            float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
            float f2 = this.A00;
            if (intBitsToFloat < f2) {
                float f3 = this.A01;
                long Bxc = interfaceC1129057z.Bxc();
                float A02 = C5YC.A02(Bxc) - f3;
                float A002 = C5YC.A00(Bxc) - f3;
                C6L5 c6l52 = this.A05;
                AnonymousClass588 AzL = interfaceC1129057z.AzL();
                AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
                AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
                long j6 = anonymousClass586.A00;
                anonymousClass586.A01.ELZ();
                try {
                    anonymousClass587.A01.AI7(0, f3, f3, A02, A002);
                    interfaceC1129057z.AR3(c6l52, null, C119815bf.A00, 1.0f, 3, 0L, C62U.A00(interfaceC1129057z.Bxc(), 0L), j4);
                    return C0eB.A00;
                } finally {
                    anonymousClass586.A01.EKS();
                    AzL.EeS(j6);
                }
            }
            c6l5 = this.A05;
            j = this.A04;
            long j7 = this.A02;
            A00 = C6L7.A00(f2, j4);
            abstractC119825bg = this.A06;
            c5yv = null;
            f = 1.0f;
            i = 3;
            j2 = j7;
        }
        interfaceC1129057z.AR3(c6l5, c5yv, abstractC119825bg, f, i, j, j2, A00);
        return C0eB.A00;
    }
}
