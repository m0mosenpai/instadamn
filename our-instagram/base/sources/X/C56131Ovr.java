package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ovr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56131Ovr implements InterfaceC13000lm {
    public long A00;
    public final UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00 = 0L;
    }

    public C56131Ovr(UserSession userSession) {
        this.A01 = userSession;
    }
}
