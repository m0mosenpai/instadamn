package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Ll, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72123Ll {
    public static final boolean A00(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36329736787542534L)) {
            if (C18U.A06(c06090Tz, userSession, 36329736787476997L) && C14360o3.A0K(C55772hI.A00(userSession).A0C, "clips_viewer_feed_timeline")) {
                return true;
            }
            return false;
        }
        return true;
    }
}
