package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140696Xx {
    public static final C140706Xy A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C140706Xy.A02 == null) {
            C140706Xy.A02 = new C140706Xy(userSession);
        }
        C140706Xy c140706Xy = C140706Xy.A02;
        if (c140706Xy == null) {
            C14360o3.A0F("instance");
            throw C00O.createAndThrow();
        }
        return c140706Xy;
    }
}
