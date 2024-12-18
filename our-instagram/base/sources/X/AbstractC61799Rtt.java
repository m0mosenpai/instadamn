package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.Rtt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61799Rtt {
    public static void A00(Intent intent, Context context) {
        if (intent != null && "com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IS_MANAGED_APP_CHANGED".equals(intent.getAction())) {
            try {
                C63208SfC.A00(context).A02();
            } catch (IllegalStateException | SecurityException e) {
                android.util.Log.e("IsManagedAppCacheService", "onHandleIntent() isManagedForceQuery failed", e);
            }
        }
    }
}
