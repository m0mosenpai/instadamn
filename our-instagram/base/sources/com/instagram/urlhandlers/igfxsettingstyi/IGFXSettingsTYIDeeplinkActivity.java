package com.instagram.urlhandlers.igfxsettingstyi;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC191768eY;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C34397FEn;
import X.C35205Ffx;
import X.C65981Txa;
import X.C66277U6x;
import X.U6G;
import X.U6H;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class IGFXSettingsTYIDeeplinkActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(93828658);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -202218397;
        } else {
            C09Y c09y = C023409i.A0A;
            AbstractC18680vv A04 = c09y.A04(A07);
            this.A00 = A04;
            if (A04 == null) {
                finish();
                i = 1897028252;
            } else if (!(A04 instanceof UserSession)) {
                AbstractC35178FfV.A00().A00(this, A07, this.A00);
                i = 1520708368;
            } else {
                Intent intent = getIntent();
                HashMap A1G = AbstractC166987dD.A1G();
                if (intent.hasExtra(CacheBehaviorLogger.SOURCE)) {
                    A1G.put(CacheBehaviorLogger.SOURCE, intent.getStringExtra(CacheBehaviorLogger.SOURCE));
                }
                if (intent.hasExtra("import_service")) {
                    A1G.put("import_service", intent.getStringExtra("import_service"));
                }
                A1G.put("surface", "STANDALONE_IG");
                HashMap A1G2 = AbstractC166987dD.A1G();
                A1G2.put("should_dismiss", AbstractC166997dE.A0b());
                A1G2.put("deeplink_params", A1G);
                HashMap A01 = AbstractC191768eY.A01(A1G2);
                C35205Ffx c35205Ffx = new C35205Ffx();
                c35205Ffx.A02 = U6G.A05;
                c35205Ffx.A03 = U6H.A08;
                C65981Txa A012 = C35205Ffx.A01(c35205Ffx, this, 6);
                IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(c09y.A06(A07)).A00;
                igBloksScreenConfig.A0R = "com.bloks.www.fx.settings.tyi.home_page";
                igBloksScreenConfig.A0C = A012;
                C66277U6x.A02("com.bloks.www.fx.settings.tyi.home_page", A01, Collections.emptyMap()).A06(this, igBloksScreenConfig);
                i = 1058637553;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
