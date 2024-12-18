package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.Hbt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39467Hbt extends AbstractC37623GhI implements C38Y {
    public View A00;
    public TextView A01;
    public TextView A02;
    public GradientSpinnerAvatarView A03;
    public FollowButton A04;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final User A08;
    public final InterfaceC31010Dk9 A09;
    public final C37624GhJ A0A;

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        Integer valueOf;
        C37556GgC c37556GgC = super.A02;
        if (c37556GgC != null && (valueOf = Integer.valueOf(c37556GgC.A03())) != null && valueOf.intValue() == 0) {
            AbstractC167007dF.A0w(this.A00);
        } else {
            AbstractC167007dF.A0x(this.A00);
        }
    }

    public C39467Hbt(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, InterfaceC31010Dk9 interfaceC31010Dk9, C37624GhJ c37624GhJ) {
        AbstractC167027dH.A13(context, userSession, c37624GhJ);
        C14360o3.A0B(interfaceC11380iw, 5);
        this.A05 = context;
        this.A07 = userSession;
        this.A0A = c37624GhJ;
        this.A09 = interfaceC31010Dk9;
        this.A06 = interfaceC11380iw;
        this.A08 = user;
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
    }
}
