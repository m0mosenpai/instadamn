package X;

/* loaded from: classes9.dex */
public final class P8Y implements InterfaceC58124Ppn {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ InterfaceC58124Ppn A01;
    public final /* synthetic */ C3M4 A02;

    @Override // X.InterfaceC58124Ppn
    public final void Da6(int i, String str, boolean z) {
    }

    public P8Y(InterfaceC11380iw interfaceC11380iw, InterfaceC58124Ppn interfaceC58124Ppn, C3M4 c3m4) {
        this.A02 = c3m4;
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC58124Ppn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r2 != X.C3G2.A1L) goto L13;
     */
    @Override // X.InterfaceC58124Ppn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DKY(boolean r5, java.lang.String r6) {
        /*
            r4 = this;
            X.3M4 r2 = r4.A02
            java.util.Map r0 = X.C3M4.A13
            X.3Ov r1 = r2.A0K
            if (r1 == 0) goto Ld
            X.0iw r0 = r4.A00
            r1.EkR(r0)
        Ld:
            X.Ppn r3 = r4.A01
            if (r3 == 0) goto L22
            boolean r0 = r2.A0S
            if (r0 == 0) goto L1e
            X.3G2 r2 = r2.A0G
            if (r2 == 0) goto L1e
            X.3G2 r1 = X.C3G2.A1L
            r0 = 1
            if (r2 == r1) goto L1f
        L1e:
            r0 = 0
        L1f:
            r3.DKY(r0, r6)
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P8Y.DKY(boolean, java.lang.String):void");
    }

    @Override // X.InterfaceC58124Ppn
    public final void Dbk(float f) {
        InterfaceC58124Ppn interfaceC58124Ppn = this.A01;
        if (interfaceC58124Ppn != null) {
            interfaceC58124Ppn.Dbk(f);
        }
    }
}
