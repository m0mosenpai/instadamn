package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.82X, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C82X {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.82Y, java.lang.Object] */
    public static final C82Y A00(UserSession userSession) {
        C82Y c82y = (C82Y) userSession.A00(C82Y.class);
        if (c82y == null) {
            ?? obj = new Object();
            userSession.A04(C82Y.class, obj);
            return obj;
        }
        return c82y;
    }
}
