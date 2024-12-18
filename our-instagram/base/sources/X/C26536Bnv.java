package X;

/* renamed from: X.Bnv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26536Bnv extends AbstractC51572Yf {
    public final int A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        int A0H = AbstractC166987dD.A0H(AbstractC77183d4.A00(c76223bS, new C37017GSy(c76223bS, 15), new Object[0]));
        C75933ay c75933ay = C51722Yv.A02;
        long A0N = AbstractC25230BEn.A0N();
        C51722Yv A00 = C9CU.A00(null, C05F.A0A, 0, A0N);
        Integer num = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(A00, num, 100.0f, 0);
        Integer num2 = C05F.A0C;
        C51722Yv A0d2 = AbstractC25230BEn.A0d(A0d, num2, 0.0f, 1);
        C84793qT c84793qT = (C84793qT) AbstractC77183d4.A00(c76223bS, new C37017GSy(c76223bS, 16), new Object[0]);
        C51722Yv A0d3 = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
        Integer num3 = C05F.A01;
        C51722Yv A0d4 = AbstractC25230BEn.A0d(A0d3, num3, 100.0f, 0);
        long A0L = AbstractC25230BEn.A0L();
        C51722Yv A002 = C9CU.A00(A0d4, C05F.A15, 0, A0L);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        int i = this.A00;
        int i2 = 8;
        if (i > 0) {
            if (i > 8) {
                i = 8;
            }
            i2 = i;
        }
        int i3 = 1;
        while (true) {
            C51722Yv A0d5 = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
            long A0F = AbstractC25229BEm.A0F();
            C51722Yv A003 = C9CU.A00(A0d5, C05F.A0u, 0, A0F);
            C2Z0 A0K = AbstractC25233BEq.A0K(A12);
            int A0m = AbstractC25232BEp.A0m(A0K, 15.0d);
            long A0H2 = AbstractC25229BEm.A0H();
            A0K.A00(new C167857ef(AbstractC25233BEq.A0T(C9CU.A00(null, num, 0, A0H2), AbstractC25225BEi.A0n(num3, 0, A0H2), num2, 0.0f, 1), A0H, A0m));
            C51722Yv A0d6 = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
            long A0C = AbstractC25229BEm.A0C();
            Integer num4 = C05F.A07;
            C51722Yv A0S = AbstractC25233BEq.A0S(A0d6, AbstractC25225BEi.A0n(num4, 0, A0L), 0, A0C);
            C2Z0 A0K2 = AbstractC25233BEq.A0K(A0K);
            A0K2.A00(new C167857ef(C9CU.A00(C9CU.A00(AbstractC25230BEn.A0d(null, num, 40.0f, 0), num3, 0, A0F), num4, 0, A0L), A0H, AbstractC25228BEl.A08(A0K2, A0N)));
            AbstractC25230BEn.A1H(new C167857ef(AbstractC25233BEq.A0Q(AbstractC25233BEq.A0Z(AbstractC25230BEn.A0d(null, num, 80.0f, 0), num3, 48.0d, 0), 4.0d), A0H, AbstractC25228BEl.A08(A0K2, A0N)), A0K2, A0K, A0S);
            C2WH A0E = AbstractC76963ci.A0E(A0K, A12, A003);
            C14360o3.A0A(c84793qT);
            A12.A00(new C167877eh(A0E, A0d2, c84793qT));
            if (i3 != i2) {
                i3++;
            } else {
                return AbstractC76963ci.A03(A12, c76223bS, A002);
            }
        }
    }

    public C26536Bnv(int i) {
        this.A00 = i;
    }

    public C26536Bnv() {
        this(8);
    }
}
