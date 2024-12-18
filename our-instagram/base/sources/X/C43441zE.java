package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;

/* renamed from: X.1zE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43441zE implements RealtimeEventHandlerProvider {
    public static final C43441zE A00 = new C43441zE();

    @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
    public final RealtimeEventHandler get(UserSession userSession) {
        C14360o3.A0A(userSession);
        return AbstractC81223jr.A00(userSession);
    }
}
