package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LBS {
    public static final int A00(C22P c22p, List list) {
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Medium A0P = AbstractC43592JPx.A0P(it);
                if (A0P != null && A0P.A0G.A0B) {
                    return 54;
                }
            }
        }
        if (c22p == C22P.A37 && (!z || !list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Medium A0P2 = AbstractC43592JPx.A0P(it2);
                if (A0P2 != null && A0P2.A0Y != null) {
                    return 108;
                }
            }
        }
        if (c22p == C22P.A4c && (!z || !list.isEmpty())) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Medium A0P3 = AbstractC43592JPx.A0P(it3);
                if (A0P3 != null && A0P3.A0Y != null) {
                    return 3;
                }
            }
        }
        return 0;
    }

    public static final void A01(GalleryItem galleryItem, UserSession userSession, C47Z c47z) {
        String str;
        Medium medium = galleryItem.A00;
        MediaUploadMetadata mediaUploadMetadata = null;
        if (medium != null) {
            str = medium.A0G.A03;
        } else {
            str = null;
        }
        AbstractC178007vZ.A02(userSession, "", AbstractC16960so.A1R(str, c47z.A13.A03));
        MediaUploadMetadata mediaUploadMetadata2 = c47z.A13;
        Medium medium2 = galleryItem.A00;
        if (medium2 != null) {
            mediaUploadMetadata = medium2.A0G;
        }
        mediaUploadMetadata2.A00(mediaUploadMetadata);
    }
}
