package com.instagram.urlhandlers.messagingadinspiration;

import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class MessagingAdInspirationUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (getSupportFragmentManager().A0U.A04().isEmpty()) {
            finish();
        }
    }
}
