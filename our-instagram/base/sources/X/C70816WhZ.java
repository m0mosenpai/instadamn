package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* renamed from: X.WhZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70816WhZ implements InterfaceC13050lr {
    public final C1QT A00;

    public C70816WhZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C1QS.A00(userSession);
    }

    public static final void A01(AbstractC68940Vee abstractC68940Vee, C70816WhZ c70816WhZ, String str) {
        long j = abstractC68940Vee.A00;
        if (j != 0) {
            c70816WhZ.A00.flowMarkPoint(j, str, null);
        }
    }

    public static final void A00(AbstractC68940Vee abstractC68940Vee, C70816WhZ c70816WhZ) {
        long j = abstractC68940Vee.A00;
        if (j != 0) {
            c70816WhZ.A00.flowEndCancel(j, CancelReason.USER_CANCELLED);
            abstractC68940Vee.A00 = 0L;
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        A00(C67908V1x.A00, this);
        A00(C67909V1y.A00, this);
    }
}
