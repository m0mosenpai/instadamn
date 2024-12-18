package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class Y12 {
    public C72850Xp6 A00;
    public InterfaceC197758om A01;
    public C201528vh A03;
    public C200688uB A02 = null;
    public final C201278vB A04 = new C201278vB();
    public final AtomicBoolean A05 = new AtomicBoolean(false);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r1.A0L == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(X.C200598u2 r8, X.Y12 r9, X.C72822Xo6 r10, X.C200688uB r11, X.C201278vB r12) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r4 = r9.A05
            boolean r0 = r8.A07
            if (r0 == 0) goto L13
            X.81A r1 = r8.A05
            X.818 r1 = (X.AnonymousClass818) r1
            X.7vE r0 = r1.A0k
            if (r0 == 0) goto L13
            boolean r1 = r1.A0L
            r0 = 1
            if (r1 != 0) goto L14
        L13:
            r0 = 0
        L14:
            r4.set(r0)
            X.810 r0 = r12.A00()
            int r1 = r0.A01
            int r0 = r0.A00
            android.opengl.GLES20.glBindTexture(r1, r0)
            int r0 = r11.A00
            r5 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r5, r0)
            int r1 = r11.A02
            int r0 = r11.A01
            r7 = 0
            android.opengl.GLES20.glViewport(r7, r7, r1, r0)
            X.8om r0 = r9.A01
            long r0 = r0.ANc()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            X.8vh r6 = r9.A03
            boolean r2 = r8.A03
            if (r2 == 0) goto L5a
            X.81A r3 = r8.A05
            boolean r2 = r3 instanceof X.C81B
            if (r2 == 0) goto L4d
            r2 = r3
            X.81B r2 = (X.C81B) r2
            r2.ETG(r6)
        L4d:
            boolean r2 = r3 instanceof X.AnonymousClass818
            if (r2 == 0) goto L56
            r2 = r3
            X.818 r2 = (X.AnonymousClass818) r2
            r2.A03 = r10
        L56:
            boolean r7 = r3.DCH(r12, r0)
        L5a:
            r1 = 0
            android.opengl.GLES20.glBindFramebuffer(r5, r1)
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r0, r1)
            r4.set(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y12.A00(X.8u2, X.Y12, X.Xo6, X.8uB, X.8vB):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r4.A00 <= 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C200598u2 r13, X.C72822Xo6 r14, java.lang.String r15) {
        /*
            r12 = this;
            X.Xp6 r0 = r12.A00
            r0.getClass()
            X.Xp6 r4 = r12.A00
            monitor-enter(r4)
            int r0 = r4.A02     // Catch: java.lang.Throwable -> L83
            if (r0 <= 0) goto L11
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L83
            r1 = 1
            if (r0 > 0) goto L12
        L11:
            r1 = 0
        L12:
            java.lang.String r0 = "Frame buffer provider not initialized"
            X.C0J8.A09(r1, r0)     // Catch: java.lang.Throwable -> L85
            int r3 = r4.A01     // Catch: java.lang.Throwable -> L85
            r0 = 4
            r2 = 0
            r1 = 0
            if (r3 >= r0) goto L1f
            r1 = 1
        L1f:
            java.lang.String r0 = "Using more than the expected # of framebuffers"
            X.C0J8.A09(r1, r0)     // Catch: java.lang.Throwable -> L85
            java.util.List r1 = r4.A03     // Catch: java.lang.Throwable -> L85
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L39
            java.lang.Object r3 = r1.remove(r2)     // Catch: java.lang.Throwable -> L85
            X.8uB r3 = (X.C200688uB) r3     // Catch: java.lang.Throwable -> L85
        L32:
            int r0 = r4.A01     // Catch: java.lang.Throwable -> L85
            int r0 = r0 + 1
            r4.A01 = r0     // Catch: java.lang.Throwable -> L85
            goto L4b
        L39:
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)     // Catch: java.lang.Throwable -> L85
            int r1 = r4.A02     // Catch: java.lang.Throwable -> L85
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L85
            X.8uB r3 = new X.8uB     // Catch: java.lang.Throwable -> L85
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L85
            r3.A00()     // Catch: java.lang.Throwable -> L85
            goto L32
        L4b:
            monitor-exit(r4)
            X.8vB r4 = r12.A04     // Catch: java.lang.Throwable -> L7a
            boolean r0 = A00(r13, r12, r14, r3, r4)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L6d
            X.8uB r1 = r12.A02     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L5d
            X.Xp6 r0 = r12.A00     // Catch: java.lang.Throwable -> L7a
            r0.A01(r1)     // Catch: java.lang.Throwable -> L7a
        L5d:
            r12.A02 = r3     // Catch: java.lang.Throwable -> L7a
            X.810 r5 = r3.A03     // Catch: java.lang.Throwable -> L6b
            long r10 = r4.A00     // Catch: java.lang.Throwable -> L6b
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            r4.A03(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6b
            goto L74
        L6b:
            r1 = move-exception
            throw r1
        L6d:
            if (r3 == 0) goto L74
            X.Xp6 r0 = r12.A00
            r0.A01(r3)
        L74:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.AbstractC180237zD.A02(r15, r0)
            return
        L7a:
            r1 = move-exception
            if (r3 == 0) goto L82
            X.Xp6 r0 = r12.A00
            r0.A01(r3)
        L82:
            throw r1
        L83:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y12.A01(X.8u2, X.Xo6, java.lang.String):void");
    }
}
