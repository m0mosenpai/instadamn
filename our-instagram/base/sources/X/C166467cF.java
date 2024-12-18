package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7cF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166467cF {
    public C38321qM A00;
    public final UserSession A01;

    public C166467cF(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = c38321qM;
    }

    public static final void A00(C166467cF c166467cF, C68860VdG c68860VdG, boolean z) {
        C38321qM c38321qM = c166467cF.A00;
        if (c38321qM != null) {
            if (z) {
                c38321qM.A0U.clear();
            }
            C67948V3n c67948V3n = new C67948V3n(c38321qM, c166467cF, c68860VdG);
            UserSession userSession = c166467cF.A01;
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A09(C05F.A0N);
            c25621Ms.A0L("limited_interactions/%s/comments/limited_comments/", c38321qM.getId());
            c25621Ms.A0P(null, C38885HAh.class, ITC.class, false);
            if (!z) {
                c25621Ms.A0H(MSV.A00(235), c38321qM.A0O);
            }
            if (new C57382kD(userSession).A00()) {
                c25621Ms.A9s("can_support_carousel_mentions", "true");
            }
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = c67948V3n;
            C1GJ.A03(A0N);
        }
    }
}
