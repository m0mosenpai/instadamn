package X;

import android.text.TextUtils;

/* renamed from: X.BkZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26328BkZ extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final String A01;

    public C26328BkZ(C51722Yv c51722Yv, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        Integer num = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 100.0f, A1Z ? 1 : 0));
        Integer num2 = C05F.A01;
        C51722Yv A00 = AbstractC25230BEn.A0d(A0h, num2, 100.0f, A1Z ? 1 : 0).A00(this.A00);
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        C51722Yv A0a = AbstractC25233BEq.A0a(null, num2, 1.0f);
        C2XE c2xe = A0P.A00;
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
        long A0E = AbstractC25229BEm.A0E();
        long A0N = AbstractC25230BEn.A0N();
        Integer num3 = C05F.A0E;
        C51722Yv A0G = AbstractC25234BEr.A0G(null, AbstractC25225BEi.A0n(num3, A1Z ? 1 : 0, A0E), A1Z ? 1 : 0, A0N);
        CharSequence expandTemplate = TextUtils.expandTemplate(AbstractC77623dm.A0F(A0P2, 2131966173), this.A01);
        C14360o3.A07(expandTemplate);
        C88 c88 = C88.A0Z;
        Integer num4 = C05F.A04;
        C93E c93e = C93E.CENTER;
        long A0B = AbstractC25229BEm.A0B();
        A0P2.A00(new C26567BoQ(A0G, c93e, c88, expandTemplate, num4, A1Z ? 1 : 0, A0B, A0B));
        AbstractC25231BEo.A19(new C26567BoQ(C9CU.A00(AbstractC25233BEq.A0Z(null, num3, 25.0d, A1Z ? 1 : 0), C05F.A0F, A1Z ? 1 : 0, A0E), c93e, C88.A0i, AbstractC77623dm.A0F(A0P2, 2131966172), num, A1Z ? 1 : 0, A0B, A0B), A0P2, A0P, A0a);
        C51722Yv A0T = AbstractC25233BEq.A0T(AbstractC25234BEr.A0E(null, AbstractC25225BEi.A0n(num3, A1Z ? 1 : 0, AbstractC25229BEm.A0H()), A1Z ? 1 : 0, A0N), AbstractC25225BEi.A0n(num2, A1Z ? 1 : 0, AbstractC25229BEm.A0C()), num, 100.0f, A1Z ? 1 : 0);
        C2Z0 A0P3 = AbstractC167007dF.A0P(c2xe);
        A0P3.A00(new C26519Bne(C9CU.A00(null, C05F.A0G, A1Z ? 1 : 0, A0E), null, null, null, AbstractC77623dm.A0F(A0P3, 2131966215), num, num, num, null, C29896DGk.A00(A0P3, this, 42)));
        AbstractC25226BEj.A1R(A0P3, A0P, A0T);
        return AbstractC76963ci.A05(A0P, c76223bS, A00);
    }
}
