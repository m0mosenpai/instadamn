package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2tV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62922tV implements InterfaceC62932tW, InterfaceC13000lm {
    public final UserSession A00;

    public C62922tV(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C62942tX.A0b = false;
    }

    @Override // X.InterfaceC62932tW
    public final int CE3() {
        return (int) C18U.A01(C06090Tz.A05, this.A00, 36592992513229697L);
    }

    @Override // X.InterfaceC62932tW
    public final boolean EjI() {
        return C18U.A06(C06090Tz.A05, this.A00, 36311517536584266L);
    }
}
