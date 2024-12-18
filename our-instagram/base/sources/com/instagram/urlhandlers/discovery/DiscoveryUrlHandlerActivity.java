package com.instagram.urlhandlers.discovery;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC85443rZ;
import X.C00O;
import X.C023409i;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.U04;
import X.V0V;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class DiscoveryUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.U29, java.lang.Object] */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        C140966Yy c140966Yy;
        Fragment v0v;
        int A00 = C0f9.A00(-527476069);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 257018858;
        } else {
            AbstractC18680vv A04 = C023409i.A0A.A04(A07);
            C14360o3.A0B(A04, 0);
            this.A00 = A04;
            super.onCreate(bundle);
            String string = A07.getString("original_url");
            if (string != null && string.length() != 0) {
                if (!(getSession() instanceof UserSession)) {
                    AbstractC35178FfV.A00().A00(this, A07, getSession());
                } else {
                    AbstractC18680vv session = getSession();
                    C14360o3.A0C(session, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
                    UserSession userSession = (UserSession) session;
                    C14360o3.A0B(userSession, 0);
                    Uri A03 = AbstractC08820cl.A03(string);
                    C14360o3.A07(A03);
                    String valueOf = String.valueOf(A03.getPath());
                    String queryParameter = A03.getQueryParameter("q");
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    if ("/search".equals(valueOf)) {
                        c140966Yy = new C140966Yy(this, userSession);
                        U04.A00();
                        v0v = new Object().A03(null, null, null);
                    } else if ("/search/keyword".equals(valueOf)) {
                        c140966Yy = new C140966Yy(this, userSession);
                        U04.A00();
                        new Object();
                        String A0j = AbstractC167017dG.A0j();
                        String str = null;
                        v0v = new V0V();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("argument_search_session_id", A0j);
                        bundle2.putString("argument_search_string", queryParameter);
                        bundle2.putString("argument_prior_module", null);
                        bundle2.putString("argument_prior_serp_session_id", null);
                        bundle2.putString("argument_prior_query_text", null);
                        bundle2.putString("argument_entity_page_id", "0");
                        bundle2.putBoolean("argument_new_search_session", false);
                        bundle2.putString("serp_source", null);
                        bundle2.putString("hcm_serp_source", null);
                        if (AbstractC85443rZ.A02(queryParameter)) {
                            str = "search_result";
                        }
                        bundle2.putString("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER", str);
                        v0v.setArguments(bundle2);
                    }
                    c140966Yy.A0D(v0v);
                    c140966Yy.A04();
                    i = -1144119084;
                }
            }
            finish();
            i = -1144119084;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
