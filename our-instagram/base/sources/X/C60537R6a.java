package X;

/* renamed from: X.R6a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60537R6a extends AbstractC50682Uo {
    public C60537R6a(Object[] objArr) {
        super((String[]) objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c7, code lost:
    
        if (r0 != null) goto L47;
     */
    @Override // X.AbstractC50682Uo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.AbstractC58570Pxo r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.R6Z
            if (r0 == 0) goto L2a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.Map r1 = r8.A03
            java.lang.String r0 = "duration"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.SOI
            if (r0 == 0) goto L27
            X.SOI r1 = (X.SOI) r1
            if (r1 == 0) goto L27
            long r0 = r1.A00
        L18:
            long r3 = r2.toMillis(r0)
            X.9Bs r0 = X.C63160SeI.A01
            if (r0 == 0) goto L88
            long r1 = r0.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L2a
        L26:
            return
        L27:
            r0 = 0
            goto L18
        L2a:
            boolean r0 = X.AbstractC79383gk.A03()
            if (r0 != 0) goto L8b
            java.lang.String r1 = r8.A02
            java.lang.String r0 = "Litho.TreeFuture.Run"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L55
            int r0 = android.os.Process.myTid()
            java.util.concurrent.ConcurrentHashMap r2 = X.C63160SeI.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L55
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ref.WeakReference r0 = X.AbstractC25225BEi.A16(r0)
            r2.put(r1, r0)
        L55:
            java.util.concurrent.ConcurrentLinkedQueue r3 = X.C63160SeI.A04
            r3.add(r8)
            java.util.concurrent.atomic.AtomicLong r4 = X.C63160SeI.A05
            long r5 = r4.incrementAndGet()
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L69
            X.C63160SeI.A00()
        L69:
            X.9Bs r0 = X.C63160SeI.A01
            if (r0 == 0) goto L88
            long r1 = r0.A02
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L26
            boolean r0 = X.AbstractC79383gk.A03()
            if (r0 != 0) goto L26
            android.os.Handler r1 = X.C63160SeI.A00
            r0 = 0
            if (r1 != 0) goto Lcd
            java.lang.String r0 = "backgroundHandler"
        L80:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L88:
            java.lang.String r0 = "config"
            goto L80
        L8b:
            java.lang.String r2 = r8.A02
            int r1 = r2.hashCode()
            r0 = -1695461095(0xffffffff9af15119, float:-9.9806284E-23)
            if (r1 == r0) goto Lca
            r0 = -1019213806(0xffffffffc3400812, float:-192.03152)
            if (r1 == r0) goto Lac
            r0 = -351073398(0xffffffffeb130b8a, float:-1.7776659E26)
            if (r1 != r0) goto L55
            java.lang.String r0 = "Litho.TreeFuture.Resume"
        La2:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L55
            r0 = 0
        La9:
            X.C63914Svp.A00 = r0
            goto L55
        Lac:
            java.lang.String r0 = "Litho.TreeFuture.Wait"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L55
            java.util.Map r1 = r8.A03
            java.lang.String r0 = "waiting-on"
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L55
            java.util.concurrent.ConcurrentHashMap r0 = X.C63160SeI.A03
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 != 0) goto La9
            goto L55
        Lca:
            java.lang.String r0 = "Litho.TreeFuture.Get"
            goto La2
        Lcd:
            r1.removeCallbacksAndMessages(r0)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 0
        Ld3:
            r3.poll()
            int r0 = r0 + 1
            if (r0 < r1) goto Ld3
            long r2 = r4.get()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 - r0
            r4.set(r2)
            X.C63160SeI.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60537R6a.A00(X.Pxo):void");
    }
}
