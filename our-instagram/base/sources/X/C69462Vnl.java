package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Vnl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69462Vnl {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final CircularImageView A0B;
    public final FollowButton A0C;
    public final boolean A0D;

    public C69462Vnl(Context context, View view, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A0D = z3;
        this.A0B = AbstractC31176DnK.A0U(view, R.id.row_user_imageview);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.row_user_username);
        this.A0A = A0N;
        this.A09 = AbstractC167007dF.A0N(view, R.id.row_user_subtitle);
        this.A08 = AbstractC167007dF.A0N(view, R.id.row_user_social_context);
        this.A00 = AbstractC166997dE.A0S(view, R.id.row_requested_user_approval_actions);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.row_requested_user_accept);
        this.A04 = A0N2;
        TextView A0N3 = AbstractC167007dF.A0N(view, R.id.row_requested_user_accept_secondary);
        this.A05 = A0N3;
        TextView A0N4 = AbstractC167007dF.A0N(view, R.id.row_requested_user_ignore);
        this.A06 = A0N4;
        View A0S = AbstractC166997dE.A0S(view, R.id.row_requested_user_dismiss);
        this.A02 = A0S;
        View A0S2 = AbstractC166997dE.A0S(view, R.id.row_requested_user_overflow);
        this.A03 = A0S2;
        this.A0C = (FollowButton) AbstractC166997dE.A0R(view, R.id.row_requested_user_follow_button_large);
        this.A07 = AbstractC167007dF.A0N(view, R.id.row_internal_badge);
        boolean z4 = true;
        A0N.getPaint().setFakeBoldText(true);
        C1QI.A0G(A0N2, A0N2);
        A0N2.setVisibility(z ? 4 : 0);
        int i = 8;
        if (z3) {
            C1QI.A0H(A0N3, A0N3);
            A0N3.setVisibility(A0N2.getVisibility());
            A0N2.setVisibility(8);
        }
        if (AbstractC13880nE.A0A(context) > 1000) {
            z4 = false;
            i = 0;
        }
        A0N4.setVisibility(i);
        A0S.setVisibility(z4 ? 0 : 8);
        A0S2.setVisibility((z4 || !z2) ? 8 : 0);
    }
}
