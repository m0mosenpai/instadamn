package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class VBT extends AbstractC77473dX {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ Tx0 A02;
    public final /* synthetic */ C65741TtG A03;
    public final /* synthetic */ XLU A04;
    public final /* synthetic */ C66171U2m A05;
    public final /* synthetic */ C66172U2n A06;

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        String str;
        C14360o3.A0B(user, 0);
        XLU xlu = this.A04;
        C65741TtG c65741TtG = this.A03;
        xlu.Dxr(this.A00, this.A02, c65741TtG);
        C66171U2m c66171U2m = this.A05;
        FollowStatus A00 = ViewOnAttachStateChangeListenerC110564yT.A00(this.A01, user);
        FollowStatus followStatus2 = FollowStatus.A05;
        if (A00 == followStatus2) {
            str = DialogModule.KEY_MESSAGE;
        } else if (A00 == FollowStatus.A07) {
            str = "requested";
        } else if (A00 == FollowStatus.A06) {
            str = "follow";
        } else {
            str = "unknown";
        }
        c65741TtG.A03 = str;
        if (A00 == followStatus2) {
            c66171U2m.A0U.setVisibility(8);
        }
    }

    public VBT(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Tx0 tx0, C65741TtG c65741TtG, XLU xlu, C66171U2m c66171U2m, C66172U2n c66172U2n) {
        this.A04 = xlu;
        this.A03 = c65741TtG;
        this.A02 = tx0;
        this.A00 = interfaceC11380iw;
        this.A05 = c66171U2m;
        this.A01 = userSession;
        this.A06 = c66172U2n;
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D4B(User user) {
        XLU xlu = this.A04;
        C65741TtG c65741TtG = this.A03;
        xlu.Dxr(this.A00, this.A02, c65741TtG);
    }
}
