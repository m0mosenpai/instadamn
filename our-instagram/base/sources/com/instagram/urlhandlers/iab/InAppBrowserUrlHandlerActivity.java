package com.instagram.urlhandlers.iab;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.C0f9;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class InAppBrowserUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(80980179);
        super.onCreate(bundle);
        finish();
        C0f9.A07(-2001068107, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
