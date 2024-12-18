package X;

/* renamed from: X.0pE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14990pE implements InterfaceC19960yQ {
    public final InterfaceC16620sF A00;
    public final InterfaceC19960yQ A01;

    @Override // X.InterfaceC19960yQ
    public final Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A01.emit(obj, interfaceC23621Ds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C10D
            if (r0 == 0) goto L68
            r6 = r8
            X.10D r6 = (X.C10D) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.A00 = r2
        L12:
            java.lang.Object r1 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 == r3) goto L26
            if (r0 != r4) goto L6e
            X.AbstractC09560e7.A00(r1)
        L23:
            X.0eB r5 = X.C0eB.A00
        L25:
            return r5
        L26:
            java.lang.Object r2 = r6.A02
            X.1Dq r2 = (X.C1Dq) r2
            java.lang.Object r0 = r6.A01
            X.0pE r0 = (X.C14990pE) r0
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> L76
            goto L4f
        L32:
            X.AbstractC09560e7.A00(r1)
            X.0yQ r1 = r7.A01
            X.12W r0 = r6.getContext()
            X.0oz r2 = new X.0oz
            r2.<init>(r0, r1)
            X.0sF r0 = r7.A00     // Catch: java.lang.Throwable -> L76
            r6.A01 = r7     // Catch: java.lang.Throwable -> L76
            r6.A02 = r2     // Catch: java.lang.Throwable -> L76
            r6.A00 = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r0.invoke(r2, r6)     // Catch: java.lang.Throwable -> L76
            if (r0 == r5) goto L25
            r0 = r7
        L4f:
            r2.releaseIntercepted()
            X.0yQ r1 = r0.A01
            boolean r0 = r1 instanceof X.C14990pE
            if (r0 == 0) goto L23
            X.0pE r1 = (X.C14990pE) r1
            r0 = 0
            r6.A01 = r0
            r6.A02 = r0
            r6.A00 = r4
            java.lang.Object r0 = r1.A00(r6)
            if (r0 != r5) goto L23
            return r5
        L68:
            X.10D r6 = new X.10D
            r6.<init>(r8, r7)
            goto L12
        L6e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L76:
            r0 = move-exception
            r2.releaseIntercepted()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14990pE.A00(X.1Ds):java.lang.Object");
    }

    public C14990pE(InterfaceC16620sF interfaceC16620sF, InterfaceC19960yQ interfaceC19960yQ) {
        this.A01 = interfaceC19960yQ;
        this.A00 = interfaceC16620sF;
    }
}
