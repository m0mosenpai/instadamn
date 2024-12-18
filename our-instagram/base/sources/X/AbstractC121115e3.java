package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.5e3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121115e3 {
    @Deprecated(message = "Use getInstanceAsync() instead", replaceWith = @ReplaceWith(expression = "getInstanceAsync(userSession)", imports = {}))
    public static final C5e4 A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C5e4) userSession.A01(C5e4.class, new C9EI(userSession, 32));
    }

    public static final C121275eQ A01(UserSession userSession, C2AH c2ah) {
        C14360o3.A0B(userSession, 0);
        C121275eQ c121275eQ = new C121275eQ(new CallableC44057Jdi(userSession), 1967622104);
        c121275eQ.A00 = c2ah;
        return c121275eQ;
    }
}
