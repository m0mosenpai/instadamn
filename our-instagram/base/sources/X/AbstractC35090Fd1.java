package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.registration.model.RegFlowExtras;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Fd1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35090Fd1 {
    public static final void A00(AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, RegFlowExtras regFlowExtras, String str) {
        C14360o3.A0B(abstractC59962oe, 1);
        FragmentActivity activity = abstractC59962oe.getActivity();
        if (activity != null) {
            C193328hC A0H = AbstractC31171DnF.A0H(activity);
            A0H.A0r(str);
            AbstractC31176DnK.A16(new DialogInterfaceOnClickListenerC35450Fk7(25, abstractC59962oe, regFlowExtras, c07270a1), A0H, 2131968948);
        }
    }

    public static final void A01(RegFlowExtras regFlowExtras, RegFlowExtras regFlowExtras2) {
        AbstractC167017dG.A1N(regFlowExtras, regFlowExtras2);
        regFlowExtras2.A0t = regFlowExtras.A0t;
        regFlowExtras2.A0y = regFlowExtras.A0y;
        regFlowExtras2.A0G = regFlowExtras.A0G;
        regFlowExtras2.A0H = regFlowExtras.A0H;
    }

    public static final boolean A02(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0A(abstractC12990ll);
        if (AbstractC31174DnI.A06(abstractC12990ll) != 0) {
            C2049995m A01 = C2049995m.A01(abstractC12990ll);
            Iterator it = A01.A01.BOd().iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                Map map = A01.A02;
                if (map.get(A1B) != null) {
                    if (A01.A05(A1B)) {
                        if (A01.A07(A1B) && ((AccountFamily) map.get(A1B)).A03.size() < 4) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
}
