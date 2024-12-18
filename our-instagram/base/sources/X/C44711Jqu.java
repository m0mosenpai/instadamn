package X;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Jqu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44711Jqu extends C3OO {
    public final TextView A00;
    public final CardView A01;
    public final IgSimpleImageView A02;
    public final IgMultiImageButton A03;

    public C44711Jqu(View view, float f) {
        super(view);
        ((MediaFrameLayout) AbstractC166997dE.A0R(view, R.id.media_image_grid_item_frame_layout)).A00 = f;
        IgMultiImageButton igMultiImageButton = (IgMultiImageButton) view.requireViewById(R.id.media_image_button);
        this.A03 = igMultiImageButton;
        ((ConstrainedImageView) igMultiImageButton).A00 = f;
        this.A01 = (CardView) view.requireViewById(R.id.overlay_metric_view);
        this.A02 = (IgSimpleImageView) view.requireViewById(R.id.media_promote_icon);
        this.A00 = AbstractC166997dE.A0T(view, R.id.media_metric_value);
    }
}
