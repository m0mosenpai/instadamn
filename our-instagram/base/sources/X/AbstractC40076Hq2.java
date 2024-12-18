package X;

import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;
import java.io.IOException;

/* renamed from: X.Hq2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40076Hq2 {
    public static H4E parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MetaGalleryNetegoInStoryMediaType metaGalleryNetegoInStoryMediaType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1O(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    metaGalleryNetegoInStoryMediaType = (MetaGalleryNetegoInStoryMediaType) MetaGalleryNetegoInStoryMediaType.A01.get(A1P);
                    if (metaGalleryNetegoInStoryMediaType == null) {
                        metaGalleryNetegoInStoryMediaType = MetaGalleryNetegoInStoryMediaType.A05;
                    }
                } else if ("media_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H4E(metaGalleryNetegoInStoryMediaType, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
