package com.instagram.urlhandlers.businesssignupexternal;

import X.AbstractC03240Dh;
import X.AbstractC12990ll;
import X.AbstractC155756z4;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC35178FfV;
import X.C00O;
import X.C0f9;
import X.C12260kU;
import X.C1QE;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes6.dex */
public final class BusinessSignUpExternalUrlHandlerActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1276462688);
        super.onCreate(bundle);
        this.A00 = AbstractC31171DnF.A0F(this);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        if (AbstractC31172DnG.A1Y(this) && A08 != null) {
            String stringExtra = intent.getStringExtra("entry_ref");
            String stringExtra2 = intent.getStringExtra("fb_user_id");
            String stringExtra3 = intent.getStringExtra("page_id");
            AbstractC155756z4.A00();
            Intent A082 = AbstractC31173DnH.A08(this);
            AbstractC18680vv session = getSession();
            AbstractC31171DnF.A1Q(session);
            AbstractC03240Dh.A00(A08, session);
            C1QE.A01("business_conversion_flow").A08();
            AbstractC31171DnF.A13(A08, stringExtra);
            A08.putInt("business_account_flow", 7);
            A08.putString("upsell_fb_user_id", stringExtra2);
            A08.putString("upsell_page_id", stringExtra3);
            A082.putExtras(A08);
            C12260kU.A08(this, A082, 12);
            finish();
        } else {
            AbstractC35178FfV.A03(A08, this);
        }
        C0f9.A07(462613051, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
