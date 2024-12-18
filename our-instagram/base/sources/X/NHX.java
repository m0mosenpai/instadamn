package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes9.dex */
public final class NHX extends AbstractC51358MmJ {
    public final IgTextView A00;
    public final IgImageView A01;
    public final RoundedCornerFrameLayout A02;

    public NHX(View view) {
        super(view);
        this.A02 = (RoundedCornerFrameLayout) AbstractC166987dD.A0c(view, R.id.audio_filter_background);
        IgImageView A0K = AbstractC37302Gc3.A0K(view, R.id.audio_filter_icon);
        this.A01 = A0K;
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.audio_filter_name);
        A0K.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
