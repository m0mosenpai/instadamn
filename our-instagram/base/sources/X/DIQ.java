package X;

/* loaded from: classes5.dex */
public final class DIQ extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ InterfaceC74953Yl A06;
    public final /* synthetic */ C28211Cc9 A07;
    public final /* synthetic */ C118125Vw A08;
    public final /* synthetic */ String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIQ(InterfaceC74953Yl interfaceC74953Yl, C28211Cc9 c28211Cc9, C118125Vw c118125Vw, String str, float f, float f2, float f3, long j, long j2, long j3) {
        super(1);
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A05 = j;
        this.A04 = j2;
        this.A03 = j3;
        this.A07 = c28211Cc9;
        this.A09 = str;
        this.A08 = c118125Vw;
        this.A06 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC1128857w interfaceC1128857w = (InterfaceC1128857w) obj;
        C14360o3.A0B(interfaceC1128857w, 0);
        float EqT = interfaceC1128857w.EqT(28.0f);
        float EqT2 = interfaceC1128857w.EqT(26.0f);
        float EqT3 = interfaceC1128857w.EqT(4.0f);
        AbstractC25227BEk.A19(this.A06, C1H4.A01(C5YC.A02(interfaceC1128857w.Bxc()) - EqT));
        float f = this.A02;
        float f2 = this.A01;
        float f3 = (f - f2) / (this.A00 - f2);
        long Bxc = interfaceC1128857w.Bxc();
        float A02 = C5YC.A02(Bxc);
        float f4 = EqT / 2.0f;
        float f5 = ((1.0f - f3) * (f4 + 0.0f)) + (f3 * (A02 - f4));
        float A00 = C5YC.A00(Bxc) / 2.0f;
        long j = this.A05;
        interfaceC1128857w.AQs(null, null, interfaceC1128857w.EqT(4.0f), 1.0f, 1, 3, j, AbstractC119395aw.A00(f5, A00), AbstractC119395aw.A00(A02, A00));
        long j2 = this.A04;
        long A002 = AbstractC119395aw.A00(0.0f, A00);
        long A003 = AbstractC119395aw.A00(f5, A00);
        interfaceC1128857w.AQs(null, null, interfaceC1128857w.EqT(4.0f), 1.0f, 1, 3, j2, A002, A003);
        C119815bf c119815bf = C119815bf.A00;
        interfaceC1128857w.AQe(null, c119815bf, f4, 1.0f, 3, j, A003);
        interfaceC1128857w.AQe(null, c119815bf, EqT2 / 2.0f, 1.0f, 3, this.A03, A003);
        long A004 = AbstractC119395aw.A00(f5 - f4, (A00 - EqT) - EqT3);
        C28211Cc9 c28211Cc9 = this.A07;
        String str = this.A09;
        C118125Vw c118125Vw = this.A08;
        C16930sl c16930sl = C16930sl.A00;
        C5C8 c5c8 = new C5C8(c16930sl, c16930sl, str);
        long Bxc2 = interfaceC1128857w.Bxc();
        float A022 = C5YC.A02(Bxc2);
        float A01 = C119365at.A01(A004);
        int round = Math.round((float) Math.ceil(A022 - A01));
        float A005 = C5YC.A00(Bxc2);
        float A023 = C119365at.A02(A004);
        C127055oj A012 = c28211Cc9.A01(c5c8, c118125Vw, c28211Cc9.A00, interfaceC1128857w, interfaceC1128857w.getLayoutDirection(), c16930sl, C5AU.A04(0, round, 0, Math.round((float) Math.ceil(A005 - A023))));
        AnonymousClass588 AzL = interfaceC1128857w.AzL();
        AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
        AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
        long A08 = AbstractC25227BEk.A08(anonymousClass586);
        try {
            C58A c58a = anonymousClass587.A01;
            c58a.F8X(A01, A023);
            CBY.A00(c58a, A012);
            A012.A03.A0A(anonymousClass586.A01, null, null, null, C1132359l.A08);
            AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
            return C0eB.A00;
        } catch (Throwable th) {
            AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
            throw th;
        }
    }
}
