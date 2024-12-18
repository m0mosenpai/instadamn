package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.LoW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49153LoW implements C7QD, C7QE {
    public C7QH A00;
    public final TextView A01;
    public final TextView A02;
    public final ConstraintLayout A03;
    public final RoundedCornerImageView A04;
    public final IgProgressImageView A05;

    @Override // X.C7QD
    public final View BKF() {
        return this.A03;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    public C49153LoW(View view) {
        this.A03 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.message_content_ar_effect_bubble_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.message_content_ar_effect_video_thumbnail);
        this.A05 = igProgressImageView;
        this.A04 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.message_content_ar_effect_icon);
        this.A02 = AbstractC167007dF.A0N(view, R.id.message_content_ar_effect_title);
        this.A01 = AbstractC167007dF.A0N(view, R.id.message_content_ar_effect_creator);
        AbstractC13880nE.A0g(igProgressImageView, (int) (AbstractC13880nE.A0A(AbstractC166997dE.A0L(r1)) / 2.5f));
        igProgressImageView.setEnableProgressBar(false);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
