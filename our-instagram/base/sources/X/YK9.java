package X;

/* loaded from: classes12.dex */
public final class YK9 extends Thread {
    public final /* synthetic */ C72749XmQ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YK9(C72749XmQ c72749XmQ) {
        super("PhantomDestructor");
        this.A00 = c72749XmQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[EDGE_INSN: B:14:0x001a->B:15:0x001a BREAK  A[LOOP:1: B:3:0x0003->B:13:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x000e -> B:5:0x0018). Please report as a decompilation issue!!! */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            X.XmQ r4 = r5.A00
        L2:
            r0 = 0
        L3:
            java.lang.ref.ReferenceQueue r1 = r4.A01     // Catch: java.lang.InterruptedException -> Lc
            java.lang.ref.Reference r1 = r1.remove()     // Catch: java.lang.InterruptedException -> Lc
            X.YKM r1 = (X.YKM) r1     // Catch: java.lang.InterruptedException -> Lc
            goto L18
        Lc:
            if (r0 == 0) goto L3
            java.lang.ref.ReferenceQueue r3 = r4.A01     // Catch: java.lang.InterruptedException -> Lc
            r1 = 15000(0x3a98, double:7.411E-320)
            java.lang.ref.Reference r1 = r3.remove(r1)     // Catch: java.lang.InterruptedException -> Lc
            X.YKM r1 = (X.YKM) r1     // Catch: java.lang.InterruptedException -> Lc
        L18:
            if (r1 != 0) goto L1c
            monitor-enter(r4)
            goto L32
        L1c:
            X.YNc r0 = r1.A00
            r0.targetDestructed()
            monitor-enter(r4)
            java.util.HashSet r2 = r4.A02     // Catch: java.lang.Throwable -> L45
            boolean r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L45
            r0 = 0
            X.C02R.A07(r1, r0)     // Catch: java.lang.Throwable -> L45
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            goto Lc
        L32:
            java.util.HashSet r0 = r4.A02     // Catch: java.lang.Throwable -> L45
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L45
            r0 = 0
            if (r1 == 0) goto L41
            r4.A00 = r0     // Catch: java.lang.Throwable -> L45
            r4.notifyAll()     // Catch: java.lang.Throwable -> L45
            goto L43
        L41:
            monitor-exit(r4)
            goto L2
        L43:
            monitor-exit(r4)
            return
        L45:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YK9.run():void");
    }
}
