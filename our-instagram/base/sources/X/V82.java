package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes11.dex */
public final class V82 extends AbstractC68982VfK {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final CircularImageView A09;
    public final FollowButton A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V82(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166987dD.A0c(view, R.id.suggested_entity_card_container);
        this.A09 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.suggested_entity_card_image);
        this.A08 = AbstractC25230BEn.A0Q(view, R.id.suggested_user_card_username);
        this.A06 = AbstractC25230BEn.A0Q(view, R.id.suggested_entity_card_name);
        this.A03 = (ViewGroup) AbstractC166987dD.A0c(view, R.id.suggested_user_media_container);
        this.A02 = AbstractC166987dD.A0c(view, R.id.suggested_user_no_media_previews_notice);
        this.A04 = (ImageView) AbstractC166987dD.A0c(view, R.id.suggested_user_no_media_previews_notice_icon);
        this.A07 = AbstractC25230BEn.A0Q(view, R.id.suggested_user_no_media_previews_notice_text);
        this.A05 = AbstractC25230BEn.A0Q(view, R.id.suggested_entity_card_context);
        this.A0A = (FollowButton) AbstractC166987dD.A0c(view, R.id.suggested_user_card_follow_button);
        this.A01 = AbstractC166987dD.A0c(view, R.id.dismiss_button);
    }
}
