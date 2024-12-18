package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Drl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31441Drl extends C3OO {
    public final View A00;
    public final UserSession A01;
    public final C31481DsQ A02;
    public final GradientSpinnerAvatarView A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final FollowButton A08;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        if (r14.length() == 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.InterfaceC11380iw r10, X.C19260xA r11, com.instagram.user.model.User r12, com.instagram.user.model.User r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31441Drl.A00(X.0iw, X.0xA, com.instagram.user.model.User, com.instagram.user.model.User, java.lang.String):void");
    }

    public C31441Drl(View view, UserSession userSession, C31481DsQ c31481DsQ) {
        super(view);
        this.A01 = userSession;
        this.A02 = c31481DsQ;
        this.A00 = AbstractC166997dE.A0S(view, R.id.suggested_entity_card_container);
        this.A07 = AbstractC31176DnK.A0U(view, R.id.suggested_entity_card_image);
        this.A03 = AbstractC31176DnK.A0f(view, R.id.suggested_entity_card_avatar_view);
        this.A06 = AbstractC167007dF.A0N(view, R.id.suggested_entity_card_name);
        this.A05 = AbstractC167007dF.A0N(view, R.id.suggested_entity_card_context);
        this.A04 = AbstractC166997dE.A0S(view, R.id.dismiss_button);
        this.A08 = (FollowButton) AbstractC166997dE.A0R(view, R.id.suggested_user_card_follow_button);
    }
}
