package X;

/* renamed from: X.0pB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14960pB implements InterfaceC19960yQ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(int r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 6
            boolean r0 = X.C0Qe.A01(r7, r3)
            if (r0 == 0) goto L44
            r4 = r7
            X.0Qe r4 = (X.C0Qe) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 != r2) goto L4a
            X.AbstractC09560e7.A00(r1)
        L23:
            X.0eB r3 = X.C0eB.A00
            return r3
        L26:
            X.AbstractC09560e7.A00(r1)
            if (r6 <= 0) goto L23
            java.lang.Object r1 = r5.A02
            X.0oO r1 = (X.C14510oO) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L23
            r1.A00 = r2
            java.lang.Object r1 = r5.A01
            X.0yQ r1 = (X.InterfaceC19960yQ) r1
            X.10L r0 = X.C10L.A02
            r4.A00 = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L23
            return r3
        L44:
            X.0Qe r4 = new X.0Qe
            r4.<init>(r5, r7, r3)
            goto L15
        L4a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14960pB.A00(int, X.1Ds):java.lang.Object");
    }

    public C14960pB(InterfaceC16620sF interfaceC16620sF, InterfaceC19960yQ interfaceC19960yQ, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = interfaceC19960yQ;
            this.A02 = interfaceC16620sF;
        } else {
            this.A01 = interfaceC16620sF;
            this.A02 = interfaceC19960yQ;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a3  */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, X.InterfaceC23621Ds r9) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14960pB.emit(java.lang.Object, X.1Ds):java.lang.Object");
    }

    public C14960pB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public C14960pB(C14510oO c14510oO, InterfaceC19960yQ interfaceC19960yQ, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = c14510oO;
            this.A01 = interfaceC19960yQ;
        } else {
            this.A01 = c14510oO;
            this.A02 = interfaceC19960yQ;
        }
    }
}
