package com.instagram.caa.registration.transition;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC191768eY;
import X.AbstractC25233BEq;
import X.AbstractC31172DnG;
import X.AbstractC31190DnZ;
import X.C023409i;
import X.C09530e4;
import X.C102874kO;
import X.C14360o3;
import X.C16030qx;
import X.C19T;
import X.C34397FEn;
import X.C35205Ffx;
import X.C65981Txa;
import X.C66277U6x;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CaaRegTransitionScreenActivity extends BaseFragmentActivity {
    public UserSession A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        try {
            UserSession A08 = C023409i.A0A.A08(this);
            this.A00 = A08;
            Intent intent = getIntent();
            C14360o3.A07(intent);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = AbstractC166987dD.A0b();
            }
            C09530e4 A1L = AbstractC166987dD.A1L("flow_name", extras.getString("flow_name"));
            Intent intent2 = getIntent();
            C14360o3.A07(intent2);
            Bundle extras2 = intent2.getExtras();
            if (extras2 == null) {
                extras2 = AbstractC166987dD.A0b();
            }
            String A19 = AbstractC166987dD.A19(new JSONObject(AbstractC25233BEq.A0p("flow_type", extras2.getString("flow_type"), A1L)));
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("flow_info", A19);
            A1G.put("family_device_id", AbstractC31172DnG.A0P(A08).A02(C19T.A1P));
            A1G.put(AbstractC31190DnZ.A01(0, 9, 31), C16030qx.A00(this));
            A1G.put("qe_device_id", C16030qx.A02.A04(this));
            C65981Txa A01 = C35205Ffx.A01(C35205Ffx.A00(), this, 3);
            IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(A08).A00;
            igBloksScreenConfig.A0R = "com.bloks.www.bloks.caa.reg.transition";
            igBloksScreenConfig.A0C = A01;
            C102874kO c102874kO = new C102874kO(13784);
            c102874kO.A0Q(45, "bloks.caa.reg.transition");
            C66277U6x A012 = C66277U6x.A01("com.bloks.www.bloks.caa.reg.transition", AbstractC191768eY.A01(A1G));
            A012.A00 = 719983200;
            c102874kO.A0P();
            A012.A03 = c102874kO;
            A012.A06 = "bloks.caa.reg.transition";
            A012.A06(this, igBloksScreenConfig);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}
