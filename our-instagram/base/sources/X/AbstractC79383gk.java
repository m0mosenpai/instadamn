package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.3gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC79383gk {
    public static final InterfaceC09390do A00;
    public static final InterfaceC09390do A01;

    static {
        EnumC09460dv enumC09460dv = EnumC09460dv.A04;
        A00 = AbstractC09440dt.A00(enumC09460dv, C79393gl.A00);
        A01 = AbstractC09440dt.A00(enumC09460dv, C79403gn.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r2 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(java.util.concurrent.Future r7, int r8) {
        /*
            java.lang.String r5 = ", "
            java.lang.String r4 = "Unable to restore priority: "
            int r0 = android.os.Process.myTid()
            r6 = 1
            r3 = 0
            r2 = 0
            if (r8 == r0) goto Le
            r2 = 1
        Le:
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L17
            r1 = 1
            if (r2 != 0) goto L18
        L17:
            r1 = 0
        L18:
            boolean r0 = A03()
            if (r0 == 0) goto L36
            if (r1 == 0) goto L36
            int r0 = android.os.Process.myTid()
            int r1 = android.os.Process.getThreadPriority(r0)
            int r3 = android.os.Process.getThreadPriority(r8)
            r0 = r1
        L2d:
            if (r1 >= r3) goto L37
            android.os.Process.setThreadPriority(r8, r0)     // Catch: java.lang.SecurityException -> L33
            goto L37
        L33:
            int r0 = r0 + 1
            goto L2d
        L36:
            r6 = 0
        L37:
            java.lang.Object r0 = r7.get()     // Catch: java.util.concurrent.CancellationException -> L59 java.lang.InterruptedException -> L5b java.util.concurrent.ExecutionException -> L66 java.lang.Throwable -> L83
            if (r6 == 0) goto L58
            android.os.Process.setThreadPriority(r8, r3)     // Catch: java.lang.SecurityException -> L41 java.lang.IllegalArgumentException -> L4c
            goto L57
        L41:
            r2 = move-exception
            java.lang.String r1 = X.AnonymousClass001.A02(r8, r3, r4, r5)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L4c:
            r2 = move-exception
            java.lang.String r1 = X.AnonymousClass001.A02(r8, r3, r4, r5)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L57:
            return r0
        L58:
            return r0
        L59:
            r1 = move-exception
            goto L79
        L5b:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L83
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L83
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L83
            goto L82
        L66:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()     // Catch: java.lang.Throwable -> L83
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L82
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L83
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L83
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L83
            goto L82
        L79:
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L83
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L83
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L83
        L82:
            throw r2     // Catch: java.lang.Throwable -> L83
        L83:
            r0 = move-exception
            if (r6 == 0) goto La0
            android.os.Process.setThreadPriority(r8, r3)     // Catch: java.lang.SecurityException -> L8a java.lang.IllegalArgumentException -> L95
            throw r0
        L8a:
            r2 = move-exception
            java.lang.String r1 = X.AnonymousClass001.A02(r8, r3, r4, r5)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L95:
            r2 = move-exception
            java.lang.String r1 = X.AnonymousClass001.A02(r8, r3, r4, r5)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        La0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC79383gk.A00(java.util.concurrent.Future, int):java.lang.Object");
    }

    public static final void A02(String str) {
        if (!C2V1.A02 && !A03()) {
            if (str == null) {
                str = AnonymousClass001.A0R("This must run on the main thread; but is running on ", Thread.currentThread().getName());
            }
            throw new IllegalStateException(str);
        }
    }

    public static final void A01(Runnable runnable) {
        if (A03()) {
            runnable.run();
        } else {
            ((Handler) A00.getValue()).post(runnable);
        }
    }

    public static final boolean A03() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return false;
        }
        return true;
    }
}
