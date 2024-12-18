package com.instagram.urlhandlers.playstore;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC14490oL;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.C0f9;
import X.InterfaceC08100bW;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.List;

/* loaded from: classes10.dex */
public final class PlayStoreUrlHandlerActivity extends BaseFragmentActivity {
    public final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A1I;
        int A00 = C0f9.A00(-181752981);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            finish();
            i = 1413808573;
        } else {
            String string = bundleExtra.getString("original_url");
            if (string == null) {
                finish();
                i = -1652316878;
            } else {
                Uri A002 = AbstractC08820cl.A00(this.A00, string);
                if (A002 != null && A002.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID) != null) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("app_id", A002.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                    String queryParameter = A002.getQueryParameter("referrer");
                    if (queryParameter != null) {
                        List A0h = AbstractC31175DnJ.A0h(queryParameter, "\\W+");
                        if (A0h.size() >= 2 && (A1I = AbstractC25226BEj.A1I(A0h, 0)) != null && A1I.equalsIgnoreCase("utm_source")) {
                            A0b.putString(CacheBehaviorLogger.SOURCE, AbstractC25226BEj.A1I(A0h, 1));
                        }
                    }
                    AbstractC14490oL.A07(this, A0b.getString("app_id"), A0b.getString(CacheBehaviorLogger.SOURCE));
                    finish();
                    i = 967076366;
                } else {
                    finish();
                    i = 1569018623;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
