package X;

/* renamed from: X.Bkd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26332Bkd extends AbstractC51572Yf {
    public final CW7 A00;
    public final Integer A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        float f;
        C14360o3.A0B(c76223bS, 0);
        if (this.A00.A00.intValue() != 0) {
            f = 1.0f;
        } else {
            f = 0.5625f;
        }
        C75933ay c75933ay = C51722Yv.A02;
        long A0H = AbstractC25230BEn.A0H();
        long A0K = AbstractC25230BEn.A0K();
        C51722Yv A0d = AbstractC25230BEn.A0d(AbstractC25234BEr.A0E(C9CU.A00(null, C05F.A07, 0, A0K), AbstractC25227BEk.A0Z(0, A0K), 0, A0H), C05F.A00, 100.0f, 0);
        C3e8 c3e8 = C3e8.CENTER;
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C51722Yv A0a = AbstractC25233BEq.A0a(C9CU.A00(null, C05F.A0j, 0, Double.doubleToRawLongBits(180.0d)), C05F.A0Y, f);
        AbstractC25230BEn.A1H(new C26365BlA(c75933ay, C29905DGt.A01(this, 23), AbstractC25230BEn.A0N()), AbstractC25232BEp.A13(A12), A12, A0a);
        return AbstractC76963ci.A0J(A12, c76223bS, A0d, null, enumC77683ds, null, c3e8, null, false);
    }

    public C26332Bkd(CW7 cw7, Integer num) {
        this.A00 = cw7;
        this.A01 = num;
    }
}
