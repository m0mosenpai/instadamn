package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.1Nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25871Nu implements InterfaceC13000lm {
    public Reel A00;
    public final UserSession A01;

    public final synchronized Reel A00(Reel reel) {
        Reel reel2;
        A01(reel);
        reel2 = this.A00;
        if (reel2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return reel2;
    }

    public final synchronized void A01(Reel reel) {
        Integer CBs;
        C1NB c1nb = reel.A0W;
        if (c1nb == null) {
            CBs = null;
        } else {
            CBs = c1nb.CBs();
        }
        if (CBs == C05F.A01 && !reel.A0b() && !reel.A0i() && !reel.A0d()) {
            User A01 = C17060sy.A01.A01(this.A01);
            C1NB c1nb2 = reel.A0W;
            C14360o3.A0A(c1nb2);
            if (C14360o3.A0K(A01, c1nb2.CDj())) {
                this.A00 = reel;
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        this.A00 = null;
    }

    public C25871Nu(UserSession userSession) {
        this.A01 = userSession;
    }
}
