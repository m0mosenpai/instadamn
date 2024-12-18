package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.Exo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33886Exo {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC111324zv.A00(11));
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        C23031Ai A00 = AbstractC23021Ah.A00(A0S);
        AbstractC31171DnF.A1S(A00, A03, A00.A0H, C23031Ai.A8c, 367);
        C39030HGg c39030HGg = new C39030HGg(A0S, 1);
        AbstractC40691uc.A01(A0S).A06(new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "BasicAdsOptInQuery", AbstractC25225BEi.A0b().getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C62472sm.class, false, null, 0, null, "xfb_user_basic_ads_preferences", AbstractC166987dD.A1E()).setMaxToleratedCacheAgeMs(0L), c39030HGg);
        return null;
    }
}
