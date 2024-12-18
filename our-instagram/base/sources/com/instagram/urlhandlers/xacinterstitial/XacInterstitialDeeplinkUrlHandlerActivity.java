package com.instagram.urlhandlers.xacinterstitial;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C27391Ur;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public class XacInterstitialDeeplinkUrlHandlerActivity extends BaseFragmentActivity {
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
        int i;
        int A00 = C0f9.A00(225117045);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -1325885367;
        } else {
            this.A00 = AbstractC31172DnG.A0V(A07);
            String A0a = AbstractC31171DnF.A0a(A07);
            if (TextUtils.isEmpty(A0a)) {
                finish();
                i = -215932218;
            } else {
                Bundle bundle2 = null;
                try {
                    Uri A03 = AbstractC08820cl.A03(A0a);
                    if ("instagram".equalsIgnoreCase(A03.getScheme())) {
                        String queryParameter = A03.getQueryParameter("deeplink_source");
                        String queryParameter2 = A03.getQueryParameter("deeplink_campaign");
                        if (queryParameter != null && queryParameter2 != null) {
                            bundle2 = AbstractC31177DnL.A0D("deeplink_source", queryParameter, "deeplink_campaign", queryParameter2);
                        }
                    }
                } catch (SecurityException unused) {
                }
                bundle2.getClass();
                A07.putAll(bundle2);
                if (!(this.A00 instanceof UserSession)) {
                    C27391Ur A002 = AbstractC35178FfV.A00();
                    AbstractC18680vv abstractC18680vv = this.A00;
                    abstractC18680vv.getClass();
                    A002.A00(this, A07, abstractC18680vv);
                }
                i = -768411249;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
