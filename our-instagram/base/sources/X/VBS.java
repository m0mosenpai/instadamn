package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class VBS extends AbstractC77473dX {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ FollowButton A04;

    /* JADX WARN: Type inference failed for: r8v0, types: [X.FEm, java.lang.Object] */
    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        C14360o3.A0B(user, 0);
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = this.A04.A0J;
        viewOnAttachStateChangeListenerC110564yT.A08(this);
        UserSession userSession = this.A03;
        viewOnAttachStateChangeListenerC110564yT.A04(this.A00, userSession, user);
        Parcelable.Creator creator = User.CREATOR;
        User user2 = new User(user.getId(), user.getUsername());
        user2.A0h(userSession, user, false);
        ?? obj = new Object();
        obj.A00 = user2;
        C6FG c6fg = this.A01;
        AnonymousClass630 A02 = AnonymousClass634.A02(c6fg);
        C102884kP c102884kP = this.A02;
        A02.A0G(new C70695WfI(c102884kP.A04), new C67962V4b(obj, 1));
        A02.A09();
        InterfaceC103384lE A0B = c102884kP.A0B(43);
        FollowStatus B7L = user.B7L();
        if (A0B != null) {
            String A06 = AbstractC38851rI.A06(B7L);
            C6FX c6fx = new C6FX();
            c6fx.A03(c102884kP, 0);
            AbstractC58322PtE.A1M(c6fg, c102884kP, c6fx, A0B, A06);
        }
        InterfaceC103384lE A09 = c102884kP.A09();
        if (A09 != null && B7L == FollowStatus.A05) {
            C6FP.A03(c6fg, c102884kP, AbstractC58320PtC.A0g(c102884kP), A09);
        }
        InterfaceC103384lE A0A = c102884kP.A0A();
        if (A0A != null && B7L == FollowStatus.A06) {
            C6FP.A03(c6fg, c102884kP, AbstractC58320PtC.A0g(c102884kP), A0A);
        }
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void DHs(User user) {
        C14360o3.A0B(user, 0);
        C102884kP c102884kP = this.A02;
        InterfaceC103384lE A0A = c102884kP.A0A();
        if (A0A != null && user.B7L() == FollowStatus.A06) {
            C6FP.A03(this.A01, c102884kP, AbstractC58320PtC.A0g(c102884kP), A0A);
        }
    }

    public VBS(InterfaceC11380iw interfaceC11380iw, C6FG c6fg, C102884kP c102884kP, UserSession userSession, FollowButton followButton) {
        this.A04 = followButton;
        this.A03 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = c6fg;
        this.A02 = c102884kP;
    }
}
