package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;

/* renamed from: X.8iF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193948iF {
    public final UserSession A00;

    public final void A00(GalleryItem galleryItem, String str, String str2, int i, boolean z) {
        long j;
        long j2;
        long j3 = 0;
        C22C A01 = AnonymousClass229.A01(this.A00);
        boolean A06 = galleryItem.A06();
        Medium medium = galleryItem.A00;
        if (z) {
            if (medium != null) {
                j2 = medium.A0B;
                j3 = medium.A04;
            } else {
                j2 = 0;
            }
            A01.A1y(str, str2, j2, j3, i, A06);
            return;
        }
        if (medium != null) {
            j = medium.A0B;
            j3 = medium.A04;
        } else {
            j = 0;
        }
        A01.A1x(str, j, j3, i, A06);
    }

    public C193948iF(UserSession userSession) {
        this.A00 = userSession;
    }
}
