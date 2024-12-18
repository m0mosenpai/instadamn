package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lcz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48508Lcz implements InterfaceC13000lm {
    public final InterfaceC19630xq A00;
    public final UserSession A01;

    public C48508Lcz(InterfaceC19630xq interfaceC19630xq, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC19630xq;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.AHW();
        ARD.apply();
    }
}
