package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7DZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DZ extends AbstractC52922bZ {
    public final C159407Da A00;

    public C7DZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = new C159407Da(userSession);
    }

    public final void A00(List list) {
        GalleryItem galleryItem;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C22874A6u c22874A6u = (C22874A6u) it.next();
            C198308pf c198308pf = c22874A6u.A00;
            C183978Ee c183978Ee = c198308pf.A02;
            C195868lW c195868lW = c198308pf.A03;
            if (c183978Ee != null) {
                galleryItem = new GalleryItem(c183978Ee, c183978Ee.A0h);
            } else if (c195868lW != null) {
                galleryItem = new GalleryItem(c195868lW);
            }
            if (galleryItem.A02()) {
                Medium medium = galleryItem.A00;
                if (medium != null) {
                    galleryItem = new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05));
                    arrayList.add(new C219829nU(galleryItem, c22874A6u, c22874A6u.A01));
                }
            } else {
                if (!galleryItem.A04() && !galleryItem.A03() && !galleryItem.A06()) {
                }
                arrayList.add(new C219829nU(galleryItem, c22874A6u, c22874A6u.A01));
            }
        }
        this.A00.EWl(arrayList);
    }
}
