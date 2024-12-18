package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker;

/* renamed from: X.2JF, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2JF {
    public static final IgSignalsClipsOpenTabTracker A00(UserSession userSession) {
        if (C18U.A06(C06090Tz.A05, userSession, 36329792622051866L) && AbstractC54792fc.A06(userSession)) {
            return (IgSignalsClipsOpenTabTracker) userSession.A01(IgSignalsClipsOpenTabTracker.class, new C9EM(userSession, 39));
        }
        return null;
    }
}
