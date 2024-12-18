package com.instagram.urlhandlers.igfxsettingstyi;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC191768eY;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C34397FEn;
import X.C35205Ffx;
import X.C65981Txa;
import X.U6G;
import X.U6H;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class IGFXSettingsTYIRedirectActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;
    public UserSession A01;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-586894843);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -274787082;
        } else {
            C09Y c09y = C023409i.A0A;
            AbstractC18680vv A04 = c09y.A04(A07);
            this.A00 = A04;
            if (A04 == null) {
                finish();
                i = 623684799;
            } else if (!(A04 instanceof UserSession)) {
                AbstractC35178FfV.A00().A00(this, A07, this.A00);
                i = 1446574786;
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = 361269283;
                } else {
                    Uri A03 = AbstractC08820cl.A03(A0a);
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, A03.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE));
                    A1G.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A03.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE));
                    HashMap A01 = AbstractC191768eY.A01(A1G);
                    C35205Ffx c35205Ffx = new C35205Ffx();
                    c35205Ffx.A02 = U6G.A05;
                    c35205Ffx.A03 = U6H.A06;
                    C65981Txa A012 = C35205Ffx.A01(c35205Ffx, this, 7);
                    UserSession A06 = c09y.A06(A07);
                    this.A01 = A06;
                    IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(A06).A00;
                    igBloksScreenConfig.A0R = "com.bloks.www.fx.settings.tyi.oauth_loading_page";
                    igBloksScreenConfig.A0C = A012;
                    AbstractC31180DnO.A11(this, igBloksScreenConfig, "com.bloks.www.fx.settings.tyi.oauth_loading_page", A01, Collections.emptyMap());
                    i = 1792672388;
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
