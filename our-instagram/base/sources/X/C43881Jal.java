package X;

import com.instagram.common.gallery.model.GalleryItem;
import java.util.Comparator;

/* renamed from: X.Jal, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43881Jal implements Comparator {
    public static final C43881Jal A00 = new C43881Jal();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        GalleryItem galleryItem = (GalleryItem) obj;
        GalleryItem galleryItem2 = (GalleryItem) obj2;
        AbstractC167017dG.A1N(galleryItem, galleryItem2);
        LIK lik = LIK.A00;
        return C14360o3.A01(lik.A01(galleryItem), lik.A01(galleryItem2));
    }
}
