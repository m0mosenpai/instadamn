package X;

import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.session.SettingsSession;

/* renamed from: X.FeZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35132FeZ {
    public static final C34932FaI A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C34932FaI) userSession.A01(C34932FaI.class, GUO.A00);
    }

    public final void A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        A01(userSession);
    }

    public static void A01(UserSession userSession) {
        SettingsSession settingsSession = A00(userSession).A00;
        if (settingsSession != null) {
            settingsSession.A03();
        }
    }
}
