package X;

/* renamed from: X.PvA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58431PvA implements Runnable {
    public final /* synthetic */ C58424Pv2 A00;
    public final /* synthetic */ C58422Pv0 A01;
    public final /* synthetic */ C58427Pv6 A02;
    public final /* synthetic */ java.util.Set A03;

    public RunnableC58431PvA(C58424Pv2 c58424Pv2, C58422Pv0 c58422Pv0, C58427Pv6 c58427Pv6, java.util.Set set) {
        this.A01 = c58422Pv0;
        this.A03 = set;
        this.A00 = c58424Pv2;
        this.A02 = c58427Pv6;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007d A[Catch: IOException -> 0x00a8, all -> 0x00aa, LOOP:4: B:37:0x0077->B:39:0x007d, LOOP_END, TryCatch #1 {IOException -> 0x00a8, blocks: (B:9:0x001d, B:10:0x0021, B:12:0x0027, B:24:0x004b, B:25:0x004f, B:27:0x0055, B:36:0x0073, B:37:0x0077, B:39:0x007d, B:41:0x0087), top: B:8:0x001d, outer: #3 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            X.Pv0 r2 = r9.A01     // Catch: java.io.IOException -> Lc0
            java.util.Set r5 = r9.A03     // Catch: java.io.IOException -> Lc0
            X.Pv2 r4 = r9.A00     // Catch: java.io.IOException -> Lc0
            java.util.Collection r6 = r2.A05     // Catch: java.io.IOException -> Lc0
            java.util.Iterator r1 = r6.iterator()     // Catch: java.io.IOException -> Lc0
        Lc:
            boolean r0 = r1.hasNext()     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()     // Catch: java.io.IOException -> Lc0
            X.2MN r0 = (X.C2MN) r0     // Catch: java.io.IOException -> Lc0
            r0.A06(r4)     // Catch: java.io.IOException -> Lc0
            goto Lc
        L1c:
            r3 = 0
            java.util.Iterator r5 = r5.iterator()     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
        L21:
            boolean r0 = r5.hasNext()     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            if (r0 == 0) goto L88
            java.lang.Object r7 = r5.next()     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            r8 = 0
            java.util.Iterator r1 = r6.iterator()     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L72
        L32:
            boolean r0 = r1.hasNext()     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L72
            if (r0 == 0) goto L42
            java.lang.Object r0 = r1.next()     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L72
            X.2MN r0 = (X.C2MN) r0     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L72
            r0.A03(r4, r7)     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L72
            goto L32
        L42:
            X.2MR r1 = r2.A03     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L72
            monitor-enter(r1)     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L72
            X.0gI r0 = r1.A00     // Catch: java.lang.Throwable -> L5f
            r0.A04(r7)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r1)     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L72
            java.util.Iterator r1 = r6.iterator()     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
        L4f:
            boolean r0 = r1.hasNext()     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            X.2MN r0 = (X.C2MN) r0     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            r0.A02(r4, r3, r7)     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            goto L4f
        L5f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L72
            throw r0     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L72
        L62:
            r5 = move-exception
            java.lang.String r2 = "AppModuleActionQueryV2"
            java.lang.String r1 = "Exception while loading module %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L72
            X.C0K8.A0L(r2, r1, r5, r0)     // Catch: java.lang.Throwable -> L72
            throw r5     // Catch: java.lang.Throwable -> L6f
        L6f:
            r2 = move-exception
            r8 = r5
            goto L73
        L72:
            r2 = move-exception
        L73:
            java.util.Iterator r1 = r6.iterator()     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
        L77:
            boolean r0 = r1.hasNext()     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            if (r0 == 0) goto L87
            java.lang.Object r0 = r1.next()     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            X.2MN r0 = (X.C2MN) r0     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            r0.A02(r4, r8, r7)     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
            goto L77
        L87:
            throw r2     // Catch: java.io.IOException -> La8 java.lang.Throwable -> Laa
        L88:
            java.util.Iterator r1 = r6.iterator()     // Catch: java.io.IOException -> Lc0
        L8c:
            boolean r0 = r1.hasNext()     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r1.next()     // Catch: java.io.IOException -> Lc0
            X.2MN r0 = (X.C2MN) r0     // Catch: java.io.IOException -> Lc0
            r0.A0A(r4, r3)     // Catch: java.io.IOException -> Lc0
            goto L8c
        L9c:
            X.Pv6 r2 = r9.A02     // Catch: java.io.IOException -> Lc0
            r1 = 1
            X.5tP r0 = new X.5tP     // Catch: java.io.IOException -> Lc0
            r0.<init>(r3, r3, r1)     // Catch: java.io.IOException -> Lc0
            r2.A01(r0)     // Catch: java.io.IOException -> Lc0
            return
        La8:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> Laa
        Laa:
            r2 = move-exception
            java.util.Iterator r1 = r6.iterator()     // Catch: java.io.IOException -> Lc0
        Laf:
            boolean r0 = r1.hasNext()     // Catch: java.io.IOException -> Lc0
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = r1.next()     // Catch: java.io.IOException -> Lc0
            X.2MN r0 = (X.C2MN) r0     // Catch: java.io.IOException -> Lc0
            r0.A0A(r4, r3)     // Catch: java.io.IOException -> Lc0
            goto Laf
        Lbf:
            throw r2     // Catch: java.io.IOException -> Lc0
        Lc0:
            r5 = move-exception
            X.Pv6 r4 = r9.A02
            r3 = 0
            r2 = 0
            r0 = -1
            X.5kd r1 = new X.5kd
            r1.<init>(r2, r0, r3, r3)
            X.5tP r0 = new X.5tP
            r0.<init>(r1, r5, r3)
            r4.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC58431PvA.run():void");
    }
}
