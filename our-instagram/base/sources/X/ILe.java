package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class ILe {
    public long A00;
    public final C1QT A01;
    public final UserSession A02;

    public ILe(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = C1QS.A00(userSession);
    }

    public final void A00() {
        this.A01.flowEndCancel(this.A00, CancelReason.USER_CANCELLED);
        this.A00 = 0L;
    }
}
