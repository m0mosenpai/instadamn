package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4lB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103364lB {
    public static int A00 = -1;
    public static C103344l9 A01;
    public static Handler A02;
    public static final List A03 = new ArrayList();
    public static volatile boolean A04;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x001b, B:12:0x0043, B:14:0x0049, B:15:0x004e, B:17:0x0052, B:18:0x0070, B:23:0x0036, B:25:0x003a), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized android.os.Handler A00() {
        /*
            java.lang.Class<X.4lB> r6 = X.C103364lB.class
            monitor-enter(r6)
            r3 = 5
            X.4l9 r0 = X.C103364lB.A01     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L36
            X.09Y r5 = X.C023409i.A0A     // Catch: java.lang.Throwable -> L74
            X.0vv r2 = r5.A05(r0)     // Catch: java.lang.Throwable -> L74
            X.0Tz r4 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L74
            r0 = 36318823276681752(0x8107c700111a18, double:3.0315083121119464E-306)
            boolean r0 = X.C18U.A06(r4, r2, r0)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L36
            X.4l9 r0 = X.C103364lB.A01     // Catch: java.lang.Throwable -> L74
            X.0vv r2 = r5.A05(r0)     // Catch: java.lang.Throwable -> L74
            r0 = 36600298253324128(0x8207c700100f60, double:3.209514220749342E-306)
            long r0 = X.C18U.A01(r4, r2, r0)     // Catch: java.lang.Throwable -> L74
            int r3 = (int) r0     // Catch: java.lang.Throwable -> L74
            r0 = 1
            X.C103364lB.A04 = r0     // Catch: java.lang.Throwable -> L74
            int r1 = X.C103364lB.A00     // Catch: java.lang.Throwable -> L74
            r0 = -1
            if (r1 == r0) goto L4e
            if (r3 == r0) goto L4e
            goto L43
        L36:
            boolean r0 = X.C103364lB.A04     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L4e
            int r0 = X.C103364lB.A00     // Catch: java.lang.Throwable -> L74
            android.os.Process.setThreadPriority(r0, r3)     // Catch: java.lang.Throwable -> L74
            r0 = 0
            X.C103364lB.A04 = r0     // Catch: java.lang.Throwable -> L74
            goto L4e
        L43:
            int r0 = android.os.Process.getThreadPriority(r1)     // Catch: java.lang.Throwable -> L74
            if (r3 == r0) goto L4e
            int r0 = X.C103364lB.A00     // Catch: java.lang.Throwable -> L74
            android.os.Process.setThreadPriority(r0, r3)     // Catch: java.lang.Throwable -> L74
        L4e:
            android.os.Handler r0 = X.C103364lB.A02     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L70
            java.lang.String r0 = "BackgroundLayoutPreparer"
            android.os.HandlerThread r2 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L74
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L74
            X.AbstractC09770fa.A00(r2)     // Catch: java.lang.Throwable -> L74
            r2.start()     // Catch: java.lang.Throwable -> L74
            android.os.Looper r1 = r2.getLooper()     // Catch: java.lang.Throwable -> L74
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L74
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L74
            X.C103364lB.A02 = r0     // Catch: java.lang.Throwable -> L74
            int r0 = r2.getThreadId()     // Catch: java.lang.Throwable -> L74
            X.C103364lB.A00 = r0     // Catch: java.lang.Throwable -> L74
        L70:
            android.os.Handler r0 = X.C103364lB.A02     // Catch: java.lang.Throwable -> L74
            monitor-exit(r6)
            return r0
        L74:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103364lB.A00():android.os.Handler");
    }

    public static synchronized U4A A01(List list, int i, boolean z) {
        U4A u4a;
        synchronized (C103364lB.class) {
            Handler A002 = A00();
            List list2 = A03;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                U43 u43 = (U43) it.next();
                if (u43.A00 == i) {
                    u43.A01.A00.compareAndSet(false, true);
                }
                U4A u4a2 = u43.A01;
                if (u4a2.A00.get()) {
                    A002.removeCallbacksAndMessages(u4a2);
                    it.remove();
                }
            }
            u4a = new U4A();
            final U43 u432 = new U43(u4a, list, i, z);
            list2.add(u432);
            A002.postAtTime(new Runnable() { // from class: X.U49
                @Override // java.lang.Runnable
                public final void run() {
                    U43 u433 = U43.this;
                    u433.run();
                    synchronized (C103364lB.class) {
                        C103364lB.A03.remove(u433);
                    }
                }
            }, u4a, 0L);
        }
        return u4a;
    }
}
