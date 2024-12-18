package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FW6 {
    public static final void A00(AbstractC59962oe abstractC59962oe, XCT xct, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C62862tP A0N = AbstractC31172DnG.A0N(abstractC59962oe, userSession);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        BitSet A0j = AbstractC31171DnF.A0j(1);
        AbstractC31171DnF.A1T(str, A1G);
        A0j.set(0);
        FragmentActivity activity = abstractC59962oe.getActivity();
        if (A0j.nextClearBit(0) >= 1) {
            FTe.A00(xct, AbstractC111324zv.A00(366), A1G, A1G2).A00(activity, A0N);
            return;
        }
        throw AbstractC31173DnH.A0f();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.XCT] */
    public static final void A01(AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C62862tP A0N = AbstractC31172DnG.A0N(abstractC59962oe, userSession);
        Map A0n = AbstractC167007dF.A0n("node_id", "upgrade_account");
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A0h = AbstractC31177DnL.A0h();
        AbstractC31171DnF.A1T(str, A1G);
        A1G.put("deeplink_destination", "individual_setting");
        if (!A0n.isEmpty()) {
            A1G.put("deeplink_params", A0n);
        }
        FTe.A00(new Object(), "com.bloks.www.fxcal.settings.async", A1G, A0h).A00(abstractC59962oe.getActivity(), A0N);
    }
}
