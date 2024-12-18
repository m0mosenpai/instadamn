package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FbJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34987FbJ {
    public static final C34987FbJ A00 = new Object();

    public final void A00(FragmentActivity fragmentActivity, UserSession userSession, Integer num) {
        boolean A1R = AbstractC167007dF.A1R(0, fragmentActivity, userSession);
        C14360o3.A0B(num, 2);
        Boolean Ce3 = AbstractC166997dE.A0Y(userSession).A03.Ce3();
        if (Ce3 != null && Ce3.booleanValue()) {
            C6WQ c6wq = new C6WQ(fragmentActivity, A1R);
            AbstractC31176DnK.A13(c6wq.getContext(), c6wq);
            c6wq.setCancelable(false);
            C0fJ.A00(c6wq);
            C62862tP A0G = AbstractC31178DnM.A0G(fragmentActivity, userSession, "igy_plugin");
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A0h = AbstractC31177DnL.A0h();
            AbstractC31171DnF.A1T(FVY.A01(num), A1G);
            A1G.put("timezone_offset_seconds_from_gmt", Long.valueOf(C23831Eq.A00()));
            FTe.A00(new C36029FvR(2, fragmentActivity, c6wq), AbstractC111324zv.A00(2100), A1G, A0h).A00(fragmentActivity, A0G);
        }
    }
}
