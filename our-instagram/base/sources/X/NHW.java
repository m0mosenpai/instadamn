package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.freetransform.widget.ClipTransformItemView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes9.dex */
public final class NHW extends AbstractC51358MmJ {
    public final IgTextView A00;
    public final ClipTransformItemView A01;
    public final RoundedCornerFrameLayout A02;

    public NHW(View view) {
        super(view);
        this.A02 = (RoundedCornerFrameLayout) AbstractC166987dD.A0c(view, R.id.empty_thumbnail_background);
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.color_transform_name_text);
        this.A01 = (ClipTransformItemView) AbstractC166987dD.A0c(view, R.id.clip_transform_item_view);
    }
}
