package X;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1SG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1SG {
    public IOException A00;
    public boolean A01;
    public final Queue A02;
    public final Condition A03;
    public final ReentrantLock A04;
    public final InterfaceC16660sJ A05;

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        throw new java.lang.RuntimeException("Response body stream is in an invalid state: available bytes > 0, but no buffers remain");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.InterfaceC16660sJ r8) {
        /*
            r7 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r0)
            X.C14360o3.A07(r5)
        L9:
            java.util.concurrent.locks.ReentrantLock r4 = r7.A04
            r4.lock()
        Le:
            boolean r0 = r7.A01     // Catch: java.lang.Throwable -> Laa
            if (r0 != 0) goto L24
            java.util.Queue r0 = r7.A02     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L24
            java.io.IOException r0 = r7.A00     // Catch: java.lang.Throwable -> Laa
            if (r0 != 0) goto L24
            java.util.concurrent.locks.Condition r0 = r7.A03     // Catch: java.lang.InterruptedException -> Le java.lang.Throwable -> Laa
            r0.await()     // Catch: java.lang.InterruptedException -> Le java.lang.Throwable -> Laa
            goto Le
        L24:
            java.io.IOException r0 = r7.A00     // Catch: java.lang.Throwable -> Laa
            if (r0 != 0) goto La9
            boolean r0 = r7.A01     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L35
            java.util.Queue r0 = r7.A02     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Laa
            if (r0 == 0) goto L35
            goto L89
        L35:
            int r1 = r5.position()     // Catch: java.lang.Throwable -> Laa
            int r0 = r5.capacity()     // Catch: java.lang.Throwable -> Laa
            if (r1 >= r0) goto L84
            java.util.Queue r6 = r7.A02     // Catch: java.lang.Throwable -> Laa
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> Laa
            r0 = r0 ^ 1
            if (r0 == 0) goto L84
            java.lang.Object r3 = r6.peek()     // Catch: java.lang.Throwable -> Laa
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch: java.lang.Throwable -> Laa
            if (r3 == 0) goto La2
            int r2 = r3.limit()     // Catch: java.lang.Throwable -> Laa
            int r1 = r3.remaining()     // Catch: java.lang.Throwable -> Laa
            int r0 = r5.remaining()     // Catch: java.lang.Throwable -> Laa
            if (r1 <= r0) goto L6b
            int r1 = r3.position()     // Catch: java.lang.Throwable -> Laa
            int r0 = r5.remaining()     // Catch: java.lang.Throwable -> Laa
            int r1 = r1 + r0
            r3.limit(r1)     // Catch: java.lang.Throwable -> Laa
        L6b:
            r5.put(r3)     // Catch: java.lang.Throwable -> Laa
            r3.limit(r2)     // Catch: java.lang.Throwable -> Laa
            int r0 = r3.remaining()     // Catch: java.lang.Throwable -> Laa
            if (r0 != 0) goto L35
            X.0sJ r1 = r7.A05     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r0 = r6.remove()     // Catch: java.lang.Throwable -> Laa
            X.C14360o3.A07(r0)     // Catch: java.lang.Throwable -> Laa
            r1.invoke(r0)     // Catch: java.lang.Throwable -> Laa
            goto L35
        L84:
            int r0 = r5.position()     // Catch: java.lang.Throwable -> Laa
            goto L8a
        L89:
            r0 = -1
        L8a:
            r4.unlock()
            if (r0 <= 0) goto La1
            int r0 = r5.position()
            r5.limit(r0)
            r5.rewind()
            r8.invoke(r5)
            r5.clear()
            goto L9
        La1:
            return
        La2:
            java.lang.String r1 = "Response body stream is in an invalid state: available bytes > 0, but no buffers remain"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Laa
        La9:
            throw r0     // Catch: java.lang.Throwable -> Laa
        Laa:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1SG.A00(X.0sJ):void");
    }

    public C1SG(InterfaceC16660sJ interfaceC16660sJ) {
        this.A05 = interfaceC16660sJ;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A04 = reentrantLock;
        this.A03 = reentrantLock.newCondition();
        this.A02 = new LinkedList();
    }
}
