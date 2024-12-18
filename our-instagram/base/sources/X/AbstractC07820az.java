package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: X.0az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07820az {
    public static void A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, boolean z) {
        if (Build.VERSION.SDK_INT >= 34 && context.getApplicationInfo().targetSdkVersion >= 34) {
            int i = 4;
            if (z) {
                i = 2;
            }
            context.registerReceiver(broadcastReceiver, intentFilter, i);
            return;
        }
        context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
