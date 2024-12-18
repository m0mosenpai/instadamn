package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public final class YKX extends AtomicInteger implements InterfaceC42071wx, InterfaceC41801wU {
    public int A00;
    public InterfaceC41801wU A01;
    public InterfaceC136016Dg A02;
    public final int A03;
    public final InterfaceC42071wx A04;
    public final C6D4 A05;
    public final YKd A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A08 = true;
        C6KP.A01(this.A06);
        this.A01.dispose();
        if (getAndIncrement() == 0) {
            this.A02.clear();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!this.A09) {
            if (this.A00 == 0) {
                this.A02.offer(obj);
            }
            A00();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C137416Km c137416Km;
        if (C6KP.A02(this.A01, interfaceC41801wU)) {
            this.A01 = interfaceC41801wU;
            if (interfaceC41801wU instanceof InterfaceC135996De) {
                InterfaceC136006Df interfaceC136006Df = (InterfaceC136006Df) interfaceC41801wU;
                int EJ7 = interfaceC136006Df.EJ7(3);
                if (EJ7 == 1) {
                    this.A00 = EJ7;
                    this.A02 = interfaceC136006Df;
                    this.A09 = true;
                    this.A04.Dpc(this);
                    A00();
                    return;
                }
                if (EJ7 == 2) {
                    this.A00 = EJ7;
                    c137416Km = interfaceC136006Df;
                    this.A02 = c137416Km;
                    this.A04.Dpc(this);
                }
            }
            c137416Km = new C137416Km(this.A03);
            this.A02 = c137416Km;
            this.A04.Dpc(this);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A09) {
            this.A09 = true;
            A00();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (this.A09) {
            AbstractC142886co.A02(th);
            return;
        }
        this.A09 = true;
        dispose();
        this.A04.onError(th);
    }

    public YKX(InterfaceC42071wx interfaceC42071wx, C6D4 c6d4, int i) {
        this.A04 = interfaceC42071wx;
        this.A05 = c6d4;
        this.A03 = i;
        this.A06 = new YKd(interfaceC42071wx, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r4 = this;
            int r0 = r4.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r4.A08
            if (r0 == 0) goto L11
            X.6Dg r0 = r4.A02
            r0.clear()
            return
        L11:
            boolean r0 = r4.A07
            if (r0 != 0) goto L44
            boolean r3 = r4.A09
            X.6Dg r0 = r4.A02     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r1 = r0.poll()     // Catch: java.lang.Throwable -> L4b
            r2 = 1
            boolean r0 = X.AbstractC25229BEm.A1Z(r1)
            if (r3 == 0) goto L2e
            if (r0 == 0) goto L30
            r4.A08 = r2
            X.1wx r0 = r4.A04
            r0.onComplete()
            return
        L2e:
            if (r0 != 0) goto L44
        L30:
            X.6D4 r0 = r4.A05     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r1 = r0.apply(r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "The mapper returned a null ObservableSource"
            X.AbstractC42141x4.A01(r1, r0)     // Catch: java.lang.Throwable -> L4b
            X.1ww r1 = (X.InterfaceC42061ww) r1     // Catch: java.lang.Throwable -> L4b
            r4.A07 = r2
            X.YKd r0 = r4.A06
            r1.EpF(r0)
        L44:
            int r0 = r4.decrementAndGet()
            if (r0 != 0) goto L7
            return
        L4b:
            r1 = move-exception
            X.AbstractC62281S5a.A00(r1)
            r4.dispose()
            X.6Dg r0 = r4.A02
            r0.clear()
            X.1wx r0 = r4.A04
            r0.onError(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YKX.A00():void");
    }
}
