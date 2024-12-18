package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: X.0DI, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0DI {
    public static final void A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler, String str, boolean z) {
        if (context.getApplicationInfo().targetSdkVersion >= 34) {
            int i = 4;
            if (z) {
                i = 2;
            }
            context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
            return;
        }
        context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static final void A01(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, boolean z) {
        if (context.getApplicationInfo().targetSdkVersion >= 34) {
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
