package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* loaded from: classes8.dex */
public final class LFL {
    public static final LFL A00 = new Object();

    public final boolean A00(Bitmap bitmap, ConstraintLayout constraintLayout, C9BB c9bb, C206279Bk c206279Bk, GalleryItem galleryItem, C44297Jho c44297Jho, C177967vV c177967vV, String str, boolean z, boolean z2) {
        ColorFilter colorFilter;
        AbstractC167007dF.A1D(c177967vV, 1, c44297Jho);
        C14360o3.A0B(c9bb, 6);
        constraintLayout.setEnabled(true);
        GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = c44297Jho.A00;
        galleryPickerMediaOverlayView.A09 = z2;
        galleryPickerMediaOverlayView.A0A = false;
        galleryPickerMediaOverlayView.A05 = false;
        C44295Jhm c44295Jhm = galleryPickerMediaOverlayView.A0C;
        int i = c9bb.A00 + 1;
        C153406vA c153406vA = c44295Jhm.A00;
        c153406vA.A00(i);
        c153406vA.A04 = c9bb.A02;
        c153406vA.invalidateSelf();
        galleryPickerMediaOverlayView.A06 = c9bb.A02;
        boolean z3 = c9bb.A04;
        galleryPickerMediaOverlayView.A07 = z3;
        galleryPickerMediaOverlayView.A00 = bitmap;
        galleryPickerMediaOverlayView.A04 = str;
        galleryPickerMediaOverlayView.invalidate();
        boolean A1Q = AbstractC25230BEn.A1Q(z3 ? 1 : 0);
        IgImageView igImageView = c177967vV.A07;
        if (A1Q) {
            colorFilter = c177967vV.A00;
        } else {
            colorFilter = null;
        }
        igImageView.setColorFilter(colorFilter);
        constraintLayout.setContentDescription(AbstractC44294Jhk.A00(AbstractC166997dE.A0L(constraintLayout), galleryItem.A00, c9bb.A00, c9bb.A01, galleryItem.A01(), galleryItem.A06(), galleryPickerMediaOverlayView.A09));
        if (!z && galleryPickerMediaOverlayView.A06 == c9bb.A02 && galleryPickerMediaOverlayView.A07 == z3) {
            return false;
        }
        galleryPickerMediaOverlayView.A0B = false;
        galleryPickerMediaOverlayView.invalidate();
        C206019Ah.A02(c206279Bk, c177967vV);
        constraintLayout.invalidate();
        return true;
    }
}
