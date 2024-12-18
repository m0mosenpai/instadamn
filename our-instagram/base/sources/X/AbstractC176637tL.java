package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.7tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176637tL {
    public static final int A00(Context context, boolean z) {
        long j;
        C14360o3.A0B(context, 0);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object systemService = context.getSystemService("activity");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        try {
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            if (z) {
                j = memoryInfo.totalMem;
            } else {
                j = memoryInfo.availMem;
            }
            return (int) (j / 1048576);
        } catch (NullPointerException unused) {
            return -1;
        }
    }

    public static final boolean A01(Context context) {
        C14360o3.A0B(context, 0);
        try {
            Object systemService = context.getSystemService("power");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager powerManager = (PowerManager) systemService;
            boolean z = false;
            if (powerManager.isPowerSaveMode()) {
                z = true;
            }
            boolean z2 = false;
            if (powerManager.isIgnoringBatteryOptimizations(context.getPackageName())) {
                z2 = true;
            }
            if (!z || z2) {
                return false;
            }
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
