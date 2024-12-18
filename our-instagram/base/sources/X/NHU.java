package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* loaded from: classes9.dex */
public final class NHU extends AbstractC51229MkE {
    public final IgTextView A00;
    public final IgImageView A01;
    public final LoadingSpinnerView A02;
    public final /* synthetic */ NHR A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NHU(View view, NHR nhr) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A03 = nhr;
        IgImageView A0K = AbstractC37302Gc3.A0K(this.itemView, R.id.tts_voice_image_view);
        this.A01 = A0K;
        this.A00 = AbstractC31175DnJ.A0L(this.itemView, R.id.tts_voice_name_text);
        this.A02 = (LoadingSpinnerView) AbstractC166987dD.A0c(this.itemView, R.id.voice_loading_spinner);
        A0K.setScaleType(ImageView.ScaleType.CENTER_CROP);
        A0K.setForeground(AbstractC31172DnG.A05(this).getDrawable(R.drawable.color_filter_image_forground));
    }
}
