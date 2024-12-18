package X;

/* renamed from: X.Bka, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26329Bka extends AbstractC51572Yf {
    public final C25811BbS A00;
    public final boolean A01;

    public C26329Bka(C25811BbS c25811BbS) {
        C14360o3.A0B(c25811BbS, 1);
        this.A00 = c25811BbS;
        this.A01 = true;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv A0d;
        C51722Yv A0a;
        C14360o3.A0B(c76223bS, 0);
        boolean z = this.A01;
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        if (z) {
            A0d = AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0m(num, 100.0f, 0), 0);
        } else {
            A0d = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
        }
        C9CT A0m = AbstractC25225BEi.A0m(num, 100.0f, 0);
        if (!z) {
            A0a = AbstractC25225BEi.A0h(null, A0m);
        } else {
            A0a = AbstractC25233BEq.A0a(AbstractC25225BEi.A0h(null, A0m), C05F.A01, 1.0f);
        }
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C2XE c2xe = A12.A00;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        C87 c87 = C87.A0A;
        C51722Yv A0Z = AbstractC25233BEq.A0Z(null, num, 200.0d, 0);
        long doubleToRawLongBits = Double.doubleToRawLongBits(190.0d);
        Integer num2 = C05F.A01;
        A0P.A00(new C26330Bkb(C9CU.A00(A0Z, num2, 0, doubleToRawLongBits), c87));
        long A0E = AbstractC25229BEm.A0E();
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(15.0d);
        Integer num3 = C05F.A0E;
        C51722Yv A00 = C9CU.A00(null, num3, 0, A0E);
        Integer num4 = C05F.A08;
        C51722Yv A002 = C9CU.A00(A00, num4, 0, doubleToRawLongBits2);
        Integer num5 = C05F.A0A;
        C51722Yv A003 = C9CU.A00(A002, num5, 0, A0E);
        String A0F = AbstractC77623dm.A0F(A0P, 2131966214);
        C88 c88 = C88.A0Z;
        Integer num6 = C05F.A04;
        long A0B = AbstractC25229BEm.A0B();
        C93E c93e = C93E.CENTER;
        A0P.A00(new C26567BoQ(A003, c93e, c88, A0F, num6, 0, A0B, A0B));
        AbstractC25231BEo.A19(new C26567BoQ(AbstractC25233BEq.A0Z(null, num3, 18.0d, 0), c93e, c88, AbstractC77623dm.A0F(A0P, 2131966213), C05F.A0G, 0, A0B, A0B), A0P, A12, A0a);
        C3e8 c3e8 = C3e8.FLEX_END;
        C51722Yv A0d2 = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
        long A0H = AbstractC25229BEm.A0H();
        long A0N = AbstractC25230BEn.A0N();
        C51722Yv A004 = C9CU.A00(C9CU.A00(C9CU.A00(A0d2, num3, 0, A0H), num4, 0, A0N), num5, 0, AbstractC25230BEn.A0J());
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
        C3e8 c3e82 = C3e8.SPACE_AROUND;
        C51722Yv A0T = AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0n(num2, 0, AbstractC25229BEm.A0C()), num, 100.0f, 0);
        C2Z0 A13 = AbstractC25232BEp.A13(A0P2);
        AbstractC25231BEo.A1B(new C26519Bne(C9CU.A00(null, num3, 0, A0E), C88.A0Q, C88.A0T, null, AbstractC77623dm.A0F(A13, 2131966212), num2, num, num, C05F.A0F, C29910DGy.A01(this, 37)), A13, A0P2, A0T, c3e82);
        A12.A00(AbstractC76963ci.A08(A0P2, A12, A004, c3e8));
        return AbstractC76963ci.A05(A12, c76223bS, A0d);
    }
}
