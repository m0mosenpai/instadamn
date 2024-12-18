package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TFx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64487TFx implements InterfaceC13000lm {
    public InterfaceC65448TkK A00;
    public InterfaceC65449TkL A01;
    public final UserSession A02;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(C64487TFx.class);
    }

    public C64487TFx(UserSession userSession) {
        this.A02 = userSession;
    }
}
