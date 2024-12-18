package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EUC extends C1P1 {
    public final /* synthetic */ C34949FaZ A00;

    public EUC(C34949FaZ c34949FaZ) {
        this.A00 = c34949FaZ;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-35285632);
        AbstractC31171DnF.A0z(2131962076);
        C0f9.A0A(645294295, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-246074596);
        AbstractC31557Dth.A00(this.A00.A00.mView, false);
        C0f9.A0A(2027852007, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1071380075);
        AbstractC31557Dth.A00(this.A00.A00.mView, true);
        C0f9.A0A(1734531395, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1254469947);
        ED3 ed3 = (ED3) obj;
        int A032 = C0f9.A03(-1480323978);
        C34949FaZ c34949FaZ = this.A00;
        UserSession userSession = c34949FaZ.A02;
        AbstractC25651Mw.A00(userSession).E4s(new Object());
        C08730cb c08730cb = C17060sy.A01;
        c08730cb.A01(userSession).A0Y();
        AnonymousClass189.A00(userSession).A03(c08730cb.A01(userSession));
        AbstractC35254Fgn.A05(c34949FaZ.A00.requireContext(), ed3.A00, ed3.A01);
        C0f9.A0A(-199737143, A032);
        C0f9.A0A(1972172603, A03);
    }
}
