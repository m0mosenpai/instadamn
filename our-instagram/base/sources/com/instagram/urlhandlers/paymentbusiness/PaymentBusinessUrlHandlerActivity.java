package com.instagram.urlhandlers.paymentbusiness;

import X.AbstractC001900j;
import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31180DnO;
import X.AbstractC31198Dnh;
import X.AbstractC58317Pt9;
import X.AbstractC58442PvL;
import X.AbstractC61636Rr0;
import X.AbstractC65703TsZ;
import X.C023409i;
import X.C09530e4;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C2FP;
import X.C2GC;
import X.SNK;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebookpay.msc.logging.LoggingData;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class PaymentBusinessUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        Bundle bundle;
        C09Y c09y = C023409i.A0A;
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getBundleExtra(AbstractC58317Pt9.A00(21));
        } else {
            bundle = null;
        }
        return c09y.A07(bundle);
    }

    public static final void A00(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        C2GC c2gc = C2FP.A02().A01;
        HashMap hashMap = new HashMap();
        hashMap.put("view_name", "deeplink");
        hashMap.put(AbstractC31198Dnh.A00(), str);
        hashMap.put("is_valid", Boolean.valueOf(z));
        AbstractC65703TsZ.A1O("target_url", str2, str3, hashMap);
        if (str4 != null) {
            hashMap.put("ref", str4);
        }
        if (str5 != null) {
            hashMap.put("financial_entity_id", str5);
        }
        if (str6 != null) {
            hashMap.put("managed_merchant_account_id", str6);
        }
        c2gc.Chz("client_load_payouthub_init", hashMap);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A00;
        Bundle bundleExtra;
        String string;
        Bundle bundle2;
        C09530e4 c09530e4;
        int A002 = C0f9.A00(464339753);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -316777352;
        } else {
            Intent intent = getIntent();
            if (intent != null && (bundleExtra = intent.getBundleExtra((A00 = AbstractC58317Pt9.A00(21)))) != null && (string = bundleExtra.getString("original_url")) != null && string.length() != 0) {
                Uri A03 = AbstractC08820cl.A03(string);
                C14360o3.A07(A03);
                C09Y c09y = C023409i.A0A;
                Intent intent2 = getIntent();
                if (intent2 != null) {
                    bundle2 = intent2.getBundleExtra(A00);
                } else {
                    bundle2 = null;
                }
                UserSession A07 = c09y.A07(bundle2);
                String queryParameter = A03.getQueryParameter("page");
                String queryParameter2 = A03.getQueryParameter(AbstractC31198Dnh.A00());
                if (queryParameter2 == null) {
                    queryParameter2 = AbstractC58442PvL.A02();
                }
                String queryParameter3 = A03.getQueryParameter("financial_entity_id");
                String queryParameter4 = A03.getQueryParameter("managed_merchant_account_id");
                String queryParameter5 = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String queryParameter6 = A03.getQueryParameter("referrer");
                if (C14360o3.A0K(queryParameter, "payout_details")) {
                    c09530e4 = new C09530e4("payout_details_v2_fragment", "payout_details");
                } else if (!C14360o3.A0K(queryParameter, "home") && queryParameter != null) {
                    c09530e4 = new C09530e4(null, null);
                } else {
                    c09530e4 = new C09530e4("home_fragment", "overview");
                }
                String str = (String) c09530e4.A00;
                String str2 = (String) c09530e4.A01;
                if (str != null && !AbstractC001900j.A0T(str)) {
                    Fragment A003 = ((SNK) C2FP.A02().A02.get()).A00(AbstractC61636Rr0.A00(new C09530e4("payout_release_id", queryParameter5), new C09530e4("financial_entity_id", queryParameter3), new C09530e4("managed_merchant_account_id", queryParameter4), new C09530e4("logging_data", new LoggingData(queryParameter2)), new C09530e4("referrer", queryParameter6)), str);
                    if (A003 != null) {
                        A00(queryParameter2, AbstractC166987dD.A19(A03), str2, queryParameter6, queryParameter3, true, queryParameter4);
                        C140966Yy A0C = AbstractC31180DnO.A0C(this, A07);
                        A0C.A0B(null, A003);
                        A0C.A04();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    A00(queryParameter2, AbstractC166987dD.A19(A03), null, null, null, false, null);
                    finish();
                }
                i = -586449201;
            } else {
                finish();
                A00(AbstractC58442PvL.A02(), "", null, null, null, false, null);
                i = -1174127728;
            }
        }
        C0f9.A07(i, A002);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        Bundle bundle;
        C09Y c09y = C023409i.A0A;
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getBundleExtra(AbstractC58317Pt9.A00(21));
        } else {
            bundle = null;
        }
        return c09y.A07(bundle);
    }
}
