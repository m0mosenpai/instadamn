package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DpP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31303DpP {
    public static final boolean A00(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        C06090Tz c06090Tz2;
        C14360o3.A0B(userSession, 0);
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        if (!AbstractC31177DnL.A1U(c06090Tz, userSession, 36325192712074091L)) {
            return false;
        }
        User A0Y = AbstractC166997dE.A0Y(userSession);
        if (A0Y.A1u()) {
            return true;
        }
        if (!A0Y.A1x()) {
            return false;
        }
        if (z) {
            c06090Tz2 = C06090Tz.A05;
        } else {
            c06090Tz2 = C06090Tz.A06;
        }
        return AbstractC31177DnL.A1U(c06090Tz2, userSession, 36325192712139628L);
    }

    public static final boolean A01(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        C14360o3.A0B(userSession, 0);
        if (!A00(userSession, z)) {
            return false;
        }
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        return AbstractC31177DnL.A1U(c06090Tz, userSession, 36325192712205165L);
    }
}
