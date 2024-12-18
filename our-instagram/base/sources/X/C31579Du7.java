package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Du7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31579Du7 {
    public View A00;
    public ImageView A01;
    public FollowButton A02;
    public FollowButton A03;
    public FollowButton A04;
    public final View A05;
    public final ViewGroup A06;
    public final ViewGroup A07;
    public final ViewStub A08;
    public final ViewStub A09;
    public final ViewStub A0A;
    public final ViewStub A0B;
    public final ViewStub A0C;
    public final ImageView A0D;
    public final LinearLayout A0E;
    public final LinearLayout A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final TextView A0I;
    public final TextView A0J;
    public final InterfaceC56392iX A0K;
    public final InterfaceC56392iX A0L;
    public final InterfaceC56392iX A0M;
    public final GradientSpinnerAvatarView A0N;

    public C31579Du7(View view) {
        C14360o3.A0B(view, 1);
        this.A06 = AbstractC31176DnK.A0C(view, R.id.follow_list_container);
        this.A07 = AbstractC31176DnK.A0C(view, R.id.follow_list_user_info_container);
        this.A0J = AbstractC167007dF.A0N(view, R.id.follow_list_username);
        this.A0I = AbstractC167007dF.A0N(view, R.id.follow_list_subtitle);
        this.A0F = (LinearLayout) AbstractC166997dE.A0R(view, R.id.follow_list_social_context_container);
        this.A0E = (LinearLayout) AbstractC166997dE.A0R(view, R.id.follow_list_content_container);
        this.A0H = AbstractC167007dF.A0N(view, R.id.follow_list_social_context);
        this.A0D = AbstractC31176DnK.A0D(view, R.id.follow_list_social_context_facepile);
        this.A08 = AbstractC31171DnF.A07(view, R.id.follow_list_large_follow_button_stub);
        this.A0N = AbstractC31176DnK.A0f(view, R.id.follow_list_user_imageview);
        this.A0C = AbstractC31171DnF.A07(view, R.id.follow_more_button_stub);
        ViewStub A0M = AbstractC167007dF.A0M(view, R.id.follow_row_right_button_stub);
        this.A09 = A0M;
        this.A0B = AbstractC31171DnF.A07(view, R.id.inverse_style_button_stub);
        this.A0G = AbstractC166987dD.A0e(view, R.id.inverse_style_divider_bullet);
        this.A05 = AbstractC166997dE.A0S(view, R.id.row_divider);
        this.A0M = AbstractC166997dE.A0X(view, R.id.follow_list_user_badge_stub);
        this.A0K = AbstractC166997dE.A0X(view, R.id.bio_in_follow_list_stub);
        this.A0L = AbstractC166997dE.A0X(view, R.id.unseen_posts_stub);
        this.A0A = AbstractC31171DnF.A07(view, R.id.hide_button_stub);
        ViewGroup.LayoutParams layoutParams = A0M.getLayoutParams();
        layoutParams.width = -2;
        A0M.setLayoutParams(layoutParams);
    }
}
