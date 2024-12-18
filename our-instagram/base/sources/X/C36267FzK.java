package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FzK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36267FzK implements InterfaceC13000lm {
    public final UserSession A00;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(C36267FzK.class);
    }

    public C36267FzK(UserSession userSession) {
        this.A00 = userSession;
    }
}
