package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DpD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31291DpD extends AbstractC46524KiP implements GZA {
    public C34410FFa A00;
    public C2EC A01;
    public final UserSession A02;
    public final C2DS A03;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        C34410FFa c34410FFa = new C34410FFa(context, this);
        this.A00 = c34410FFa;
        return c34410FFa.A00;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        List BKM;
        List BJR;
        C14360o3.A0B(interfaceC37159GYw, 1);
        this.A01 = c2ec;
        if (c2ec != null) {
            UserSession userSession = this.A02;
            C2DS c2ds = this.A03;
            AbstractC167017dG.A1O(userSession, c2ds);
            String C7I = c2ec.C7I();
            if (C7I == null) {
                C7I = "";
            }
            if (c2ec.C7g() == 29 && C14360o3.A0K(userSession.userId, c2ec.Asv()) && AbstractC159887Fa.A01(userSession, JRE.A05(c2ec.BKb())) && !AbstractC31174DnI.A1X(AbstractC23021Ah.A00(userSession).A01, AbstractC111324zv.A00(768), C7I) && (((BKM = c2ec.BKM()) == null || BKM.isEmpty()) && (((BJR = c2ec.BJR()) == null || BJR.isEmpty()) && !C34975Fb2.A00(userSession, c2ec, c2ds, c2ec.BKb(), null) && !FU8.A01(userSession, c2ec, c2ds, null) && !AbstractC31302DpO.A00(userSession, c2ec, AbstractC2056298m.A00(userSession))))) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                if (AbstractC167017dG.A1b(A00, A00.A2R, C23031Ai.A8c, 452)) {
                    interfaceC37159GYw.Dpu(this);
                    return;
                }
            }
        }
        interfaceC37159GYw.onFailure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1vN] */
    @Override // X.GZA
    public final void onActionClicked() {
        String str;
        UserSession userSession = this.A02;
        AbstractC25651Mw.A00(userSession).E4s(new Object());
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C2EC c2ec = this.A01;
        if (c2ec == null || (str = c2ec.C7I()) == null) {
            str = "";
        }
        AbstractC31177DnL.A1M(AbstractC166987dD.A0w(A00), AbstractC111324zv.A00(768), str, true);
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        String str;
        C23031Ai A00 = AbstractC23021Ah.A00(this.A02);
        C2EC c2ec = this.A01;
        if (c2ec == null || (str = c2ec.C7I()) == null) {
            str = "";
        }
        AbstractC31177DnL.A1M(AbstractC166987dD.A0w(A00), AbstractC111324zv.A00(768), str, true);
    }

    public C31291DpD(UserSession userSession) {
        this.A02 = userSession;
        this.A03 = C2JD.A00(userSession);
    }
}
