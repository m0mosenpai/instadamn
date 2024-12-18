package com.instagram.urlhandlers.businesslinkmanagement;

import X.AbstractC03270Dk;
import X.AbstractC06930Yk;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC191768eY;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.C023409i;
import X.C09530e4;
import X.C09Y;
import X.C0f9;
import X.C102874kO;
import X.C140966Yy;
import X.C33232ElR;
import X.C34397FEn;
import X.C35205Ffx;
import X.C65981Txa;
import X.C66277U6x;
import X.U6H;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class BusinessLinkManagementUrlHandlerActivity extends BaseFragmentActivity {
    public static final C09530e4 A00 = AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "deeplink_from_fb");
    public static final C09530e4 A01 = AbstractC166987dD.A1L("link_flow_source", "instagram");

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        Bundle A08;
        C09Y c09y = C023409i.A0A;
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            return c09y.A04(A08);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        HashMap A02 = AbstractC06930Yk.A02(A00, A01);
        C35205Ffx c35205Ffx = new C35205Ffx();
        c35205Ffx.A03 = U6H.A08;
        C65981Txa A03 = c35205Ffx.A03();
        IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(getSession()).A00;
        igBloksScreenConfig.A0R = "com.bloks.www.casd_bl.business_link_management";
        igBloksScreenConfig.A0S = "CASD_BUSINESS_LINK_MANAGEMENT";
        igBloksScreenConfig.A0C = A03;
        C102874kO c102874kO = new C102874kO(13784);
        c102874kO.A0Q(45, "CASD_BUSINESS_LINK_MANAGEMENT");
        C66277U6x A022 = C66277U6x.A02("com.bloks.www.casd_bl.business_link_management", AbstractC191768eY.A01(A02), Collections.emptyMap());
        c102874kO.A0P();
        A022.A03 = c102874kO;
        A022.A06 = "CASD_BUSINESS_LINK_MANAGEMENT";
        A022.A06(this, igBloksScreenConfig);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C0f9.A00(-56009915);
        super.onCreate(bundle);
        if (AbstractC31176DnK.A07(this) != null) {
            C140966Yy A0C = AbstractC31180DnO.A0C(this, AbstractC03270Dk.A00(getSession()));
            A0C.A0D(new C33232ElR());
            A0C.A04();
            i = -670210581;
        } else {
            finish();
            i = -1736406545;
        }
        C0f9.A07(i, A002);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
