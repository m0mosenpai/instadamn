package X;

import androidx.fragment.app.Fragment;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7nH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173037nH {
    public C173227na A00;
    public C196188m9 A01;
    public final Fragment A02;
    public final UserSession A03;

    public C173037nH(Fragment fragment, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragment, 2);
        this.A03 = userSession;
        this.A02 = fragment;
    }

    public static final boolean A00(C173037nH c173037nH) {
        C173227na c173227na = c173037nH.A00;
        if (c173227na != null && c173227na.A00) {
            UserSession userSession = c173037nH.A03;
            if (C196008lp.A00(userSession) && C180377zR.A07(userSession) && C18U.A06(C06090Tz.A05, userSession, 2342155828124976402L)) {
                return true;
            }
        }
        return false;
    }

    public final void A01() {
        UserSession userSession = this.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36312818911806740L)) {
            if ("fx_ig4a_cross_posting_story_is_upsell_universe".length() > 0) {
                if ("is_in_holdout".length() > 0) {
                    C2JM c2jm = new C2JM();
                    C2JM c2jm2 = new C2JM();
                    c2jm.A04("qe_universe", "fx_ig4a_cross_posting_story_is_upsell_universe");
                    c2jm.A04("param_name", "is_in_holdout");
                    c2jm.A02("default_value", false);
                    C2JQ c2jq = PandoGraphQLRequest.Companion;
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGFXGrowthLogExposureQEBoolParamMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C173157nT.class, true, null, 0, null, "fx_growth_qe_bool_param_log_exposure", new ArrayList());
                    AbstractC40691uc.A01(userSession).ATV(C173187nW.A00, C173177nV.A00, pandoGraphQLRequest);
                    return;
                }
                throw new IllegalStateException("paramName parameter can't be empty");
            }
            throw new IllegalStateException("qeUniverse parameter can't be empty");
        }
    }
}
