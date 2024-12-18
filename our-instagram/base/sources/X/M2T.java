package X;

import com.instagram.ui.widget.gallery.GalleryView;

/* loaded from: classes8.dex */
public final class M2T implements Runnable {
    public final /* synthetic */ GalleryView A00;

    public M2T(GalleryView galleryView) {
        this.A00 = galleryView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0T.setSelection(0);
    }
}
