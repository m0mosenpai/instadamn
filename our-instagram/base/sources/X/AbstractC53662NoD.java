package X;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: X.NoD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53662NoD {
    public static boolean A00() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return AbstractC167007dF.A1P(runningAppProcessInfo.importance, 100);
    }
}
