package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FzL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36268FzL implements InterfaceC13000lm {
    public final UserSession A00;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(C36268FzL.class);
    }

    public C36268FzL(UserSession userSession) {
        this.A00 = userSession;
    }
}
