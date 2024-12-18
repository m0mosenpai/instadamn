package X;

import com.instagram.common.gallery.model.GalleryItem;

/* loaded from: classes8.dex */
public final class LZF implements InterfaceC66482zP {
    public final GalleryItem A00;

    public LZF(GalleryItem galleryItem) {
        C14360o3.A0B(galleryItem, 1);
        this.A00 = galleryItem;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A0A;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZF lzf = (LZF) obj;
        C14360o3.A0B(lzf, 0);
        return C14360o3.A0K(this.A00, lzf.A00);
    }
}
