package com.instagram.urlhandlers.bloksaccountsetuppromodedeeplink;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31179DnN;
import X.AbstractC35178FfV;
import X.AbstractC35275FhA;
import X.C0K8;
import X.C0f9;
import X.C35971FuV;
import X.FTf;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class BloksAccountSetupPromodeDeeplinkHandler extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A08;
        HashMap A01;
        int A00 = C0f9.A00(1200807747);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            AbstractC18680vv session = getSession();
            if (session != null) {
                if (!(session instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A08, session);
                    finish();
                    i = -1278461480;
                } else {
                    String A0a = AbstractC31171DnF.A0a(A08);
                    if (A0a == null) {
                        finish();
                        i = -496337092;
                    } else {
                        UserSession userSession = (UserSession) session;
                        String queryParameter = AbstractC25227BEk.A0B(A0a).getQueryParameter("params");
                        if (queryParameter != null) {
                            try {
                                A01 = FTf.A01(userSession, queryParameter);
                            } catch (IOException e) {
                                C0K8.A0F("BloksAccountSetupPromodeDeeplinkHandler", "IOException while parseParams()", e);
                            }
                            AbstractC35275FhA.A0D(this, new C35971FuV(), userSession, "com.bloks.www.ig.ccp_onboarding.promode_upsell_deeplink.action", "BloksAccountSetupPromodeDeeplinkHandler", A01);
                        }
                        A01 = null;
                        AbstractC35275FhA.A0D(this, new C35971FuV(), userSession, "com.bloks.www.ig.ccp_onboarding.promode_upsell_deeplink.action", "BloksAccountSetupPromodeDeeplinkHandler", A01);
                    }
                }
            }
            finish();
            i = -376049037;
        } else {
            finish();
            i = -314286433;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31179DnN.A0J(this);
    }
}