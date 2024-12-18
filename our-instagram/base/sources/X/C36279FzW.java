package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FzW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36279FzW implements InterfaceC13000lm {
    public final C18920wW A00;
    public final String A01;
    public final HashMap A02;
    public final UserSession A03;

    public C36279FzW(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = userSession.userId;
        this.A02 = AbstractC166987dD.A1G();
        this.A00 = AbstractC12220kQ.A02(userSession);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.clear();
    }
}
