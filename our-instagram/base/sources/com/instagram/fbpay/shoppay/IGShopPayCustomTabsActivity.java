package com.instagram.fbpay.shoppay;

import X.C14360o3;
import android.content.Intent;
import com.fbpay.customtabs.CustomTabsActivity;

/* loaded from: classes10.dex */
public final class IGShopPayCustomTabsActivity extends CustomTabsActivity {
    @Override // com.fbpay.customtabs.CustomTabsActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        intent.setAction("action_custom_tab_redirect");
        super.onNewIntent(intent);
    }
}
