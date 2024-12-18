package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes6.dex */
public final class FNY {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final GradientSpinnerAvatarView A04;
    public final FollowButton A05;

    public FNY(View view) {
        this.A00 = view;
        this.A04 = AbstractC31176DnK.A0f(view, R.id.recommended_user_card_avatar_view);
        this.A02 = AbstractC167007dF.A0N(view, R.id.recommended_user_card_name);
        this.A03 = AbstractC167007dF.A0N(view, R.id.recommended_user_card_context);
        this.A05 = (FollowButton) AbstractC166997dE.A0R(view, R.id.recommended_user_card_follow_button);
        this.A01 = AbstractC166997dE.A0S(view, R.id.recommended_user_dismiss_button);
    }
}
