package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TFy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64488TFy implements InterfaceC13000lm {
    public C62514SEq A00;
    public C62684SLx A01;
    public final UserSession A02;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(C64488TFy.class);
    }

    public C64488TFy(UserSession userSession) {
        this.A02 = userSession;
    }
}
