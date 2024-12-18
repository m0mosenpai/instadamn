package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Vll, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69339Vll {
    public C70716Wfh A00;
    public User A01;
    public String A02;
    public final C6FG A03;
    public final C102884kP A04;
    public final UserSession A05;

    public C69339Vll(C6FG c6fg, C102884kP c102884kP) {
        User A02;
        this.A03 = c6fg;
        this.A04 = c102884kP;
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        C14360o3.A0C(A0A, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        UserSession userSession = (UserSession) A0A;
        this.A05 = userSession;
        C34396FEm c34396FEm = (C34396FEm) C102884kP.A00(c102884kP, 38);
        this.A02 = c102884kP.A0J();
        if (c34396FEm != null) {
            A02 = c34396FEm.A00;
        } else {
            A02 = AnonymousClass189.A00(userSession).A02(this.A02);
        }
        this.A01 = A02;
        if (A02 != null) {
            this.A02 = A02.getId();
        }
    }
}
