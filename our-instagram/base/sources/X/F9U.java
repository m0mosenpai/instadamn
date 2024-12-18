package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F9U {
    public static final void A00(UserSession userSession, GZK gzk, String str, String str2, String str3, List list) {
        C14360o3.A0B(userSession, 0);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        C2JO c2jo = new C2JO();
        c2jo.A09(str2, AbstractC31189DnY.A02());
        c2jo.A09(str3, "guid");
        c2jo.A09(str, "contact_point");
        c2jo.A05("google_tokens", list);
        A0b.A00(c2jo, "data");
        C35826Fs2.A00(new C31463Ds7(gzk, 10), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "NUXUpdateContactPointMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), R1L.class, true, null, 0, null, "xdt_async_send_confirmation_code", AbstractC166987dD.A1E()), A01, gzk, 10);
    }
}
