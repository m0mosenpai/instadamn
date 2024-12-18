package com.instagram.urlhandlers.adspaynow;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC35178FfV;
import X.AbstractC70398WUa;
import X.C0f9;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class AdsPayNowUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(602079204);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        if (A08 != null) {
            this.A00 = AbstractC31172DnG.A0V(A08);
        }
        String stringExtra = intent.getStringExtra("adAccountID");
        if (A08 != null) {
            A08.putString(AbstractC111324zv.A00(5046), stringExtra);
            A08.putString("entryPoint", "instagram");
        }
        AbstractC18680vv abstractC18680vv = this.A00;
        if (!(abstractC18680vv instanceof UserSession)) {
            if (abstractC18680vv != null) {
                AbstractC35178FfV.A01(this, A08, abstractC18680vv);
            }
        } else if (stringExtra != null && stringExtra.length() != 0) {
            AbstractC70398WUa.A01(this, (UserSession) abstractC18680vv, stringExtra, null);
        }
        C0f9.A07(-1087055987, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
