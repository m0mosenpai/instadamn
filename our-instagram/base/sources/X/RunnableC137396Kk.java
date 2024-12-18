package X;

/* renamed from: X.6Kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC137396Kk extends AbstractC137406Kl implements Runnable, InterfaceC42071wx {
    public int A00;
    public InterfaceC41801wU A01;
    public InterfaceC136016Dg A02;
    public Throwable A03;
    public boolean A04;
    public final int A05;
    public final InterfaceC42071wx A06;
    public final AbstractC151006r1 A07;
    public volatile boolean A08;
    public volatile boolean A09;

    @Override // X.InterfaceC136006Df
    public final int EJ7(int i) {
        if ((i & 2) != 0) {
            this.A04 = true;
            return 2;
        }
        return 0;
    }

    public final boolean A00(InterfaceC42071wx interfaceC42071wx, boolean z, boolean z2) {
        if (this.A08) {
            this.A02.clear();
            return true;
        }
        if (z) {
            Throwable th = this.A03;
            if (th != null) {
                this.A08 = true;
                this.A02.clear();
                interfaceC42071wx.onError(th);
            } else if (z2) {
                this.A08 = true;
                interfaceC42071wx.onComplete();
            } else {
                return false;
            }
            this.A07.dispose();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!this.A09) {
            if (this.A00 != 2) {
                this.A02.offer(obj);
            }
            if (getAndIncrement() == 0) {
                this.A07.A00(this);
            }
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
                int EJ7 = interfaceC136006Df.EJ7(7);
                if (EJ7 == 1) {
                    this.A00 = EJ7;
                    this.A02 = interfaceC136006Df;
                    this.A09 = true;
                    this.A06.Dpc(this);
                    if (getAndIncrement() == 0) {
                        this.A07.A00(this);
                        return;
                    }
                    return;
                }
                if (EJ7 == 2) {
                    this.A00 = EJ7;
                    c137416Km = interfaceC136006Df;
                    this.A02 = c137416Km;
                    this.A06.Dpc(this);
                }
            }
            c137416Km = new C137416Km(this.A05);
            this.A02 = c137416Km;
            this.A06.Dpc(this);
        }
    }

    @Override // X.InterfaceC136016Dg
    public final void clear() {
        this.A02.clear();
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A08) {
            this.A08 = true;
            this.A01.dispose();
            this.A07.dispose();
            if (getAndIncrement() == 0) {
                this.A02.clear();
            }
        }
    }

    @Override // X.InterfaceC136016Dg
    public final boolean isEmpty() {
        return this.A02.isEmpty();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A09) {
            this.A09 = true;
            if (getAndIncrement() == 0) {
                this.A07.A00(this);
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (this.A09) {
            AbstractC142886co.A02(th);
            return;
        }
        this.A03 = th;
        this.A09 = true;
        if (getAndIncrement() != 0) {
            return;
        }
        this.A07.A00(this);
    }

    @Override // X.InterfaceC136016Dg
    public final Object poll() {
        return this.A02.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0060, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0065, code lost:
    
        if (r3 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.A04
            if (r0 == 0) goto L3b
            r4 = 1
            r3 = 1
        L6:
            boolean r0 = r7.A08
            if (r0 != 0) goto L20
            boolean r2 = r7.A09
            java.lang.Throwable r0 = r7.A03
            if (r2 == 0) goto L21
            if (r0 == 0) goto L21
            r7.A08 = r4
            X.1wx r1 = r7.A06
            java.lang.Throwable r0 = r7.A03
        L18:
            r1.onError(r0)
        L1b:
            X.6r1 r0 = r7.A07
            r0.dispose()
        L20:
            return
        L21:
            X.1wx r1 = r7.A06
            r0 = 0
            r1.DVo(r0)
            if (r2 == 0) goto L33
            r7.A08 = r4
            java.lang.Throwable r0 = r7.A03
            if (r0 != 0) goto L18
            r1.onComplete()
            goto L1b
        L33:
            int r0 = -r3
            int r3 = r7.addAndGet(r0)
            if (r3 != 0) goto L6
            return
        L3b:
            X.6Dg r6 = r7.A02
            X.1wx r5 = r7.A06
            r4 = 1
            r3 = 1
        L41:
            boolean r1 = r7.A09
            boolean r0 = r6.isEmpty()
            boolean r0 = r7.A00(r5, r1, r0)
            if (r0 == 0) goto L4e
            return
        L4e:
            boolean r0 = r7.A09
            java.lang.Object r2 = r6.poll()     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            if (r2 != 0) goto L58
            r1 = 1
        L58:
            boolean r0 = r7.A00(r5, r0, r1)
            if (r0 != 0) goto L20
            if (r1 == 0) goto L68
            int r0 = -r3
            int r3 = r7.addAndGet(r0)
            if (r3 != 0) goto L41
            return
        L68:
            r5.DVo(r2)
            goto L4e
        L6c:
            r1 = move-exception
            X.AbstractC62281S5a.A00(r1)
            r7.A08 = r4
            X.1wU r0 = r7.A01
            r0.dispose()
            r6.clear()
            r5.onError(r1)
            X.6r1 r0 = r7.A07
            r0.dispose()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC137396Kk.run():void");
    }

    public RunnableC137396Kk(InterfaceC42071wx interfaceC42071wx, AbstractC151006r1 abstractC151006r1, int i) {
        this.A06 = interfaceC42071wx;
        this.A07 = abstractC151006r1;
        this.A05 = i;
    }
}
