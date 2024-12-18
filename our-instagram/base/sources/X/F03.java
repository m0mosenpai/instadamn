package X;

import com.facebook.AccessToken;
import com.instagram.common.session.UserSession;
import java.util.Date;

/* loaded from: classes6.dex */
public abstract class F03 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.1vN] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        String A0f = AbstractC31171DnF.A0f(A01);
        String str = (String) A01;
        C14360o3.A0C(c6fw.A03(1), A0f);
        String A0n = AbstractC31176DnK.A0n(c6fw, A0f);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        if (A0n.length() == 0) {
            C14360o3.A0B(A0B, 1);
            C1L2.A02(A0B, true);
        } else {
            Date date = AccessToken.A0A;
            new AccessToken(C05F.A1F, A0n, C1L4.A02, str, EnumC61160RgL.A04.A00, null, null, new Date());
            AbstractC12990ll A0B2 = C6BQ.A0B(c6fq);
            C14360o3.A0C(A0B2, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            UserSession userSession = (UserSession) A0B2;
            AbstractC23021Ah.A00(userSession).A0p(userSession);
        }
        AbstractC25651Mw.A00(A0B).E4s(new Object());
        return null;
    }
}
