package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7IA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7IA {
    public static final boolean A00(UserSession userSession, C2EC c2ec, boolean z) {
        User Ba5;
        C06090Tz c06090Tz;
        if (!c2ec.CVQ() && (Ba5 = c2ec.Ba5()) != null && ((Ba5.A1u() || Ba5.A1x()) && ((C81663kb) c2ec).A01.A2U)) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            if (C18U.A06(c06090Tz, userSession, 36319106743409602L)) {
                return true;
            }
        }
        return false;
    }
}
