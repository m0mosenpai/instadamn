package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Draft;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.LYc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48279LYc implements BCZ {
    public final /* synthetic */ C206279Bk A00;
    public final /* synthetic */ C44738JrL A01;

    @Override // X.BCZ
    public final void Dt2(Bitmap bitmap, Draft draft) {
        String str;
        String str2 = draft.A04;
        C44738JrL c44738JrL = this.A01;
        Draft draft2 = c44738JrL.A01;
        if (draft2 != null) {
            str = draft2.A04;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str)) {
            if (bitmap != null) {
                C206019Ah.A00.A03(bitmap, this.A00, c44738JrL.A05, null, 0);
            } else {
                C206019Ah.A02(this.A00, c44738JrL.A05);
            }
            GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = c44738JrL.A04.A00;
            galleryPickerMediaOverlayView.A0B = AbstractC167007dF.A1W(bitmap);
            galleryPickerMediaOverlayView.invalidate();
            c44738JrL.A03.invalidate();
        }
    }

    public C48279LYc(C206279Bk c206279Bk, C44738JrL c44738JrL) {
        this.A01 = c44738JrL;
        this.A00 = c206279Bk;
    }

    @Override // X.BCZ
    public final boolean CXY(Draft draft) {
        Draft draft2 = this.A01.A01;
        if (draft2 != null && C14360o3.A0K(draft.A04, draft2.A04)) {
            return true;
        }
        return false;
    }
}
