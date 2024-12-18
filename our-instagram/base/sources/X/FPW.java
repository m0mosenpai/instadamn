package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FPW {
    public final UserSession A00;
    public final C1GL A01 = C1GJ.A01();

    public final void A00(C1ON c1on, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        c1on.A00 = new C67856Uzb(this.A00, interfaceC16660sJ2, interfaceC16660sJ, 1);
        this.A01.schedule(c1on, c1on.getRunnableId(), 3, true, false);
    }

    public FPW(UserSession userSession) {
        this.A00 = userSession;
    }
}
