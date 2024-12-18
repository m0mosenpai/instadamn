package com.instagram.urlhandlers.serviceshopxma;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ServiceShopXMAUrlHandlerActivity extends BaseFragmentActivity {
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
        Bundle A08;
        int A00 = C0f9.A00(-1161881457);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            String A0a = AbstractC31171DnF.A0a(A08);
            if (A0a != null && A0a.length() != 0) {
                Uri A0B = AbstractC25227BEk.A0B(A0a);
                if (AbstractC31174DnI.A04(A0B) == 2 && C14360o3.A0K(A0B.getPathSegments().get(1), "service_details_page")) {
                    HashMap A1G = AbstractC166987dD.A1G();
                    AbstractC31180DnO.A15(A0B, "service_id", A1G);
                    AbstractC31180DnO.A15(A0B, "referrer_ui_surface", A1G);
                    AbstractC31180DnO.A15(A0B, "referrer_ui_component", A1G);
                    AbstractC18680vv session = getSession();
                    C140966Yy A0P = AbstractC31173DnH.A0P(this, session);
                    A0P.A0D = false;
                    A0P.A0D(AbstractC31180DnO.A0G(session, "com.bloks.www.service.buyer.service-details-page", A1G));
                    A0P.A04();
                    i = 469404682;
                }
            }
            finish();
            i = 469404682;
        } else {
            finish();
            i = -466833547;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
