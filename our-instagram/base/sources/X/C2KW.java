package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2KW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2KW {
    public static final C71943Kr A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C2IZ.A04.A00(userSession.userId).A00();
    }

    public static final void A01(UserSession userSession, C2KV c2kv) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c2kv, 1);
        C2IZ.A04.A00(userSession.userId).A01().add(c2kv);
    }

    public static final void A02(UserSession userSession, C2KV c2kv) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c2kv, 1);
        C2IZ.A04.A00(userSession.userId).A01().remove(c2kv);
    }
}
