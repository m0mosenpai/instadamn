package com.instagram.urlhandlers.updatepayment;

import X.AbstractC12990ll;
import X.AbstractC1566271k;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class UpdatePaymentUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(1059763919);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        C09Y c09y = C023409i.A0A;
        C14360o3.A0A(A08);
        AbstractC18680vv A04 = c09y.A04(A08);
        this.A00 = A04;
        AbstractC31171DnF.A1Q(A04);
        AbstractC1566271k.A0G(this, (UserSession) A04, intent.getStringExtra("order_id"));
        C0f9.A07(-172755301, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
