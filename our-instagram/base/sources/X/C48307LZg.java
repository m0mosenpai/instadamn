package X;

import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.LZg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48307LZg implements InterfaceC66482zP {
    public final C9BB A00;
    public final GalleryItem A01;
    public final C195788lL A02;
    public final String A03;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48307LZg c48307LZg = (C48307LZg) obj;
        if (c48307LZg != null && C14360o3.A0K(this.A03, c48307LZg.A03) && C14360o3.A0K(this.A01, c48307LZg.A01) && C14360o3.A0K(this.A00, c48307LZg.A00) && C14360o3.A0K(this.A02, c48307LZg.A02)) {
            return true;
        }
        return false;
    }

    public C48307LZg(C9BB c9bb, GalleryItem galleryItem, C195788lL c195788lL) {
        this.A01 = galleryItem;
        this.A00 = c9bb;
        this.A02 = c195788lL;
        this.A03 = galleryItem.A0A;
    }
}
