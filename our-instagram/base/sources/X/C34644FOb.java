package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.FOb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34644FOb {
    public C34553FKn A00;
    public C140626Xq A01;
    public String A02;
    public final View A03;
    public final ViewStub A04;
    public final FrameLayout A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final IgSimpleImageView A0A;
    public final IgSimpleImageView A0B;
    public final IgSimpleImageView A0C;
    public final C3PF A0D;
    public final CircularImageView A0E;
    public final GradientSpinner A0F;
    public final FollowButton A0G;

    public C34644FOb(View view) {
        C14360o3.A0B(view, 1);
        this.A03 = view;
        FrameLayout frameLayout = (FrameLayout) AbstractC166997dE.A0R(view, R.id.avatar_container);
        this.A05 = frameLayout;
        this.A0E = AbstractC31176DnK.A0U(view, R.id.row_recommended_user_imageview);
        this.A0F = (GradientSpinner) AbstractC166997dE.A0R(view, R.id.row_recommended_reel_ring);
        this.A06 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.row_recommended_user_info_container);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.row_recommended_user_username);
        this.A09 = A0N;
        this.A07 = AbstractC167007dF.A0N(view, R.id.row_recommended_user_fullname);
        this.A08 = AbstractC167007dF.A0N(view, R.id.row_recommended_social_context);
        this.A0A = AbstractC31176DnK.A0T(view, R.id.row_recommended_facepile);
        this.A0C = AbstractC31176DnK.A0T(view, R.id.row_recommended_overflow_menu);
        this.A0B = AbstractC31176DnK.A0T(view, R.id.row_recommended_hide_icon_button);
        this.A0G = (FollowButton) AbstractC166997dE.A0R(view, R.id.row_recommended_user_follow_button);
        this.A04 = AbstractC167007dF.A0M(view, R.id.row_recommended_internal_badge);
        A0N.getPaint().setFakeBoldText(true);
        C3P9 c3p9 = new C3P9(frameLayout);
        c3p9.A07 = true;
        c3p9.A04 = new EZQ(this, 5);
        this.A0D = c3p9.A00();
    }
}
