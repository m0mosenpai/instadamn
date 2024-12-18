package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

@Deprecated
/* renamed from: X.0k4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0k4 implements LightweightQuickPerformanceLogger {
    public LightweightQuickPerformanceLogger A00;
    public C0k1 A01;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.0YF] */
    public final void A00() {
        C0k1 c0k1 = this.A01;
        if (c0k1 != null) {
            Lock lock = c0k1.A01;
            lock.lock();
            try {
                AtomicReference atomicReference = c0k1.A00;
                ?? obj = new Object();
                obj.A01 = null;
                obj.A00 = null;
                atomicReference.set(obj);
            } finally {
                lock.unlock();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3.isEmpty() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r2 = new java.util.concurrent.ConcurrentLinkedQueue();
        r0 = new java.lang.Object();
        r0.A01 = r2;
        r0.A00 = null;
        r4.set(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r5.unlock();
        r1 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r1.hasNext() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        X.C0k1.A00(r8, (X.C0YE) r1.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r0 = new java.lang.Object();
        r0.A01 = null;
        r0.A00 = r8;
        r4.set(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r5.unlock();
        r7.A01 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r5.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        r7.A00 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        if (r6 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r5 = r6.A01;
        r5.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
    
        r4 = r6.A00;
        r1 = (X.C0YF) r4.get();
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r1.A00 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r3 = r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.0YF] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.0YF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.facebook.quicklog.LightweightQuickPerformanceLogger r8) {
        /*
            r7 = this;
            X.0k1 r6 = r7.A01
            if (r6 == 0) goto L63
        L4:
            java.util.concurrent.locks.Lock r5 = r6.A01
            r5.lock()
            java.util.concurrent.atomic.AtomicReference r4 = r6.A00     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r4.get()     // Catch: java.lang.Throwable -> L59
            X.0YF r1 = (X.C0YF) r1     // Catch: java.lang.Throwable -> L59
            r1.getClass()     // Catch: java.lang.Throwable -> L59
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r1.A00     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L4b
            java.util.concurrent.ConcurrentLinkedQueue r3 = r1.A01     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L4b
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L4b
            java.util.concurrent.ConcurrentLinkedQueue r2 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch: java.lang.Throwable -> L59
            r2.<init>()     // Catch: java.lang.Throwable -> L59
            r1 = 0
            X.0YF r0 = new X.0YF     // Catch: java.lang.Throwable -> L59
            r0.<init>()     // Catch: java.lang.Throwable -> L59
            r0.A01 = r2     // Catch: java.lang.Throwable -> L59
            r0.A00 = r1     // Catch: java.lang.Throwable -> L59
            r4.set(r0)     // Catch: java.lang.Throwable -> L59
            r5.unlock()
            java.util.Iterator r1 = r3.iterator()
        L3b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4
            java.lang.Object r0 = r1.next()
            X.0YE r0 = (X.C0YE) r0
            X.C0k1.A00(r8, r0)
            goto L3b
        L4b:
            r1 = 0
            X.0YF r0 = new X.0YF     // Catch: java.lang.Throwable -> L59
            r0.<init>()     // Catch: java.lang.Throwable -> L59
            r0.A01 = r1     // Catch: java.lang.Throwable -> L59
            r0.A00 = r8     // Catch: java.lang.Throwable -> L59
            r4.set(r0)     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r0 = move-exception
            r5.unlock()
            throw r0
        L5e:
            r5.unlock()
            r7.A01 = r1
        L63:
            r7.A00 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0k4.A01(com.facebook.quicklog.LightweightQuickPerformanceLogger):void");
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final long currentMonotonicTimestamp() {
        return this.A00.currentMonotonicTimestamp();
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final long currentMonotonicTimestampNanos() {
        return this.A00.currentMonotonicTimestampNanos();
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerOn(int i, boolean z) {
        return this.A00.isMarkerOn(i, z);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final EventBuilder markEventBuilder(int i, String str) {
        return this.A00.markEventBuilder(i, str);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        this.A00.markerAnnotateCrucialForUserFlow(i, i2, str, i3);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDrop(int i) {
        this.A00.markerDrop(i);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDropForUserFlow(int i, int i2) {
        this.A00.markerDropForUserFlow(i, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        this.A00.markerEnd(i, s, j, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        this.A00.markerEndAtPointForUserFlow(i, i2, s, str);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndForUserFlow(int i, String str, int i2, short s) {
        this.A00.markerEndForUserFlow(i, str, i2, s);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map) {
        this.A00.markerGenerateWithAnnotations(i, s, j, timeUnit, map);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerLinkPivot(int i, int i2, String str) {
        this.A00.markerLinkPivot(i, i2, str);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i) {
        this.A00.markerStart(i);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j, long j2, TimeUnit timeUnit) {
        this.A00.markerStartForUserFlow(i, i2, str, z, j, j2, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z) {
        this.A00.markerStartWithCancelPolicy(i, z);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerTag(int i, String str) {
        this.A00.markerTag(i, str);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final MarkerEditor withMarker(int i) {
        return this.A00.withMarker(i);
    }

    public C0k4() {
        C0k1 c0k1 = new C0k1();
        this.A01 = c0k1;
        c0k1.getClass();
        this.A00 = c0k1;
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, double d) {
        this.A00.markerAnnotate(i, i2, str, d);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, int i3) {
        this.A00.markerAnnotate(i, i2, str, i3);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, long j) {
        this.A00.markerAnnotate(i, i2, str, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, String str2) {
        this.A00.markerAnnotate(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, boolean z) {
        this.A00.markerAnnotate(i, i2, str, z);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, double[] dArr) {
        this.A00.markerAnnotate(i, i2, str, dArr);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, int[] iArr) {
        this.A00.markerAnnotate(i, i2, str, iArr);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, long[] jArr) {
        this.A00.markerAnnotate(i, i2, str, jArr);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, String[] strArr) {
        this.A00.markerAnnotate(i, i2, str, strArr);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        this.A00.markerAnnotate(i, i2, str, zArr);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, double d) {
        this.A00.markerAnnotate(i, str, d);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, int i2) {
        this.A00.markerAnnotate(i, str, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, long j) {
        this.A00.markerAnnotate(i, str, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, String str2) {
        this.A00.markerAnnotate(i, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, boolean z) {
        this.A00.markerAnnotate(i, str, z);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, double[] dArr) {
        this.A00.markerAnnotate(i, str, dArr);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, int[] iArr) {
        this.A00.markerAnnotate(i, str, iArr);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, long[] jArr) {
        this.A00.markerAnnotate(i, str, jArr);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, String[] strArr) {
        this.A00.markerAnnotate(i, str, strArr);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, boolean[] zArr) {
        this.A00.markerAnnotate(i, str, zArr);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str) {
        this.A00.markerPoint(i, i2, str);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        this.A00.markerPoint(i, i2, str, j, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2) {
        this.A00.markerPoint(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        this.A00.markerPoint(i, i2, str, str2, j, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        this.A00.markerPoint(i, i2, str, str2, j, timeUnit, i3);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str) {
        this.A00.markerPoint(i, str);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        this.A00.markerPoint(i, str, j, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, String str2) {
        this.A00.markerPoint(i, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        this.A00.markerPoint(i, str, str2, j, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerOn(int i, int i2, boolean z) {
        return this.A00.isMarkerOn(i, i2, z);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final EventBuilder markEventBuilder(int i, int i2, String str) {
        return this.A00.markEventBuilder(i, i2, str);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        this.A00.markerAnnotateCrucialForUserFlow(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDrop(int i, int i2) {
        this.A00.markerDrop(i, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, int i2, short s) {
        this.A00.markerEnd(i, i2, s);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndForUserFlow(int i, int i2, short s) {
        this.A00.markerEndForUserFlow(i, i2, s);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, String str, String str2) {
        this.A00.markerStart(i, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        this.A00.markerStartForUserFlow(i, i2, j, timeUnit, z);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2) {
        this.A00.markerStartWithCancelPolicy(i, z, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerTag(int i, int i2, String str) {
        this.A00.markerTag(i, i2, str);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final MarkerEditor withMarker(int i, int i2) {
        return this.A00.withMarker(i, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        this.A00.markerEnd(i, i2, s, j, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        this.A00.markerStart(i, i2, str, str2, j, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        this.A00.markerStartForUserFlow(i, i2, str, z, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        this.A00.markerStartWithCancelPolicy(i, z, i2, j, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, short s) {
        this.A00.markerEnd(i, s);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, String str, String str2) {
        this.A00.markerStart(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        this.A00.markerStartForUserFlow(i, i2, z, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2) {
        this.A00.markerStart(i, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        this.A00.markerStart(i, str, str2, j, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        this.A00.markerStart(i, i2, j, timeUnit, i3);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        this.A00.markerStart(i, i2, j, timeUnit);
    }
}
