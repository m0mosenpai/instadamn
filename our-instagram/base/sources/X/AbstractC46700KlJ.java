package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.creator.inspiration.repository.graphql.GetTopAudioTrendsEligibleCategoriesResponseImpl;

/* renamed from: X.KlJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46700KlJ {
    public static final void A00(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36609777245296607L);
        C1Dk maxToleratedCacheAgeMs = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "GetTopAudioTrendsEligibleCategories", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), GetTopAudioTrendsEligibleCategoriesResponseImpl.class, false, null, 0, null, "xdt_top_audio_trends_eligible_tabs", AbstractC166987dD.A1E()).setFreshCacheAgeMs(A01).setMaxToleratedCacheAgeMs(A01);
        AbstractC40691uc.A01(userSession).ATV(C48143LSs.A00, new LT1(interfaceC16660sJ, 10), maxToleratedCacheAgeMs);
    }
}
