package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Rsf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61724Rsf {
    public static final boolean A00(C43031yW c43031yW, boolean z) {
        C06090Tz c06090Tz;
        C06090Tz c06090Tz2;
        C14360o3.A0B(c43031yW, 0);
        UserSession userSession = c43031yW.A00;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        if (!AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800420989571L)) {
            if (z) {
                c06090Tz2 = C06090Tz.A05;
            } else {
                c06090Tz2 = C06090Tz.A06;
            }
            if (!AbstractC31177DnL.A1U(c06090Tz2, userSession, 36322800420792960L)) {
                return false;
            }
        }
        return true;
    }
}
