package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.254, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass254 implements InterfaceC13000lm {
    public final UserSession A00;

    public AnonymousClass254(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(AnonymousClass254.class);
    }

    public AnonymousClass254() {
    }
}
