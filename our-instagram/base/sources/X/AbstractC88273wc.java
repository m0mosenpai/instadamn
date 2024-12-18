package X;

import com.instagram.api.schemas.MediaCroppingCoordinates;
import java.io.IOException;

/* renamed from: X.3wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88273wc {
    public static C88293wg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MediaCroppingCoordinates mediaCroppingCoordinates = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MediaCroppingCoordinates mediaCroppingCoordinates2 = null;
            MediaCroppingCoordinates mediaCroppingCoordinates3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("feed_preview_crop".equals(A0q)) {
                    mediaCroppingCoordinates = AbstractC88283wd.parseFromJson(c16l);
                } else if ("square_crop".equals(A0q)) {
                    mediaCroppingCoordinates2 = AbstractC88283wd.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(3238).equals(A0q)) {
                    mediaCroppingCoordinates3 = AbstractC88283wd.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C88293wg(mediaCroppingCoordinates, mediaCroppingCoordinates2, mediaCroppingCoordinates3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
