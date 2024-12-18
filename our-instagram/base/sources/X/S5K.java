package X;

/* loaded from: classes10.dex */
public abstract class S5K {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r2 == 100) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.Intent A00() {
        /*
            X.SF4 r5 = X.S8A.A00
            r8 = 0
            if (r5 == 0) goto Lcc
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.MessageQueue r4 = r0.getQueue()
            X.C14360o3.A07(r4)
            monitor-enter(r4)
            java.lang.reflect.Field r0 = r5.A00     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r0.get(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "null cannot be cast to non-null type android.os.Message"
            X.C14360o3.A0C(r3, r0)     // Catch: java.lang.Throwable -> L1f
            android.os.Message r3 = (android.os.Message) r3     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto Lcb
            int r2 = r3.what     // Catch: java.lang.Throwable -> Lc8
            r1 = 159(0x9f, float:2.23E-43)
            if (r2 == r1) goto L2d
            r0 = 100
            r7 = 0
            if (r2 != r0) goto L2e
        L2d:
            r7 = 1
        L2e:
            if (r2 != r1) goto L89
            java.lang.Object r2 = r3.obj     // Catch: java.lang.Throwable -> Lc8
            boolean r0 = r2 instanceof android.app.servertransaction.ClientTransaction     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L87
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "mActivityCallbacks"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L45
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L46
            goto L46
        L45:
            r1 = 0
        L46:
            if (r1 == 0) goto L87
            java.lang.Object r6 = r1.get(r2)     // Catch: java.lang.Throwable -> Laf
            r0 = 12
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)     // Catch: java.lang.Throwable -> Laf
            X.C14360o3.A0C(r6, r0)     // Catch: java.lang.Throwable -> Laf
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> Laf
            if (r0 != 0) goto L87
            r2 = 0
            java.lang.Object r0 = r6.get(r2)     // Catch: java.lang.Throwable -> Laf
            X.C14360o3.A0A(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "mIntent"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L74
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L75
            goto L75
        L74:
            r1 = 0
        L75:
            if (r1 == 0) goto Laf
            java.lang.Object r0 = r6.get(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "null cannot be cast to non-null type android.content.Intent"
            X.C14360o3.A0C(r1, r0)     // Catch: java.lang.Throwable -> Laf
            android.content.Intent r1 = (android.content.Intent) r1     // Catch: java.lang.Throwable -> Laf
            goto Lb0
        L87:
            r1 = r8
            goto Lb0
        L89:
            java.lang.Object r2 = r3.obj     // Catch: java.lang.Throwable -> Lc8
            if (r2 != 0) goto L8f
            r1 = r8
            goto Lb0
        L8f:
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "intent"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L9e
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L9f
            goto L9f
        L9e:
            r1 = 0
        L9f:
            if (r1 == 0) goto Lad
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "null cannot be cast to non-null type android.content.Intent"
            X.C14360o3.A0C(r1, r0)     // Catch: java.lang.Throwable -> Lad
            android.content.Intent r1 = (android.content.Intent) r1     // Catch: java.lang.Throwable -> Lad
            goto Lb0
        Lad:
            r1 = r8
            goto Lb0
        Laf:
            r1 = r8
        Lb0:
            if (r1 == 0) goto Lb6
            if (r7 == 0) goto Lb6
            monitor-exit(r4)
            return r1
        Lb6:
            java.lang.reflect.Field r0 = r5.A01     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = "null cannot be cast to non-null type android.os.Message"
            X.C14360o3.A0C(r3, r0)     // Catch: java.lang.Throwable -> Lc5
            android.os.Message r3 = (android.os.Message) r3     // Catch: java.lang.Throwable -> Lc5
            goto L20
        Lc5:
            r3 = 0
            goto L20
        Lc8:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        Lcb:
            monitor-exit(r4)
        Lcc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S5K.A00():android.content.Intent");
    }
}
