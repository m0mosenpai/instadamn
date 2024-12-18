package com.instagram.urlhandlers.zeroheadersextrig;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC19750y3;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.C0f9;
import X.C210679Tk;
import X.C9GR;
import X.InterfaceC19610xo;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.tigon.interceptors.zeroheadersdogfoodinterceptor.ZeroHeadersDogfoodRequestInterceptor;

/* loaded from: classes9.dex */
public final class ZeroHeadersExtrigUrlHandlerActivity extends BaseFragmentActivity {
    public final AbstractC18680vv A00 = AbstractC31171DnF.A0F(this);

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String string;
        Uri A03;
        int A00 = C0f9.A00(1006880913);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null || (string = A07.getString("original_url")) == null || (A03 = AbstractC08820cl.A03(string)) == null || (str = A03.getQueryParameter("dogfood_id")) == null) {
            str = "";
        }
        InterfaceC19610xo ARD = AbstractC19750y3.A01(ZeroHeadersDogfoodRequestInterceptor.PREF_ZERO_HEADERS_DOGFOODING).ARD();
        ARD.E7K(ZeroHeadersDogfoodRequestInterceptor.ZERO_HEADERS_DOGFOOD_ID, str);
        ARD.commit();
        if (str.length() > 0) {
            str2 = "Headers Dogfooding Enabled";
        } else {
            str2 = "Headers Dogfooding Disabled";
        }
        C210679Tk A02 = C9GR.A02(this.A00.getDeviceSession().A06(), str2, null, 1);
        if (A02 != null) {
            A02.show();
        }
        finish();
        C0f9.A07(-1184440653, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
