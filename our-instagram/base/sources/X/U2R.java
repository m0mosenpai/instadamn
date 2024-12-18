package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U2R implements InterfaceC13050lr {
    public final C65739TtE A00;

    public U2R(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = new C65739TtE(userSession, C38200Gr5.A00, U2S.A00, 100);
    }

    public final synchronized void A00(JIN jin) {
        this.A00.A04(jin);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            synchronized (this) {
                this.A00.A03();
            }
        }
    }
}
