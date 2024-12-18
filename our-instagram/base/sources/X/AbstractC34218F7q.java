package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.F7q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34218F7q {
    public static final void A00(UserSession userSession, String str) {
        if (C18U.A06(C06090Tz.A05, userSession, 36314476770626142L)) {
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A04("upsell_name", str);
            C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "FXGrowthLogImpressionForISUpsell", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59654QjY.class, true, null, 0, null, "fx_growth_log_impression_for_is_upsell", AbstractC166987dD.A1E()).setMaxToleratedCacheAgeMs(0L);
            AbstractC40691uc.A01(userSession).ATV(C35818Fru.A00, C35846FsM.A00, maxToleratedCacheAgeMs);
            return;
        }
        C2JM A0b3 = AbstractC25225BEi.A0b();
        A0b3.A04("upsell_name", str);
        C907442n c907442n = new C907442n(A0b3, E56.class, "FXGrowthLogImpressionForISUpsell", true);
        C14360o3.A0A(C195928le.A00(userSession).ATV(C35819Frv.A00, C35847FsN.A00, c907442n));
    }
}
