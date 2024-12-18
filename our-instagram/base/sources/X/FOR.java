package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes6.dex */
public final class FOR {
    public View.OnClickListener A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final IgImageView A08;
    public final IgImageView A09;
    public final FollowButton A0A;

    public FOR(View view) {
        C14360o3.A0B(view, 1);
        this.A05 = AbstractC167007dF.A0N(view, R.id.save_collection_header_title);
        this.A03 = AbstractC167007dF.A0N(view, R.id.visible_subtitle);
        this.A04 = AbstractC167007dF.A0N(view, R.id.num_posts);
        this.A08 = AbstractC167007dF.A0T(view, R.id.audience_icon);
        this.A09 = AbstractC167007dF.A0T(view, R.id.dropdown_icon);
        this.A07 = AbstractC31176DnK.A0U(view, R.id.save_collection_header_facepile);
        this.A06 = AbstractC167007dF.A0N(view, R.id.username);
        this.A02 = AbstractC166997dE.A0S(view, R.id.visibility_header);
        this.A0A = (FollowButton) AbstractC166997dE.A0R(view, R.id.follow_button);
        this.A01 = AbstractC166997dE.A0S(view, R.id.follow_separator);
    }
}
