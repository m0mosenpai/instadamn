package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.90Q, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C90Q extends C83Z {
    public final UserSession A00;
    public final String A01;

    public C90Q(UserSession userSession, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = userSession;
        this.A01 = str;
    }

    public static final InterfaceC19630xq A00(C90Q c90q) {
        UserSession userSession = c90q.A00;
        if (userSession != null) {
            return C1AT.A01(userSession).A03(C1AV.A0b);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
