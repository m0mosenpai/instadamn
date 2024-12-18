package com.instagram.urlhandlers.payouthub;

import X.AbstractC104314mu;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC34279F9z;
import X.AbstractC53973Ntk;
import X.C0f9;
import X.C140966Yy;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class PayoutHubUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        UserMonetizationProductType userMonetizationProductType;
        int i;
        int A00 = C0f9.A00(-883668819);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 1505011486;
        } else {
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                finish();
                i = 416054233;
            } else {
                this.A00 = AbstractC31172DnG.A0V(A07);
                Uri A0B = AbstractC25227BEk.A0B(A0a);
                AbstractC18680vv abstractC18680vv = this.A00;
                String queryParameter = A0B.getQueryParameter("monetization_type");
                String A12 = AbstractC31172DnG.A12(A0B);
                String queryParameter2 = A0B.getQueryParameter("upl_session_id");
                String queryParameter3 = A0B.getQueryParameter("financial_entity_id");
                if (queryParameter != null) {
                    userMonetizationProductType = AbstractC104314mu.A00(queryParameter);
                } else {
                    userMonetizationProductType = null;
                }
                C140966Yy A0C = AbstractC31180DnO.A0C(this, abstractC18680vv);
                if (abstractC18680vv != null) {
                    A0C.A0B(null, AbstractC53973Ntk.A00(userMonetizationProductType, AbstractC34279F9z.A00(A12), queryParameter3, queryParameter2));
                    A0C.A04();
                    i = 727646448;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
