package X;

/* renamed from: X.058, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass058 implements InterfaceC19390xP, InterfaceC16480rt {
    public final InterfaceC16620sF A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // X.InterfaceC19390xP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC19960yQ r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C18870wH
            if (r0 == 0) goto L23
            r6 = r9
            X.0wH r6 = (X.C18870wH) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.A00 = r2
        L12:
            java.lang.Object r5 = r6.A02
            X.1JX r4 = X.C1JX.A02
            r3 = r4
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            java.lang.Object r2 = r6.A01
            X.1Dq r2 = (X.C1Dq) r2
            goto L29
        L23:
            X.0wH r6 = new X.0wH
            r6.<init>(r9, r7)
            goto L12
        L29:
            X.AbstractC09560e7.A00(r5)     // Catch: java.lang.Throwable -> L54
            goto L4e
        L2d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L35:
            X.AbstractC09560e7.A00(r5)
            X.12W r0 = r6.getContext()
            X.0oz r2 = new X.0oz
            r2.<init>(r0, r8)
            r6.A01 = r2     // Catch: java.lang.Throwable -> L54
            r6.A00 = r1     // Catch: java.lang.Throwable -> L54
            X.0sF r0 = r7.A00     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.invoke(r2, r6)     // Catch: java.lang.Throwable -> L54
            if (r0 != r4) goto L4e
            return r3
        L4e:
            r2.releaseIntercepted()
            X.0eB r3 = X.C0eB.A00
            return r3
        L54:
            r1 = move-exception
            r2.releaseIntercepted()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass058.collect(X.0yQ, X.1Ds):java.lang.Object");
    }

    public AnonymousClass058(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }

    public AnonymousClass058() {
    }
}
