package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WjF implements BC4 {
    public final UserSession A00;
    public final C7UR A01;

    @Override // X.BC4
    public final void BOI(C148286ly c148286ly, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16820sZ, 2);
        C7UR c7ur = this.A01;
        String url = c148286ly.A0H.getUrl();
        C70919WkN c70919WkN = new C70919WkN(2, interfaceC16820sZ, interfaceC16660sJ);
        C7UR c7ur2 = C7UR.A0A;
        c7ur.A05(c70919WkN, url);
    }

    public /* synthetic */ WjF(UserSession userSession) {
        C7UR c7ur = C7UR.A0A;
        C7UR A00 = C7US.A00(userSession.deviceSession.A06());
        C14360o3.A0B(A00, 2);
        this.A00 = userSession;
        this.A01 = A00;
    }
}
