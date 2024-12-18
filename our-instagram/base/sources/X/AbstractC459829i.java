package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.29i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC459829i {
    public static final Long A00(UserSession userSession) {
        long A00 = new C29W(userSession).A00();
        if (A00 > 0 && !AnonymousClass280.A01.A0C(userSession)) {
            return Long.valueOf(A00);
        }
        return null;
    }
}
