package X;

import com.instagram.camera.effect.models.ThumbnailImage;
import java.io.IOException;

/* renamed from: X.HyP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40543HyP {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.camera.effect.models.ThumbnailImage, java.lang.Object] */
    public static ThumbnailImage parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("uri".equals(AbstractC166997dE.A0s(c16l))) {
                    obj.A00 = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
