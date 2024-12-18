package X;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.7tJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176617tJ extends FutureTask {
    public final ArrayList A00;
    public final UUID A01;
    public final String A02;
    public final /* synthetic */ C175227qw A03;

    private synchronized void A00(boolean z) {
        if (z) {
            AbstractC09790fc.A01(this.A02, -1341607321);
        } else {
            AbstractC09790fc.A00(1731813202);
        }
    }

    public final synchronized void A01(final AbstractC184688Hj abstractC184688Hj) {
        C175227qw c175227qw;
        UUID uuid;
        Runnable runnable;
        if (isDone()) {
            final Exception exc = null;
            try {
                final Object obj = get();
                final boolean z = true;
                this.A03.A05(new Runnable() { // from class: X.Ayp
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z2 = z;
                        AbstractC184688Hj abstractC184688Hj2 = abstractC184688Hj;
                        Object obj2 = obj;
                        Exception exc2 = exc;
                        if (z2) {
                            abstractC184688Hj2.A02(obj2);
                            return;
                        }
                        if (!(exc2 instanceof CancellationException)) {
                            exc2.getClass();
                        }
                        abstractC184688Hj2.A01(exc2);
                    }
                }, this.A01);
            } catch (InterruptedException e) {
                e = e;
                final boolean z2 = false;
                c175227qw = this.A03;
                uuid = this.A01;
                runnable = new Runnable() { // from class: X.Ayp
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z22 = z2;
                        AbstractC184688Hj abstractC184688Hj2 = abstractC184688Hj;
                        Object obj2 = exc;
                        Exception exc2 = e;
                        if (z22) {
                            abstractC184688Hj2.A02(obj2);
                            return;
                        }
                        if (!(exc2 instanceof CancellationException)) {
                            exc2.getClass();
                        }
                        abstractC184688Hj2.A01(exc2);
                    }
                };
                c175227qw.A05(runnable, uuid);
            } catch (CancellationException e2) {
                final boolean z3 = false;
                c175227qw = this.A03;
                uuid = this.A01;
                runnable = new Runnable() { // from class: X.Ayp
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z22 = z3;
                        AbstractC184688Hj abstractC184688Hj2 = abstractC184688Hj;
                        Object obj2 = exc;
                        Exception exc2 = e2;
                        if (z22) {
                            abstractC184688Hj2.A02(obj2);
                            return;
                        }
                        if (!(exc2 instanceof CancellationException)) {
                            exc2.getClass();
                        }
                        abstractC184688Hj2.A01(exc2);
                    }
                };
                c175227qw.A05(runnable, uuid);
            } catch (ExecutionException e3) {
                e = e3;
                final boolean z22 = false;
                c175227qw = this.A03;
                uuid = this.A01;
                runnable = new Runnable() { // from class: X.Ayp
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z222 = z22;
                        AbstractC184688Hj abstractC184688Hj2 = abstractC184688Hj;
                        Object obj2 = exc;
                        Exception exc2 = e;
                        if (z222) {
                            abstractC184688Hj2.A02(obj2);
                            return;
                        }
                        if (!(exc2 instanceof CancellationException)) {
                            exc2.getClass();
                        }
                        abstractC184688Hj2.A01(exc2);
                    }
                };
                c175227qw.A05(runnable, uuid);
            }
        } else {
            this.A00.add(abstractC184688Hj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C176617tJ(C175227qw c175227qw, String str, UUID uuid, Callable callable) {
        super(callable);
        this.A03 = c175227qw;
        this.A00 = new ArrayList();
        C02R.A03(uuid, AnonymousClass001.A0R("SessionId is null! Attempting to schedule task: ", str));
        this.A01 = uuid;
        C02R.A03(str, "OpticFutureTask cannot have a null name.");
        this.A02 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x000f, B:7:0x0017, B:9:0x001d, B:11:0x0021, B:18:0x0032, B:20:0x0038, B:22:0x004d, B:23:0x0053, B:24:0x0057, B:26:0x005d, B:28:0x0061, B:29:0x0077, B:31:0x006d), top: B:3:0x0004, inners: #1, #4, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x000f, B:7:0x0017, B:9:0x001d, B:11:0x0021, B:18:0x0032, B:20:0x0038, B:22:0x004d, B:23:0x0053, B:24:0x0057, B:26:0x005d, B:28:0x0061, B:29:0x0077, B:31:0x006d), top: B:3:0x0004, inners: #1, #4, #3 }] */
    @Override // java.util.concurrent.FutureTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void done() {
        /*
            r9 = this;
            java.util.UUID r0 = X.C175227qw.A06
            r8 = r9
            monitor-enter(r8)
            java.util.ArrayList r0 = r9.A00     // Catch: java.lang.Throwable -> L80
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L80
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L80
            r0.clear()     // Catch: java.lang.Throwable -> L80
            r6 = 0
            java.lang.Object r4 = r9.get()     // Catch: java.lang.InterruptedException -> L2f java.util.concurrent.ExecutionException -> L31 java.util.concurrent.CancellationException -> L6c java.lang.Throwable -> L80
            java.util.Iterator r1 = r7.iterator()     // Catch: java.lang.InterruptedException -> L2f java.util.concurrent.ExecutionException -> L31 java.util.concurrent.CancellationException -> L6c java.lang.Throwable -> L80
        L17:
            boolean r0 = r1.hasNext()     // Catch: java.lang.InterruptedException -> L2f java.util.concurrent.ExecutionException -> L31 java.util.concurrent.CancellationException -> L6c java.lang.Throwable -> L80
            if (r0 == 0) goto L21
            r1.next()     // Catch: java.lang.InterruptedException -> L2f java.util.concurrent.ExecutionException -> L31 java.util.concurrent.CancellationException -> L6c java.lang.Throwable -> L80
            goto L17
        L21:
            r3 = 1
            X.7qw r2 = r9.A03     // Catch: java.lang.InterruptedException -> L2f java.util.concurrent.ExecutionException -> L31 java.util.concurrent.CancellationException -> L6c java.lang.Throwable -> L80
            java.util.UUID r1 = r9.A01     // Catch: java.lang.InterruptedException -> L2f java.util.concurrent.ExecutionException -> L31 java.util.concurrent.CancellationException -> L6c java.lang.Throwable -> L80
            X.7tg r0 = new X.7tg     // Catch: java.lang.InterruptedException -> L2f java.util.concurrent.ExecutionException -> L31 java.util.concurrent.CancellationException -> L6c java.lang.Throwable -> L80
            r0.<init>()     // Catch: java.lang.InterruptedException -> L2f java.util.concurrent.ExecutionException -> L31 java.util.concurrent.CancellationException -> L6c java.lang.Throwable -> L80
            r2.A05(r0, r1)     // Catch: java.lang.InterruptedException -> L2f java.util.concurrent.ExecutionException -> L31 java.util.concurrent.CancellationException -> L6c java.lang.Throwable -> L80
            goto L7a
        L2f:
            r5 = move-exception
            goto L32
        L31:
            r5 = move-exception
        L32:
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L53
            X.7qw r0 = r9.A03     // Catch: java.lang.Throwable -> L80
            android.os.HandlerThread r0 = r0.A04     // Catch: java.lang.Throwable -> L80
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> L80
            r0.getClass()     // Catch: java.lang.Throwable -> L80
            java.lang.Thread r1 = r0.getThread()     // Catch: java.lang.Throwable -> L80
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L80
            if (r1 == r0) goto L7a
            r1 = 4
            r0 = 0
            X.AbstractC175037qd.A00(r1, r0, r5)     // Catch: java.lang.Throwable -> L80
            goto L7a
        L53:
            java.util.Iterator r1 = r7.iterator()     // Catch: java.lang.Throwable -> L80
        L57:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L61
            r1.next()     // Catch: java.lang.Throwable -> L80
            goto L57
        L61:
            r0 = 0
            X.7qw r4 = r9.A03     // Catch: java.lang.Throwable -> L80
            java.util.UUID r3 = r9.A01     // Catch: java.lang.Throwable -> L80
            X.7tg r2 = new X.7tg     // Catch: java.lang.Throwable -> L80
            r2.<init>()     // Catch: java.lang.Throwable -> L80
            goto L77
        L6c:
            r1 = move-exception
            r0 = 0
            X.7qw r4 = r9.A03     // Catch: java.lang.Throwable -> L80
            java.util.UUID r3 = r9.A01     // Catch: java.lang.Throwable -> L80
            X.7tg r2 = new X.7tg     // Catch: java.lang.Throwable -> L80
            r2.<init>()     // Catch: java.lang.Throwable -> L80
        L77:
            r4.A05(r2, r3)     // Catch: java.lang.Throwable -> L80
        L7a:
            monitor-exit(r8)
            r0 = 0
            r9.A00(r0)
            return
        L80:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176617tJ.done():void");
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        UUID uuid = C175227qw.A06;
        A00(true);
        super.run();
    }

    @Override // java.util.concurrent.FutureTask
    public final boolean runAndReset() {
        UUID uuid = C175227qw.A06;
        A00(true);
        return super.runAndReset();
    }
}
