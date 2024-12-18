package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7DU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DU implements InterfaceC13000lm {
    public final UserSession A00;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(C7DU.class);
    }

    public C7DU(UserSession userSession) {
        this.A00 = userSession;
    }
}
