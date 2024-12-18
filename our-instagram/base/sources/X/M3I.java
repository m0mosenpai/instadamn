package X;

import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;

/* loaded from: classes8.dex */
public final class M3I implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GalleryPreviewMultiselectPager A01;

    public M3I(GalleryPreviewMultiselectPager galleryPreviewMultiselectPager, int i) {
        this.A01 = galleryPreviewMultiselectPager;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0L(this.A00, 0.0f);
    }
}
