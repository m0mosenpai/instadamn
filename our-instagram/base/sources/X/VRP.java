package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VRP {
    public static final void A00(C45125Jxu c45125Jxu, UJM ujm, UserSession userSession) {
        String A00;
        W6I A002 = VRC.A00(userSession);
        AbstractC70663Fe abstractC70663Fe = ujm.A04.A0D;
        C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a <= A1b) {
            boolean z = true;
            while (true) {
                if (A1a >= 0) {
                    List list = (List) c45125Jxu.A01;
                    if (A1a < list.size()) {
                        XCL xcl = (XCL) list.get(A1a);
                        if (xcl.BsE()) {
                            z = false;
                        } else {
                            if (xcl instanceof WeH) {
                                A002.A06("ads_manager_highlights_hub", WGU.A01(((WeH) xcl).A02), "ads_manager");
                            } else if (xcl instanceof C70636WeG) {
                                if (((C70636WeG) xcl).A03 == C05F.A00) {
                                    A00 = AnonymousClass001.A0O(MSV.A00(1408), A1a);
                                } else {
                                    A00 = MSV.A00(1409);
                                }
                                A002.A06("promotion_list", A00, "direct_inbox_setting_entrypoint");
                            }
                            xcl.EdP(true);
                        }
                    }
                }
                if (A1a == A1b) {
                    break;
                } else {
                    A1a++;
                }
            }
            if (!z) {
                return;
            }
        }
        if (c45125Jxu.A00 == C05F.A01) {
            A002.A06("promotion_list", "messaging_ads_multi_suggestion", "direct_inbox_setting_entrypoint");
        }
    }
}
