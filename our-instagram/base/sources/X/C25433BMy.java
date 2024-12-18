package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.BMy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25433BMy {
    public final boolean A00(ClipsViewerSource clipsViewerSource, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C38321qM c38321qM = c120985dq.A02;
        if ((c38321qM != null && c38321qM.A5n()) || ((AbstractC37677GiE.A00(c120985dq, c37644Ghd, userSession) && clipsViewerSource != ClipsViewerSource.A05) || c37644Ghd.A0D != EnumC75193Zm.A0F)) {
            return true;
        }
        return false;
    }
}
