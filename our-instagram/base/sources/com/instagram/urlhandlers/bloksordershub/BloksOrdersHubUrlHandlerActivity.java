package com.instagram.urlhandlers.bloksordershub;

import X.AbstractC12990ll;
import X.AbstractC1566271k;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.C0f9;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class BloksOrdersHubUrlHandlerActivity extends BaseFragmentActivity {
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
        UserSession userSession;
        int A00 = C0f9.A00(890632314);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        if (A08 != null) {
            userSession = AbstractC31171DnF.A0G(A08);
            this.A00 = userSession;
        } else {
            userSession = null;
        }
        String stringExtra = intent.getStringExtra("referrer_surface");
        String stringExtra2 = intent.getStringExtra("additional_logging_data");
        String stringExtra3 = intent.getStringExtra("deeplink_destination");
        String stringExtra4 = intent.getStringExtra("deeplink_destination_params");
        if (userSession != null) {
            AbstractC1566271k.A0K(this, userSession, stringExtra, stringExtra2, stringExtra3, stringExtra4);
        }
        C0f9.A07(1300214731, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
