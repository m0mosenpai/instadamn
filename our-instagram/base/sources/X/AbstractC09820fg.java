package X;

import android.os.PowerManager;

/* renamed from: X.0fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09820fg {
    public static void A02(PowerManager.WakeLock wakeLock) {
        wakeLock.setReferenceCounted(false);
        C05650Rp c05650Rp = C0BX.A00;
        synchronized (c05650Rp) {
            C0CB c0cb = (C0CB) c05650Rp.A06.get(wakeLock);
            if (c0cb == null) {
                android.util.Log.e("WakeLockMetricsCollector", "Unknown wakelock modified", null);
            } else {
                c0cb.A06 = false;
            }
        }
    }

    public static void A00(PowerManager.WakeLock wakeLock) {
        wakeLock.acquire();
        C0BX.A01(wakeLock, -1L);
    }

    public static void A01(PowerManager.WakeLock wakeLock) {
        wakeLock.release();
        C0BX.A00(wakeLock);
    }
}
