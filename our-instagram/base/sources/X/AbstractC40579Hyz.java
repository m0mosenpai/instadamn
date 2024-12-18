package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;

/* renamed from: X.Hyz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40579Hyz {
    public static final void A00(UserSession userSession, JH1 jh1, String str) {
        C26076Bg5 c26076Bg5;
        AbstractC167027dH.A12(userSession, str, jh1);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36315292812446862L);
        if (A06 && (c26076Bg5 = (C26076Bg5) ((C42341Ip3) userSession.A01(C42341Ip3.class, J7Y.A00)).A00.get(str)) != null && System.currentTimeMillis() - c26076Bg5.A00 < C18U.A01(c06090Tz, userSession, 36596767789222529L)) {
            jh1.DVY((C35003Fba) c26076Bg5.A01);
            return;
        }
        C1ON A08 = DirectThreadApi.A08(userSession, str, null, 10);
        A08.A00 = new HG3(userSession, jh1, str, 0, A06);
        C1GJ.A03(A08);
    }
}
