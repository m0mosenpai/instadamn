package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class LHw {
    public final MediaPickerItemView A00;
    public final /* synthetic */ C44420JkF A01;

    public LHw(C44420JkF c44420JkF, MediaPickerItemView mediaPickerItemView) {
        this.A01 = c44420JkF;
        this.A00 = mediaPickerItemView;
    }

    public static final C9BB A01(GalleryItem galleryItem, LHw lHw) {
        HashMap hashMap = lHw.A01.A05;
        String str = galleryItem.A0A;
        C9BB c9bb = (C9BB) hashMap.get(str);
        if (c9bb == null) {
            c9bb = new C9BB(null, 0, 0, 15, 3, false, false);
            hashMap.put(str, c9bb);
        }
        c9bb.A02 = AbstractC25230BEn.A1S(lHw.A00(galleryItem), -1);
        c9bb.A00 = lHw.A00(galleryItem);
        return c9bb;
    }

    private final int A00(GalleryItem galleryItem) {
        if (galleryItem.A05()) {
            int i = 0;
            Iterator it = this.A01.A03.A01.A0Y.iterator();
            while (it.hasNext()) {
                if (!C14360o3.A0K(it.next(), galleryItem)) {
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }
}
