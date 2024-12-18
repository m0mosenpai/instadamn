package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.U2m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66171U2m implements C3Ow {
    public View A00;
    public IgSimpleImageView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public CircularImageView A05;
    public IgImageView A06;
    public IgdsButton A07;
    public boolean A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;
    public final ViewStub A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final ViewStub A0E;
    public final ViewStub A0F;
    public final ViewStub A0G;
    public final FrameLayout A0H;
    public final IgSimpleImageView A0I;
    public final IgTextView A0J;
    public final IgTextView A0K;
    public final IgTextView A0L;
    public final IgTextView A0M;
    public final CircularImageView A0N;
    public final InterfaceC56392iX A0O;
    public final InterfaceC56392iX A0P;
    public final InterfaceC56392iX A0Q;
    public final InterfaceC56392iX A0R;
    public final InterfaceC56392iX A0S;
    public final GradientSpinner A0T;
    public final FollowButton A0U;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A0N);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A0N;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A0N);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A0T;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A0N.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A0N.setVisibility(0);
    }

    public C66171U2m(Context context, ViewGroup viewGroup, boolean z) {
        boolean A1V = AbstractC167007dF.A1V(viewGroup);
        this.A0A = viewGroup;
        this.A09 = (ViewGroup) viewGroup.requireViewById(R.id.row_search_user_container);
        MSY.A0y(viewGroup, R.id.row_search_avatar_with_ring_stub);
        this.A0N = (CircularImageView) viewGroup.requireViewById(R.id.row_search_avatar_in_ring);
        this.A0T = (GradientSpinner) viewGroup.requireViewById(R.id.reel_seen_state);
        FrameLayout frameLayout = (FrameLayout) viewGroup.requireViewById(R.id.row_search_avatar_with_ring);
        this.A0H = frameLayout;
        this.A0B = (ViewStub) viewGroup.requireViewById(R.id.birthday_confetti_animation_stub);
        this.A08 = z;
        int A0E = AbstractC167017dG.A0E(context);
        int i = 0;
        if (this.A08) {
            i = A0E;
            A0E = 0;
        }
        frameLayout.setPadding(i, 0, A0E, 0);
        this.A0U = (FollowButton) viewGroup.requireViewById(R.id.row_search_user_follow_button);
        this.A0L = (IgTextView) viewGroup.requireViewById(R.id.row_search_user_fullname);
        this.A0I = (IgSimpleImageView) viewGroup.requireViewById(R.id.row_search_facepiles);
        this.A0K = (IgTextView) viewGroup.requireViewById(R.id.row_search_social_context_rtl);
        IgTextView igTextView = (IgTextView) viewGroup.requireViewById(R.id.row_search_user_username);
        this.A0M = igTextView;
        AbstractC37300Gc1.A0d(igTextView, A1V);
        this.A0J = (IgTextView) viewGroup.requireViewById(R.id.row_search_user_secondary_subtitle);
        this.A0C = (ViewStub) viewGroup.requireViewById(R.id.dismiss_button_stub);
        this.A0G = (ViewStub) viewGroup.requireViewById(R.id.remove_user_stub);
        this.A0E = (ViewStub) viewGroup.requireViewById(R.id.extra_label_stub);
        this.A0D = (ViewStub) viewGroup.requireViewById(R.id.extra_button_stub);
        this.A0S = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.unavailable_user_overlay_stub), false, false);
        viewGroup.setBackgroundResource(AbstractC53242c7.A0H(context, R.attr.backgroundDrawable));
        this.A0F = (ViewStub) viewGroup.requireViewById(R.id.row_search_internal_badge);
        this.A0O = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.live_badge_stub), false, false);
        this.A0P = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.pulse_emitter_stub), false, false);
        this.A0Q = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.pulsing_image_view_stub), false, false);
        this.A0R = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.right_arrow_stub), false, false);
    }
}
