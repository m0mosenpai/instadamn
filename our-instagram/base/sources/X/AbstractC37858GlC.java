package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObjImpl;
import com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl;
import java.io.IOException;

/* renamed from: X.GlC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37858GlC {
    public static MediaIdToBrandSafetyContentBlocklistBitmapMapImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            BrandSafetyContentBlocklistBitmapQLObjImpl brandSafetyContentBlocklistBitmapQLObjImpl = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("content_blocklist_bitmap".equals(A0q)) {
                    brandSafetyContentBlocklistBitmapQLObjImpl = C3XS.parseFromJson(c16l);
                } else if ("media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new MediaIdToBrandSafetyContentBlocklistBitmapMapImpl(brandSafetyContentBlocklistBitmapQLObjImpl, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
