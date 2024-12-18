package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;

/* renamed from: X.Ovu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56134Ovu implements InterfaceC13000lm {
    public final UserSession A00;
    public final Object A01;
    public final java.util.Set A02;

    public C56134Ovu(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = new Object();
        this.A02 = AbstractC166987dD.A1H();
        this.A00 = userSession;
    }

    public final void A00(ISendDirectMessageCallback iSendDirectMessageCallback) {
        C119925bq A00 = AbstractC119915bp.A00(this.A00);
        C56386P1x c56386P1x = new C56386P1x(this, iSendDirectMessageCallback);
        synchronized (A00) {
            A00.A00 = c56386P1x;
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC119915bp.A00(this.A00).A00();
    }
}
