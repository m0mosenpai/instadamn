package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes9.dex */
public final class NHV extends AbstractC51229MkE {
    public final IgTextView A00;
    public final IgImageView A01;
    public final RoundedCornerFrameLayout A02;
    public final SpinnerImageView A03;
    public final /* synthetic */ NHQ A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NHV(View view, NHQ nhq) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A04 = nhq;
        this.A02 = (RoundedCornerFrameLayout) AbstractC166987dD.A0c(this.itemView, R.id.audio_filter_background);
        this.A01 = AbstractC37302Gc3.A0K(this.itemView, R.id.audio_filter_icon);
        this.A00 = AbstractC31175DnJ.A0L(this.itemView, R.id.audio_filter_name);
        this.A03 = (SpinnerImageView) AbstractC166987dD.A0c(this.itemView, R.id.audio_filter_spinner);
    }
}
