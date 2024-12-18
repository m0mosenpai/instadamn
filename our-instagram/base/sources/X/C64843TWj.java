package X;

/* renamed from: X.TWj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64843TWj implements InterfaceC65677Tr7 {
    public C63365SiO A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final /* synthetic */ C63029Sb0 A06;
    public final TWX A05 = new Object();
    public final TWX A04 = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TWX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.TWX, java.lang.Object] */
    public C64843TWj(C63029Sb0 c63029Sb0, long j) {
        this.A06 = c63029Sb0;
        this.A03 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    @Override // X.InterfaceC65677Tr7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E7q(X.TWX r23, long r24) {
        /*
            r22 = this;
            r7 = 0
            r1 = r24
            int r0 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lf
            java.lang.String r0 = "byteCount < 0: "
            java.lang.IllegalArgumentException r10 = X.AbstractC58319PtB.A0h(r0, r1)
        Le:
            throw r10
        Lf:
            r10 = 0
            r11 = r22
            X.Sb0 r9 = r11.A06
            monitor-enter(r9)
            X.Teh r6 = r9.A0A     // Catch: java.lang.Throwable -> Lae
            r6.A08()     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = r9.A03     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L27
            java.io.IOException r10 = r9.A02     // Catch: java.lang.Throwable -> La9
            if (r10 != 0) goto L27
            X.Rdz r10 = new X.Rdz     // Catch: java.lang.Throwable -> La9
            r10.<init>(r0)     // Catch: java.lang.Throwable -> La9
        L27:
            boolean r0 = r11.A01     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto La1
            X.TWX r5 = r11.A04     // Catch: java.lang.Throwable -> La9
            long r3 = r5.A00     // Catch: java.lang.Throwable -> La9
            r14 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L45
            long r0 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> La9
            r2 = r23
            long r4 = r5.E7q(r2, r0)     // Catch: java.lang.Throwable -> La9
            long r2 = r9.A01     // Catch: java.lang.Throwable -> La9
            long r2 = r2 + r4
            r9.A01 = r2     // Catch: java.lang.Throwable -> La9
            goto L53
        L45:
            boolean r0 = r11.A02     // Catch: java.lang.Throwable -> La9
            if (r0 != 0) goto L85
            if (r10 != 0) goto L85
            r9.wait()     // Catch: java.lang.InterruptedException -> L98 java.lang.Throwable -> La9
            r6.A0B()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lae
            goto Lf
        L53:
            if (r10 != 0) goto L87
            X.THU r11 = r9.A07     // Catch: java.lang.Throwable -> La9
            X.SNj r0 = r11.A0A     // Catch: java.lang.Throwable -> La9
            int r0 = r0.A00()     // Catch: java.lang.Throwable -> La9
            int r0 = r0 / 2
            long r0 = (long) r0     // Catch: java.lang.Throwable -> La9
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 < 0) goto L87
            int r13 = r9.A05     // Catch: java.lang.Throwable -> La9
            java.util.concurrent.ScheduledExecutorService r12 = r11.A0G     // Catch: java.util.concurrent.RejectedExecutionException -> L82 java.lang.Throwable -> La9
            java.lang.String r1 = r11.A0C     // Catch: java.util.concurrent.RejectedExecutionException -> L82 java.lang.Throwable -> La9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch: java.util.concurrent.RejectedExecutionException -> L82 java.lang.Throwable -> La9
            java.lang.Object[] r18 = new java.lang.Object[]{r1, r0}     // Catch: java.util.concurrent.RejectedExecutionException -> L82 java.lang.Throwable -> La9
            X.TeP r0 = new X.TeP     // Catch: java.util.concurrent.RejectedExecutionException -> L82 java.lang.Throwable -> La9
            r20 = r2
            r19 = r13
            r17 = r11
            r16 = r0
            r16.<init>(r17, r18, r19, r20)     // Catch: java.util.concurrent.RejectedExecutionException -> L82 java.lang.Throwable -> La9
            r12.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L82 java.lang.Throwable -> La9
        L82:
            r9.A01 = r7     // Catch: java.lang.Throwable -> La9
            goto L87
        L85:
            r4 = -1
        L87:
            r6.A0B()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lae
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L95
            X.THU r0 = r9.A07
            r0.A04(r4)
            return r4
        L95:
            if (r10 != 0) goto Le
            return r14
        L98:
            X.AbstractC58318PtA.A18()     // Catch: java.lang.Throwable -> La9
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> La9
            r0.<init>()     // Catch: java.lang.Throwable -> La9
            goto La8
        La1:
            java.lang.String r0 = "stream closed"
            java.io.IOException r0 = X.MSW.A0y(r0)     // Catch: java.lang.Throwable -> La9
        La8:
            throw r0     // Catch: java.lang.Throwable -> La9
        La9:
            r0 = move-exception
            r6.A0B()     // Catch: java.lang.Throwable -> Lae
            throw r0     // Catch: java.lang.Throwable -> Lae
        Lae:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lae
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64843TWj.E7q(X.TWX, long):long");
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return this.A06.A0A;
    }

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        long j;
        C63029Sb0 c63029Sb0 = this.A06;
        synchronized (c63029Sb0) {
            this.A01 = true;
            TWX twx = this.A04;
            j = twx.A00;
            twx.A0A();
            c63029Sb0.notifyAll();
        }
        if (j > 0) {
            c63029Sb0.A07.A04(j);
        }
        c63029Sb0.A02();
    }
}
