package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.99H, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C99H implements InterfaceC13000lm {
    public boolean A00;
    public final int A01;
    public final C006802i A02;
    public final UserSession A03;

    public C99H(C006802i c006802i, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = c006802i;
        this.A01 = userSession.userId.hashCode();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.markerEnd(20127518, this.A01, (short) 3);
    }
}
