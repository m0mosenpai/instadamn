package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1Ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27511Ve {
    public static long A00 = 80;
    public static boolean A01 = true;
    public static boolean A02 = true;
    public static boolean A03 = true;
    public static boolean A04;
    public static final C27531Vg A06;
    public static final C27511Ve A07 = new Object();
    public static final Handler A05 = new Handler(Looper.getMainLooper());

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r2.A00 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C59252nR r4) {
        /*
            r3 = this;
            r1 = 0
            X.C14360o3.A0B(r4, r1)
            boolean r0 = X.C27511Ve.A04
            if (r0 == 0) goto Le
            X.2nZ r2 = r4.A0J
            boolean r0 = r2.A00
            if (r0 == 0) goto L15
        Le:
            android.os.Handler r0 = X.C27511Ve.A05
            X.2nZ r2 = r4.A0J
            r0.removeCallbacks(r2)
        L15:
            r2.A00 = r1
            X.1Vg r0 = X.C27511Ve.A06
            java.lang.Object r1 = r0.A02
            monitor-enter(r1)
            java.util.ArrayList r0 = r0.A00     // Catch: java.lang.Throwable -> L23
            r0.remove(r2)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27511Ve.A00(X.2nR):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r1.A00 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C59252nR r4) {
        /*
            r3 = this;
            r2 = 0
            X.C14360o3.A0B(r4, r2)
            boolean r0 = X.C27511Ve.A03
            if (r0 == 0) goto L20
            boolean r0 = X.C27511Ve.A04
            if (r0 == 0) goto L12
            X.2nZ r1 = r4.A0J
            boolean r0 = r1.A00
            if (r0 == 0) goto L19
        L12:
            android.os.Handler r0 = X.C27511Ve.A05
            X.2nZ r1 = r4.A0J
            r0.removeCallbacks(r1)
        L19:
            r1.A00 = r2
            X.1Vg r0 = X.C27511Ve.A06
            r0.A00(r1)
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27511Ve.A01(X.2nR):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Ve, java.lang.Object] */
    static {
        C27531Vg c27531Vg;
        synchronized (C27531Vg.class) {
            c27531Vg = C27531Vg.A05;
            if (c27531Vg == null) {
                c27531Vg = new C27531Vg();
                C27531Vg.A05 = c27531Vg;
            }
        }
        A06 = c27531Vg;
    }
}
