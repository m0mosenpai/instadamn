package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2h9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55692h9 implements InterfaceC13000lm {
    public static final C55682h8 A02 = new Object();
    public final InterfaceC19630xq A00;
    public final UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C55692h9.class);
    }

    public C55692h9(UserSession userSession) {
        this.A01 = userSession;
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A2d);
        this.A00 = A03;
        int i = A03.getInt("app_version_number", -1);
        int A00 = AbstractC12880la.A00();
        if (i != A00) {
            InterfaceC19610xo ARD = A03.ARD();
            ARD.AHW();
            ARD.apply();
            InterfaceC19610xo ARD2 = A03.ARD();
            ARD2.E7D("app_version_number", A00);
            ARD2.apply();
        }
    }
}
