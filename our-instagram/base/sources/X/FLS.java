package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes6.dex */
public final class FLS {
    public final IgTextView A00;
    public final CircularImageView A01;
    public final FollowButton A02;

    public FLS(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.follow_upsell_text);
        this.A02 = (FollowButton) AbstractC166997dE.A0R(view, R.id.follow_upsell_button);
        this.A01 = AbstractC31176DnK.A0U(view, R.id.follow_upsell_user_image);
    }
}
