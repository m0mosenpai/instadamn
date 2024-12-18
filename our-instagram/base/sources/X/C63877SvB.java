package X;

/* renamed from: X.SvB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63877SvB implements InterfaceC65582TnL, InterfaceC65580TnH {
    public Integer A00;
    public Integer A01;
    public final InterfaceC65580TnH A02;
    public final Object A03;
    public volatile InterfaceC65582TnL A04;
    public volatile InterfaceC65582TnL A05;

    @Override // X.InterfaceC65582TnL
    public final void ADM() {
        synchronized (this.A03) {
            Integer num = this.A01;
            Integer num2 = C05F.A00;
            if (num != num2) {
                this.A01 = num2;
                this.A05.ADM();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r4.equals(r3.A05) == false) goto L10;
     */
    @Override // X.InterfaceC65580TnH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFo(X.InterfaceC65582TnL r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            X.TnH r0 = r3.A02     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto Ld
            boolean r0 = r0.AFo(r3)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L16
        Ld:
            X.TnL r0 = r3.A05     // Catch: java.lang.Throwable -> L19
            boolean r1 = r4.equals(r0)     // Catch: java.lang.Throwable -> L19
            r0 = 1
            if (r1 != 0) goto L17
        L16:
            r0 = 0
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            return r0
        L19:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63877SvB.AFo(X.TnL):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        if (r1 == r2) goto L18;
     */
    @Override // X.InterfaceC65580TnH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFp(X.InterfaceC65582TnL r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            X.TnH r0 = r4.A02     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Ld
            boolean r0 = r0.AFp(r4)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
        Ld:
            java.lang.Integer r0 = r4.A01     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r2 = X.C05F.A0Y     // Catch: java.lang.Throwable -> L31
            if (r0 == r2) goto L1c
            X.TnL r0 = r4.A05     // Catch: java.lang.Throwable -> L31
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
            goto L2c
        L1c:
            X.TnL r0 = r4.A04     // Catch: java.lang.Throwable -> L31
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
            java.lang.Integer r1 = r4.A00     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> L31
            if (r1 == r0) goto L2c
            if (r1 != r2) goto L2e
        L2c:
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            return r0
        L31:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63877SvB.AFp(X.TnL):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r1 != false) goto L8;
     */
    @Override // X.InterfaceC65580TnH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFy(X.InterfaceC65582TnL r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            X.TnH r0 = r3.A02     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Le
            boolean r1 = r0.AFy(r3)     // Catch: java.lang.Throwable -> L11
            r0 = 0
            if (r1 == 0) goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63877SvB.AFy(X.TnL):boolean");
    }

    @Override // X.InterfaceC65580TnH
    public final InterfaceC65580TnH BpV() {
        InterfaceC65580TnH interfaceC65580TnH;
        synchronized (this.A03) {
            InterfaceC65580TnH interfaceC65580TnH2 = this.A02;
            if (interfaceC65580TnH2 != null) {
                interfaceC65580TnH = interfaceC65580TnH2.BpV();
            } else {
                interfaceC65580TnH = this;
            }
        }
        return interfaceC65580TnH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r3.A04.CPw() != false) goto L8;
     */
    @Override // X.InterfaceC65582TnL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CPw() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            X.TnL r0 = r3.A05     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.CPw()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L14
            X.TnL r0 = r3.A04     // Catch: java.lang.Throwable -> L17
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
        throw new UnsupportedOperationException("Method not decompiled: X.C63877SvB.CPw():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r4.A00 != r2) goto L8;
     */
    @Override // X.InterfaceC65582TnL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CRK() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            java.lang.Integer r0 = r4.A01     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r2 = X.C05F.A0C     // Catch: java.lang.Throwable -> L11
            if (r0 != r2) goto Le
            java.lang.Integer r1 = r4.A00     // Catch: java.lang.Throwable -> L11
            r0 = 1
            if (r1 == r2) goto Lf
        Le:
            r0 = 0
        Lf:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63877SvB.CRK():boolean");
    }

    @Override // X.InterfaceC65582TnL
    public final boolean CTx(InterfaceC65582TnL interfaceC65582TnL) {
        if (!(interfaceC65582TnL instanceof C63877SvB)) {
            return false;
        }
        C63877SvB c63877SvB = (C63877SvB) interfaceC65582TnL;
        if (!this.A05.CTx(c63877SvB.A05) || !this.A04.CTx(c63877SvB.A04)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65580TnH
    public final void Dfu(InterfaceC65582TnL interfaceC65582TnL) {
        synchronized (this.A03) {
            if (!interfaceC65582TnL.equals(this.A04)) {
                this.A01 = C05F.A0Y;
                Integer num = this.A00;
                Integer num2 = C05F.A00;
                if (num != num2) {
                    this.A00 = num2;
                    this.A04.ADM();
                }
            } else {
                this.A00 = C05F.A0Y;
                InterfaceC65580TnH interfaceC65580TnH = this.A02;
                if (interfaceC65580TnH != null) {
                    interfaceC65580TnH.Dfu(this);
                }
            }
        }
    }

    @Override // X.InterfaceC65580TnH
    public final void DgN(InterfaceC65582TnL interfaceC65582TnL) {
        synchronized (this.A03) {
            if (interfaceC65582TnL.equals(this.A05)) {
                this.A01 = C05F.A0N;
            } else if (interfaceC65582TnL.equals(this.A04)) {
                this.A00 = C05F.A0N;
            }
            InterfaceC65580TnH interfaceC65580TnH = this.A02;
            if (interfaceC65580TnH != null) {
                interfaceC65580TnH.DgN(this);
            }
        }
    }

    @Override // X.InterfaceC65582TnL
    public final void clear() {
        synchronized (this.A03) {
            Integer num = C05F.A0C;
            this.A01 = num;
            this.A05.clear();
            if (this.A00 != num) {
                this.A00 = num;
                this.A04.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r4.A00 == r2) goto L8;
     */
    @Override // X.InterfaceC65582TnL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isComplete() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            java.lang.Integer r0 = r4.A01     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r2 = X.C05F.A0N     // Catch: java.lang.Throwable -> L11
            if (r0 == r2) goto Le
            java.lang.Integer r1 = r4.A00     // Catch: java.lang.Throwable -> L11
            r0 = 0
            if (r1 != r2) goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63877SvB.isComplete():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r4.A00 == r2) goto L8;
     */
    @Override // X.InterfaceC65582TnL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isRunning() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            java.lang.Integer r0 = r4.A01     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r2 = X.C05F.A00     // Catch: java.lang.Throwable -> L11
            if (r0 == r2) goto Le
            java.lang.Integer r1 = r4.A00     // Catch: java.lang.Throwable -> L11
            r0 = 0
            if (r1 != r2) goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63877SvB.isRunning():boolean");
    }

    @Override // X.InterfaceC65582TnL
    public final void pause() {
        synchronized (this.A03) {
            Integer num = this.A01;
            Integer num2 = C05F.A00;
            if (num == num2) {
                this.A01 = C05F.A01;
                this.A05.pause();
            }
            if (this.A00 == num2) {
                this.A00 = C05F.A01;
                this.A04.pause();
            }
        }
    }

    public C63877SvB(InterfaceC65580TnH interfaceC65580TnH, Object obj) {
        Integer num = C05F.A0C;
        this.A01 = num;
        this.A00 = num;
        this.A03 = obj;
        this.A02 = interfaceC65580TnH;
    }
}
