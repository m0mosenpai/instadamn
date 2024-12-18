package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLoggingController;

/* renamed from: X.2Eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47272Eu {
    public static final /* synthetic */ C47272Eu A02 = new Object();
    public static final C47282Ev A01 = new C47282Ev(20127832, "IG_DIRECT_MESSAGING_READY_ARMADILLO_TEMP");
    public static final C47282Ev A00 = new C47282Ev(20131727, "IG_DIRECT_ARMADILLO_TIME_TO_NEW_CONTENT");

    public static final IGFOAMessagingReadyLogger A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return ((IGFOAMessagingReadyLoggingController) userSession.A01(IGFOAMessagingReadyLoggingController.class, new C206829Dn(userSession, 8))).getLogger(Integer.valueOf(userSession.userId.hashCode()));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.2F1] */
    public static final C2F2 A01(UserSession userSession) {
        C47282Ev c47282Ev;
        C14360o3.A0B(userSession, 0);
        int hashCode = userSession.userId.hashCode();
        if (C18U.A06(C06090Tz.A05, userSession, 36323968647376629L)) {
            c47282Ev = A00;
        } else {
            c47282Ev = A01;
        }
        C14360o3.A0B(c47282Ev, 1);
        return new C2F2(userSession, new Object(), (AbstractC47302Ey) userSession.A01(IGFOAMessagingReadyLoggingController.class, new C206829Dn(userSession, 8)), c47282Ev, hashCode);
    }
}
