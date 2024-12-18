package X;

import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.Jhq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44299Jhq {
    public static boolean A00;
    public static final C44299Jhq A01 = new Object();

    public static final void A00(EnumC44309Ji0 enumC44309Ji0, GalleryPickerMediaOverlayView galleryPickerMediaOverlayView) {
        Integer num;
        galleryPickerMediaOverlayView.setMediaIconType(enumC44309Ji0);
        if (enumC44309Ji0.ordinal() == 3) {
            num = Integer.valueOf(R.drawable.instagram_glasses_pano_outline_24);
        } else {
            num = null;
        }
        if (num == null) {
            galleryPickerMediaOverlayView.A01 = null;
            return;
        }
        Drawable drawable = galleryPickerMediaOverlayView.getContext().getDrawable(num.intValue());
        if (drawable != null) {
            drawable.setColorFilter(AbstractC46530KiV.A00(C05F.A0j, galleryPickerMediaOverlayView.getResources().getColor(R.color.audio_bar_action_color_enabled, null)));
        }
        galleryPickerMediaOverlayView.A01 = drawable;
        if (enumC44309Ji0 != EnumC44309Ji0.A05) {
            return;
        }
        galleryPickerMediaOverlayView.A08 = true;
    }
}
