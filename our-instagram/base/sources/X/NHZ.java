package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* loaded from: classes9.dex */
public final class NHZ extends AbstractC51358MmJ {
    public final IgTextView A00;
    public final IgImageView A01;
    public final LoadingSpinnerView A02;

    public NHZ(View view) {
        super(view);
        IgImageView A0K = AbstractC37302Gc3.A0K(view, R.id.tts_voice_image_view);
        this.A01 = A0K;
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.tts_voice_name_text);
        this.A02 = (LoadingSpinnerView) AbstractC166987dD.A0c(view, R.id.voice_loading_spinner);
        A0K.setScaleType(ImageView.ScaleType.CENTER_CROP);
        A0K.setForeground(view.getContext().getDrawable(R.drawable.color_filter_image_forground));
    }
}
