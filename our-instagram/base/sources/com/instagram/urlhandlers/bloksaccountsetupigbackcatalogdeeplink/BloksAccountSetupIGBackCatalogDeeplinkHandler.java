package com.instagram.urlhandlers.bloksaccountsetupigbackcatalogdeeplink;

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
import X.C35970FuU;
import X.FTf;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class BloksAccountSetupIGBackCatalogDeeplinkHandler extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-72525554);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            AbstractC18680vv session = getSession();
            if (session != null) {
                if (!(session instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A08, session);
                    finish();
                    i = 2042998312;
                } else {
                    String A0a = AbstractC31171DnF.A0a(A08);
                    if (A0a == null) {
                        finish();
                        i = 1381891047;
                    } else {
                        UserSession userSession = (UserSession) session;
                        String queryParameter = AbstractC25227BEk.A0B(A0a).getQueryParameter("params");
                        if (queryParameter != null) {
                            try {
                                A01 = FTf.A01(userSession, queryParameter);
                            } catch (IOException e) {
                                C0K8.A0F("BloksAccountSetupIGBackCatalogDeeplinkHandler", "IOException while parseParams()", e);
                            }
                            AbstractC35275FhA.A0D(this, new C35970FuU(), userSession, "com.bloks.www.ig.ccp_onboarding.account_setup_ig_back_catalog_landing_page_launcher", "BloksAccountSetupIGBackCatalogDeeplinkHandler", A01);
                        }
                        A01 = null;
                        AbstractC35275FhA.A0D(this, new C35970FuU(), userSession, "com.bloks.www.ig.ccp_onboarding.account_setup_ig_back_catalog_landing_page_launcher", "BloksAccountSetupIGBackCatalogDeeplinkHandler", A01);
                    }
                }
            }
            finish();
            i = -438810386;
        } else {
            finish();
            i = 1118799131;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31179DnN.A0J(this);
    }
}