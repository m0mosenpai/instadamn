package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.Wfh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70716Wfh implements InterfaceC42271xH {
    public final C6FG A00;
    public final C102884kP A01;
    public final UserSession A02;
    public final FollowButton A03;
    public final User A04;

    public C70716Wfh(C6FG c6fg, C102884kP c102884kP, UserSession userSession, FollowButton followButton, User user) {
        C14360o3.A0B(userSession, 5);
        this.A03 = followButton;
        this.A01 = c102884kP;
        this.A00 = c6fg;
        this.A04 = user;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C70073Cr c70073Cr = (C70073Cr) obj;
        C14360o3.A0B(c70073Cr, 0);
        return C14360o3.A0K(this.A04.getId(), c70073Cr.A00.getId());
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1672621563);
        int A032 = C0f9.A03(2049552199);
        FollowButton followButton = this.A03;
        C102884kP c102884kP = this.A01;
        WEJ.A00(this.A00, c102884kP, this.A02, followButton, this.A04);
        C0f9.A0A(986741150, A032);
        C0f9.A0A(-1890568048, A03);
    }
}
