package X;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;

/* renamed from: X.0Al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC02620Al {
    public static boolean A00(AlarmManager alarmManager, Context context) {
        boolean z = false;
        if (context.getApplicationInfo().targetSdkVersion > 30) {
            z = true;
        }
        boolean z2 = false;
        if (Build.VERSION.SDK_INT > 30) {
            z2 = true;
        }
        if (!z || !z2) {
            return true;
        }
        try {
            return alarmManager.canScheduleExactAlarms();
        } catch (RuntimeException e) {
            C0K8.A0G("AndroidCompat", "failed to check canScheduleExactAlarms. Reverting to false", e);
            return false;
        }
    }
}
