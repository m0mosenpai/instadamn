package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.LoX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49154LoX implements C7QD, C7QE {
    public C7QH A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final ConstraintLayout A05;
    public final CircularImageView A06;
    public final InterfaceC56392iX A07;
    public final IgProgressImageView A08;
    public final C105154oV A09;
    public final RoundedCornerMediaFrameLayout A0A;
    public final InterfaceC09390do A0B;

    public C49154LoX(View view) {
        C14360o3.A0B(view, 1);
        this.A05 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.share_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.preview_image);
        this.A08 = igProgressImageView;
        this.A01 = AbstractC31176DnK.A0D(view, R.id.top_icon);
        this.A03 = AbstractC31178DnM.A0C(view);
        this.A06 = AbstractC31176DnK.A0U(view, R.id.avatar);
        this.A04 = AbstractC167007dF.A0N(view, R.id.username);
        this.A09 = new C105154oV(AbstractC167007dF.A0M(view, R.id.music_attribution_view_stub));
        this.A0A = (RoundedCornerMediaFrameLayout) AbstractC166997dE.A0R(view, R.id.media_container);
        this.A07 = AbstractC56372iV.A01(view.findViewById(R.id.reaction_stub), false, false);
        this.A02 = AbstractC167007dF.A0N(view, R.id.portrait_video_share_cta_button);
        this.A0B = MHU.A00(view, this, 18);
        igProgressImageView.setEnableProgressBar(false);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A05;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }
}
