package com.instagram.wellbeing.limitedprofile.activity;

import X.AbstractC06930Yk;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC31171DnF;
import X.AbstractC31181DnP;
import X.AbstractC58327PtK;
import X.C0f9;
import X.C14240no;
import X.C66277U6x;
import X.C72743Nv;
import X.MSV;
import X.W6d;
import android.os.Bundle;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* loaded from: classes6.dex */
public final class LimitedInteractionsReminderActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        if (getSupportFragmentManager().A0O(R.id.layout_container_main) == null) {
            C66277U6x A01 = C66277U6x.A01(MSV.A00(191), AbstractC06930Yk.A02(AbstractC25229BEm.A1b("entryPoint", "reminder", AbstractC166987dD.A1L(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "3"))));
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(AbstractC31181DnP.A08(this));
            AbstractC31171DnF.A10(this, A0C, 2131965224);
            C72743Nv A02 = W6d.A02(A0C, A01);
            C14240no c14240no = new C14240no(getSupportFragmentManager());
            c14240no.A0A(A02, R.id.layout_container_main);
            c14240no.A00();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31181DnP.A08(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1174875921);
        super.onCreate(AbstractC58327PtK.A00(bundle));
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
        C0f9.A07(804179451, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC31181DnP.A08(this);
    }
}
