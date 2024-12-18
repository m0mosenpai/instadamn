package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.25A, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C25A {
    public static final PendingMediaStore A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (PendingMediaStore) userSession.A01(PendingMediaStore.class, new C9EQ(userSession, 8));
    }
}
