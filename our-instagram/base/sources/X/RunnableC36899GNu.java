package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GNu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36899GNu implements Runnable {
    public final /* synthetic */ C164617Ya A00;
    public final /* synthetic */ C2ED A01;

    public RunnableC36899GNu(C164617Ya c164617Ya, C2ED c2ed) {
        this.A00 = c164617Ya;
        this.A01 = c2ed;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        FKZ fkz;
        String C7I;
        C164617Ya c164617Ya = this.A00;
        C2EC c2ec = (C2EC) this.A01;
        C7YY c7yy = c164617Ya.A00;
        C81543kP A0g = AbstractC31172DnG.A0g(c2ec);
        if (A0g != null && (list = A0g.A0A) != null && (fkz = (FKZ) list.get(0)) != null && (C7I = c2ec.C7I()) != null) {
            UserSession userSession = c7yy.A05;
            if (C14360o3.A0K(userSession.userId, A0g.A07)) {
                AbstractC59962oe abstractC59962oe = c7yy.A02;
                if (abstractC59962oe.isResumed() && C14360o3.A0K(fkz.A02, "member_growth")) {
                    Context requireContext = abstractC59962oe.requireContext();
                    C2056398n A00 = AbstractC2056298m.A00(userSession);
                    int i = fkz.A00;
                    if (AbstractC111324zv.A00(2007).equals(c7yy.A08) || !A00.A00.getBoolean(AnonymousClass001.A0V("preference_milestone_dialog_", C7I, '_', i), false)) {
                        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(requireContext), R.layout.direct_broadcast_chat_milestone);
                        AbstractC31177DnL.A0r(requireContext, AbstractC166987dD.A0e(A0C, R.id.title), C84963qk.A04(AbstractC166997dE.A0M(requireContext), Integer.valueOf(i), 1000, true, true), 2131958777);
                        AbstractC166987dD.A0e(A0C, R.id.subtitle).setText(2131958776);
                        ImageView A08 = AbstractC31171DnF.A08(A0C, R.id.confetti_image_view);
                        C148086le c148086le = new C148086le(requireContext);
                        c148086le.A02(A08, C05F.A00);
                        C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
                        A0I.A0l(A0C);
                        A0I.A07();
                        A0I.A0t(true);
                        A0I.A0h(new AP9(c148086le, 2));
                        DialogInterfaceOnDismissListenerC35463FkK.A00(A0I, c148086le, 1);
                        AbstractC166987dD.A1W(A0I);
                        InterfaceC19610xo ARD = A00.A00.ARD();
                        ARD.E77(AnonymousClass001.A0V("preference_milestone_dialog_", C7I, '_', i), true);
                        ARD.apply();
                    }
                }
            }
        }
    }
}
