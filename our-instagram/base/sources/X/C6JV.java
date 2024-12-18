package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6JV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JV implements InterfaceC13000lm {
    public boolean A00;
    public final C41761wQ A01;
    public final UserSession A02;

    public C6JV(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = new C41761wQ(null);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A01();
    }
}
