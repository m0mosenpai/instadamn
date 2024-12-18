package X;

/* loaded from: classes4.dex */
public final class B5K extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5K(Object obj, InterfaceC23621Ds interfaceC23621Ds, float f, float f2, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
        this.A01 = f;
        this.A02 = f2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A03;
        Object obj2 = this.A04;
        float f = this.A01;
        float f2 = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new B5K(obj2, interfaceC23621Ds, f, f2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r1 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r1 == 0) goto L26
            if (r0 != 0) goto L40
            X.AbstractC09560e7.A00(r7)
            java.lang.Object r0 = r6.A04
            X.Mgc r0 = (X.C51029Mgc) r0
            X.0Ui r3 = r0.A08
            float r2 = r6.A01
            float r1 = r6.A02
            X.CVP r0 = new X.CVP
            r0.<init>(r2, r1)
            r6.A00 = r4
            java.lang.Object r0 = r3.emit(r0, r6)
        L23:
            if (r0 != r5) goto L43
            return r5
        L26:
            if (r0 != 0) goto L40
            X.AbstractC09560e7.A00(r7)
            java.lang.Object r0 = r6.A04
            X.6NT r0 = (X.C6NT) r0
            androidx.compose.foundation.gestures.ScrollingLogic r2 = r0.A09
            float r1 = r6.A01
            float r0 = r6.A02
            long r0 = X.AbstractC119395aw.A00(r1, r0)
            r6.A00 = r4
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollableKt.A00(r2, r6, r0)
            goto L23
        L40:
            X.AbstractC09560e7.A00(r7)
        L43:
            X.0eB r5 = X.C0eB.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B5K.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((B5K) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
