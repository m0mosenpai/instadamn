package com.instagram.urlhandlers.promotepaymentstatus;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC27401Ut;
import X.AbstractC31172DnG;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C17060sy;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class PromotePaymentStatusUrlHandlerActivity extends BaseFragmentActivity {
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
        double d;
        int i;
        int A00 = C0f9.A00(68156686);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        if (A08 != null) {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A08);
            this.A00 = A0V;
            String stringExtra = intent.getStringExtra("account");
            String stringExtra2 = intent.getStringExtra("contextID");
            String stringExtra3 = intent.getStringExtra("paymentID");
            A08.putString("account", stringExtra);
            A08.putString("contextID", stringExtra2);
            A08.putString("paymentID", stringExtra3);
            String stringExtra4 = intent.getStringExtra("originRootTag");
            if (stringExtra4 != null && stringExtra4.length() != 0) {
                d = Double.parseDouble(stringExtra4);
            } else {
                d = 0.0d;
            }
            A08.putDouble("originRootTag", d);
            if ((A0V instanceof UserSession) && C17060sy.A01.A01((UserSession) A0V).A1J()) {
                finish();
                AbstractC27401Ut.getInstance().navigateToReactNativeApp(A0V, "AdsPaymentsPrepayPaymentStatusRoute", A08);
                i = -4390570;
            } else {
                AbstractC35178FfV.A01(this, A08, A0V);
                i = -241370319;
            }
            C0f9.A07(i, A00);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A07(1705685707, A00);
        throw A0g;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
