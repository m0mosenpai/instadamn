package X;

import android.view.View;
import com.facebook.R;
import com.instagram.business.ui.widget.IgABTestMultiImageButton;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes8.dex */
public final class Jp3 extends C3OO {
    public final IgABTestMultiImageButton A00;

    public Jp3(View view, float f) {
        super(view);
        ((MediaFrameLayout) AbstractC166997dE.A0R(view, R.id.media_image_grid_item_frame_layout)).A00 = f;
        IgABTestMultiImageButton igABTestMultiImageButton = (IgABTestMultiImageButton) view.requireViewById(R.id.media_image_button);
        this.A00 = igABTestMultiImageButton;
        ((ConstrainedImageView) igABTestMultiImageButton).A00 = f;
        igABTestMultiImageButton.setNumberedCheckBoxEnabled(false);
        igABTestMultiImageButton.setBottomRightAlphabetCircleDrawableEnabled(true);
        igABTestMultiImageButton.setBottomCenterAlphabetCircleDrawableEnabled(false);
    }
}
