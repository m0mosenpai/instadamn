package X;

import com.instagram.comments.request.CommentsFetcher;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OV4 {
    public static final OV4 A00 = new Object();

    public final void A00(C07T c07t, UserSession userSession, C38321qM c38321qM, String str, int i, long j) {
        C14360o3.A0B(str, 1);
        if (!c38321qM.A4k()) {
            C54627OBc c54627OBc = (C54627OBc) userSession.A01(C54627OBc.class, new J7Q(userSession, 19));
            String id = c38321qM.getId();
            if (id != null) {
                if (c54627OBc.A00.get(id) == null) {
                    if (C18U.A06(C06090Tz.A05, userSession, 36318694427007397L) && (AbstractC15820qc.A04().A00 == C05F.A01 || AbstractC15820qc.A04().A00 == C05F.A0C)) {
                        return;
                    }
                    new CommentsFetcher(c07t, userSession, c38321qM, str, i).A03(EnumC166067ba.A04, C05F.A0u, j);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
