package X;

import com.instagram.common.gallery.model.GalleryItem;

/* loaded from: classes9.dex */
public final class P5A implements InterfaceC57960Pn6 {
    public final GalleryItem A00;
    public final String A01;

    @Override // X.InterfaceC57960Pn6
    public final String getId() {
        return this.A01;
    }

    public P5A(GalleryItem galleryItem) {
        this.A00 = galleryItem;
        this.A01 = galleryItem.A0A;
    }
}
