package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;

/* renamed from: X.0fM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fM {
    public static void A01(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        if (intent != null) {
            C14360o3.A0B(context, 2);
            if (C08770cf.A00 == null) {
                try {
                    ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, broadcastReceiver.getClass()), 128);
                    C14360o3.A07(receiverInfo);
                    if (((ComponentInfo) receiverInfo).enabled && C08770cf.A00 == null) {
                        C08770cf.A00 = intent;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void A00(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null && C08770cf.A00 == null) {
            try {
                ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 128);
                C14360o3.A07(activityInfo);
                if (((ComponentInfo) activityInfo).enabled && C08770cf.A00 == null) {
                    C08770cf.A00 = intent;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
