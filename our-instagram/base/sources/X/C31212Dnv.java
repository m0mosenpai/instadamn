package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dnv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31212Dnv implements InterfaceC11380iw, InterfaceC13000lm {
    public static final String __redex_internal_original_name = "QPAnalyticsLoggerImpl";
    public final UserSession A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quick_promotion";
    }

    public final void A00(String str, String str2, boolean z) {
        if (z) {
            Long A0j = AbstractC166997dE.A0j(str2);
            if (A0j == null) {
                AbstractC31546DtW.A00(this.A00, C05F.A01, "method: maybeLogEligibilityWaterfallStep promotion id is null", null);
                return;
            }
            C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, this.A00), "qp_eligibility_waterfall"), 361);
            A0A.A0Q("promotion_id", A0j);
            A0A.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
            A0A.Cht();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(C31212Dnv.class);
    }

    public C31212Dnv(UserSession userSession) {
        this.A00 = userSession;
    }
}
