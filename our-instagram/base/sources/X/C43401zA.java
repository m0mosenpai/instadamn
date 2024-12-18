package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;

/* renamed from: X.1zA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43401zA implements RealtimeEventHandlerProvider {
    public static final C43401zA A00 = new C43401zA();

    @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
    public final RealtimeEventHandler get(UserSession userSession) {
        C14360o3.A0A(userSession);
        C14360o3.A0B(userSession, 0);
        return (RealtimeEventHandler) userSession.A01(C4M8.class, new C50162MDp(userSession, 34));
    }
}
