package X;

import java.util.List;

/* renamed from: X.Bo3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26544Bo3 extends AbstractC51572Yf {
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final long A05;
    public static final long A06;
    public static final long A07 = AbstractC25230BEn.A0L();
    public final List A00;
    public final InterfaceC16660sJ A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        String A0F = AbstractC77623dm.A0F(A0P, 2131966558);
        Integer num = C05F.A0N;
        C88 c88 = C88.A0i;
        C93E c93e = C93E.CENTER;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(AbstractC25234BEr.A0G(null, AbstractC25225BEi.A0n(C05F.A0E, 0, A06), 0, A07), C05F.A1I, 0, A04);
        long j = A05;
        A0P.A00(new C26567BoQ(A00, c93e, c88, A0F, num, 0, j, j));
        C51722Yv A002 = C9CU.A00(AbstractC25230BEn.A0d(null, C05F.A01, 100.0f, 0), C05F.A04, 0, A03);
        long A0D = AbstractC25229BEm.A0D();
        C3F1 c3f1 = AbstractC169037gc.A00;
        C2XE c2xe = A0P.A00;
        C2V3 c2v3 = c2xe.A02.A01;
        C2VF c2vf = c2v3.A02;
        boolean z = c2v3.A0W;
        C28943Cpr c28943Cpr = new C28943Cpr(c2xe);
        c28943Cpr.A00(this.A00, C30150DQg.A00, null, new C30506Dbp(this, 8));
        A0P.A00(new C168977gW(c3f1, null, null, null, A002, null, new C212149aj(c2xe, c2vf, 1, Integer.MIN_VALUE, AbstractC25232BEp.A0n(A0P, A0D), 2, z), c28943Cpr.A01, null, null, null, null, null, null, true, null, null, null, null, null, null, true, false));
        return new C2WF(null, null, null, A0P.A01, false);
    }

    static {
        long A0F = AbstractC25229BEm.A0F();
        A04 = A0F;
        A06 = A0F;
        A05 = AbstractC25230BEn.A0K();
        long A0J = AbstractC25229BEm.A0J();
        A03 = A0J;
        A02 = A0J;
    }

    public C26544Bo3(InterfaceC16660sJ interfaceC16660sJ, List list) {
        AbstractC167017dG.A1P(list, interfaceC16660sJ);
        this.A00 = list;
        this.A01 = interfaceC16660sJ;
    }
}
