package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Grk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38241Grk {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TightTextView A04;
    public final CircularImageView A05;
    public final FollowButton A06;

    public C38241Grk(View view) {
        this.A00 = view;
        this.A05 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.card_avatar);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.card_suggested_name);
        this.A02 = (ImageView) AbstractC166987dD.A0c(view, R.id.card_suggested_subtitle_stacked_avatar);
        this.A04 = (TightTextView) AbstractC166987dD.A0c(view, R.id.card_suggested_subtitle);
        this.A06 = (FollowButton) AbstractC166987dD.A0c(view, R.id.card_follow_button);
        this.A01 = (ImageView) AbstractC166987dD.A0c(view, R.id.card_dismiss_button);
    }
}
