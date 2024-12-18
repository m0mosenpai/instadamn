package X;

/* renamed from: X.5UQ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5UQ {
    public final C5US A00;

    public C5US A00() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
    
        X.C5UC.A04("Unexpected form of a provided value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0072, code lost:
    
        if ((r5 instanceof X.C117725Uh) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5US A01(X.C117685Ud r4, X.C5US r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof X.C117705Uf
            r2 = 0
            if (r0 == 0) goto L4c
            boolean r0 = r4.A05
            if (r0 == 0) goto L16
            r2 = r5
            X.5Uf r2 = (X.C117705Uf) r2
            X.3Yl r1 = r2.A00
            boolean r0 = r4.A04
            if (r0 == 0) goto L47
            r0 = 0
        L13:
            r1.Egh(r0)
        L16:
            X.5US r2 = (X.C5US) r2
            if (r2 != 0) goto L36
        L1a:
            boolean r0 = r4.A05
            if (r0 == 0) goto L37
            java.lang.Object r2 = r4.A03
            X.3Ye r1 = r4.A02
            if (r1 != 0) goto L28
            X.3Yd r1 = X.AbstractC74873Yc.A00()
        L28:
            X.0do r0 = X.AbstractC74903Yf.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r0.<init>(r1, r2)
            X.5Uf r2 = new X.5Uf
            r2.<init>(r0)
        L34:
            X.5US r2 = (X.C5US) r2
        L36:
            return r2
        L37:
            boolean r0 = r4.A04
            if (r0 == 0) goto L42
            r0 = 0
        L3c:
            X.5Ug r2 = new X.5Ug
            r2.<init>(r0)
            goto L34
        L42:
            java.lang.Object r0 = r4.A03
            if (r0 == 0) goto L75
            goto L3c
        L47:
            java.lang.Object r0 = r4.A03
            if (r0 == 0) goto L75
            goto L13
        L4c:
            boolean r0 = r5 instanceof X.C117715Ug
            if (r0 == 0) goto L70
            boolean r1 = r4.A04
            if (r1 != 0) goto L58
            java.lang.Object r0 = r4.A03
            if (r0 == 0) goto L16
        L58:
            boolean r0 = r4.A05
            if (r0 != 0) goto L16
            if (r1 == 0) goto L6b
            r1 = 0
        L5f:
            X.5Ug r5 = (X.C117715Ug) r5
            java.lang.Object r0 = r5.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L16
            r2 = r5
            goto L16
        L6b:
            java.lang.Object r1 = r4.A03
            if (r1 == 0) goto L75
            goto L5f
        L70:
            boolean r0 = r5 instanceof X.C117725Uh
            if (r0 == 0) goto L1a
            goto L16
        L75:
            java.lang.String r0 = "Unexpected form of a provided value"
            X.C5UC.A04(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5UQ.A01(X.5Ud, X.5US):X.5US");
    }

    public C5UQ(final InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = new C5US(interfaceC16820sZ) { // from class: X.5UR
            public final InterfaceC09390do A00;

            @Override // X.C5US
            public final Object E8W(C59P c59p) {
                return this.A00.getValue();
            }

            {
                this.A00 = AbstractC09440dt.A01(interfaceC16820sZ);
            }
        };
    }
}
