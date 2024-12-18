package X;

import android.content.res.Resources;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LIH {
    public static final List A01(List list) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC167017dG.A0d(AbstractC166987dD.A0l(it)));
        }
        return A0q;
    }

    public final List A02(Resources resources, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, List list) {
        Medium A01;
        C14360o3.A0B(list, 0);
        AbstractC25234BEr.A1P(userSession, interfaceC11380iw, resources);
        C195428ki A00 = AbstractC195408kg.A00(userSession);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GalleryItem galleryItem = (GalleryItem) it.next();
            RemoteMedia remoteMedia = galleryItem.A04;
            if (remoteMedia != null) {
                A01 = A00.A01(remoteMedia);
                if (A01 == null) {
                    AbstractC208329Jr.A04(interfaceC11380iw, remoteMedia, userSession, str, resources.getString(2131963095), list);
                    final String A0q = AbstractC166997dE.A0q(resources, 2131963095);
                    throw new Exception(A0q) { // from class: X.40e
                        public final String A00;

                        @Override // java.lang.Throwable
                        public final String getMessage() {
                            return this.A00;
                        }

                        {
                            this.A00 = A0q;
                        }
                    };
                }
            } else {
                A01 = galleryItem.A00;
                if (A01 != null) {
                }
            }
            A1E.add(A01);
        }
        return A01(A1E);
    }

    public static final List A00(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RemoteMedia remoteMedia = ((GalleryItem) it.next()).A04;
            if (remoteMedia != null) {
                A1E.add(remoteMedia);
            }
        }
        return A1E;
    }
}
