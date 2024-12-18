package X;

/* loaded from: classes9.dex */
public final class PXR extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXR(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        switch (this.A01) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return new PXR(i, interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r1 = r6.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r5 = 1
            switch(r1) {
                case 0: goto L25;
                case 1: goto L33;
                case 2: goto L43;
                default: goto La;
            }
        La:
            if (r0 != 0) goto L63
            X.AbstractC09560e7.A00(r7)
            X.1R3 r0 = X.C1R3.A03
            X.0UO r3 = r0.A02
            X.PVb r2 = X.C57112PVb.A00
            r6.A00 = r5
            java.lang.String r1 = "dogfooding_notification_collect"
            com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2 r0 = new com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2
            r0.<init>(r1, r2)
            java.lang.Object r0 = r3.collect(r0, r6)
        L22:
            if (r0 != r4) goto L66
            return r4
        L25:
            if (r0 != 0) goto L63
            X.AbstractC09560e7.A00(r7)
            r0 = 300(0x12c, double:1.48E-321)
            r6.A00 = r5
            java.lang.Object r0 = X.AbstractC89993zf.A01(r6, r0)
            goto L22
        L33:
            if (r0 != 0) goto L63
            X.AbstractC09560e7.A00(r7)
            com.instagram.preferences.device.AppRestartLoggerPrefs r1 = com.instagram.preferences.device.AppRestartLoggerPrefs.A00
            X.MLJ r0 = X.MLJ.A00
            r6.A00 = r5
            java.lang.Object r0 = r1.A02(r6, r0)
            goto L22
        L43:
            if (r0 == 0) goto L4d
            X.AbstractC09560e7.A00(r7)
        L48:
            X.PW2 r0 = X.AbstractC25225BEi.A19()
            throw r0
        L4d:
            X.AbstractC09560e7.A00(r7)
            X.0do r0 = X.C2ZK.A02
            java.lang.Object r1 = r0.getValue()
            X.0pN r1 = (X.InterfaceC15070pN) r1
            X.PVa r0 = X.C57111PVa.A00
            r6.A00 = r5
            java.lang.Object r0 = r1.collect(r0, r6)
            if (r0 != r4) goto L48
            return r4
        L63:
            X.AbstractC09560e7.A00(r7)
        L66:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PXR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PXR) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
