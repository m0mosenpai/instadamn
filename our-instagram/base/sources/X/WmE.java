package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* loaded from: classes11.dex */
public final class WmE implements C3Ow {
    public View A00;
    public IgTextView A01;
    public IgImageView A02;
    public final ViewGroup A03;
    public final ViewGroup A04;
    public final FrameLayout A05;
    public final IgTextView A06;
    public final CircularImageView A07;
    public final InterfaceC56392iX A08;
    public final InterfaceC56392iX A09;
    public final InterfaceC56392iX A0A;
    public final GradientSpinner A0B;

    public WmE(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        this.A04 = viewGroup;
        this.A03 = (ViewGroup) viewGroup.requireViewById(R.id.avatar_search_user_container);
        MSY.A0y(viewGroup, R.id.row_search_avatar_with_ring_stub);
        this.A07 = (CircularImageView) viewGroup.requireViewById(R.id.row_search_avatar_in_ring);
        this.A0B = (GradientSpinner) viewGroup.requireViewById(R.id.reel_seen_state);
        this.A05 = (FrameLayout) viewGroup.requireViewById(R.id.row_search_avatar_with_ring);
        IgTextView igTextView = (IgTextView) viewGroup.requireViewById(R.id.row_search_user_username);
        this.A06 = igTextView;
        igTextView.getPaint().setFakeBoldText(true);
        this.A08 = AbstractC166997dE.A0X(viewGroup, R.id.live_badge_stub);
        this.A09 = AbstractC166997dE.A0X(viewGroup, R.id.pulse_emitter_stub);
        this.A0A = AbstractC166997dE.A0X(viewGroup, R.id.pulsing_image_view_stub);
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A07);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A07;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A07);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A0B;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A07.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A07.setVisibility(0);
    }
}
