package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;

/* renamed from: X.E3n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31985E3n extends C3OO {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final C34440FGe A05;
    public final HashtagFollowButton A06;
    public final ReelBrandingBadgeView A07;

    public C31985E3n(View view, C34440FGe c34440FGe) {
        super(view);
        this.A05 = c34440FGe;
        this.A00 = AbstractC166997dE.A0S(view, R.id.suggested_entity_card_container);
        this.A04 = AbstractC31176DnK.A0U(view, R.id.suggested_entity_card_image);
        this.A07 = (ReelBrandingBadgeView) AbstractC166997dE.A0R(view, R.id.branding_badge);
        this.A03 = AbstractC167007dF.A0N(view, R.id.suggested_entity_card_name);
        this.A02 = AbstractC167007dF.A0N(view, R.id.suggested_entity_card_context);
        this.A01 = AbstractC166997dE.A0S(view, R.id.dismiss_button);
        this.A06 = (HashtagFollowButton) AbstractC166997dE.A0R(view, R.id.suggested_hashtag_card_follow_button);
    }
}
