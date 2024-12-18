package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: X.0Rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05650Rp extends AbstractC02970Bv {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public final WeakHashMap A06 = new WeakHashMap();
    public final C005001p A04 = new C005001p(0);
    public final ArrayList A05 = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r0 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A00(X.C05650Rp r14) {
        /*
            monitor-enter(r14)
            r6 = 0
            r12 = -1
            java.util.ArrayList r0 = r14.A05     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r11 = r0.iterator()     // Catch: java.lang.Throwable -> Lad
        La:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L9b
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> Lad
            X.0CB r1 = (X.C0CB) r1     // Catch: java.lang.Throwable -> Lad
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Lad
            long r2 = r1.A04     // Catch: java.lang.Throwable -> Lad
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L99
            boolean r4 = X.C0CB.A00(r1, r2)     // Catch: java.lang.Throwable -> Lad
        L24:
            boolean r0 = r1.A05     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L49
            java.lang.ref.WeakReference r0 = r1.A08     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L49
            java.lang.String r3 = "The wakelock "
            java.lang.String r2 = r1.A07     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = " was garbage collected before being released."
            java.lang.String r3 = X.AnonymousClass001.A0g(r3, r2, r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r2 = "WakeLockMetricsCollector"
            r0 = 0
            android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> Lad
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Lad
            boolean r0 = X.C0CB.A00(r1, r2)     // Catch: java.lang.Throwable -> Lad
            goto L4a
        L49:
            r0 = 0
        L4a:
            if (r4 != 0) goto L4f
            r2 = 0
            if (r0 == 0) goto L50
        L4f:
            r2 = 1
        L50:
            boolean r0 = r1.A05     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L57
            int r6 = r6 + 1
            goto L60
        L57:
            if (r2 == 0) goto L60
            long r2 = r1.A03     // Catch: java.lang.Throwable -> Lad
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L60
            r12 = r2
        L60:
            java.lang.ref.WeakReference r0 = r1.A08     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto La
            X.01p r10 = r14.A04     // Catch: java.lang.Throwable -> Lad
            java.lang.String r9 = r1.A07     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r0 = r10.get(r9)     // Catch: java.lang.Throwable -> Lad
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L77
            r7 = 0
            goto L7b
        L77:
            long r7 = r0.longValue()     // Catch: java.lang.Throwable -> Lad
        L7b:
            long r4 = r1.A02     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r1.A05     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L96
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Lad
            long r0 = r1.A01     // Catch: java.lang.Throwable -> Lad
            long r2 = r2 - r0
        L88:
            long r4 = r4 + r2
            long r7 = r7 + r4
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lad
            r10.put(r9, r0)     // Catch: java.lang.Throwable -> Lad
            r11.remove()     // Catch: java.lang.Throwable -> Lad
            goto La
        L96:
            r2 = 0
            goto L88
        L99:
            r4 = 0
            goto L24
        L9b:
            int r0 = r14.A00     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto La9
            if (r6 != 0) goto La9
            long r2 = r14.A03     // Catch: java.lang.Throwable -> Lad
            long r0 = r14.A02     // Catch: java.lang.Throwable -> Lad
            long r12 = r12 - r0
            long r2 = r2 + r12
            r14.A03 = r2     // Catch: java.lang.Throwable -> Lad
        La9:
            r14.A00 = r6     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r14)
            return
        Lad:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05650Rp.A00(X.0Rp):void");
    }

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
        C05660Rq c05660Rq;
        synchronized (this) {
            c05660Rq = new C05660Rq(false);
        }
        return c05660Rq;
    }

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ boolean A04(AbstractC02960Bu abstractC02960Bu) {
        long j;
        long longValue;
        long j2;
        long longValue2;
        C05660Rq c05660Rq = (C05660Rq) abstractC02960Bu;
        synchronized (this) {
            AbstractC03000By.A00(c05660Rq);
            A00(this);
            c05660Rq.A00 = this.A01;
            long j3 = this.A03;
            if (this.A00 > 0) {
                j = SystemClock.uptimeMillis() - this.A02;
            } else {
                j = 0;
            }
            c05660Rq.A01 = j3 + j;
            if (c05660Rq.A02) {
                C005001p c005001p = c05660Rq.A03;
                c005001p.clear();
                ArrayList arrayList = this.A05;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0CB c0cb = (C0CB) arrayList.get(i);
                    long j4 = c0cb.A02;
                    if (c0cb.A05) {
                        j2 = SystemClock.uptimeMillis() - c0cb.A01;
                    } else {
                        j2 = 0;
                    }
                    long j5 = j4 + j2;
                    String str = c0cb.A07;
                    Long l = (Long) c005001p.get(str);
                    if (l == null) {
                        longValue2 = 0;
                    } else {
                        longValue2 = l.longValue();
                    }
                    c005001p.put(str, Long.valueOf(longValue2 + j5));
                }
                C005001p c005001p2 = this.A04;
                int size2 = c005001p2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = (String) c005001p2.A05(i2);
                    Long l2 = (Long) c005001p.get(str2);
                    if (l2 == null) {
                        longValue = 0;
                    } else {
                        longValue = l2.longValue();
                    }
                    c005001p.put(str2, Long.valueOf(longValue + ((Long) c005001p2.A06(i2)).longValue()));
                }
            }
        }
        return true;
    }
}
