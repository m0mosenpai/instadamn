package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132025xd implements InterfaceC13000lm {
    public final C41761wQ A00;
    public final UserSession A01;

    public C132025xd(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new C41761wQ(null);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A01();
    }
}
