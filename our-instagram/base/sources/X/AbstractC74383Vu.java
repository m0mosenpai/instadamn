package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.3Vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC74383Vu {
    public static C74393Vv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ExtendedImageUrl extendedImageUrl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38321qM c38321qM = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("image".equals(A0q)) {
                    extendedImageUrl = C17Y.parseFromJson(c16l);
                } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A0q)) {
                    c38321qM = C38321qM.A0h.A0C(c16l, true, false);
                }
                c16l.A0z();
            }
            return new C74393Vv(c38321qM, extendedImageUrl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
