package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.JrY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44751JrY extends C3OO {
    public final Context A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final UserSession A05;
    public final IgSimpleImageView A06;
    public final CircularImageView A07;
    public final FollowButton A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44751JrY(Context context, final View view, UserSession userSession) {
        super(view);
        int dimensionPixelSize;
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A00 = context;
        this.A05 = userSession;
        FollowButton followButton = (FollowButton) AbstractC166997dE.A0R(view, R.id.card_follow_button);
        this.A08 = followButton;
        this.A04 = AbstractC167007dF.A0N(view, R.id.card_suggested_name);
        this.A02 = AbstractC31176DnK.A0D(view, R.id.card_suggested_subtitle_stacked_avatar);
        this.A03 = AbstractC167007dF.A0N(view, R.id.card_suggested_subtitle);
        final IgSimpleImageView A0T = AbstractC31176DnK.A0T(view, R.id.dismiss_button);
        this.A06 = A0T;
        CircularImageView A0U = AbstractC31176DnK.A0U(view, R.id.card_avatar);
        this.A07 = A0U;
        followButton.setBackground(null);
        AbstractC166987dD.A1O(context, followButton, AbstractC53242c7.A0C(context));
        AbstractC31173DnH.A0z(context, view, AbstractC72723Nt.A00(context) ? R.drawable.quad_card_su_background_night : R.drawable.card_background);
        int A0A = AbstractC13880nE.A0A(context);
        int A09 = AbstractC13880nE.A09(context);
        C110964z8 c110964z8 = new C110964z8();
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        c110964z8.A0I(constraintLayout);
        double d = 0.6d;
        if (C18U.A06(C06090Tz.A06, userSession, 36316559827931656L)) {
            C110964z8.A02(c110964z8, R.id.card_avatar).A03.A0W = Integer.MAX_VALUE;
            C110964z8.A02(c110964z8, R.id.card_avatar).A03.A0u = Integer.MAX_VALUE;
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
            if (A0A > 1000) {
                d = 0.7d;
            }
        } else {
            C110964z8.A02(c110964z8, R.id.card_avatar).A03.A0W = context.getResources().getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xlarge);
            C110964z8.A02(c110964z8, R.id.card_avatar).A03.A0u = AbstractC166997dE.A04(context, R.dimen.avatar_size_ridiculously_xlarge);
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        }
        constraintLayout.setLayoutParams(new C56302iJ((A0A / 2) - 60, ((int) (A09 * d)) / 2));
        c110964z8.A0G(constraintLayout);
        int A04 = AbstractC167017dG.A04(context);
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(A0U);
        A0G.setMargins(dimensionPixelSize, A04, dimensionPixelSize, 0);
        A0U.setLayoutParams(A0G);
        C14360o3.A0B(A0T, 0);
        AbstractC13880nE.A0q(A0T, new Runnable() { // from class: X.0my
            @Override // java.lang.Runnable
            public final void run() {
                Rect rect = new Rect();
                View view2 = A0T;
                view2.getHitRect(rect);
                Resources resources = view2.getResources();
                rect.left -= resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                rect.bottom += resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                view.setTouchDelegate(new TouchDelegate(rect, view2));
            }
        });
    }
}
