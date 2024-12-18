package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.List;

/* renamed from: X.M4o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49973M4o implements Runnable {
    public final /* synthetic */ C47958LGu A00;
    public final /* synthetic */ L9H A01;

    public RunnableC49973M4o(C47958LGu c47958LGu, L9H l9h) {
        this.A01 = l9h;
        this.A00 = c47958LGu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        L9H l9h = this.A01;
        String str = l9h.A03;
        if (str != null) {
            this.A00.A09.A01(new C55057OaC(str), str);
        }
        List<GalleryItem> list = l9h.A08;
        if (list != null) {
            C47958LGu c47958LGu = this.A00;
            c47958LGu.A04();
            C47958LGu.A00(c47958LGu);
            for (GalleryItem galleryItem : list) {
                GalleryView galleryView = c47958LGu.A03;
                if (galleryView == null) {
                    C14360o3.A0F("galleryView");
                    throw C00O.createAndThrow();
                }
                C14360o3.A0B(galleryItem, 0);
                C44420JkF c44420JkF = galleryView.A0C;
                if (c44420JkF != null) {
                    num = c44420JkF.A02(galleryItem);
                } else {
                    num = null;
                }
                GalleryView.A03(galleryItem, galleryView, num);
            }
        }
    }
}
