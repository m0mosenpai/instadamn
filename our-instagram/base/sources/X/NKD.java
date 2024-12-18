package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NKD extends OX6 {
    public final C22P A00;
    public final UserSession A01;
    public final C52458NJc A02;
    public final C05A A03;
    public final C0UO A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKD(C22P c22p, UserSession userSession, C52458NJc c52458NJc) {
        super(c52458NJc);
        AbstractC167007dF.A1D(userSession, 1, c52458NJc);
        this.A01 = userSession;
        this.A02 = c52458NJc;
        this.A00 = c22p;
        C008002u A1H = AbstractC25225BEi.A1H(new C51721Msy(null, null, 15, 1, false, false, false));
        this.A03 = A1H;
        this.A04 = A1H;
    }

    public final void A08() {
        C51754Mtd A00;
        if (C22P.A2m != this.A00) {
            return;
        }
        A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 253951, false, false, false, false, false, false, false, false, false, false, true, false, false);
        A07(A00);
        C35131FeY c35131FeY = EgZ.A04;
        UserSession userSession = this.A01;
        c35131FeY.A02(AbstractC166987dD.A0O(AbstractC25225BEi.A0F(userSession)), userSession, null, false, true);
    }

    public final void A09(String str) {
        A07(C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, A04(), null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, -1, 258047, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }
}
