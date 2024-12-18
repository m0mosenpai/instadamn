package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L6Q {
    public final UserSession A00;

    public L6Q(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C42221xC A00() {
        C91P A01 = C6JS.A05.A00(this.A00).A01();
        if (A01 != null) {
            return LFg.A00(new LFg(A01)).A0L(new C48345LaL(C50324MKc.A00));
        }
        return C42221xC.A00();
    }
}
