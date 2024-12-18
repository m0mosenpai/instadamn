package X;

/* renamed from: X.02x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C008302x extends C05N {
    public final InterfaceC16620sF A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.02x, X.05N] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.1Ir] */
    @Override // X.C05N, X.C0UG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC71543Iw r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0wJ
            if (r0 == 0) goto L3b
            r4 = r7
            X.0wJ r4 = (X.C0wJ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.A00 = r2
        L12:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L49
            java.lang.Object r6 = r4.A01
            X.1Ir r6 = (X.InterfaceC24741Ir) r6
            X.AbstractC09560e7.A00(r3)
        L24:
            boolean r0 = r6.CRR()
            if (r0 == 0) goto L41
            X.0eB r2 = X.C0eB.A00
            return r2
        L2d:
            X.AbstractC09560e7.A00(r3)
            r4.A01 = r6
            r4.A00 = r0
            java.lang.Object r0 = super.A00(r6, r4)
            if (r0 != r2) goto L24
            return r2
        L3b:
            X.0wJ r4 = new X.0wJ
            r4.<init>(r7, r5)
            goto L12
        L41:
            java.lang.String r1 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L49:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C008302x.A00(X.3Iw, X.1Ds):java.lang.Object");
    }

    @Override // X.C05N, X.C0UG
    public final C0UG A04(Integer num, C12W c12w, int i) {
        return new C008302x(num, c12w, this.A00, i);
    }

    public C008302x(Integer num, C12W c12w, InterfaceC16620sF interfaceC16620sF, int i) {
        super(num, c12w, interfaceC16620sF, i);
        this.A00 = interfaceC16620sF;
    }
}
