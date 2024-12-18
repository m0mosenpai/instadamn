package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41301vf {
    public static final void A00(UserSession userSession) {
        User A01 = C17060sy.A01.A01(userSession);
        C41331vi.A00 = new C41311vg(A01.getId(), A01.getUsername(), userSession.token);
    }
}
