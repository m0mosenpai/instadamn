package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FAF {
    public static final boolean A00(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        Boolean CTH = AbstractC31178DnM.A0T(userSession).A03.CTH();
        if (CTH != null && CTH.booleanValue()) {
            if (z) {
                c06090Tz = C06090Tz.A06;
            } else {
                c06090Tz = C06090Tz.A05;
            }
            if (C18U.A06(c06090Tz, userSession, 36322761760975337L)) {
                return true;
            }
        }
        return false;
    }
}
