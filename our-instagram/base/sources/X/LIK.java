package X;

import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;

/* loaded from: classes8.dex */
public final class LIK {
    public static final LIK A00 = new Object();

    public final long A01(GalleryItem galleryItem) {
        Medium medium;
        Long l;
        C14360o3.A0B(galleryItem, 0);
        if (galleryItem.A04()) {
            RemoteMedia remoteMedia = galleryItem.A04;
            if (remoteMedia == null || (l = remoteMedia.A05) == null) {
                return 0L;
            }
            return l.longValue() * 1000;
        }
        if (!galleryItem.A02() || (medium = galleryItem.A00) == null) {
            return 0L;
        }
        long j = medium.A0D;
        if (j <= 0) {
            return medium.A0C * 1000;
        }
        return j;
    }

    public static final int A00(GalleryItem galleryItem) {
        if (galleryItem.A02()) {
            Medium medium = galleryItem.A00;
            if (medium != null) {
                return medium.A03;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (galleryItem.A04()) {
            RemoteMedia remoteMedia = galleryItem.A04;
            if (remoteMedia != null) {
                return remoteMedia.A01;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        Integer num = galleryItem.A09;
        if (num == C05F.A01) {
            Draft draft = galleryItem.A02;
            if (draft != null) {
                return draft.A00;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (num == C05F.A0Y) {
            C195858lV c195858lV = galleryItem.A05;
            if (c195858lV != null) {
                return c195858lV.A00;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        return 0;
    }
}
