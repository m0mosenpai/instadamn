package X;

/* loaded from: classes9.dex */
public final class PVP implements InterfaceC19960yQ {
    public final int A00;
    public final Object A01;
    public final String A02;

    public PVP(String str, InterfaceC19960yQ interfaceC19960yQ, int i) {
        this.A00 = i;
        this.A01 = interfaceC19960yQ;
        this.A02 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            if (r0 == 0) goto L42
            r4 = 47
            boolean r0 = X.PX5.A02(r8, r4)
            if (r0 == 0) goto L2a
            r3 = r8
            X.PX5 r3 = (X.PX5) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r2 = r3.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 == r1) goto L98
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2a:
            X.PX5 r3 = new X.PX5
            r3.<init>(r6, r8, r4)
            goto L1a
        L30:
            X.AbstractC09560e7.A00(r2)
            java.lang.Object r0 = r6.A01
            X.0yQ r0 = (X.InterfaceC19960yQ) r0
            if (r7 != 0) goto L3b
            java.lang.String r7 = r6.A02
        L3b:
            r3.A00 = r1
            java.lang.Object r0 = r0.emit(r7, r3)
            goto L93
        L42:
            r3 = 34
            boolean r0 = X.PX5.A02(r8, r3)
            if (r0 == 0) goto L68
            r5 = r8
            X.PX5 r5 = (X.PX5) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r5.A00 = r2
        L58:
            java.lang.Object r2 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L6e
            if (r0 == r3) goto L98
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L68:
            X.PX5 r5 = new X.PX5
            r5.<init>(r6, r8, r3)
            goto L58
        L6e:
            X.AbstractC09560e7.A00(r2)
            java.lang.Object r2 = r6.A01
            X.0yQ r2 = (X.InterfaceC19960yQ) r2
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r0 = r6.A02
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L96
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L96
            int r0 = r1.intValue()
        L89:
            java.lang.Integer r0 = X.AbstractC43592JPx.A0r(r0)
            r5.A00 = r3
            java.lang.Object r0 = r2.emit(r0, r5)
        L93:
            if (r0 != r4) goto L9b
            return r4
        L96:
            r0 = 0
            goto L89
        L98:
            X.AbstractC09560e7.A00(r2)
        L9b:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PVP.emit(java.lang.Object, X.1Ds):java.lang.Object");
    }
}
