package X;

import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import java.io.IOException;

/* renamed from: X.NsO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53892NsO {
    public static MediaTransformation parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MediaTransformation mediaTransformation = new MediaTransformation();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("translation_x".equals(A0s)) {
                    mediaTransformation.A01 = (float) c16l.A0U();
                } else if ("translation_y".equals(A0s)) {
                    mediaTransformation.A02 = (float) c16l.A0U();
                } else if ("zoom".equals(A0s)) {
                    mediaTransformation.A03 = (float) c16l.A0U();
                } else if ("rotation".equals(A0s)) {
                    mediaTransformation.A00 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return mediaTransformation;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
