package X;

import android.os.Handler;
import com.facebook.memorytimeline.MemoryTimeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.2RK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2RK implements MemoryTimeline {
    public long A00;
    public C0JO A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public long A06;
    public final int A07;
    public final int A08;
    public final Handler A09;
    public final Runnable A0A;
    public final List A0B;
    public final java.util.Set A0C;
    public final java.util.Set A0D;
    public final java.util.Set A0E;
    public final AtomicReference A0F;

    public static synchronized void A01(C2RK c2rk) {
        synchronized (c2rk) {
            A02(c2rk, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r1 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r9 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r8.A0C.isEmpty() == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[Catch: all -> 0x007d, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000d, B:8:0x0015, B:10:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0033, B:21:0x0042, B:22:0x0047, B:24:0x004f, B:26:0x0055, B:27:0x005e, B:29:0x006c, B:30:0x0074, B:38:0x0045, B:39:0x003d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[Catch: all -> 0x007d, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000d, B:8:0x0015, B:10:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0033, B:21:0x0042, B:22:0x0047, B:24:0x004f, B:26:0x0055, B:27:0x005e, B:29:0x006c, B:30:0x0074, B:38:0x0045, B:39:0x003d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000d, B:8:0x0015, B:10:0x001f, B:15:0x0029, B:17:0x002f, B:19:0x0033, B:21:0x0042, B:22:0x0047, B:24:0x004f, B:26:0x0055, B:27:0x005e, B:29:0x006c, B:30:0x0074, B:38:0x0045, B:39:0x003d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A02(X.C2RK r8, boolean r9) {
        /*
            monitor-enter(r8)
            java.util.Set r0 = r8.A0D     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            r7 = 1
            r6 = 0
            r2 = 0
            if (r0 != 0) goto Ld
            r2 = 1
        Ld:
            java.util.Set r0 = r8.A0E     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L1e
            java.util.Set r0 = r8.A0C     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            r1 = 0
            if (r0 != 0) goto L1f
        L1e:
            r1 = 1
        L1f:
            boolean r0 = r8.A02     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L28
            if (r2 == 0) goto L28
            r2 = 1
            if (r1 != 0) goto L29
        L28:
            r2 = 0
        L29:
            r8.A05 = r2     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r8.A04     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L36
            int r0 = r8.A07     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L36
            r8.A05 = r6     // Catch: java.lang.Throwable -> L7d
            goto L40
        L36:
            if (r2 == 0) goto L40
            if (r9 != 0) goto L42
            if (r1 == 0) goto L3d
            goto L45
        L3d:
            int r0 = r8.A07     // Catch: java.lang.Throwable -> L7d
            goto L47
        L40:
            if (r9 == 0) goto L7b
        L42:
            int r0 = r8.A08     // Catch: java.lang.Throwable -> L7d
            goto L47
        L45:
            int r0 = r8.A08     // Catch: java.lang.Throwable -> L7d
        L47:
            long r2 = r8.A00     // Catch: java.lang.Throwable -> L7d
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L7d
            long r2 = r2 + r0
            boolean r0 = r8.A03     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L5e
            long r4 = r8.A06     // Catch: java.lang.Throwable -> L7d
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L7b
            android.os.Handler r1 = r8.A09     // Catch: java.lang.Throwable -> L7d
            java.lang.Runnable r0 = r8.A0A     // Catch: java.lang.Throwable -> L7d
            r1.removeCallbacks(r0)     // Catch: java.lang.Throwable -> L7d
            r8.A03 = r6     // Catch: java.lang.Throwable -> L7d
        L5e:
            r8.A03 = r7     // Catch: java.lang.Throwable -> L7d
            r8.A06 = r2     // Catch: java.lang.Throwable -> L7d
            X.0JO r0 = r8.A01     // Catch: java.lang.Throwable -> L7d
            long r4 = r0.now()     // Catch: java.lang.Throwable -> L7d
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L74
            android.os.Handler r1 = r8.A09     // Catch: java.lang.Throwable -> L7d
            java.lang.Runnable r0 = r8.A0A     // Catch: java.lang.Throwable -> L7d
            r1.post(r0)     // Catch: java.lang.Throwable -> L7d
            goto L7b
        L74:
            android.os.Handler r1 = r8.A09     // Catch: java.lang.Throwable -> L7d
            java.lang.Runnable r0 = r8.A0A     // Catch: java.lang.Throwable -> L7d
            r1.postAtTime(r0, r2)     // Catch: java.lang.Throwable -> L7d
        L7b:
            monitor-exit(r8)
            return
        L7d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2RK.A02(X.2RK, boolean):void");
    }

    public C2RK(Handler handler, C0JO c0jo, List list, java.util.Set set) {
        HashSet hashSet = new HashSet();
        this.A0D = hashSet;
        this.A0C = new HashSet();
        this.A0E = new HashSet();
        this.A02 = false;
        this.A03 = false;
        this.A05 = false;
        this.A04 = false;
        this.A00 = Long.MIN_VALUE;
        this.A0F = new AtomicReference();
        this.A0A = new Runnable() { // from class: X.2RL
            @Override // java.lang.Runnable
            public final void run() {
                C2RK c2rk = C2RK.this;
                synchronized (c2rk) {
                    c2rk.A00 = c2rk.A01.now();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                java.util.Set<C0TT> set2 = c2rk.A0E;
                synchronized (set2) {
                    for (C0TT c0tt : set2) {
                        if (c0tt.FDw()) {
                            i |= c0tt.BoH();
                            arrayList.add(c0tt);
                        }
                    }
                }
                java.util.Set set3 = c2rk.A0C;
                synchronized (set3) {
                    arrayList2.addAll(set3);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next();
                        i |= 27;
                    }
                }
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    c2rk.A0F.set(null);
                } else {
                    C0TS A00 = C2RK.A00(C0TG.A03, c2rk, i);
                    c2rk.A0F.set(A00);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((C0TT) it2.next()).DVg(c2rk, A00);
                    }
                }
                synchronized (c2rk) {
                    c2rk.A03 = false;
                }
                C2RK.A01(c2rk);
            }
        };
        this.A01 = c0jo;
        this.A09 = handler;
        hashSet.addAll(set);
        this.A0B = list;
        this.A08 = Math.max(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 200);
        this.A07 = Math.max(0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x03c3, code lost:
    
        if (r2 != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03cf, code lost:
    
        if (r5.A05 != r3.A05) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03d4, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03d9, code lost:
    
        if (r5.A06 == r3.A06) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03db, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03dc, code lost:
    
        if (r3 == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03e4, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03e5, code lost:
    
        r1 = new java.util.ArrayList();
        r0 = r6.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03ec, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0473, code lost:
    
        r1.addAll(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0476, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0477, code lost:
    
        r4 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x047f, code lost:
    
        if (r4.hasNext() == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0481, code lost:
    
        r3 = (X.C0TW) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0487, code lost:
    
        if (r9 == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x048b, code lost:
    
        if ((r3 instanceof X.InterfaceC18130ux) == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x048d, code lost:
    
        ((X.InterfaceC18130ux) r3).Cvs(r5.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0495, code lost:
    
        if (r7 == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0499, code lost:
    
        if ((r3 instanceof X.InterfaceC18490vb) == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x049b, code lost:
    
        ((X.InterfaceC18490vb) r3).DO4(r5.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04a3, code lost:
    
        if (r10 == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04a7, code lost:
    
        if ((r3 instanceof X.InterfaceC18530vf) == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04a9, code lost:
    
        ((X.InterfaceC18530vf) r3).Drh(r5.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04b7, code lost:
    
        if (((X.C2RK) r6.A02).A02 != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04b9, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04ba, code lost:
    
        r6.A05 = r5;
        r8.putAll(r2.A01);
        r11.addAll(r2.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x03e2, code lost:
    
        if (r5.A07 == r3.A07) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x03d2, code lost:
    
        if (r3 == null) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0TS A00(X.C0TG r22, X.C2RK r23, int r24) {
        /*
            Method dump skipped, instructions count: 1249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2RK.A00(X.0TG, X.2RK, int):X.0TS");
    }

    @Override // com.facebook.memorytimeline.MemoryTimeline
    public final void AAR(C0TT c0tt) {
        java.util.Set set = this.A0E;
        synchronized (set) {
            set.add(c0tt);
        }
        A01(this);
    }
}
