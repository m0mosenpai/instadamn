package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gfx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37541Gfx {
    public static final boolean A00(ClipsViewerSource clipsViewerSource, UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(clipsViewerSource, 1);
        if (z) {
            if (clipsViewerSource != ClipsViewerSource.A0C) {
                if (clipsViewerSource == ClipsViewerSource.A0s || clipsViewerSource == ClipsViewerSource.A0t) {
                    if (z2 || C7M3.A04(userSession) || C7M3.A03(userSession)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A01(ClipsViewerSource clipsViewerSource, UserSession userSession, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(clipsViewerSource, 1);
        if (A00(clipsViewerSource, userSession, z, z2) || clipsViewerSource == ClipsViewerSource.A2R) {
            return false;
        }
        if (clipsViewerSource != ClipsViewerSource.A2Q && clipsViewerSource != ClipsViewerSource.A0B && clipsViewerSource != ClipsViewerSource.A08 && clipsViewerSource != ClipsViewerSource.A0s && clipsViewerSource != ClipsViewerSource.A0t && clipsViewerSource != ClipsViewerSource.A26 && clipsViewerSource != ClipsViewerSource.A25 && clipsViewerSource != ClipsViewerSource.A2V && clipsViewerSource != ClipsViewerSource.A2A && clipsViewerSource != ClipsViewerSource.A2X && clipsViewerSource != ClipsViewerSource.A0H && clipsViewerSource != ClipsViewerSource.A1c && clipsViewerSource != ClipsViewerSource.A1p && clipsViewerSource != ClipsViewerSource.A2T && clipsViewerSource != ClipsViewerSource.A0p && !z3) {
            return false;
        }
        return true;
    }
}
