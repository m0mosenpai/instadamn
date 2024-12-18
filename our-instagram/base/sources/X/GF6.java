package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes6.dex */
public final class GF6 implements C3Ow {
    public View A00;
    public C140626Xq A01;
    public C34533FJt A02;
    public String A03;
    public final ViewStub A04;
    public final FrameLayout A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final C3PF A0A;
    public final CircularImageView A0B;
    public final GradientSpinner A0C;
    public final FollowButton A0D;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A0B);
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A0B);
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A0B.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A0B.setVisibility(0);
    }

    public GF6(View view) {
        FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.featured_user_profile_picture_container);
        this.A05 = frameLayout;
        this.A0C = (GradientSpinner) view.requireViewById(R.id.featured_user_reel_ring);
        this.A0B = AbstractC31173DnH.A0T(view, R.id.featured_user_profile_picture);
        this.A08 = AbstractC166997dE.A0T(view, R.id.featured_user_username);
        this.A06 = AbstractC166997dE.A0T(view, R.id.featured_user_fullname);
        this.A07 = AbstractC166997dE.A0T(view, R.id.featured_user_social_context);
        this.A0D = (FollowButton) view.requireViewById(R.id.featured_user_follow_button);
        this.A04 = AbstractC31173DnH.A0G(view, R.id.featured_user_direct_message_stub);
        this.A09 = AbstractC166997dE.A0T(view, R.id.featured_user_view_profile_button);
        C3P9 c3p9 = new C3P9(frameLayout);
        c3p9.A07 = true;
        c3p9.A04 = new EZQ(this, 7);
        this.A0A = c3p9.A00();
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A0B;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A0C;
    }
}
