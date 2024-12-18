package X;

/* loaded from: classes9.dex */
public final class PXm extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r9 = r12
            int r1 = r12.A01
            X.1JX r0 = X.C1JX.A02
            if (r1 == 0) goto L44
            int r1 = r12.A00
            r3 = 2
            r2 = 1
            if (r1 != 0) goto L68
            X.AbstractC09560e7.A00(r13)
            boolean r1 = r12.A05
            java.lang.Object r4 = r12.A03
            if (r1 == 0) goto L2e
            X.NSa r4 = (X.C52678NSa) r4
            boolean r1 = r12.A06
            r10 = r1 ^ 1
            java.lang.Integer r7 = X.C05F.A1F
            java.lang.String r8 = r12.A04
            java.lang.Object r6 = r12.A02
            X.Iwq r6 = (X.C42814Iwq) r6
            r12.A00 = r2
            r5 = r4
            java.lang.Object r1 = r5.A02(r6, r7, r8, r9, r10)
        L2b:
            if (r1 != r0) goto L6b
            return r0
        L2e:
            X.NSa r4 = (X.C52678NSa) r4
            boolean r1 = r12.A06
            r10 = r1 ^ 1
            java.lang.Integer r6 = X.C05F.A1F
            java.lang.String r7 = r12.A04
            r8 = 0
            java.lang.Object r5 = r12.A02
            X.Iwq r5 = (X.C42814Iwq) r5
            r12.A00 = r3
            java.lang.Object r1 = r4.A01(r5, r6, r7, r8, r9, r10)
            goto L2b
        L44:
            int r2 = r12.A00
            r1 = 1
            if (r2 == 0) goto L50
            if (r2 == r1) goto L68
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L50:
            X.AbstractC09560e7.A00(r13)
            java.lang.Object r6 = r12.A03
            com.instagram.creation.ml.VisualFeatureStore r6 = (com.instagram.creation.ml.VisualFeatureStore) r6
            java.lang.String r8 = r12.A04
            boolean r10 = r12.A06
            java.lang.Object r7 = r12.A02
            java.lang.Long r7 = (java.lang.Long) r7
            boolean r11 = r12.A05
            r12.A00 = r1
            java.lang.Object r1 = r6.A03(r7, r8, r9, r10, r11)
            goto L2b
        L68:
            X.AbstractC09560e7.A00(r13)
        L6b:
            X.0eB r0 = X.C0eB.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXm(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A03 = obj;
        this.A04 = str;
        this.A06 = z;
        this.A02 = obj2;
        this.A05 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        boolean z;
        Object obj3;
        boolean z2;
        int i;
        if (this.A01 != 0) {
            z2 = this.A05;
            obj2 = this.A03;
            z = this.A06;
            str = this.A04;
            obj3 = this.A02;
            i = 1;
        } else {
            obj2 = this.A03;
            str = this.A04;
            z = this.A06;
            obj3 = this.A02;
            z2 = this.A05;
            i = 0;
        }
        return new PXm(obj2, obj3, str, interfaceC23621Ds, i, z, z2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PXm) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
