package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;

/* loaded from: classes11.dex */
public final class U29 {
    public static V0V A00(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        C14360o3.A0B(str, 1);
        V0V v0v = new V0V();
        Bundle bundle = new Bundle();
        bundle.putString("argument_search_session_id", str);
        bundle.putString("argument_search_string", str2);
        bundle.putString("argument_prior_module", str3);
        bundle.putString("argument_prior_serp_session_id", str4);
        bundle.putString("argument_prior_query_text", str5);
        bundle.putString("argument_entity_page_id", str6);
        bundle.putBoolean("argument_new_search_session", z);
        bundle.putString("serp_source", str7);
        bundle.putString("hcm_serp_source", str8);
        bundle.putString("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER", AbstractC85443rZ.A02(str2) ? "search_result" : null);
        v0v.setArguments(bundle);
        return v0v;
    }

    public static C38934HCh A01(Keyword keyword, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 1);
        C38934HCh c38934HCh = new C38934HCh();
        Bundle bundle = new Bundle();
        bundle.putString("argument_search_session_id", str2);
        bundle.putString("argument_search_string", str3);
        bundle.putString(AbstractC111324zv.A00(1937), str4);
        bundle.putString("argument_prior_module", str);
        bundle.putString(AbstractC111324zv.A00(1936), null);
        bundle.putParcelable(AbstractC111324zv.A00(1935), keyword);
        c38934HCh.setArguments(bundle);
        return c38934HCh;
    }

    public final C65918TwP A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return A03(null, null, null);
    }

    public final C65918TwP A03(String str, String str2, String str3) {
        C65918TwP c65918TwP = new C65918TwP();
        Bundle bundle = new Bundle();
        bundle.putString("argument_search_session_id", str);
        bundle.putString("argument_search_string", str2);
        bundle.putString("argument_prior_serp_session_id", str3);
        c65918TwP.setArguments(bundle);
        return c65918TwP;
    }
}
