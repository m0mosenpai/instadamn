package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.E3w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31994E3w extends C3OO {
    public final ViewStub A00;
    public final ViewStub A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final CircularImageView A08;
    public final FollowButton A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31994E3w(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        LinearLayout linearLayout = (LinearLayout) AbstractC166997dE.A0R(view, R.id.user_row);
        this.A04 = linearLayout;
        this.A08 = AbstractC31176DnK.A0U(linearLayout, R.id.row_recommended_user_imageview);
        this.A07 = AbstractC167007dF.A0N(linearLayout, R.id.row_recommended_user_username);
        this.A05 = AbstractC167007dF.A0N(linearLayout, R.id.row_recommended_user_fullname);
        this.A09 = (FollowButton) AbstractC166997dE.A0R(linearLayout, R.id.row_recommended_user_follow_button);
        this.A02 = AbstractC31176DnK.A0D(linearLayout, R.id.row_recommended_hide_icon_button);
        this.A03 = (LinearLayout) AbstractC166997dE.A0R(linearLayout, R.id.row_recommended_social_context_container);
        this.A06 = AbstractC167007dF.A0N(linearLayout, R.id.row_recommended_social_context);
        this.A00 = (ViewStub) AbstractC166987dD.A0c(view, R.id.three_posts_viewstub);
        this.A01 = (ViewStub) AbstractC166987dD.A0c(view, R.id.four_reels_viewstub);
    }
}
