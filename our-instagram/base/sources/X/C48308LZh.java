package X;

import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.LZh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48308LZh implements InterfaceC66482zP {
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
        C48308LZh c48308LZh = (C48308LZh) obj;
        if (c48308LZh != null && C14360o3.A0K(this.A03, c48308LZh.A03) && C14360o3.A0K(this.A01, c48308LZh.A01) && C14360o3.A0K(this.A00, c48308LZh.A00) && C14360o3.A0K(this.A02, c48308LZh.A02)) {
            return true;
        }
        return false;
    }

    public C48308LZh(C9BB c9bb, GalleryItem galleryItem, C195788lL c195788lL) {
        this.A01 = galleryItem;
        this.A00 = c9bb;
        this.A02 = c195788lL;
        this.A03 = galleryItem.A0A;
    }
}
