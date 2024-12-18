package X;

import android.app.Activity;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.6sO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151786sO {
    public static boolean A00;
    public static boolean A01;

    public static final void A00(Activity activity, UserSession userSession) {
        if (!A01 && !A00) {
            C06090Tz c06090Tz = C06090Tz.A06;
            if (C18U.A06(c06090Tz, userSession, 36323749603389018L)) {
                if (C18U.A06(c06090Tz, userSession, 36323749603061333L)) {
                    if (C18U.A06(c06090Tz, userSession, 36323749603257944L) || C18U.A06(c06090Tz, userSession, 36323749603192407L)) {
                        C40701ud A012 = AbstractC40691uc.A01(userSession);
                        C2JM c2jm = new C2JM();
                        C2JM c2jm2 = new C2JM();
                        C2JQ c2jq = PandoGraphQLRequest.Companion;
                        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGTeenBioEducationQPQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59762Qmc.class, false, null, 0, null, AbstractC58317Pt9.A00(1106), new ArrayList());
                        A012.ATV(C23367AXr.A00, new C64016Sxn(activity, userSession), pandoGraphQLRequest);
                        return;
                    }
                    return;
                }
                C1VN c1vn = C1VN.A00;
                if (c1vn == null) {
                    return;
                }
                c1vn.A02(userSession, activity, "333195783095862");
            }
        }
    }
}
