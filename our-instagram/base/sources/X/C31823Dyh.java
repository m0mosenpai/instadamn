package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dyh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31823Dyh extends AbstractC52922bZ {
    public C05A A00;
    public C05A A01;
    public C05A A02;
    public final C05A A03;
    public final C05A A04 = C10E.A00(null);

    public final void A00(UserSession userSession, String str) {
        C05A c05a;
        C14360o3.A0B(userSession, 0);
        AbstractC166997dE.A1Y(this.A00, true);
        C05A c05a2 = this.A02;
        AbstractC166997dE.A1Y(c05a2, C14360o3.A0K(str, "partial_ci"));
        C15370ps A1F = AbstractC25225BEi.A1F();
        if (AbstractC31176DnK.A1b(c05a2)) {
            c05a = this.A03;
        } else {
            c05a = this.A04;
        }
        A1F.A00 = c05a;
        C1ON A01 = AbstractC31513Dsx.A01(userSession, null, null, str, true, false);
        C31456Ds0.A00(A01, A1F, userSession, 38);
        C1GJ.A04(A01, 413491125);
    }

    public C31823Dyh() {
        Boolean A0a = AbstractC166997dE.A0a();
        this.A00 = AbstractC25225BEi.A1H(A0a);
        this.A01 = AbstractC25225BEi.A1H(A0a);
        this.A03 = C10E.A00(null);
        this.A02 = AbstractC25225BEi.A1H(A0a);
    }
}
