package X;

import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: X.0BX, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0BX {
    public static final C05650Rp A00 = new C05650Rp();

    public static final void A00(PowerManager.WakeLock wakeLock) {
        C05650Rp c05650Rp = A00;
        synchronized (c05650Rp) {
            C05650Rp.A00(c05650Rp);
            C0CB c0cb = (C0CB) c05650Rp.A06.get(wakeLock);
            if (c0cb == null) {
                android.util.Log.e("WakeLockMetricsCollector", "Unknown wakelock modified", null);
            } else if (C0CB.A00(c0cb, SystemClock.uptimeMillis())) {
                int i = c05650Rp.A00 - 1;
                c05650Rp.A00 = i;
                if (i == 0) {
                    c05650Rp.A03 += c0cb.A03 - c05650Rp.A02;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1 != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.os.PowerManager.WakeLock r7, long r8) {
        /*
            X.0Rp r5 = X.C0BX.A00
            monitor-enter(r5)
            X.C05650Rp.A00(r5)     // Catch: java.lang.Throwable -> L54
            java.util.WeakHashMap r0 = r5.A06     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r0.get(r7)     // Catch: java.lang.Throwable -> L54
            X.0CB r4 = (X.C0CB) r4     // Catch: java.lang.Throwable -> L54
            if (r4 != 0) goto L19
            java.lang.String r2 = "WakeLockMetricsCollector"
            java.lang.String r1 = "Unknown wakelock modified"
            r0 = 0
            android.util.Log.e(r2, r1, r0)     // Catch: java.lang.Throwable -> L54
            goto L52
        L19:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L54
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L26
            long r8 = r8 + r2
            r4.A04 = r8     // Catch: java.lang.Throwable -> L54
        L26:
            boolean r0 = r4.A06     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L31
            int r1 = r4.A00     // Catch: java.lang.Throwable -> L54
            int r0 = r1 + 1
            r4.A00 = r0     // Catch: java.lang.Throwable -> L54
            goto L50
        L31:
            boolean r0 = r4.A05     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L52
            r4.A01 = r2     // Catch: java.lang.Throwable -> L54
            r0 = 1
            r4.A05 = r0     // Catch: java.lang.Throwable -> L54
            int r4 = r5.A00     // Catch: java.lang.Throwable -> L54
            if (r4 != 0) goto L44
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L54
            r5.A02 = r0     // Catch: java.lang.Throwable -> L54
        L44:
            long r2 = r5.A01     // Catch: java.lang.Throwable -> L54
            r0 = 1
            long r2 = r2 + r0
            r5.A01 = r2     // Catch: java.lang.Throwable -> L54
            int r0 = r4 + 1
            r5.A00 = r0     // Catch: java.lang.Throwable -> L54
            goto L52
        L50:
            if (r1 == 0) goto L31
        L52:
            monitor-exit(r5)
            return
        L54:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0BX.A01(android.os.PowerManager$WakeLock, long):void");
    }

    public static final void A02(PowerManager.WakeLock wakeLock, String str) {
        C05650Rp c05650Rp = A00;
        synchronized (c05650Rp) {
            C0CB c0cb = new C0CB(wakeLock, str);
            c05650Rp.A06.put(wakeLock, c0cb);
            c05650Rp.A05.add(c0cb);
        }
    }
}
