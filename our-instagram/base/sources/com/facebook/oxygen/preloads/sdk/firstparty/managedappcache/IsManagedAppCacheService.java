package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.AbstractC61799Rtt;
import android.app.IntentService;
import android.content.Intent;

/* loaded from: classes10.dex */
public class IsManagedAppCacheService extends IntentService {
    public IsManagedAppCacheService() {
        super("IsManagedAppCacheService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        AbstractC61799Rtt.A00(intent, this);
    }
}
