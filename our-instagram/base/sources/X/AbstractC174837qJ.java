package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7qJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC174837qJ {
    public static final int A00(UserSession userSession, C55U c55u, Integer num, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c55u, 3);
        if ((num != null && num.intValue() == 1) || z || AbstractC23021Ah.A00(userSession).A1w()) {
            return 1;
        }
        if (!(c55u instanceof C81T)) {
            if (AbstractC23021Ah.A00(userSession).A1v()) {
                return 1;
            }
        } else {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (((Boolean) A00.A0y.CES(A00, C23031Ai.A8c[68])).booleanValue()) {
                return 1;
            }
        }
        return 0;
    }
}
