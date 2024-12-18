package com.instagram.urlhandlers.professionalsignupexternal;

import X.AbstractC03240Dh;
import X.AbstractC12990ll;
import X.AbstractC155756z4;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.C0f9;
import X.C12260kU;
import X.C1QE;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes6.dex */
public final class ProfessionalSignUpExternalUrlHandlerActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(999364440);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        if (A08 != null) {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A08);
            this.A00 = A0V;
            String stringExtra = intent.getStringExtra("entry_ref");
            String stringExtra2 = intent.getStringExtra("account_id");
            String stringExtra3 = intent.getStringExtra("fb_page_id");
            String stringExtra4 = intent.getStringExtra("user_type");
            AbstractC155756z4.A00();
            Intent A082 = AbstractC31173DnH.A08(this);
            if (stringExtra == null) {
                stringExtra = "deep_link";
            }
            AbstractC03240Dh.A00(A08, A0V);
            C1QE.A01("business_conversion_flow").A08();
            AbstractC31171DnF.A13(A08, stringExtra);
            A08.putInt("business_account_flow", 7);
            A08.putString("account_id", stringExtra2);
            A08.putString("user_type", stringExtra4);
            A08.putString("upsell_page_id", stringExtra3);
            A082.putExtras(A08);
            C12260kU.A08(this, A082, 12);
        }
        finish();
        C0f9.A07(1626889403, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
