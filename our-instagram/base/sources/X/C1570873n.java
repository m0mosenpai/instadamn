package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.73n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1570873n implements InterfaceC13050lr {
    public long A00;
    public long A01;
    public final C1QT A02;
    public final UserSession A03;
    public final HashMap A04;

    public C1570873n(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = C1QS.A00(userSession);
        this.A04 = new HashMap();
    }

    public final void A00() {
        long j = this.A01;
        if (j != 0) {
            this.A02.flowEndCancel(j, CancelReason.USER_CANCELLED);
            this.A01 = 0L;
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        A00();
        long j = this.A00;
        if (j != 0) {
            this.A02.flowEndSuccess(j);
            this.A00 = 0L;
            this.A04.clear();
        }
        this.A04.clear();
    }
}
