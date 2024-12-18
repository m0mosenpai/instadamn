package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EW7 extends AbstractC61132qb {
    public final UserSession A00;
    public final InterfaceC83713oG A01;

    public EW7(UserSession userSession, InterfaceC83713oG interfaceC83713oG) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = interfaceC83713oG;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        InterfaceC83713oG interfaceC83713oG = this.A01;
        C2DS A00 = AbstractC28761aE.A00(userSession);
        InterfaceC83703oF A02 = AbstractC140946Yw.A02(interfaceC83713oG);
        C14360o3.A0C(A02, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadId");
        String str = ((C83693oE) A02).A00;
        C14360o3.A0B(str, 0);
        C81663kb A0N = ((C2DU) A00).A0N(str);
        if (A0N != null) {
            return new C44519JmP(userSession, A0N, interfaceC83713oG);
        }
        throw AbstractC166997dE.A0g();
    }
}
