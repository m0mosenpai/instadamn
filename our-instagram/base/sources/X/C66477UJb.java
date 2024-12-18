package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.UJb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66477UJb extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final FollowButton A08;
    public final ViewStub A09;

    public C66477UJb(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0S(view, R.id.suggested_entity_card_container);
        this.A07 = AbstractC31176DnK.A0U(view, R.id.suggested_entity_card_image);
        this.A06 = AbstractC167007dF.A0N(view, R.id.suggested_entity_card_name);
        this.A04 = AbstractC167007dF.A0N(view, R.id.suggested_entity_card_context);
        this.A01 = AbstractC166997dE.A0S(view, R.id.dismiss_button);
        this.A08 = (FollowButton) AbstractC166997dE.A0R(view, R.id.suggested_user_card_follow_button);
        ViewStub A0M = AbstractC167007dF.A0M(view, R.id.follow_actions_stub);
        this.A09 = A0M;
        View inflate = A0M.inflate();
        C14360o3.A07(inflate);
        this.A02 = inflate;
        this.A03 = AbstractC167007dF.A0N(inflate, R.id.row_requested_user_accept);
        this.A05 = AbstractC167007dF.A0N(inflate, R.id.row_requested_user_ignore);
    }
}
