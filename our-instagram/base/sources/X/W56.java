package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class W56 {
    public static final Integer A05 = C05F.A0N;
    public XCI A00;
    public XCI A01;
    public AbstractC154286wd A02;
    public final UserSession A03;
    public final C154796xU A04;

    public W56(UserSession userSession, C154796xU c154796xU) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = c154796xU;
    }

    public final void A00(XDK xdk, String str) {
        boolean A1a = AbstractC167017dG.A1a(str, xdk);
        C154796xU c154796xU = this.A04;
        if (c154796xU != null) {
            UserSession userSession = this.A03;
            String A06 = AbstractC13670mt.A06("%s_%s", str, userSession.userId);
            C38321qM A0h = AbstractC25229BEm.A0h(userSession, A06);
            if (A0h != null) {
                W6j.A01(xdk, A0h);
                W6j.A00(xdk);
                return;
            }
            this.A02 = new C32951Eei(A1a ? 1 : 0, xdk, this);
            C1ON A04 = AbstractC2044893h.A04(userSession, A06);
            AbstractC154286wd abstractC154286wd = this.A02;
            if (abstractC154286wd != null) {
                c154796xU.A03(A04, abstractC154286wd);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw new IllegalStateException("mFeedNetworkSource could not be null when requesting single feed media");
    }

    public final void A01(XDK xdk, String str, String str2, String str3, String str4) {
        Integer num;
        AbstractC167017dG.A1N(str, str2);
        C14360o3.A0B(xdk, 4);
        C70611Wdp c70611Wdp = new C70611Wdp(xdk, 0);
        this.A01 = c70611Wdp;
        UserSession userSession = this.A03;
        Integer num2 = A05;
        if (str.equals("ALL")) {
            num = C05F.A00;
        } else if (str.equals("CAROUSEL_V2")) {
            num = C05F.A01;
        } else if (str.equals("IMAGE")) {
            num = C05F.A0C;
        } else if (str.equals("SHOPPING")) {
            num = C05F.A0N;
        } else if (str.equals("VIDEO")) {
            num = C05F.A0Y;
        } else {
            throw new IllegalArgumentException(str);
        }
        Integer A00 = AbstractC69889VxG.A00(str2);
        C14360o3.A0B(num2, 3);
        AbstractC167007dF.A1G(num, 4, A00);
        W8e.A00(new C70088W2k(c70611Wdp, userSession, num, A00, str4, str3));
    }
}
