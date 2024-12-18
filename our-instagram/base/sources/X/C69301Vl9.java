package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Vl9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69301Vl9 {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final HashtagFollowButton A03;
    public final GradientSpinnerAvatarView A04;

    public C69301Vl9(View view, int i) {
        C14360o3.A0B(view, 1);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.follow_list_container);
        this.A00 = A0C;
        this.A01 = AbstractC167007dF.A0N(view, R.id.follow_list_username);
        this.A02 = AbstractC167007dF.A0N(view, R.id.follow_list_subtitle);
        this.A04 = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(view, R.id.follow_list_user_imageview);
        A0C.setPadding(i, 0, i, 0);
        View inflate = AbstractC167007dF.A0M(view, R.id.hashtag_follow_button_stub).inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.hashtag.ui.HashtagFollowButton");
        this.A03 = (HashtagFollowButton) inflate;
    }
}
