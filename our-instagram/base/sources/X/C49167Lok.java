package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.Lok, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49167Lok implements C7QD, C7QE, InterfaceC1581778c {
    public C3PX A00;
    public C7QH A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final C57012jc A04;
    public final C57012jc A05;
    public final C57012jc A06;
    public final C57012jc A07;
    public final IgProgressImageView A08;
    public final RoundedCornerMediaFrameLayout A09;
    public final ImageView A0A;

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A0A;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A02;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A01;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A01 = c7qh;
    }

    public C49167Lok(View view) {
        this.A02 = AbstractC31172DnG.A0B(view, R.id.live_viewer_invite_container);
        View findViewById = view.findViewById(R.id.placeholder_title_stub);
        findViewById.getClass();
        this.A07 = new C57012jc((ViewStub) findViewById);
        View findViewById2 = view.findViewById(R.id.placeholder_message_stub);
        findViewById2.getClass();
        this.A06 = new C57012jc((ViewStub) findViewById2);
        this.A09 = (RoundedCornerMediaFrameLayout) view.requireViewById(R.id.preview_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) view.requireViewById(R.id.preview_image);
        this.A08 = igProgressImageView;
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        igProgressImageView.setEnableProgressBar(false);
        this.A04 = AbstractC31177DnL.A0V(view, R.id.active_live_header_stub);
        this.A05 = AbstractC31177DnL.A0V(view, R.id.expired_live_header_stub);
        this.A0A = AbstractC31173DnH.A0I(view, R.id.doubletap_heart);
        this.A03 = AbstractC166997dE.A0T(view, R.id.watch_live_video_button);
    }
}
