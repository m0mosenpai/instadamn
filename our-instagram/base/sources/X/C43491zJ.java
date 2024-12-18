package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;

/* renamed from: X.1zJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43491zJ implements RealtimeEventHandlerProvider {
    public static final C43491zJ A00 = new C43491zJ();

    @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
    public final RealtimeEventHandler get(UserSession userSession) {
        if (C18U.A06(C06090Tz.A06, userSession, 36312501083767952L)) {
            C14360o3.A0A(userSession);
            return new C46034KYz(userSession);
        }
        return null;
    }
}
