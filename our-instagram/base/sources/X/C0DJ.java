package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* renamed from: X.0DJ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0DJ {
    public static final Intent A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(intentFilter, 2);
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static final void A01(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(broadcastReceiver, 1);
        C14360o3.A0B(intentFilter, 2);
        context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }

    public static final void A02(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler, String str, boolean z) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(broadcastReceiver, 1);
        C14360o3.A0B(intentFilter, 2);
        if (Build.VERSION.SDK_INT >= 34) {
            C0DI.A00(broadcastReceiver, context, intentFilter, handler, str, z);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        }
    }

    public static final void A03(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, boolean z) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(intentFilter, 2);
        if (Build.VERSION.SDK_INT >= 34) {
            C0DI.A01(broadcastReceiver, context, intentFilter, z);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
