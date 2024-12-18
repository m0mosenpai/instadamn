package X;

/* renamed from: X.0rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16400rl implements InterfaceC19390xP {
    public final /* synthetic */ InterfaceC16620sF A00;
    public final /* synthetic */ InterfaceC19390xP A01;

    public C16400rl(InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        this.A00 = interfaceC16620sF;
        this.A01 = interfaceC19390xP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // X.InterfaceC19390xP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC19960yQ r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C11J
            if (r0 == 0) goto L68
            r6 = r9
            X.11J r6 = (X.C11J) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.A00 = r2
        L12:
            java.lang.Object r5 = r6.A04
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 == r1) goto L26
            if (r0 != r3) goto L6e
            X.AbstractC09560e7.A00(r5)
        L23:
            X.0eB r4 = X.C0eB.A00
        L25:
            return r4
        L26:
            java.lang.Object r2 = r6.A03
            X.1Dq r2 = (X.C1Dq) r2
            java.lang.Object r8 = r6.A02
            X.0yQ r8 = (X.InterfaceC19960yQ) r8
            java.lang.Object r0 = r6.A01
            X.0rl r0 = (X.C16400rl) r0
            X.AbstractC09560e7.A00(r5)     // Catch: java.lang.Throwable -> L76
            goto L53
        L36:
            X.AbstractC09560e7.A00(r5)
            X.12W r0 = r6.getContext()
            X.0oz r2 = new X.0oz
            r2.<init>(r0, r8)
            X.0sF r0 = r7.A00     // Catch: java.lang.Throwable -> L76
            r6.A01 = r7     // Catch: java.lang.Throwable -> L76
            r6.A02 = r8     // Catch: java.lang.Throwable -> L76
            r6.A03 = r2     // Catch: java.lang.Throwable -> L76
            r6.A00 = r1     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r0.invoke(r2, r6)     // Catch: java.lang.Throwable -> L76
            if (r0 == r4) goto L25
            r0 = r7
        L53:
            r2.releaseIntercepted()
            X.0xP r1 = r0.A01
            r0 = 0
            r6.A01 = r0
            r6.A02 = r0
            r6.A03 = r0
            r6.A00 = r3
            java.lang.Object r0 = r1.collect(r8, r6)
            if (r0 != r4) goto L23
            return r4
        L68:
            X.11J r6 = new X.11J
            r6.<init>(r9, r7)
            goto L12
        L6e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L76:
            r1 = move-exception
            r2.releaseIntercepted()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16400rl.collect(X.0yQ, X.1Ds):java.lang.Object");
    }
}
