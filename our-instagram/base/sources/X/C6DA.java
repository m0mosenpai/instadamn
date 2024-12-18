package X;

/* renamed from: X.6DA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6DA extends AbstractC42051wv {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r4.compareAndSet(false, true) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A03(X.C6DH r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C6D9
            if (r0 == 0) goto L59
            r6 = r7
            X.6D9 r6 = (X.C6D9) r6
        L7:
            java.util.concurrent.atomic.AtomicReference r2 = r6.A03
            java.lang.Object r5 = r2.get()
            X.6JK r5 = (X.C6JK) r5
            if (r5 == 0) goto L1b
            java.util.concurrent.atomic.AtomicReference r0 = r5.A03
            java.lang.Object r1 = r0.get()
            X.6JO[] r0 = X.C6JK.A05
            if (r1 != r0) goto L2d
        L1b:
            r1 = 1
            X.6JL r0 = new X.6JL
            r0.<init>(r1)
            X.6JK r1 = new X.6JK
            r1.<init>(r0)
            boolean r0 = X.C1EM.A00(r5, r1, r2)
            if (r0 == 0) goto L7
            r5 = r1
        L2d:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.A02
            boolean r0 = r4.get()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L3e
            boolean r0 = r4.compareAndSet(r2, r3)
            r1 = 1
            if (r0 != 0) goto L3f
        L3e:
            r1 = 0
        L3f:
            r8.accept(r5)     // Catch: java.lang.Throwable -> L43
            goto L51
        L43:
            r0 = move-exception
            if (r1 == 0) goto L49
            r4.compareAndSet(r3, r2)
        L49:
            X.AbstractC62281S5a.A00(r0)
            java.lang.RuntimeException r0 = X.Y4X.A00(r0)
            throw r0
        L51:
            if (r1 == 0) goto L61
            X.1ww r0 = r6.A01
            r0.EpF(r5)
            return
        L59:
            r0 = r7
            X.6Iu r0 = (X.C137156Iu) r0
            X.6DA r0 = r0.A00
            r0.A03(r8)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6DA.A03(X.6DH):void");
    }
}
