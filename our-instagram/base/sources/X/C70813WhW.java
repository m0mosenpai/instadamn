package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* renamed from: X.WhW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70813WhW implements InterfaceC13050lr {
    public long A00;
    public final C1QT A01;
    public final UserSession A02;

    public C70813WhW(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = C1QS.A00(userSession);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        long j = this.A00;
        if (j != 0) {
            this.A01.flowEndCancel(j, CancelReason.USER_CANCELLED);
            this.A00 = 0L;
        }
    }
}
