package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1Xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28061Xk implements InterfaceC28011Xf {
    public final UserSession A00;
    public final boolean A01;

    @Override // X.InterfaceC28011Xf
    public final /* synthetic */ boolean AC7(C108104tt c108104tt) {
        return true;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        C38321qM A02;
        C38321qM A022;
        C38321qM A023;
        C3XG c3xg = (C3XG) obj;
        if (c3xg == null) {
            return false;
        }
        C1XV c1xv = c3xg.A06;
        if (c1xv == C1XV.A0Y && (A023 = C3XH.A02(c3xg.A05)) != null) {
            return C3ZZ.A00(this.A00, A023, true, this.A01);
        }
        UserSession userSession = this.A00;
        if (C1XT.A03(userSession) && C3YW.A02(c3xg) && (A022 = C3XH.A02(c3xg.A05)) != null) {
            return C3ZZ.A00(userSession, A022, false, this.A01);
        }
        if (c1xv != C1XV.A0H || (A02 = C3XH.A02(c3xg.A05)) == null || !C3ZZ.A00(userSession, A02, false, this.A01)) {
            return false;
        }
        return true;
    }

    public C28061Xk(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = C18U.A06(C06090Tz.A05, userSession, 36312866155922778L);
    }
}
