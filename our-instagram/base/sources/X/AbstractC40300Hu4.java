package X;

import com.instagram.api.schemas.TrackDataImpl;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Hu4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40300Hu4 {
    public static C51799Mv3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            TrackDataImpl trackDataImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A0s)) {
                    trackDataImpl = AbstractC84383pX.parseFromJson(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "participation_count");
                }
                c16l.A0z();
            }
            if (trackDataImpl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(MediaStreamTrack.AUDIO_TRACK_KIND, c16l, "StoryMusicPickAggregationItemImpl");
            } else if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("participation_count", c16l, "StoryMusicPickAggregationItemImpl");
            } else {
                return new C51799Mv3(trackDataImpl, num.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
