package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6JF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JF extends AtomicInteger implements InterfaceC42071wx, InterfaceC41801wU {
    public static final C6JG A09;
    public InterfaceC41801wU A00;
    public final int A01;
    public final InterfaceC42071wx A02;
    public final C6D4 A03;
    public volatile long A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final AtomicReference A05 = new AtomicReference();
    public final C6JD A04 = new AtomicReference();

    static {
        C6JG c6jg = new C6JG(null, 1, -1L);
        A09 = c6jg;
        C6KP.A01(c6jg);
    }

    public final void A00() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.A05;
        Object obj = atomicReference2.get();
        C6JG c6jg = A09;
        if (obj != c6jg && (atomicReference = (AtomicReference) atomicReference2.getAndSet(c6jg)) != c6jg && atomicReference != null) {
            C6KP.A01(atomicReference);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        Object obj2;
        long j = this.A06 + 1;
        this.A06 = j;
        AtomicReference atomicReference = this.A05;
        AtomicReference atomicReference2 = (AtomicReference) atomicReference.get();
        if (atomicReference2 != null) {
            C6KP.A01(atomicReference2);
        }
        try {
            Object apply = this.A03.apply(obj);
            AbstractC42141x4.A01(apply, "The ObservableSource returned is null");
            InterfaceC42061ww interfaceC42061ww = (InterfaceC42061ww) apply;
            C6JG c6jg = new C6JG(this, this.A01, j);
            do {
                obj2 = atomicReference.get();
                if (obj2 == A09) {
                    return;
                }
            } while (!C1EM.A00(obj2, c6jg, atomicReference));
            interfaceC42061ww.EpF(c6jg);
        } catch (Throwable th) {
            AbstractC62281S5a.A00(th);
            this.A00.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A00, interfaceC41801wU)) {
            this.A00 = interfaceC41801wU;
            this.A02.Dpc(this);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A07) {
            this.A07 = true;
            this.A00.dispose();
            A00();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A08) {
            this.A08 = true;
            A01();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (!this.A08 && Y4X.A02(th, this.A04)) {
            A00();
            this.A08 = true;
            A01();
            return;
        }
        AbstractC142886co.A02(th);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6JD, java.util.concurrent.atomic.AtomicReference] */
    public C6JF(InterfaceC42071wx interfaceC42071wx, C6D4 c6d4, int i) {
        this.A02 = interfaceC42071wx;
        this.A03 = c6d4;
        this.A01 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x000c, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.6JD, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.6JD, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.6JD, java.util.concurrent.atomic.AtomicReference] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r11 = this;
            int r0 = r11.getAndIncrement()
            if (r0 != 0) goto L29
            X.1wx r8 = r11.A02
            java.util.concurrent.atomic.AtomicReference r7 = r11.A05
            r6 = 1
            r9 = 1
        Lc:
            boolean r0 = r11.A07
            if (r0 != 0) goto L29
            boolean r0 = r11.A08
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r7.get()
            r2 = 0
            if (r0 != 0) goto L1c
            r2 = 1
        L1c:
            X.6JD r1 = r11.A04
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L9b
            if (r2 == 0) goto L2a
            r8.onComplete()
        L29:
            return
        L2a:
            java.lang.Object r5 = r7.get()
            X.6JG r5 = (X.C6JG) r5
            if (r5 == 0) goto L93
            X.6Dg r4 = r5.A03
            if (r4 == 0) goto L93
            boolean r0 = r5.A04
            r3 = 0
            if (r0 == 0) goto L4d
            boolean r2 = r4.isEmpty()
            X.6JD r1 = r11.A04
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L9b
            if (r2 == 0) goto L4d
            X.C1EM.A00(r5, r3, r7)
            goto Lc
        L4d:
            r10 = 0
        L4e:
            boolean r0 = r11.A07
            if (r0 != 0) goto L29
            java.lang.Object r0 = r7.get()
            if (r5 != r0) goto Lc
            X.6JD r1 = r11.A04
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L9b
            boolean r2 = r5.A04
            java.lang.Object r1 = r4.poll()     // Catch: java.lang.Throwable -> L6a
            r0 = 0
            if (r1 != 0) goto L81
            goto L80
        L6a:
            r0 = move-exception
            X.AbstractC62281S5a.A00(r0)
            X.Y4X.A02(r0, r1)
            X.C1EM.A00(r5, r3, r7)
            r11.A00()
            X.1wU r0 = r11.A00
            r0.dispose()
            r11.A08 = r6
            r1 = r3
            r10 = 1
        L80:
            r0 = 1
        L81:
            if (r2 == 0) goto L89
            if (r0 == 0) goto L8f
            X.C1EM.A00(r5, r3, r7)
            goto Lc
        L89:
            if (r0 == 0) goto L8f
            if (r10 == 0) goto L93
            goto Lc
        L8f:
            r8.DVo(r1)
            goto L4e
        L93:
            int r0 = -r9
            int r9 = r11.addAndGet(r0)
            if (r9 != 0) goto Lc
            return
        L9b:
            java.lang.Throwable r0 = X.Y4X.A01(r1)
            r8.onError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6JF.A01():void");
    }
}
