package com.instagram.urlhandlers.aradstestlink;

import X.AbstractC03270Dk;
import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC131165w4;
import X.AbstractC18680vv;
import X.AbstractC23641Du;
import X.AbstractC58317Pt9;
import X.AnonymousClass191;
import X.C00O;
import X.C023409i;
import X.C0f9;
import X.C0w9;
import X.C14360o3;
import X.C1Z8;
import X.C1Z9;
import X.C211339Wh;
import X.C22P;
import X.C23656Adr;
import X.C35777FrF;
import X.C68709Val;
import X.C69381VmR;
import X.C70400WUc;
import X.EnumC223239t9;
import X.InterfaceC23621Ds;
import X.LK0;
import X.MC9;
import X.VEL;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class ArAdsTestLinkUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return C023409i.A0A.A05(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        int A00 = C0f9.A00(-662436212);
        super.onCreate(bundle);
        Intent intent = getIntent();
        C14360o3.A07(intent);
        Bundle bundleExtra = intent.getBundleExtra(AbstractC58317Pt9.A00(21));
        if (bundleExtra != null && (string = bundleExtra.getString("original_url")) != null) {
            try {
                Uri A03 = AbstractC08820cl.A03(string);
                Bundle bundle2 = new Bundle();
                bundle2.putString("encoded_token", A03.getQueryParameter("encoded_token"));
                bundle2.putString("effect_id", A03.getQueryParameter("effect_id"));
                bundle2.putString("device_position", A03.getQueryParameter("device_position"));
                bundle2.putString(DatePickerDialogModule.ARG_MODE, A03.getQueryParameter(DatePickerDialogModule.ARG_MODE));
                UserSession A002 = AbstractC03270Dk.A00(C023409i.A0A.A05(this));
                String string2 = bundle2.getString("encoded_token");
                if (string2 != null) {
                    C1Z9 c1z9 = C1Z9.A03;
                    if (c1z9 == null) {
                        C14360o3.A0F("instance");
                        throw C00O.createAndThrow();
                    }
                    C22P c22p = C22P.A0P;
                    C14360o3.A0B(A002, 3);
                    C211339Wh c211339Wh = c1z9.A01;
                    if (c211339Wh == null) {
                        c211339Wh = new C211339Wh(new C35777FrF(A002));
                        c1z9.A01 = c211339Wh;
                    }
                    C69381VmR c69381VmR = new C69381VmR(this, c22p, c211339Wh, A002, string2);
                    c69381VmR.A00 = bundle2.getString("device_position");
                    c69381VmR.A01 = bundle2.getString(DatePickerDialogModule.ARG_MODE);
                    C1Z8 A003 = AbstractC131165w4.A00();
                    UserSession userSession = c69381VmR.A05;
                    Context applicationContext = c69381VmR.A02.getApplicationContext();
                    C14360o3.A07(applicationContext);
                    C23656Adr A02 = A003.A02(applicationContext, VEL.A05, new C68709Val(), userSession, "ar_ads_camera");
                    A02.A01();
                    A02.A02(EnumC223239t9.A07, "", null);
                    String str = c69381VmR.A06;
                    C211339Wh c211339Wh2 = c69381VmR.A04;
                    LK0 lk0 = new LK0();
                    AbstractC23641Du.A05(AnonymousClass191.A00, new MC9(c211339Wh2, lk0, str, (InterfaceC23621Ds) null, 9), c211339Wh2.A01);
                    lk0.A04(new C70400WUc(1, c69381VmR, A02));
                }
            } catch (IllegalArgumentException | SecurityException e) {
                C0w9.A07("ArAdsTestLinkUrlHandler", e);
            }
        }
        finish();
        C0f9.A07(1465274605, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return C023409i.A0A.A05(this);
    }
}
