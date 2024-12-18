package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.S4y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62279S4y {
    public static final void A00(SZ2 sz2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        C14360o3.A0B(sz2, 0);
        UserSession userSession = sz2.A01;
        C55170OdY A00 = OPL.A00(userSession);
        if (!z) {
            if (A00.A03.contains(MSV.A00(187))) {
                interfaceC16660sJ.invoke(A00.A04());
                return;
            }
        }
        SZ2.A00(sz2, "opt_in_status_read_started", null);
        C50364MLq c50364MLq = new C50364MLq(48, A00, sz2, interfaceC16660sJ);
        C50362MLo c50362MLo = new C50362MLo(15, sz2, interfaceC16660sJ2);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C64006Sxd.A00(new C58510Pwe(c50364MLq, 22), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IABLinkHistorySettingsQuery", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59673Qjr.class, false, null, 0, null, "xig_link_history_settings_from_ig_user", AbstractC166987dD.A1E()), A01, c50362MLo, 12);
    }
}
