package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* renamed from: X.1LT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1LT extends C1LW {
    public static final C25051Kj A03 = new C25051Kj(C1LT.class);
    public ImmutableCollection A00;
    public final boolean A01;
    public final boolean A02;

    public abstract void A0D();

    public abstract void A0E(int index, Object returnValue);

    public static void A01(ImmutableCollection immutableCollection, C1LT c1lt) {
        int A00 = C1LW.A00.A00(c1lt);
        boolean z = false;
        if (A00 >= 0) {
            z = true;
        }
        C18C.A0H(z, "Less than 0 remaining futures");
        if (A00 == 0) {
            if (immutableCollection != null) {
                int i = 0;
                C1LC it = immutableCollection.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        A02(c1lt, future, i);
                    }
                    i++;
                }
            }
            c1lt.seenExceptions = null;
            c1lt.A0D();
            c1lt.A0F(C05F.A01);
        }
    }

    @Override // X.AbstractC25011Ke
    public final String A07() {
        ImmutableCollection immutableCollection = this.A00;
        if (immutableCollection != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("futures=");
            sb.append(immutableCollection);
            return sb.toString();
        }
        return super.A07();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (((X.C25561Mm) r1).A01 == false) goto L11;
     */
    @Override // X.AbstractC25011Ke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08() {
        /*
            r4 = this;
            com.google.common.collect.ImmutableCollection r3 = r4.A00
            java.lang.Integer r0 = X.C05F.A00
            r4.A0F(r0)
            boolean r1 = r4.isCancelled()
            r0 = 0
            if (r3 == 0) goto Lf
            r0 = 1
        Lf:
            r1 = r1 & r0
            if (r1 == 0) goto L34
            java.lang.Object r1 = r4.value
            boolean r0 = r1 instanceof X.C25561Mm
            if (r0 == 0) goto L1f
            X.1Mm r1 = (X.C25561Mm) r1
            boolean r0 = r1.A01
            r2 = 1
            if (r0 != 0) goto L20
        L1f:
            r2 = 0
        L20:
            X.1LC r1 = r3.iterator()
        L24:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            r0.cancel(r2)
            goto L24
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1LT.A08():void");
    }

    public final void A0C() {
        final ImmutableCollection immutableCollection;
        this.A00.getClass();
        if (this.A00.isEmpty()) {
            A0D();
            return;
        }
        if (this.A01) {
            final int i = 0;
            C1LC it = this.A00.iterator();
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                listenableFuture.addListener(new Runnable() { // from class: X.JSv
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1LT c1lt = C1LT.this;
                        ListenableFuture listenableFuture2 = listenableFuture;
                        int i2 = i;
                        try {
                            if (listenableFuture2.isCancelled()) {
                                c1lt.A00 = null;
                                c1lt.cancel(false);
                            } else {
                                C1LT.A02(c1lt, listenableFuture2, i2);
                            }
                        } finally {
                            C1LT.A01(null, c1lt);
                        }
                    }
                }, C1M8.A01);
                i++;
            }
            return;
        }
        if (this.A02) {
            immutableCollection = this.A00;
        } else {
            immutableCollection = null;
        }
        Runnable runnable = new Runnable() { // from class: X.1M5
            @Override // java.lang.Runnable
            public final void run() {
                C1LT.A01(immutableCollection, this);
            }
        };
        C1LC it2 = this.A00.iterator();
        while (it2.hasNext()) {
            ((ListenableFuture) it2.next()).addListener(runnable, C1M8.A01);
        }
    }

    public C1LT(ImmutableCollection futures, boolean allMustSucceed, boolean collectsValues) {
        int size = futures.size();
        this.seenExceptions = null;
        this.remaining = size;
        this.A00 = futures;
        this.A01 = allMustSucceed;
        this.A02 = collectsValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C1LT r4, java.util.concurrent.Future r5, int r6) {
        /*
            boolean r1 = r5.isDone()     // Catch: java.lang.Throwable -> L11 java.util.concurrent.ExecutionException -> L13
            java.lang.String r0 = "Future was expected to be done: %s"
            X.C18C.A0B(r5, r0, r1)     // Catch: java.lang.Throwable -> L11 java.util.concurrent.ExecutionException -> L13
            java.lang.Object r0 = X.AbstractC53362cK.A00(r5)     // Catch: java.lang.Throwable -> L11 java.util.concurrent.ExecutionException -> L13
            r4.A0E(r6, r0)     // Catch: java.lang.Throwable -> L11 java.util.concurrent.ExecutionException -> L13
            return
        L11:
            r3 = move-exception
            goto L18
        L13:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()
        L18:
            r3.getClass()
            boolean r0 = r4.A01
            if (r0 == 0) goto L68
            boolean r0 = r4.setException(r3)
            if (r0 != 0) goto L68
            java.util.Set r2 = r4.seenExceptions
            if (r2 != 0) goto L5a
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r0)
            r2.getClass()
            boolean r0 = r4.isCancelled()
            if (r0 != 0) goto L4f
            java.lang.Throwable r1 = r4.A06()
            r1.getClass()
        L42:
            boolean r0 = r2.add(r1)
            if (r0 == 0) goto L4f
            java.lang.Throwable r1 = r1.getCause()
            if (r1 == 0) goto L4f
            goto L42
        L4f:
            X.1Lo r1 = X.C1LW.A00
            r0 = 0
            r1.A01(r4, r0, r2)
            java.util.Set r2 = r4.seenExceptions
            r2.getClass()
        L5a:
            r1 = r3
        L5b:
            boolean r0 = r2.add(r1)
            if (r0 == 0) goto L68
            java.lang.Throwable r1 = r1.getCause()
            if (r1 == 0) goto L6c
            goto L5b
        L68:
            boolean r0 = r3 instanceof java.lang.Error
            if (r0 == 0) goto L7d
        L6c:
            boolean r0 = r3 instanceof java.lang.Error
            if (r0 == 0) goto L7e
            java.lang.String r2 = "Input Future failed with Error"
        L72:
            X.1Kj r0 = X.C1LT.A03
            java.util.logging.Logger r1 = r0.A00()
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE
            r1.log(r0, r2, r3)
        L7d:
            return
        L7e:
            java.lang.String r2 = "Got more than one input Future failure. Logging failures after the first"
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1LT.A02(X.1LT, java.util.concurrent.Future, int):void");
    }

    public void A0F(Integer reason) {
        reason.getClass();
        this.A00 = null;
    }
}
