package X;

import com.instagram.common.gallery.model.GalleryItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JiA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44318JiA {
    public static final boolean A01(String str, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((GalleryItem) it.next()).A0A, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final HashMap A00(List list) {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GalleryItem galleryItem = (GalleryItem) it.next();
            A1G.put(galleryItem.A0A, galleryItem);
        }
        return A1G;
    }
}
