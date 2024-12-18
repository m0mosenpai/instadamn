package X;

/* renamed from: X.9Cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206689Cz extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206689Cz(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        boolean z = this.A03;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C206689Cz(obj2, interfaceC23621Ds, i, z);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C206689Cz) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            X.1JX r3 = X.C1JX.A02
            if (r0 == 0) goto L34
            int r0 = r4.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L22
            if (r0 != r1) goto L55
            X.AbstractC09560e7.A00(r5)
        L11:
            java.lang.Object r0 = r4.A02
            X.2OX r0 = (X.C2OX) r0
            X.2Px r1 = r0.A02
            boolean r0 = r4.A03
            r4.A00 = r2
            java.lang.Object r0 = r1.A00(r4, r0)
        L1f:
            if (r0 != r3) goto L58
            return r3
        L22:
            X.AbstractC09560e7.A00(r5)
            java.lang.Object r0 = r4.A02
            X.2OX r0 = (X.C2OX) r0
            X.2Od r0 = r0.A03
            r4.A00 = r1
            java.lang.Object r0 = r0.A00(r4)
            if (r0 != r3) goto L11
            return r3
        L34:
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L43
            if (r0 == r2) goto L55
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L43:
            X.AbstractC09560e7.A00(r5)
            java.lang.Object r0 = r4.A02
            X.3CY r0 = (X.C3CY) r0
            com.instagram.quicksnap.data.repository.QuickSnapRepository r1 = r0.A05
            boolean r0 = r4.A03
            r4.A00 = r2
            java.lang.Object r0 = r1.A04(r4, r0)
            goto L1f
        L55:
            X.AbstractC09560e7.A00(r5)
        L58:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206689Cz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
