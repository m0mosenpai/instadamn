package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes8.dex */
public final class Jp5 extends C3OO {
    public final IgMultiImageButton A00;

    public Jp5(View view, float f) {
        super(view);
        ((MediaFrameLayout) AbstractC166997dE.A0R(view, R.id.media_image_grid_item_frame_layout)).A00 = f;
        IgMultiImageButton igMultiImageButton = (IgMultiImageButton) view.requireViewById(R.id.media_image_button);
        this.A00 = igMultiImageButton;
        ((ConstrainedImageView) igMultiImageButton).A00 = f;
    }
}
