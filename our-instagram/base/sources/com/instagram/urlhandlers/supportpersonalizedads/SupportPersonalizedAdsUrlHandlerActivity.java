package com.instagram.urlhandlers.supportpersonalizedads;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC192798gL;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC59962oe;
import X.C06N;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C192108fB;
import X.C1GJ;
import X.C32392EOt;
import X.C35756Fqt;
import X.C62862tP;
import X.InterfaceC11380iw;
import X.MSV;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class SupportPersonalizedAdsUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public AbstractC18680vv A00;
    public final C06N A01 = new C35756Fqt(this, 33);

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "spa_deep_link_handler_activity";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1198351854);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        if (A08 != null) {
            this.A00 = AbstractC31172DnG.A0V(A08);
        }
        if (!(this.A00 instanceof UserSession)) {
            SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, true, true, false, false, false, AbstractC166997dE.A0q(getApplicationContext().getResources(), 2131962236), "https://fb.com/deservetobefound");
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable(MSV.A00(2), simpleWebViewConfig);
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            abstractC59962oe.setArguments(A0b);
            C140966Yy A0r = AbstractC25225BEi.A0r(this, this.A00);
            A0r.A0D = false;
            A0r.A0B(null, abstractC59962oe);
            A0r.A04();
        } else {
            getSupportFragmentManager().A0r(this.A01);
            String stringExtra = intent.getStringExtra("entryPoint");
            AbstractC18680vv abstractC18680vv = this.A00;
            C14360o3.A0A(abstractC18680vv);
            C62862tP A01 = C62862tP.A01(null, this, this, abstractC18680vv);
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, stringExtra);
            AbstractC18680vv abstractC18680vv2 = this.A00;
            C14360o3.A0A(abstractC18680vv2);
            AbstractC192798gL A05 = C192108fB.A05(abstractC18680vv2, "com.instagram.ads.spa.components.hub.business_spa_hub.main_screen_action", A1G);
            C32392EOt.A00(A05, A01, 21);
            C1GJ.A03(A05);
        }
        C0f9.A07(-1864294748, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
