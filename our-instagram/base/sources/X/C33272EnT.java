package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.EnT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33272EnT extends AbstractC77473dX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C33272EnT(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A04 = obj2;
        this.A01 = obj;
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        int i;
        EnumC223459tc enumC223459tc;
        EnumC110554yS enumC110554yS;
        float f;
        if (this.A00 != 0) {
            Object obj = this.A02;
            GF6 gf6 = (GF6) this.A03;
            FollowButton followButton = gf6.A0D;
            UserSession userSession = (UserSession) this.A04;
            FollowStatus A0j = AbstractC31174DnI.A0j(userSession, user);
            FollowStatus followStatus2 = FollowStatus.A05;
            if (A0j.equals(followStatus2)) {
                enumC110554yS = EnumC110554yS.A02;
            } else {
                enumC110554yS = EnumC110554yS.A03;
            }
            followButton.setFollowButtonSize(enumC110554yS);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) followButton.getLayoutParams();
            if (AbstractC31174DnI.A0j(userSession, user).equals(followStatus2)) {
                ((ViewGroup.LayoutParams) layoutParams).width = ((Context) this.A01).getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
                f = 0.0f;
            } else {
                ((ViewGroup.LayoutParams) layoutParams).width = 0;
                f = 1.0f;
            }
            layoutParams.weight = f;
            if (AbstractC31174DnI.A0j(userSession, user).equals(followStatus2)) {
                View view = gf6.A00;
                if (view == null) {
                    view = gf6.A04.inflate();
                    gf6.A00 = view;
                }
                view.setVisibility(0);
                View view2 = gf6.A00;
                if (view2 == null) {
                    view2 = gf6.A04.inflate();
                    gf6.A00 = view2;
                }
                ViewOnClickListenerC35687FpM.A00(view2, 70, obj, user);
            } else {
                AbstractC13880nE.A0P(gf6.A00);
            }
            followButton.setLayoutParams(layoutParams);
            return;
        }
        C14360o3.A0B(followStatus, 1);
        UserSession userSession2 = (UserSession) this.A03;
        String BaA = ((C2EE) this.A02).BaA();
        int ordinal = followStatus.ordinal();
        if (ordinal != 4) {
            i = 22;
            if (ordinal != 5) {
                i = 21;
                enumC223459tc = EnumC223459tc.A0Q;
            } else {
                enumC223459tc = EnumC223459tc.A0O;
            }
        } else {
            i = 23;
            enumC223459tc = EnumC223459tc.A0N;
        }
        AbstractC35215Fg8.A01(enumC223459tc, null, userSession2, BaA, i);
    }
}
