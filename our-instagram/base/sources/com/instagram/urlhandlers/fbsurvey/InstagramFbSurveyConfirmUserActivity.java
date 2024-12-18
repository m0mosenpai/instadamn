package com.instagram.urlhandlers.fbsurvey;

import X.AbstractC001900j;
import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AnonymousClass637;
import X.C06090Tz;
import X.C14360o3;
import X.C16920sk;
import X.C18U;
import X.C35756Fqt;
import X.C63719SsZ;
import X.C69421Vn6;
import X.S3A;
import X.VRA;
import X.WTY;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class InstagramFbSurveyConfirmUserActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        String A0a;
        super.onPostCreate(bundle);
        C35756Fqt.A00(getSupportFragmentManager(), this, 11);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
            Uri A0B = AbstractC25227BEk.A0B(A0a);
            HashMap A1G = AbstractC166987dD.A1G();
            String queryParameter = A0B.getQueryParameter("survey_fbid");
            if (queryParameter != null && S3A.A00(queryParameter) != null) {
                A1G.put("survey_fbid", queryParameter);
            }
            Iterator it = AbstractC16960so.A1Q("id1", "id2", "id3").iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                String queryParameter2 = A0B.getQueryParameter(A1B);
                if (queryParameter2 != null && !AbstractC001900j.A0T(queryParameter2)) {
                    A1G.put(A1B, queryParameter2);
                }
            }
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if (C18U.A06(C06090Tz.A05, A0F, 36323818322800248L)) {
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                BitSet A0j = AbstractC31171DnF.A0j(0);
                A1I.put("survey_fbid", A1G.get("survey_fbid"));
                A1I.put("id1", A1G.get("id1"));
                A1I.put("id2", A1G.get("id2"));
                A1I.put("id3", A1G.get("id3"));
                if (A0j.nextClearBit(0) >= 0) {
                    C16920sk c16920sk = C16920sk.A00;
                    C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                    C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.sandwich_surveys.confirm_user_screen_query", null, null, AbstractC06930Yk.A0B(A1I), c16920sk, 719983200, 0L, true);
                    WTY wty = new WTY(new C69421Vn6(null, null, null, null, getString(2131962355), null, null, false, false), null, null, null);
                    AnonymousClass637 A00 = VRA.A00(A0F, false);
                    C14360o3.A0B(A00, 1);
                    c63719SsZ.E2V(this, wty, A00);
                    return;
                }
                throw AbstractC31172DnG.A0v();
            }
            Uri.Builder path = new Uri.Builder().scheme("https").authority("www.instagram.com").path("/fbsurvey/confirm_user/");
            Iterator A14 = AbstractC166997dE.A14(A1G);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                path.appendQueryParameter(AbstractC31172DnG.A17(A1K), A1K.getValue().toString());
            }
            SimpleWebViewActivity.A02.A02(this, A0F, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, (String) null, AbstractC166987dD.A19(path.build())));
            return;
        }
        finish();
    }
}
