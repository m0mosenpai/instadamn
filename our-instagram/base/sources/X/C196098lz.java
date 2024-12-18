package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196098lz implements InterfaceC13000lm {
    public final C196118m1 A00;
    public final UserSession A01;

    public C196098lz(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC196108m0.A00(userSession);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C196098lz.class);
    }

    public C196098lz() {
    }
}
