package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* loaded from: classes8.dex */
public final class JUG implements C7QD, C7QE, InterfaceC1581778c {
    public MRJ A00;
    public C7QH A01;
    public final View A02;
    public final View A03;
    public final ViewStub A04;
    public final C51761Mtk A05;
    public final C41761wQ A06;
    public final InterfaceC56392iX A07;
    public final C3Y8 A08;
    public final IgProgressImageView A09;
    public final IgProgressImageViewProgressBar A0A;
    public final RoundedCornerMediaFrameLayout A0B;
    public final ImageView A0C;
    public final InterfaceC56392iX A0D;

    public JUG(View view) {
        C14360o3.A0B(view, 1);
        this.A0B = (RoundedCornerMediaFrameLayout) AbstractC166997dE.A0R(view, R.id.media_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.image);
        this.A09 = igProgressImageView;
        this.A03 = AbstractC166997dE.A0S(view, R.id.play_icon);
        this.A02 = AbstractC166997dE.A0S(view, R.id.pending_overlay);
        this.A0A = (IgProgressImageViewProgressBar) AbstractC166997dE.A0R(view, R.id.upload_progress_indicator);
        InterfaceC56392iX A0X = AbstractC166997dE.A0X(view, R.id.privacy_overlay_stub);
        this.A0D = A0X;
        this.A04 = AbstractC167007dF.A0M(view, R.id.pill_overlay_stub);
        this.A08 = new C3Y8(AbstractC31173DnH.A0G(view, R.id.zero_rating_video_play_button_stub));
        this.A07 = AbstractC166997dE.A0X(view, R.id.hd_icon_stub);
        this.A06 = AbstractC31173DnH.A0S();
        this.A0C = AbstractC31176DnK.A0D(view, R.id.doubletap_heart);
        this.A05 = new C51761Mtk(A0X, igProgressImageView);
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A0C;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A0B;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A01;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A01 = c7qh;
    }
}
