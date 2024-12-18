package com.instagram.urlhandlers.professionaldashboardexternal;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC35275FhA;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ProfessionalDashboardExternalUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int A00 = C0f9.A00(-152613700);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (!AbstractC31172DnG.A1Y(this)) {
            AbstractC35178FfV.A03(A07, this);
        } else {
            HashMap A1G = AbstractC166987dD.A1G();
            Intent intent = getIntent();
            if (intent == null || (str = intent.getStringExtra("origin")) == null || str.length() == 0) {
                str = "deep_link";
            }
            A1G.put("origin", str);
            AbstractC35275FhA.A0E(this, getSession(), A1G);
        }
        C0f9.A07(183218028, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
