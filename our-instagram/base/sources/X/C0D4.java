package X;

import android.app.ActivityThread;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0D4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0D4 {
    public static ActivityThread A03;
    public static Handler.Callback A04;
    public static Handler A05;
    public static C0D4 A06;
    public static Field A07;
    public static volatile boolean A0B;
    public static volatile boolean A0C;
    public final C0H5 A02;
    public static final C03720In A09 = new C03720In("ActivityThreadHooker");
    public static final Handler.Callback A08 = new Handler.Callback() { // from class: X.0D3
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            List list;
            ArrayList arrayList;
            int i = message.what;
            boolean z = false;
            C0D4 c0d4 = C0D4.A06;
            if (c0d4 != null) {
                try {
                    synchronized (c0d4.A01) {
                        try {
                            list = (List) c0d4.A00.get(i);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (list != null) {
                        synchronized (list) {
                            try {
                                arrayList = new ArrayList(list);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (arrayList.size() == 0) {
                            arrayList.size();
                            return false;
                        }
                        arrayList.size();
                        Iterator it = arrayList.iterator();
                        boolean z2 = true;
                        while (it.hasNext()) {
                            C05440Qt c05440Qt = (C05440Qt) it.next();
                            boolean z3 = C03160Cw.A09;
                            c05440Qt.A00.A02.A01(null, i, message);
                            z2 = false;
                        }
                        Handler.Callback callback = C0D4.A04;
                        if (callback != null) {
                            z = callback.handleMessage(message);
                        }
                        return z | z2;
                    }
                } catch (Error | RuntimeException e) {
                    C0D4.A09.A06("Perform hook for what %d had an error.", e, new Object[]{Integer.valueOf(message.what)}, 6, 0);
                }
            }
            return false;
        }
    };
    public static final Object A0A = new Object();
    public final Object A01 = new Object();
    public final SparseArray A00 = new SparseArray();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[Catch: all -> 0x009b, TryCatch #3 {, blocks: (B:9:0x000b, B:11:0x000f, B:13:0x0016, B:14:0x001c, B:19:0x0088, B:21:0x0090, B:22:0x0020, B:24:0x0026, B:26:0x002f, B:27:0x0033, B:29:0x003b, B:30:0x0042, B:32:0x0044, B:34:0x0051, B:35:0x0055, B:36:0x005b, B:38:0x005f, B:41:0x0067, B:44:0x0070, B:47:0x0079, B:48:0x0097, B:49:0x0099), top: B:8:0x000b, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0D4 A00(X.C0H5 r7) {
        /*
            r6 = 0
            boolean r0 = X.C0D4.A0C
            if (r0 == 0) goto L8
            X.0D4 r0 = X.C0D4.A06
            return r0
        L8:
            java.lang.Object r5 = X.C0D4.A0A
            monitor-enter(r5)
            boolean r0 = X.C0D4.A0C     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L97
            android.app.ActivityThread r2 = X.C0Cu.A00()     // Catch: java.lang.Throwable -> L9b
            r4 = 0
            if (r2 != 0) goto L20
            X.0In r2 = X.C0D4.A09     // Catch: java.lang.Throwable -> L9b
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "Could not find ActivityThread"
        L1c:
            r2.A08(r0, r1)     // Catch: java.lang.Throwable -> L9b
            goto L82
        L20:
            X.C0D4.A03 = r2     // Catch: java.lang.Throwable -> L9b
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r1 = X.C0H5.A05(r6, r1, r6, r0)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L9b
            if (r1 == 0) goto L33
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L9b
        L33:
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L9b
            android.os.Handler r3 = (android.os.Handler) r3     // Catch: java.lang.Exception -> L78 java.lang.Throwable -> L9b
            if (r3 != 0) goto L42
            X.0In r2 = X.C0D4.A09     // Catch: java.lang.Throwable -> L9b
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "Got a null ActivityThread Handler mH"
            goto L1c
        L42:
            X.C0D4.A05 = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Class<android.os.Handler> r2 = android.os.Handler.class
            java.lang.String r1 = "mCallback"
            java.lang.Class<android.os.Handler$Callback> r0 = android.os.Handler.Callback.class
            java.lang.reflect.Field r1 = X.C0H5.A05(r6, r2, r0, r1)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L9b
            if (r1 == 0) goto L55
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L9b
        L55:
            java.lang.Object r0 = r1.get(r3)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L9b
            android.os.Handler$Callback r0 = (android.os.Handler.Callback) r0     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L9b
            X.C0D4.A07 = r1     // Catch: java.lang.Throwable -> L9b
            X.C0D4.A04 = r0     // Catch: java.lang.Throwable -> L9b
            android.os.Handler$Callback r0 = X.C0D4.A08     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L9b
            r1.set(r3, r0)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L9b
            r2 = 1
            goto L83
        L66:
            r2 = move-exception
            X.0In r1 = X.C0D4.A09     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "Could not get hook ActivityThread Handler callback"
            r1.A04(r0, r2)     // Catch: java.lang.Throwable -> L9b
            goto L82
        L6f:
            r2 = move-exception
            X.0In r1 = X.C0D4.A09     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "Could not get ActivityThread Handler callback"
            r1.A04(r0, r2)     // Catch: java.lang.Throwable -> L9b
            goto L82
        L78:
            r3 = move-exception
            X.0In r2 = X.C0D4.A09     // Catch: java.lang.Throwable -> L9b
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "Could not get ActivityThread Handler mH"
            r2.A0C(r3, r0, r1)     // Catch: java.lang.Throwable -> L9b
        L82:
            r2 = 0
        L83:
            r1 = 1
            r0 = 0
            if (r2 != 0) goto L88
            r0 = 1
        L88:
            X.C0D4.A0B = r0     // Catch: java.lang.Throwable -> L9b
            X.C0D4.A0C = r1     // Catch: java.lang.Throwable -> L9b
            boolean r0 = X.C0D4.A0B     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L97
            X.0D4 r0 = new X.0D4     // Catch: java.lang.Throwable -> L9b
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L9b
            X.C0D4.A06 = r0     // Catch: java.lang.Throwable -> L9b
        L97:
            X.0D4 r0 = X.C0D4.A06     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            return r0
        L9b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D4.A00(X.0H5):X.0D4");
    }

    public C0D4(C0H5 c0h5) {
        this.A02 = c0h5;
    }
}
