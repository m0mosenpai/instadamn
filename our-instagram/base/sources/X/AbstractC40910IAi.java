package X;

import com.instagram.api.schemas.ClipsTrendType;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.IAi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40910IAi {
    public static IHY parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IHY ihy = new IHY();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("trend_id".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("trend_type".equals(A0s)) {
                    ClipsTrendType.A01.get(AbstractC37304Gc5.A0c(c16l));
                } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A0s)) {
                    ihy.A01 = AbstractC40907IAf.parseFromJson(c16l);
                } else if ("creative_config_info".equals(A0s)) {
                    ihy.A02 = AbstractC40911IAj.parseFromJson(c16l);
                } else if ("hashtag".equals(A0s)) {
                    ihy.A00 = AbstractC109614wn.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return ihy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
