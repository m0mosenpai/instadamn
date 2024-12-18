package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0k1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0k1 implements LightweightQuickPerformanceLogger {
    public final AtomicReference A00;
    public final Lock A01;
    public final Lock A02;

    public static void A01(C0k1 c0k1, Object obj, String str, TimeUnit timeUnit, int i, int i2, int i3, long j) {
        c0k1.A02(new C0YE(obj, null, str, timeUnit, i, i2, i3, j));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerOn(int i, int i2, boolean z) {
        return z;
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerOn(int i, boolean z) {
        return z;
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final EventBuilder markEventBuilder(int i, String str) {
        return new C12160kK(this, str, i, 0);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        A01(this, Boolean.TRUE, "", TimeUnit.MILLISECONDS, 0, i, 0, currentMonotonicTimestamp);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z) {
        markerStartWithCancelPolicy(i, z, 0);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final MarkerEditor withMarker(int i) {
        return new C12100kE(this, i, 0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0045. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(com.facebook.quicklog.LightweightQuickPerformanceLogger r13, X.C0YE r14) {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0k1.A00(com.facebook.quicklog.LightweightQuickPerformanceLogger, X.0YE):void");
    }

    public final void A02(C0YE c0ye) {
        Lock lock = this.A02;
        lock.lock();
        try {
            C0YF c0yf = (C0YF) this.A00.get();
            c0yf.getClass();
            ConcurrentLinkedQueue concurrentLinkedQueue = c0yf.A01;
            if (concurrentLinkedQueue != null) {
                concurrentLinkedQueue.add(c0ye);
                return;
            }
            lock.unlock();
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c0yf.A00;
            if (lightweightQuickPerformanceLogger != null) {
                A00(lightweightQuickPerformanceLogger, c0ye);
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final long currentMonotonicTimestamp() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        A02(new C0YE(str, Integer.valueOf(i3), "", TimeUnit.MILLISECONDS, 30, i, i2, 0L));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDrop(int i) {
        A01(this, "", "", TimeUnit.MILLISECONDS, 12, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDropForUserFlow(int i, int i2) {
        A01(this, "", "", TimeUnit.MILLISECONDS, 21, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map) {
        A02(new C0YE(new C0k2(i, s, j, timeUnit, map), null, "", TimeUnit.MILLISECONDS, 29, 0, 0, 0L));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerLinkPivot(int i, int i2, String str) {
        A01(this, "", str, TimeUnit.MILLISECONDS, 23, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    @Deprecated
    public final void markerTag(int i, String str) {
        A01(this, "", str, TimeUnit.MILLISECONDS, 7, i, 0, 0L);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.0YF] */
    public C0k1() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        ?? obj = new Object();
        obj.A01 = concurrentLinkedQueue;
        obj.A00 = null;
        this.A00 = new AtomicReference(obj);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A02 = reentrantReadWriteLock.readLock();
        this.A01 = reentrantReadWriteLock.writeLock();
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final long currentMonotonicTimestampNanos() {
        return System.nanoTime();
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        A01(this, Short.valueOf(s), "", timeUnit, 1, i, 0, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        A02(new C0YE(Short.valueOf(s), null, str, TimeUnit.MILLISECONDS, 20, i, i2, currentMonotonicTimestamp));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndForUserFlow(int i, String str, int i2, short s) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        A02(new C0YE(str, Short.valueOf(s), "", TimeUnit.MILLISECONDS, 19, i, i2, currentMonotonicTimestamp));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j, long j2, TimeUnit timeUnit) {
        A02(new C0YE(Boolean.valueOf(z), Long.valueOf(j), str, timeUnit, 27, i, i2, j2));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, double d) {
        A01(this, Double.valueOf(d), str, TimeUnit.MILLISECONDS, 8, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, int i3) {
        A01(this, Integer.valueOf(i3), str, TimeUnit.MILLISECONDS, 5, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, long j) {
        A01(this, Long.valueOf(j), str, TimeUnit.MILLISECONDS, 11, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, String str2) {
        A01(this, str2, str, TimeUnit.MILLISECONDS, 4, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, boolean z) {
        A01(this, Boolean.valueOf(z), str, TimeUnit.MILLISECONDS, 6, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, double[] dArr) {
        A01(this, dArr, str, TimeUnit.MILLISECONDS, 17, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, int[] iArr) {
        A01(this, iArr, str, TimeUnit.MILLISECONDS, 10, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, long[] jArr) {
        A01(this, jArr, str, TimeUnit.MILLISECONDS, 15, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, String[] strArr) {
        A01(this, strArr, str, TimeUnit.MILLISECONDS, 9, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        A01(this, zArr, str, TimeUnit.MILLISECONDS, 16, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, double d) {
        A01(this, Double.valueOf(d), str, TimeUnit.MILLISECONDS, 8, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, int i2) {
        A01(this, Integer.valueOf(i2), str, TimeUnit.MILLISECONDS, 5, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, long j) {
        A01(this, Long.valueOf(j), str, TimeUnit.MILLISECONDS, 11, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, String str2) {
        A01(this, str2, str, TimeUnit.MILLISECONDS, 4, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, boolean z) {
        A01(this, Boolean.valueOf(z), str, TimeUnit.MILLISECONDS, 6, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, double[] dArr) {
        A01(this, dArr, str, TimeUnit.MILLISECONDS, 17, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, int[] iArr) {
        A01(this, iArr, str, TimeUnit.MILLISECONDS, 10, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, long[] jArr) {
        A01(this, jArr, str, TimeUnit.MILLISECONDS, 15, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, String[] strArr) {
        A01(this, strArr, str, TimeUnit.MILLISECONDS, 9, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, boolean[] zArr) {
        A01(this, zArr, str, TimeUnit.MILLISECONDS, 16, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str) {
        A01(this, "", str, TimeUnit.MILLISECONDS, 2, i, i2, currentMonotonicTimestamp());
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        A01(this, "", str, timeUnit, 2, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2) {
        A01(this, str2, str, TimeUnit.MILLISECONDS, 3, i, i2, currentMonotonicTimestamp());
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        A01(this, str2, str, timeUnit, 3, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        A02(new C0YE(str2, Integer.valueOf(i3), str, timeUnit, 22, i, i2, j));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str) {
        A01(this, "", str, TimeUnit.MILLISECONDS, 2, i, 0, currentMonotonicTimestamp());
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        A01(this, "", str, timeUnit, 2, i, 0, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, String str2) {
        A01(this, str2, str, TimeUnit.MILLISECONDS, 3, i, 0, currentMonotonicTimestamp());
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        A01(this, str2, str, timeUnit, 3, i, 0, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final EventBuilder markEventBuilder(int i, int i2, String str) {
        return new C12160kK(this, str, i, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        A02(new C0YE(str, str2, "", TimeUnit.MILLISECONDS, 24, i, i2, 0L));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDrop(int i, int i2) {
        A01(this, "", "", TimeUnit.MILLISECONDS, 12, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, int i2, short s) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        A01(this, Short.valueOf(s), "", TimeUnit.MILLISECONDS, 1, i, i2, currentMonotonicTimestamp);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndForUserFlow(int i, int i2, short s) {
        markerEndForUserFlow(i, null, i2, s);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, String str, String str2) {
        markerStart(i);
        markerAnnotate(i, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        A02(new C0YE(Boolean.valueOf(z), Long.valueOf(j), str, TimeUnit.MILLISECONDS, 26, i, i2, 0L));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2) {
        markerStartWithCancelPolicy(i, z, i2, currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    @Deprecated
    public final void markerTag(int i, int i2, String str) {
        A01(this, "", str, TimeUnit.MILLISECONDS, 7, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final MarkerEditor withMarker(int i, int i2) {
        return new C12100kE(this, i, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        A01(this, Short.valueOf(s), "", timeUnit, 1, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, i2, j, timeUnit);
        markerAnnotate(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        A01(this, Boolean.valueOf(z), "", timeUnit, 18, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        A01(this, Boolean.valueOf(z), "", timeUnit, 0, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, short s) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        A01(this, Short.valueOf(s), "", TimeUnit.MILLISECONDS, 1, i, 0, currentMonotonicTimestamp);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, String str, String str2) {
        markerStart(i, i2);
        markerAnnotate(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        A02(new C0YE(Boolean.valueOf(z), Long.valueOf(j), "", TimeUnit.MILLISECONDS, 25, i, i2, 0L));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2) {
        long currentMonotonicTimestamp = currentMonotonicTimestamp();
        A01(this, Boolean.TRUE, "", TimeUnit.MILLISECONDS, 0, i, i2, currentMonotonicTimestamp);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, 0, j, timeUnit);
        markerAnnotate(i, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        A01(this, Integer.valueOf(i3), "", timeUnit, 28, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        A01(this, Boolean.TRUE, "", timeUnit, 0, i, i2, j);
    }
}
