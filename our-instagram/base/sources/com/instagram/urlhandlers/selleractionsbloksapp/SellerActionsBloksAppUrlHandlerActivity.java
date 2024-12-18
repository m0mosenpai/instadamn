package com.instagram.urlhandlers.selleractionsbloksapp;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C06N;
import X.C07950bF;
import X.C09Y;
import X.C0K8;
import X.C0f9;
import X.C140966Yy;
import X.C35756Fqt;
import X.C72743Nv;
import X.FTf;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class SellerActionsBloksAppUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;
    public UserSession A01;
    public final C06N A02 = new C35756Fqt(this, 27);

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
        AbstractC18680vv abstractC18680vv;
        int A00 = C0f9.A00(1609628641);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -99187986;
        } else {
            C09Y c09y = C023409i.A0A;
            this.A00 = c09y.A04(A07);
            getIntent();
            AbstractC18680vv abstractC18680vv2 = this.A00;
            if (abstractC18680vv2 == null) {
                finish();
                i = -415405202;
            } else if (!(abstractC18680vv2 instanceof UserSession)) {
                AbstractC35178FfV.A00().A00(this, A07, this.A00);
                i = -1612312075;
            } else {
                this.A01 = c09y.A06(A07);
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = -2010016789;
                } else {
                    getSupportFragmentManager().A0r(this.A02);
                    Uri A03 = AbstractC08820cl.A03(A0a);
                    String queryParameter = A03.getQueryParameter("bloks_app_id");
                    String queryParameter2 = A03.getQueryParameter("params");
                    HashMap A1G = AbstractC166987dD.A1G();
                    UserSession userSession = this.A01;
                    if (userSession != null && queryParameter2 != null) {
                        try {
                            A1G = FTf.A00(C07950bF.A04.A01(userSession, queryParameter2));
                        } catch (IOException e) {
                            C0K8.A0F("FBShopsSellerActionsUrlHandler", "Failed to extract params from URI", e);
                        }
                    }
                    if (queryParameter != null && Arrays.asList("com.bloks.www.shops.fb_channel_enablement,com.bloks.www.bloks.commerce.creator-shop.activation.info,com.bloks.www.bloks.commerce.drops.shared-launch-details,com.bloks.www.bloks.commerce.drops.future-product-details-edit,com.bloks.www.bloks.commerce.creators-as-sellers.shop-management,com.bloks.www.bloks.commerce.creators-as-sellers.featured-products,com.bloks.www.commerce.cam.shop.management".split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)).contains(queryParameter) && A1G != null && (abstractC18680vv = this.A00) != null && this.A01 != null) {
                        C72743Nv A0G = AbstractC31180DnO.A0G(abstractC18680vv, queryParameter, A1G);
                        C140966Yy A0P = AbstractC31173DnH.A0P(this, this.A01);
                        A0P.A0D = false;
                        A0P.A0E(A0G);
                        A0P.A04();
                    } else {
                        finish();
                    }
                    i = 537902847;
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
