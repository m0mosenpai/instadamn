package X;

import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.8kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195598kz implements InterfaceC66482zP {
    public final C9BB A00;
    public final GalleryItem.LocalGalleryMedium A01;
    public final C195788lL A02;
    public final String A03;

    public C195598kz(C9BB c9bb, GalleryItem.LocalGalleryMedium localGalleryMedium, C195788lL c195788lL, String str) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A01 = localGalleryMedium;
        this.A00 = c9bb;
        this.A02 = c195788lL;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C195598kz c195598kz = (C195598kz) obj;
        if (this == c195598kz || (c195598kz != null && C14360o3.A0K(this.A03, c195598kz.A03) && C14360o3.A0K(this.A01, c195598kz.A01) && C14360o3.A0K(this.A00, c195598kz.A00) && C14360o3.A0K(this.A02, c195598kz.A02))) {
            return true;
        }
        return false;
    }
}
