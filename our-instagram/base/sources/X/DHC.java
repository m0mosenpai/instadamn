package X;

/* loaded from: classes5.dex */
public final class DHC extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHC(long j, boolean z) {
        super(1);
        this.A01 = z;
        this.A00 = j;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
        float EqT = A0c.EqT(5.0f);
        boolean z = this.A01;
        if (z) {
            f = 0.0f;
        } else {
            f = ((-A0c.EqT(24.0f)) + EqT) / 2.0f;
        }
        long A00 = AbstractC119395aw.A00(f, (A0c.EqT(24.0f) - EqT) / 2.0f);
        long j = this.A00;
        float f2 = EqT * 2.0f;
        long A002 = C5YB.A00(f2, f2);
        C119815bf c119815bf = C119815bf.A00;
        A0c.AQa(null, c119815bf, -10.0f, 200.0f, 1.0f, 3, j, A00, A002, true);
        float EqT2 = A0c.EqT(2.0f);
        float A01 = C119365at.A01(A00);
        if (!z) {
            A01 = A01 + EqT + (2.0f * EqT2);
        }
        A0c.AQe(null, c119815bf, EqT2, 1.0f, 3, j, AbstractC119395aw.A00(A01, C119365at.A02(A00) + f2 + EqT2));
        return C0eB.A00;
    }
}
