package X;

import java.util.List;

/* renamed from: X.0o6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0o6 extends Thread {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final C0v7 A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public volatile AbstractRunnableC14200nk A07;

    public C0o6(C0v7 c0v7, String str, List list, int i, int i2, boolean z) {
        C14360o3.A0B(c0v7, 1);
        C14360o3.A0B(list, 4);
        C14360o3.A0B(str, 6);
        this.A03 = c0v7;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = list;
        this.A06 = z;
        this.A04 = str;
        setName(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A01
            android.os.Process.setThreadPriority(r0)
        L5:
            boolean r0 = r13.A00
            if (r0 != 0) goto Lce
            X.0v7 r7 = r13.A03
            int r12 = r13.A02
            int[] r11 = r7.A03
            java.util.List r8 = r7.A01
            java.util.List r9 = r7.A00
            java.util.concurrent.atomic.AtomicInteger r10 = r7.A02
            X.0nk r1 = r7.A01(r8, r9, r10, r11, r12)
            if (r1 == 0) goto Laa
            X.0vD r0 = new X.0vD
            r0.<init>(r1)
            r13.A07 = r0
        L22:
            X.0nk r4 = r13.A07
            r5 = 0
            if (r4 == 0) goto La6
            java.util.List r6 = r13.A05
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L49
            int r2 = r7.A00()
            java.util.Iterator r1 = r6.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r1.next()
            X.0nl r0 = (X.InterfaceC14210nl) r0
            r0.onStartTask(r4, r2)
            goto L39
        L49:
            X.0SJ r1 = r4.furyContext
            if (r1 == 0) goto L5d
            int r0 = r1.getType()
            X.0SJ r3 = X.C06600Wq.A01(r1, r0)
        L55:
            X.0v3 r2 = X.AbstractC14310nv.A00
            if (r2 == 0) goto L5f
            r2.A03(r4)
            goto L5f
        L5d:
            r3 = r5
            goto L55
        L5f:
            r4.run()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L67
            r2.A02(r4)
        L67:
            if (r3 == 0) goto L86
            r3.close()
            goto L86
        L6d:
            r1 = move-exception
            if (r2 == 0) goto L73
            r2.A01(r4)     // Catch: java.lang.Throwable -> Lc2
        L73:
            java.lang.String r0 = "IG_EXECUTOR_TASK"
            X.C0w9.A07(r0, r1)     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = r13.A06     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto Lc1
            if (r2 == 0) goto L81
            r2.A02(r4)
        L81:
            if (r3 == 0) goto L86
            r3.close()
        L86:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto La6
            int r2 = r7.A00()
            java.util.Iterator r1 = r6.iterator()
        L96:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r1.next()
            X.0nl r0 = (X.InterfaceC14210nl) r0
            r0.onFinishTask(r4, r2)
            goto L96
        La6:
            r13.A07 = r5
            goto L5
        Laa:
            r10.decrementAndGet()
            int r0 = r12 + (-1)
            java.lang.Object r0 = r9.get(r0)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r13)
        Lb8:
            java.util.concurrent.locks.LockSupport.park()
            X.0nk r0 = r13.A07
            if (r0 == 0) goto Lb8
            goto L22
        Lc1:
            throw r1     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r0 = move-exception
            if (r2 == 0) goto Lc8
            r2.A02(r4)
        Lc8:
            if (r3 == 0) goto Lcd
            r3.close()
        Lcd:
            throw r0
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0o6.run():void");
    }
}
