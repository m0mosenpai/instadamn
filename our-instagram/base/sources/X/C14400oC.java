package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0oC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14400oC extends Thread {
    public int A00;
    public boolean A01;
    public final C0v7 A03;
    public final List A02 = Collections.synchronizedList(new ArrayList());
    public final Map A04 = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
    
        java.lang.Thread.sleep(r13.A00);
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            boolean r0 = r13.A01
            if (r0 == 0) goto L5
            return
        L5:
            java.util.List r3 = r13.A02
            int r2 = r3.size()
        Lb:
            int r2 = r2 + (-1)
            if (r2 < 0) goto Lbb
            java.lang.Object r4 = r3.get(r2)     // Catch: java.lang.IndexOutOfBoundsException -> Lac
            X.0o6 r4 = (X.C0o6) r4     // Catch: java.lang.IndexOutOfBoundsException -> Lac
            java.util.Map r5 = r13.A04
            java.lang.Object r0 = r5.get(r4)
            X.0nk r1 = r4.A07
            if (r0 != r1) goto La7
            if (r1 == 0) goto La7
            r6 = 1
            boolean r0 = r4.A00     // Catch: java.lang.Throwable -> La3
            r0 = r0 ^ 1
            r4.A00 = r6     // Catch: java.lang.OutOfMemoryError -> Lb0
            if (r0 == 0) goto L9b
            int r9 = r13.A00     // Catch: java.lang.OutOfMemoryError -> Lb0
            X.0w9 r8 = X.C0w9.A01     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch: java.lang.OutOfMemoryError -> Lb0
            int r0 = r1.runnableId     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.lang.String r0 = "Background task stuck: runnableId=%d timeoutMs=%d"
            java.lang.String r7 = java.lang.String.format(r7, r0, r6)     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.lang.String r6 = "IG_EXECUTOR_STUCK_SIMPLE_WORKER"
            r0 = 100000(0x186a0, float:1.4013E-40)
            r8.EmO(r6, r7, r0)     // Catch: java.lang.OutOfMemoryError -> Lb0
            X.0nS r0 = X.C14120nc.A00()     // Catch: java.lang.OutOfMemoryError -> Lb0
            X.0vO r0 = (X.C18370vO) r0     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.util.List r0 = r0.A01     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.OutOfMemoryError -> Lb0
        L58:
            boolean r0 = r6.hasNext()     // Catch: java.lang.OutOfMemoryError -> Lb0
            if (r0 == 0) goto L68
            java.lang.Object r0 = r6.next()     // Catch: java.lang.OutOfMemoryError -> Lb0
            X.0nl r0 = (X.InterfaceC14210nl) r0     // Catch: java.lang.OutOfMemoryError -> Lb0
            r0.onStuckTask(r1, r4)     // Catch: java.lang.OutOfMemoryError -> Lb0
            goto L58
        L68:
            X.0v7 r7 = r4.A03     // Catch: java.lang.OutOfMemoryError -> Lb0
            int r10 = r4.A02     // Catch: java.lang.OutOfMemoryError -> Lb0
            int r11 = r4.A01     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.util.List r9 = r4.A05     // Catch: java.lang.OutOfMemoryError -> Lb0
            boolean r12 = r4.A06     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.lang.String r8 = r4.A04     // Catch: java.lang.OutOfMemoryError -> Lb0
            X.0o6 r6 = new X.0o6     // Catch: java.lang.OutOfMemoryError -> Lb0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.OutOfMemoryError -> Lb0
            r6.start()     // Catch: java.lang.OutOfMemoryError -> Lb0
            r3.add(r6)     // Catch: java.lang.OutOfMemoryError -> Lb0
            X.0v3 r0 = X.AbstractC14310nv.A00     // Catch: java.lang.OutOfMemoryError -> Lb0
            if (r0 == 0) goto L9b
            int r0 = r1.runnableId     // Catch: java.lang.OutOfMemoryError -> Lb0
            long r0 = (long) r0     // Catch: java.lang.OutOfMemoryError -> Lb0
            java.lang.Long r6 = new java.lang.Long     // Catch: java.lang.OutOfMemoryError -> Lb0
            r6.<init>(r0)     // Catch: java.lang.OutOfMemoryError -> Lb0
            long r0 = r6.longValue()     // Catch: java.lang.OutOfMemoryError -> Lb0
            X.0nS r7 = X.C14120nc.A00()     // Catch: java.lang.OutOfMemoryError -> Lb0
            X.0v4 r6 = new X.0v4     // Catch: java.lang.OutOfMemoryError -> Lb0
            r6.<init>(r0)     // Catch: java.lang.OutOfMemoryError -> Lb0
            r7.ATO(r6)     // Catch: java.lang.OutOfMemoryError -> Lb0
        L9b:
            r3.remove(r4)     // Catch: java.lang.OutOfMemoryError -> Lb0
            r5.remove(r4)     // Catch: java.lang.OutOfMemoryError -> Lb0
            goto Lb
        La3:
            r0 = move-exception
            r4.A00 = r6     // Catch: java.lang.OutOfMemoryError -> Lb0
            throw r0     // Catch: java.lang.OutOfMemoryError -> Lb0
        La7:
            r5.put(r4, r1)
            goto Lb
        Lac:
            r1 = move-exception
            java.lang.String r0 = "IgExecutorV2"
            goto Lb6
        Lb0:
            r1 = move-exception
            r0 = 0
            r4.A00 = r0
            java.lang.String r0 = "OOM when creating a new SimpleWorker"
        Lb6:
            X.C0w9.A07(r0, r1)
            goto Lb
        Lbb:
            int r0 = r13.A00     // Catch: java.lang.InterruptedException -> Lc3
            long r0 = (long) r0     // Catch: java.lang.InterruptedException -> Lc3
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Lc3
            goto L5
        Lc3:
            r1 = move-exception
            java.lang.String r0 = "IG_EXECUTOR_STUCK_SIMPLE_WORKER"
            X.C0w9.A07(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14400oC.run():void");
    }

    public C14400oC(C14130nd c14130nd, C0v7 c0v7) {
        this.A00 = 500;
        this.A01 = false;
        setName("IgExecutorSimpleMonitor");
        if (c14130nd.A0B) {
            this.A00 = c14130nd.A06;
            this.A01 = c14130nd.A0E;
        }
        this.A03 = c0v7;
    }
}
