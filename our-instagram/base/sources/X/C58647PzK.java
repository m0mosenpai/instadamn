package X;

import java.lang.Thread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PzK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58647PzK {
    public static final ThreadPoolExecutor A00(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, boolean z) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 30000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC58646PzJ(str, uncaughtExceptionHandler, z));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.concurrent.ThreadPoolExecutor A02(java.lang.Integer r5, java.lang.Thread.UncaughtExceptionHandler r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L7
            X.TRp r6 = new X.TRp
            r6.<init>()
        L7:
            int r0 = r5.intValue()
            r3 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L1c;
                case 1: goto L1c;
                case 2: goto L10;
                case 3: goto L10;
                case 4: goto L10;
                case 5: goto L26;
                case 6: goto L26;
                case 7: goto L1c;
                case 8: goto L2f;
                case 9: goto L2f;
                case 10: goto L2f;
                case 11: goto L2f;
                case 12: goto L2f;
                case 13: goto L26;
                case 14: goto L10;
                case 15: goto L26;
                default: goto L10;
            }
        L10:
            java.lang.String r1 = "unknown type "
            java.lang.String r0 = X.AbstractC58648PzL.A00(r5)
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r1, r0)
            throw r0
        L1c:
            java.lang.String r1 = X.AbstractC58648PzL.A00(r5)
            r0 = 2
            java.util.concurrent.ThreadPoolExecutor r0 = A00(r1, r6, r0, r2)
            return r0
        L26:
            java.lang.String r0 = X.AbstractC58648PzL.A00(r5)
            java.util.concurrent.ThreadPoolExecutor r0 = A00(r0, r6, r3, r2)
            return r0
        L2f:
            java.lang.String r1 = X.AbstractC58648PzL.A00(r5)
            r0 = 4
            java.util.concurrent.ThreadPoolExecutor r0 = A00(r1, r6, r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58647PzK.A02(java.lang.Integer, java.lang.Thread$UncaughtExceptionHandler):java.util.concurrent.ThreadPoolExecutor");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public final ThreadPoolExecutor A01(Integer num, int i) {
        return A00(AbstractC58648PzL.A00(num), new Object(), i, false);
    }
}
