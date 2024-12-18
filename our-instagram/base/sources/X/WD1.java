package X;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public abstract class WD1 {
    public final VIS A00;
    public volatile Object A01;

    public static Object A00(WD1 wd1) {
        Object obj;
        Object obj2 = wd1.A01;
        if (obj2 == null) {
            synchronized (wd1) {
                obj = wd1.A01;
                if (obj == null) {
                    obj = new Object();
                    wd1.A01 = obj;
                }
            }
            return obj;
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (java.lang.Double.isNaN(r13) != false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.WD1, X.Uy9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.WD1 create(double r13, X.VIS r15) {
        /*
            X.Uy9 r7 = new X.Uy9
            r7.<init>(r15)
            r0 = 0
            r7.A03 = r0
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L16
            boolean r0 = java.lang.Double.isNaN(r13)
            r1 = 1
            if (r0 == 0) goto L17
        L16:
            r1 = 0
        L17:
            java.lang.String r0 = "rate must be positive"
            X.C18C.A0G(r1, r0)
            java.lang.Object r10 = A00(r7)
            monitor-enter(r10)
            X.VIS r0 = r7.A00     // Catch: java.lang.Throwable -> L6f
            X.Uy8 r0 = (X.C67783Uy8) r0     // Catch: java.lang.Throwable -> L6f
            X.4Qz r1 = r0.A00     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Throwable -> L6f
            long r4 = r1.A00(r0)     // Catch: java.lang.Throwable -> L6f
            long r2 = r7.A03     // Catch: java.lang.Throwable -> L6f
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L46
            long r0 = r4 - r2
            double r8 = (double) r0     // Catch: java.lang.Throwable -> L6f
            double r0 = r7.A01     // Catch: java.lang.Throwable -> L6f
            double r8 = r8 / r0
            double r2 = r7.A00     // Catch: java.lang.Throwable -> L6f
            double r0 = r7.A02     // Catch: java.lang.Throwable -> L6f
            double r0 = r0 + r8
            double r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L6f
            r7.A02 = r0     // Catch: java.lang.Throwable -> L6f
            r7.A03 = r4     // Catch: java.lang.Throwable -> L6f
        L46:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L6f
            r0 = 1
            long r2 = r2.toMicros(r0)     // Catch: java.lang.Throwable -> L6f
            double r0 = (double) r2     // Catch: java.lang.Throwable -> L6f
            double r0 = r0 / r13
            r7.A01 = r0     // Catch: java.lang.Throwable -> L6f
            double r5 = r7.A00     // Catch: java.lang.Throwable -> L6f
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 * r13
            r7.A00 = r3     // Catch: java.lang.Throwable -> L6f
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L61
            r0 = r3
            goto L6b
        L61:
            r0 = 0
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 == 0) goto L6b
            double r0 = r7.A02     // Catch: java.lang.Throwable -> L6f
            double r0 = r0 * r3
            double r0 = r0 / r5
        L6b:
            r7.A02 = r0     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            return r7
        L6f:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WD1.create(double, X.VIS):X.WD1");
    }

    public final String toString() {
        double micros;
        Locale locale = Locale.ROOT;
        synchronized (A00(this)) {
            micros = TimeUnit.SECONDS.toMicros(1L) / ((C67784Uy9) this).A01;
        }
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(micros));
    }

    public WD1(VIS stopwatch) {
        stopwatch.getClass();
        this.A00 = stopwatch;
    }
}
