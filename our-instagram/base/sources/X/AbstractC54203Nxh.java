package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nxh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54203Nxh {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C196218mC.A00(userSession)) {
            return false;
        }
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        long A03 = AbstractC31175DnJ.A03(A0x, "fb_feed_crossposting_toggle_tooltip_last_seen_time_in_ms");
        long currentTimeMillis = System.currentTimeMillis();
        if (A0x.getInt("fb_feed_crossposting_advanced_settings_tooltip", 0) >= 3 || currentTimeMillis - A03 <= OWR.A03) {
            return false;
        }
        if (!C197838ou.A03(C82G.A0D, C82H.A0w, userSession)) {
            return false;
        }
        return true;
    }
}
