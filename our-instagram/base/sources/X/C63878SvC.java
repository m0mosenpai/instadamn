package X;

/* renamed from: X.SvC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63878SvC implements InterfaceC65582TnL, InterfaceC65580TnH {
    public Integer A00;
    public Integer A01;
    public boolean A02;
    public final InterfaceC65580TnH A03;
    public final Object A04;
    public volatile InterfaceC65582TnL A05;
    public volatile InterfaceC65582TnL A06;

    @Override // X.InterfaceC65582TnL
    public final void ADM() {
        synchronized (this.A04) {
            this.A02 = true;
            try {
                if (this.A00 != C05F.A0N) {
                    Integer num = this.A01;
                    Integer num2 = C05F.A00;
                    if (num != num2) {
                        this.A01 = num2;
                        this.A06.ADM();
                    }
                }
                if (this.A02) {
                    Integer num3 = this.A00;
                    Integer num4 = C05F.A00;
                    if (num3 != num4) {
                        this.A00 = num4;
                        this.A05.ADM();
                    }
                }
            } finally {
                this.A02 = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001a, code lost:
    
        if (r4.A00 == X.C05F.A01) goto L12;
     */
    @Override // X.InterfaceC65580TnH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFo(X.InterfaceC65582TnL r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A04
            monitor-enter(r3)
            X.TnH r0 = r4.A03     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto Ld
            boolean r0 = r0.AFo(r4)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1c
        Ld:
            X.TnL r0 = r4.A05     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1c
            java.lang.Integer r2 = r4.A00     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r1 = X.C05F.A01     // Catch: java.lang.Throwable -> L1f
            r0 = 1
            if (r2 != r1) goto L1d
        L1c:
            r0 = 0
        L1d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            return r0
        L1f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63878SvC.AFo(X.TnL):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001a, code lost:
    
        if (CPw() != false) goto L12;
     */
    @Override // X.InterfaceC65580TnH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFp(X.InterfaceC65582TnL r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A04
            monitor-enter(r2)
            X.TnH r0 = r3.A03     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto Ld
            boolean r0 = r0.AFp(r3)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1c
        Ld:
            X.TnL r0 = r3.A05     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1c
            boolean r1 = r3.CPw()     // Catch: java.lang.Throwable -> L1f
            r0 = 1
            if (r1 == 0) goto L1d
        L1c:
            r0 = 0
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            return r0
        L1f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63878SvC.AFp(X.TnL):boolean");
    }

    @Override // X.InterfaceC65580TnH
    public final boolean AFy(InterfaceC65582TnL interfaceC65582TnL) {
        boolean z;
        synchronized (this.A04) {
            InterfaceC65580TnH interfaceC65580TnH = this.A03;
            if ((interfaceC65580TnH == null || interfaceC65580TnH.AFy(this)) && (interfaceC65582TnL.equals(this.A05) || this.A00 != C05F.A0N)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.InterfaceC65580TnH
    public final InterfaceC65580TnH BpV() {
        InterfaceC65580TnH interfaceC65580TnH;
        synchronized (this.A04) {
            InterfaceC65580TnH interfaceC65580TnH2 = this.A03;
            if (interfaceC65580TnH2 != null) {
                interfaceC65580TnH = interfaceC65580TnH2.BpV();
            } else {
                interfaceC65580TnH = this;
            }
        }
        return interfaceC65580TnH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r3.A05.CPw() != false) goto L8;
     */
    @Override // X.InterfaceC65582TnL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CPw() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A04
            monitor-enter(r2)
            X.TnL r0 = r3.A06     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.CPw()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L14
            X.TnL r0 = r3.A05     // Catch: java.lang.Throwable -> L17
            boolean r1 = r0.CPw()     // Catch: java.lang.Throwable -> L17
            r0 = 0
            if (r1 == 0) goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63878SvC.CPw():boolean");
    }

    @Override // X.InterfaceC65582TnL
    public final boolean CRK() {
        boolean A1X;
        synchronized (this.A04) {
            A1X = AbstractC167007dF.A1X(this.A00, C05F.A0C);
        }
        return A1X;
    }

    @Override // X.InterfaceC65582TnL
    public final boolean CTx(InterfaceC65582TnL interfaceC65582TnL) {
        if (!(interfaceC65582TnL instanceof C63878SvC)) {
            return false;
        }
        C63878SvC c63878SvC = (C63878SvC) interfaceC65582TnL;
        if (this.A05 == null) {
            if (c63878SvC.A05 != null) {
                return false;
            }
        } else if (!this.A05.CTx(c63878SvC.A05)) {
            return false;
        }
        if (this.A06 == null) {
            if (c63878SvC.A06 != null) {
                return false;
            }
        } else if (!this.A06.CTx(c63878SvC.A06)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65580TnH
    public final void Dfu(InterfaceC65582TnL interfaceC65582TnL) {
        synchronized (this.A04) {
            if (!interfaceC65582TnL.equals(this.A05)) {
                this.A01 = C05F.A0Y;
            } else {
                this.A00 = C05F.A0Y;
                InterfaceC65580TnH interfaceC65580TnH = this.A03;
                if (interfaceC65580TnH != null) {
                    interfaceC65580TnH.Dfu(this);
                }
            }
        }
    }

    @Override // X.InterfaceC65580TnH
    public final void DgN(InterfaceC65582TnL interfaceC65582TnL) {
        synchronized (this.A04) {
            if (interfaceC65582TnL.equals(this.A06)) {
                this.A01 = C05F.A0N;
            } else {
                this.A00 = C05F.A0N;
                InterfaceC65580TnH interfaceC65580TnH = this.A03;
                if (interfaceC65580TnH != null) {
                    interfaceC65580TnH.DgN(this);
                }
                if (!AbstractC61691Rs6.A00(this.A01)) {
                    this.A06.clear();
                }
            }
        }
    }

    @Override // X.InterfaceC65582TnL
    public final void clear() {
        synchronized (this.A04) {
            this.A02 = false;
            Integer num = C05F.A0C;
            this.A00 = num;
            this.A01 = num;
            this.A06.clear();
            this.A05.clear();
        }
    }

    @Override // X.InterfaceC65582TnL
    public final boolean isComplete() {
        boolean A1X;
        synchronized (this.A04) {
            A1X = AbstractC167007dF.A1X(this.A00, C05F.A0N);
        }
        return A1X;
    }

    @Override // X.InterfaceC65582TnL
    public final boolean isRunning() {
        boolean A1X;
        synchronized (this.A04) {
            A1X = AbstractC167007dF.A1X(this.A00, C05F.A00);
        }
        return A1X;
    }

    @Override // X.InterfaceC65582TnL
    public final void pause() {
        synchronized (this.A04) {
            if (!AbstractC61691Rs6.A00(this.A01)) {
                this.A01 = C05F.A01;
                this.A06.pause();
            }
            if (!AbstractC61691Rs6.A00(this.A00)) {
                this.A00 = C05F.A01;
                this.A05.pause();
            }
        }
    }

    public C63878SvC(InterfaceC65580TnH interfaceC65580TnH, Object obj) {
        Integer num = C05F.A0C;
        this.A00 = num;
        this.A01 = num;
        this.A04 = obj;
        this.A03 = interfaceC65580TnH;
    }
}
