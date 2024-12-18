package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Loj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49166Loj implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final FrameLayout A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final IgProgressImageView A07;
    public final MediaFrameLayout A08;
    public final ImageView A09;

    public C49166Loj(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = (FrameLayout) AbstractC166997dE.A0R(view, R.id.product_message_content);
        this.A06 = AbstractC31176DnK.A0U(view, R.id.avatar);
        this.A05 = AbstractC167007dF.A0N(view, R.id.username);
        this.A08 = (MediaFrameLayout) AbstractC166997dE.A0R(view, R.id.media_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.image);
        this.A07 = igProgressImageView;
        this.A02 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.title_container);
        this.A04 = AbstractC31178DnM.A0C(view);
        this.A03 = AbstractC167007dF.A0N(view, R.id.subtitle);
        this.A09 = AbstractC31176DnK.A0D(view, R.id.doubletap_heart);
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A09;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A01;
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
