package com.instagram.urlhandlers.bloksstepup;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C66277U6x;
import X.W6d;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class BloksStepUpRouterUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A00 = C0f9.A00(941041054);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        C09Y c09y = C023409i.A0A;
        if (A08 != null) {
            UserSession A06 = c09y.A06(A08);
            this.A00 = A06;
            String stringExtra = intent.getStringExtra("flow_type");
            if (stringExtra != null) {
                String stringExtra2 = intent.getStringExtra("flow_params");
                String stringExtra3 = intent.getStringExtra("ref");
                String stringExtra4 = intent.getStringExtra("upl_session_id");
                HashMap A12 = AbstractC31174DnI.A12("flow_type", stringExtra);
                A12.put("flow_params", stringExtra2);
                A12.put("ref", stringExtra3);
                A12.put("upl_session_id", stringExtra4);
                C140966Yy A0r = AbstractC25225BEi.A0r(this, A06);
                C66277U6x A01 = C66277U6x.A01("com.bloks.www.bloks.universal_link.step_up.router", A12);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A06);
                A0C.A0U = "";
                A0r.A0D(W6d.A02(A0C, A01));
                A0r.A0D = false;
                A0r.A04();
                C0f9.A07(2001368951, A00);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1803012069;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1457067585;
        }
        C0f9.A07(i, A00);
        throw A14;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
