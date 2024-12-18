package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.0DV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DV {
    public final UserSession A00;

    public static final void A00(C0DV c0dv) {
        C17150tA c17150tA;
        UserSession userSession = c0dv.A00;
        if (!userSession.isDestroyed()) {
            if (!userSession.isEnded() && (c17150tA = userSession.userSessionEnder) != null) {
                c17150tA.A00.AIn(null);
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36327812643830669L) && userSession.hasEnded()) {
                for (Object obj : userSession.A02()) {
                    if (!(obj instanceof C17060sy)) {
                        String A0R = AnonymousClass001.A0R("scoped:", obj.getClass().getName());
                        C6QM.A01(obj, A0R, AbstractC16850sd.A0M(new C09530e4("additional_logged_classname", A0R)));
                    }
                }
            }
            if (userSession.hasEnded()) {
                java.util.Set entrySet = userSession.A00.entrySet();
                C14360o3.A07(entrySet);
                AnonymousClass016.A19(entrySet, C04890Ni.A00, true);
                userSession.sessionState = EnumC13040lq.A02;
            }
        }
    }

    public final void A01(boolean z) {
        UserSession userSession = this.A00;
        userSession.sessionState = EnumC13040lq.A05;
        userSession.isLoggedOut = z;
        C17150tA c17150tA = userSession.userSessionEnder;
        if (c17150tA != null) {
            c17150tA.A00.AIn(null);
        }
    }

    public C0DV(UserSession userSession) {
        this.A00 = userSession;
    }
}
