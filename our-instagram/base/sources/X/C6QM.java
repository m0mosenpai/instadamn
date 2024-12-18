package X;

import java.util.Collections;

/* renamed from: X.6QM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QM {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00c4, code lost:
    
        if (X.C2RY.A01 == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A01(java.lang.Object r5, java.lang.String r6, java.util.Map r7) {
        /*
            java.lang.Class<X.6QM> r4 = X.C6QM.class
            monitor-enter(r4)
            X.C2RY.A00()     // Catch: java.lang.Throwable -> Lc8
            boolean r0 = X.C2RY.A00     // Catch: java.lang.Throwable -> Lc8
            if (r0 != 0) goto L14
            X.C2RY.A00()     // Catch: java.lang.Throwable -> Lc8
            X.C2RY.A00()     // Catch: java.lang.Throwable -> Lc8
            boolean r0 = X.C2RY.A01     // Catch: java.lang.Throwable -> Lc8
            goto Lc4
        L14:
            X.2S1 r1 = X.C2S1.A00()     // Catch: java.lang.IllegalStateException -> Lbb java.lang.Throwable -> Lc8
            boolean r0 = X.C2RR.A00()     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L28
            java.lang.String r2 = "endpoint"
            java.lang.String r0 = X.C0L6.A00()     // Catch: java.lang.Throwable -> Lc8
            java.util.Map r7 = java.util.Collections.singletonMap(r2, r0)     // Catch: java.lang.Throwable -> Lc8
        L28:
            boolean r0 = r5 instanceof androidx.fragment.app.Fragment     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L8c
            X.2S1 r0 = X.C2S1.A00()     // Catch: java.lang.Throwable -> Lc8
            X.2Rb r0 = r0.A07()     // Catch: java.lang.Throwable -> Lc8
            boolean r0 = r0.A00()     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L4f
            X.2S1 r0 = X.C2S1.A00()     // Catch: java.lang.Throwable -> Lc8
            X.3Jm r0 = r0.A05()     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L4f
            X.2S1 r0 = X.C2S1.A00()     // Catch: java.lang.Throwable -> Lc8
            X.3Jm r0 = r0.A05()     // Catch: java.lang.Throwable -> Lc8
            r0.A03(r5, r6, r7)     // Catch: java.lang.Throwable -> Lc8
        L4f:
            X.2S1 r0 = X.C2S1.A00()     // Catch: java.lang.Throwable -> Lc8
            X.2Rb r0 = r0.A07()     // Catch: java.lang.Throwable -> Lc8
            boolean r0 = r0.A02()     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto Lc6
            X.0cm r0 = r1.A0K     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto Lc6
            X.2S1 r0 = X.C2S1.A00()     // Catch: java.lang.Throwable -> Lc8
            X.3Ts r0 = r0.A01()     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto Lc6
            X.2S1 r0 = X.C2S1.A00()     // Catch: java.lang.Throwable -> Lc8
            X.3Ts r3 = r0.A01()     // Catch: java.lang.Throwable -> Lc8
            int r1 = r3.A00     // Catch: java.lang.Throwable -> Lc8
            java.util.Random r0 = X.C3Ts.A02     // Catch: java.lang.Throwable -> Lc8
            int r0 = r0.nextInt(r1)     // Catch: java.lang.Throwable -> Lc8
            if (r0 != 0) goto Lc6
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> Lc8
            r1 = 0
            java.lang.String r0 = "fragment"
            r3.A00(r1, r2, r7, r0)     // Catch: java.lang.Throwable -> Lc8
            goto Lc6
        L8c:
            boolean r0 = r5 instanceof android.app.Activity     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L94
            r1.A0B(r5, r6, r7)     // Catch: java.lang.Throwable -> Lc8
            goto Lc6
        L94:
            X.2S1 r0 = X.C2S1.A00()     // Catch: java.lang.Throwable -> Lc8
            X.2Rb r0 = r0.A07()     // Catch: java.lang.Throwable -> Lc8
            boolean r0 = r0.A00()     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto Lc6
            X.2S1 r0 = X.C2S1.A00()     // Catch: java.lang.Throwable -> Lc8
            X.3Jm r0 = r0.A05()     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto Lc6
            X.2S1 r0 = X.C2S1.A00()     // Catch: java.lang.Throwable -> Lc8
            X.3Jm r0 = r0.A05()     // Catch: java.lang.Throwable -> Lc8
            r0.getClass()     // Catch: java.lang.Throwable -> Lc8
            r0.A04(r5, r6, r7)     // Catch: java.lang.Throwable -> Lc8
            goto Lc6
        Lbb:
            r2 = move-exception
            java.lang.String r1 = "IgLeakDetector:memoryManagerNotInitialized"
            java.lang.String r0 = "couldn't get memory manager"
            X.C0K8.A0J(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc8
            goto Lc6
        Lc4:
            if (r0 != 0) goto L14
        Lc6:
            monitor-exit(r4)
            return
        Lc8:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6QM.A01(java.lang.Object, java.lang.String, java.util.Map):void");
    }

    public static void A00(Object obj) {
        A01(obj, null, Collections.emptyMap());
    }
}
