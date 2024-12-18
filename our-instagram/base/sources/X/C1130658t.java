package X;

/* renamed from: X.58t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1130658t extends C58J implements InterfaceC1130758u, InterfaceC1130858v {
    public InterfaceC1130858v A00;
    public InterfaceC1130958w A01;
    public final InterfaceC16660sJ A02;
    public final Object A03 = C1131058x.A00;

    @Override // X.InterfaceC1130758u
    public final Object CAp() {
        return this.A03;
    }

    @Override // X.InterfaceC1130958w
    public final boolean DCZ(COP cop) {
        InterfaceC1130958w interfaceC1130958w = this.A00;
        if (interfaceC1130958w == null && (interfaceC1130958w = this.A01) == null) {
            return false;
        }
        return interfaceC1130958w.DCZ(cop);
    }

    @Override // X.InterfaceC1130958w
    public final void DDh(COP cop) {
        DRU dru = new DRU(cop, 24);
        if (dru.invoke(this) == BHM.ContinueTraversal) {
            BFZ.A03(this, dru);
        }
    }

    @Override // X.InterfaceC1130958w
    public final void DF2(COP cop) {
        InterfaceC1130958w interfaceC1130958w = this.A01;
        if (interfaceC1130958w != null) {
            interfaceC1130958w.DF2(cop);
        }
        InterfaceC1130858v interfaceC1130858v = this.A00;
        if (interfaceC1130858v != null) {
            interfaceC1130858v.DF2(cop);
        }
        this.A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r3 == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.58w] */
    @Override // X.InterfaceC1130958w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DTz(X.COP r5) {
        /*
            r4 = this;
            X.58v r3 = r4.A00
            r2 = 1
            if (r3 == 0) goto L3b
            android.view.DragEvent r0 = r5.A00
            float r1 = r0.getX()
            float r0 = r0.getY()
            long r0 = X.AbstractC119395aw.A00(r1, r0)
            boolean r0 = X.CB7.A00(r3, r0)
            if (r0 != r2) goto L3b
            r1 = r3
        L1a:
            boolean r0 = X.C14360o3.A0K(r1, r3)
            if (r0 != 0) goto L2d
            if (r1 == 0) goto L25
            r1.DTz(r5)
        L25:
            if (r3 == 0) goto L2a
        L27:
            r3.DF2(r5)
        L2a:
            r4.A00 = r1
            return
        L2d:
            if (r1 == 0) goto L33
            r1.DTz(r5)
            goto L2a
        L33:
            X.58w r0 = r4.A01
            if (r0 == 0) goto L2a
            r0.DTz(r5)
            goto L2a
        L3b:
            X.58J r0 = r4.A03
            boolean r0 = r0.A08
            if (r0 != 0) goto L4e
            r1 = 0
        L42:
            X.58v r1 = (X.InterfaceC1130858v) r1
            if (r1 == 0) goto L62
            if (r3 != 0) goto L1a
            r1.DTz(r5)
            X.58w r3 = r4.A01
            goto L25
        L4e:
            X.0ps r2 = new X.0ps
            r2.<init>()
            r1 = 12
            X.DHZ r0 = new X.DHZ
            r0.<init>(r1, r5, r4, r2)
            X.BFZ.A03(r4, r0)
            java.lang.Object r1 = r2.A00
            X.58u r1 = (X.InterfaceC1130758u) r1
            goto L42
        L62:
            if (r3 == 0) goto L1a
            X.58w r0 = r4.A01
            if (r0 == 0) goto L27
            r0.DTz(r5)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1130658t.DTz(X.COP):void");
    }

    public C1130658t(InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC16660sJ;
    }
}
