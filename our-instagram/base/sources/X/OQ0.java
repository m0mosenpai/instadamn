package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OQ0 {
    public static final C1ON A00(UserSession userSession, String str, String str2) {
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("feed/saved/audio/");
        A0M.A9s("browse_session_id", userSession.token);
        A0M.A0R(HAU.class, C41351IRw.class);
        A0M.A0H("cursor", str);
        A0M.A0H("audio_type", str2);
        return A0M.A0N();
    }
}
