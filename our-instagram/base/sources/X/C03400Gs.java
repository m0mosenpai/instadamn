package X;

import android.os.Process;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03400Gs implements Thread.UncaughtExceptionHandler {
    public static C03400Gs A03;
    public static Runnable A04;
    public final Thread.UncaughtExceptionHandler A01;
    public byte[] mOomReservation;
    public final Object A00 = new Object();
    public volatile List A02 = Collections.unmodifiableList(new ArrayList());

    public static synchronized C03400Gs A00() {
        C03400Gs c03400Gs;
        synchronized (C03400Gs.class) {
            c03400Gs = A03;
            if (c03400Gs == null) {
                C03400Gs c03400Gs2 = new C03400Gs(Thread.getDefaultUncaughtExceptionHandler());
                A03 = c03400Gs2;
                Thread.setDefaultUncaughtExceptionHandler(c03400Gs2);
                c03400Gs = A03;
            }
        }
        return c03400Gs;
    }

    public static synchronized C03400Gs A01() {
        C03400Gs c03400Gs;
        synchronized (C03400Gs.class) {
            c03400Gs = A03;
        }
        return c03400Gs;
    }

    public static void A02() {
        try {
            Runnable runnable = A04;
            if (runnable != null) {
                runnable.run();
            }
            Process.killProcess(Process.myPid());
        } catch (Throwable th) {
            android.util.Log.e("ExceptionHandlerManager", "Error during exception handling", th);
        }
        try {
            System.exit(10);
        } catch (Throwable th2) {
            android.util.Log.e("ExceptionHandlerManager", "Error during exception handling", th2);
        }
        while (true) {
        }
    }

    public static synchronized void A03(InterfaceC03430Gv interfaceC03430Gv, int i) {
        synchronized (C03400Gs.class) {
            C03400Gs A00 = A00();
            synchronized (A00) {
                ArrayList arrayList = new ArrayList(A00.A02);
                arrayList.add(new C0Gr(interfaceC03430Gv, i));
                Collections.sort(arrayList);
                A00.A02 = Collections.unmodifiableList(arrayList);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r0 != null) goto L25;
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r9, java.lang.Throwable r10) {
        /*
            r8 = this;
            java.lang.Object r3 = r8.A00
            monitor-enter(r3)
            r0 = -10
            android.os.Process.setThreadPriority(r0)     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L87
        L8:
            boolean r7 = r10 instanceof java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L87
            r0 = 1
            r6 = 0
            r8.mOomReservation = r6     // Catch: java.lang.Throwable -> L87
            java.util.List r5 = r8.A02     // Catch: java.lang.Throwable -> L87
            int r4 = r5.size()     // Catch: java.lang.Throwable -> L38
            int r4 = r4 - r0
        L15:
            if (r4 < 0) goto L44
            java.lang.Object r0 = r5.get(r4)     // Catch: java.lang.Throwable -> L38
            X.0Gr r0 = (X.C0Gr) r0     // Catch: java.lang.Throwable -> L38
            X.0Gv r0 = r0.A01     // Catch: java.lang.Throwable -> L38
            r0.handleUncaughtException(r9, r10, r6)     // Catch: java.lang.Throwable -> L23
            goto L35
        L23:
            r2 = move-exception
            if (r7 == 0) goto L2e
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "OOM while handling OOM"
            android.util.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L38
            goto L35
        L2e:
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "Error during exception handling"
            android.util.Log.e(r1, r0, r2)     // Catch: java.lang.Throwable -> L38
        L35:
            int r4 = r4 + (-1)
            goto L15
        L38:
            A04(r10)     // Catch: java.lang.Throwable -> L73
            boolean r0 = r10 instanceof X.C03410Gt     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L63
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.A01     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L7b
            goto L4f
        L44:
            A04(r10)     // Catch: java.lang.Throwable -> L73
            boolean r0 = r10 instanceof X.C03410Gt     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L53
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.A01     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L7b
        L4f:
            r0.uncaughtException(r9, r10)     // Catch: java.lang.Throwable -> L73
            goto L7b
        L53:
            java.lang.String r2 = "ExceptionHandlerManager"
            java.lang.String r1 = "Exit: "
            java.lang.String r0 = r10.getMessage()     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.lang.Throwable -> L73
            android.util.Log.w(r2, r0)     // Catch: java.lang.Throwable -> L73
            goto L7b
        L63:
            java.lang.String r2 = "ExceptionHandlerManager"
            java.lang.String r1 = "Exit: "
            java.lang.String r0 = r10.getMessage()     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.lang.Throwable -> L73
            android.util.Log.w(r2, r0)     // Catch: java.lang.Throwable -> L73
            goto L7b
        L73:
            r2 = move-exception
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "Error during exception handling"
            android.util.Log.e(r1, r0, r2)     // Catch: java.lang.Throwable -> L7f
        L7b:
            A02()     // Catch: java.lang.Throwable -> L87
            goto L82
        L7f:
            A02()     // Catch: java.lang.Throwable -> L87
        L82:
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L87
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03400Gs.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }

    public C03400Gs(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.mOomReservation = null;
        this.A01 = uncaughtExceptionHandler;
        this.mOomReservation = new byte[4096];
    }

    public static void A04(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = length + 1;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, length);
        stackTraceElementArr[i - 1] = new StackTraceElement("Z", "init", C0L6.A01(), -1);
        th.setStackTrace(stackTraceElementArr);
    }
}
