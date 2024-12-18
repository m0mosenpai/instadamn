package X;

/* loaded from: classes5.dex */
public final class DP0 extends C0YY implements InterfaceC16660sJ {
    public static final DP0 A00 = new DP0();

    public DP0() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
        float EqT = A0c.EqT(344.0f);
        float EqT2 = A0c.EqT(516.0f);
        C25766Ba5 A002 = C6L6.A00(AbstractC16960so.A1Q(AbstractC25227BEk.A0O(4286591988L), AbstractC25227BEk.A0O(4289337820L), AbstractC25227BEk.A0O(4286461174L)), 0L, 9187343241974906880L);
        long j = 4294932482L << 32;
        long j2 = 4294379380L << 32;
        float f = EqT * 0.5f;
        C25764Ba3 c25764Ba3 = new C25764Ba3(AbstractC16960so.A1Q(AbstractC25225BEi.A0S(j), AbstractC25225BEi.A0S(j2), AbstractC25227BEk.A0O(4289275593L), AbstractC25227BEk.A0O(8401908L)), f);
        C25764Ba3 c25764Ba32 = new C25764Ba3(AbstractC16960so.A1Q(AbstractC25225BEi.A0S(j), AbstractC25225BEi.A0S(j2), AbstractC25227BEk.A0O(4289272797L), AbstractC25227BEk.A0O(8401909L)), EqT2 * 0.5f);
        C25764Ba3 c25764Ba33 = new C25764Ba3(AbstractC16960so.A1Q(AbstractC25227BEk.A0O(4286526452L), AbstractC25227BEk.A0O(4287770338L), AbstractC25227BEk.A0O(2158307026L), AbstractC25227BEk.A0O(10888913L)), Float.POSITIVE_INFINITY);
        float EqT3 = A0c.EqT(40.0f);
        long A003 = AbstractC137636Lj.A00(EqT3, EqT3);
        long A0H = AbstractC25228BEl.A0H(A0c);
        C119815bf c119815bf = C119815bf.A00;
        A0c.AR3(A002, null, c119815bf, 1.0f, 3, 0L, A0H, A003);
        AnonymousClass588 AzL = A0c.AzL();
        AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
        AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
        long A08 = AbstractC25227BEk.A08(anonymousClass586);
        try {
            C58A c58a = anonymousClass587.A01;
            c58a.F8X(0.2f * EqT, (-0.6f) * EqT2);
            c58a.EL7(c58a.Amh(), 20.0f);
            c58a.ELz(c58a.Amh(), 1.5f, 2.0f);
            long A004 = AbstractC119395aw.A00(0.0f, 0.0f);
            long Bxc = A0c.Bxc();
            float A02 = C5YC.A02(Bxc) / 2.0f;
            A0c.AR3(c25764Ba3, null, c119815bf, 1.0f, 3, A004, C62U.A00(Bxc, A004), AbstractC137636Lj.A00(A02, A02));
            AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
            long A082 = AbstractC25227BEk.A08(anonymousClass586);
            c58a.F8X(EqT * 0.1f, 0.7f * EqT2);
            c58a.EL7(c58a.Amh(), 40.0f);
            c58a.ELz(c58a.Amh(), 6.0f, 2.0f);
            long Bxc2 = A0c.Bxc();
            float A022 = C5YC.A02(Bxc2) / 2.0f;
            A0c.AR3(c25764Ba32, null, c119815bf, 1.0f, 3, A004, C62U.A00(Bxc2, A004), AbstractC137636Lj.A00(A022, A022));
            AbstractC25228BEl.A1L(anonymousClass586, AzL, A082);
            A08 = AbstractC25227BEk.A08(anonymousClass586);
            c58a.F8X(f, 0.05f * EqT2);
            c58a.ELz(c58a.Amh(), 1.0f, 1.0f);
            long Bxc3 = A0c.Bxc();
            float A023 = C5YC.A02(Bxc3) / 2.0f;
            A0c.AR3(c25764Ba33, null, c119815bf, 1.0f, 3, A004, C62U.A00(Bxc3, A004), AbstractC137636Lj.A00(A023, A023));
            AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
            return C0eB.A00;
        } catch (Throwable th) {
            AbstractC25228BEl.A1L(anonymousClass586, AzL, A08);
            throw th;
        }
    }
}
