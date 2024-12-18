package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TFw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64486TFw implements InterfaceC13000lm {
    public InterfaceC65450TkM A00;
    public final UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C64486TFw.class);
    }

    public C64486TFw(UserSession userSession) {
        this.A01 = userSession;
    }
}
