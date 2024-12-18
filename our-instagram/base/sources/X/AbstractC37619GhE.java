package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.GhE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37619GhE {
    public static final boolean A00(ClipsViewerSource clipsViewerSource, UserSession userSession, Boolean bool, String str, String str2, String str3, boolean z) {
        AbstractC167007dF.A1K(userSession, clipsViewerSource);
        if ((clipsViewerSource != ClipsViewerSource.A2V || (!MediaStreamTrack.VIDEO_TRACK_KIND.equals(str) && !"reel".equals(str))) && ((clipsViewerSource != ClipsViewerSource.A1s || !C18U.A06(C06090Tz.A05, userSession, 36313403026835378L)) && ((clipsViewerSource != ClipsViewerSource.A26 || !C18U.A06(C06090Tz.A05, userSession, 36313403026900915L)) && clipsViewerSource != ClipsViewerSource.A22))) {
            if (clipsViewerSource != ClipsViewerSource.A0s && clipsViewerSource != ClipsViewerSource.A0t) {
                if (clipsViewerSource != ClipsViewerSource.A2W && clipsViewerSource != ClipsViewerSource.A0d && (clipsViewerSource != ClipsViewerSource.A1v || C18U.A06(C06090Tz.A06, userSession, 36325630799262946L))) {
                    return false;
                }
            } else if (!z && !AbstractC166997dE.A1Z(bool, false) && str2 == null && str3 == null) {
                return false;
            }
        }
        return true;
    }
}
