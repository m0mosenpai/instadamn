package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.E3k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31982E3k extends C3OO {
    public FollowButton A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final GradientSpinnerAvatarView A04;
    public final View A05;
    public final ViewStub A06;

    public C31982E3k(View view) {
        super(view);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) AbstractC166987dD.A0c(view, R.id.follow_list_user_imageview);
        this.A04 = gradientSpinnerAvatarView;
        TextView A0Q = AbstractC25230BEn.A0Q(view, R.id.follow_list_username);
        this.A03 = A0Q;
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.follow_list_subtitle);
        ViewStub viewStub = (ViewStub) AbstractC166987dD.A0c(view, R.id.follow_list_large_follow_button_stub);
        this.A06 = viewStub;
        View A0S = AbstractC166997dE.A0S(view, R.id.follow_list_container);
        this.A01 = A0S;
        View A0c = AbstractC166987dD.A0c(view, R.id.row_divider);
        this.A05 = A0c;
        A0S.setBackgroundResource(0);
        Context context = A0S.getContext();
        A0S.setPadding(AbstractC167017dG.A03(context), context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material), 0, AbstractC166997dE.A04(context, R.dimen.abc_button_padding_horizontal_material));
        A0c.setVisibility(8);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        AbstractC31177DnL.A0q(A0Q.getContext(), A0Q, R.attr.igds_color_primary_text_on_media);
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.user.follow.FollowButton");
        FollowButton followButton = (FollowButton) inflate;
        this.A00 = followButton;
        if (followButton != null) {
            followButton.setVisibility(0);
        }
    }
}
