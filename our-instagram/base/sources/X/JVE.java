package X;

import com.facebook.msys.mca.MailboxFeature;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class JVE {
    public static final JV6 A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (JV6) userSession.A01(JV6.class, MHS.A00(userSession, 13));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.msys.mca.MailboxFeature, X.K3Q] */
    public static final K3Q A00(UserSession userSession) {
        return new MailboxFeature(new C135656Br(C61A.A02(userSession, AbstractC94034Kn.A00(userSession)), 2));
    }
}
