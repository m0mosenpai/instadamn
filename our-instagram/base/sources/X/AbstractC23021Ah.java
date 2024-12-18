package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1Ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23021Ah {
    public static final C23031Ai A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C23031Ai) userSession.A01(C23031Ai.class, new C9EQ(userSession, 23));
    }

    public static final void A01(UserSession userSession, int i) {
        InterfaceC19610xo ARD = C1AT.A01(userSession).A03(C1AV.A3X).ARD();
        ARD.E7D("num_unseen_activities", i);
        ARD.apply();
    }
}
