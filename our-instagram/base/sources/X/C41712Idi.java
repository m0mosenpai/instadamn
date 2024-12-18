package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.Idi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41712Idi {
    public static final C42284Io8 A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C42284Io8) userSession.A01(C42284Io8.class, J8S.A00);
    }

    public static final boolean A02(ClipsViewerSource clipsViewerSource) {
        if (clipsViewerSource != ClipsViewerSource.A1T && clipsViewerSource != ClipsViewerSource.A1X && clipsViewerSource != ClipsViewerSource.A1S && clipsViewerSource != ClipsViewerSource.A1W && clipsViewerSource != ClipsViewerSource.A1U && clipsViewerSource != ClipsViewerSource.A0V) {
            return false;
        }
        return true;
    }

    public static void A01(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, long j) {
        A00(userSession).A01(c120985dq, Long.valueOf(j), c37644Ghd.A06());
    }
}
