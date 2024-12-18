package com.instagram.urlhandlers.billingwizard;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC70398WUa;
import X.AnonymousClass001;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C18950wb;
import X.C70623We1;
import X.W6f;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class BillingWizardUrlHandlerActivity extends BaseFragmentActivity {
    public static final void A00(BillingWizardUrlHandlerActivity billingWizardUrlHandlerActivity, String str, String str2, String str3, String str4) {
        if (str != null && str.length() != 0 && str3 != null && str3.length() != 0) {
            AbstractC18680vv session = billingWizardUrlHandlerActivity.getSession();
            C14360o3.A0C(session, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            AbstractC70398WUa.A02(billingWizardUrlHandlerActivity, (UserSession) session, str, str3, null, null, str2, str4, true);
            billingWizardUrlHandlerActivity.A0a();
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-1706077397);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -2119690280;
        } else if (!(getSession() instanceof UserSession)) {
            AbstractC35178FfV.A00().A00(this, A07, getSession());
            finish();
            i = -666936813;
        } else {
            String string = A07.getString("original_url");
            if (string != null && string.length() != 0) {
                Uri A03 = AbstractC08820cl.A03(string);
                C14360o3.A07(A03);
                try {
                    AbstractC08820cl.A03(string);
                    String queryParameter = A03.getQueryParameter("paymentAccountID");
                    String queryParameter2 = A03.getQueryParameter("placement");
                    String queryParameter3 = A03.getQueryParameter("wizardName");
                    AbstractC18680vv session = getSession();
                    C14360o3.A0C(session, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
                    W6f.A00(this, new C70623We1(this, queryParameter, queryParameter2, queryParameter3), (UserSession) session);
                    i = -228050117;
                } catch (Exception e) {
                    AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A0u("BillingWizardUrlHandlerActivity: Exception: ", e.getMessage(), " when parsing uri: ", string), 817897458);
                    finish();
                    i = -643056211;
                }
            } else {
                finish();
                i = 322825440;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
