package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.1zV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43571zV implements RealtimeClientManager.PresenceMsysAppStateChangeObserverProvider {
    public static final C43571zV A00 = new C43571zV();

    @Override // com.instagram.realtimeclient.RealtimeClientManager.PresenceMsysAppStateChangeObserverProvider
    public final RealtimeClientManager.PresenceMsysAppStateChangeObserver get(final UserSession userSession) {
        return new RealtimeClientManager.PresenceMsysAppStateChangeObserver() { // from class: X.4Mg
            @Override // com.instagram.realtimeclient.RealtimeClientManager.PresenceMsysAppStateChangeObserver
            public final void onAppBackgrounded() {
                UserSession userSession2 = UserSession.this;
                C14360o3.A0A(userSession2);
                C14360o3.A0B(userSession2, 0);
                if (C18U.A06(C06090Tz.A05, userSession2, 36313390141933483L)) {
                    C14360o3.A0A(userSession2);
                    C47909LEd c47909LEd = AbstractC46874KoH.A00(userSession2).A00;
                    if (c47909LEd != null) {
                        C47909LEd.A00(c47909LEd, new DS9(14, c47909LEd, false));
                    }
                }
            }

            @Override // com.instagram.realtimeclient.RealtimeClientManager.PresenceMsysAppStateChangeObserver
            public final void onAppForegrounded() {
                UserSession userSession2 = UserSession.this;
                C14360o3.A0A(userSession2);
                C14360o3.A0B(userSession2, 0);
                if (C18U.A06(C06090Tz.A05, userSession2, 36313390141999020L)) {
                    C14360o3.A0A(userSession2);
                    C47909LEd c47909LEd = AbstractC46874KoH.A00(userSession2).A00;
                    if (c47909LEd != null) {
                        C47909LEd.A00(c47909LEd, new DS9(14, c47909LEd, true));
                    }
                }
            }
        };
    }
}
