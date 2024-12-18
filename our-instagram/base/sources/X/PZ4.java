package X;

/* loaded from: classes9.dex */
public final class PZ4 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ4(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A02 = 3;
        this.A04 = i;
        this.A03 = i2;
        this.A05 = interfaceC16660sJ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C50868Mdz c50868Mdz;
        EnumC53170NfR enumC53170NfR;
        int i;
        int i2;
        int i3;
        switch (this.A02) {
            case 0:
                return new PZ4((C8K5) this.A01, (C115525Km) this.A05, interfaceC23621Ds, this.A04, this.A03);
            case 1:
                c50868Mdz = (C50868Mdz) this.A01;
                enumC53170NfR = (EnumC53170NfR) this.A05;
                i = this.A04;
                i2 = this.A03;
                i3 = 1;
                break;
            case 2:
                c50868Mdz = (C50868Mdz) this.A01;
                enumC53170NfR = (EnumC53170NfR) this.A05;
                i = this.A03;
                i2 = this.A04;
                i3 = 2;
                break;
            default:
                PZ4 pz4 = new PZ4(interfaceC23621Ds, (InterfaceC16660sJ) this.A05, this.A04, this.A03);
                pz4.A01 = obj;
                return pz4;
        }
        return new PZ4(enumC53170NfR, c50868Mdz, interfaceC23621Ds, i, i2, i3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0029 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r1 = r13.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r13.A00
            r5 = 1
            switch(r1) {
                case 0: goto L66;
                case 1: goto L40;
                case 2: goto L2a;
                default: goto La;
            }
        La:
            if (r0 != 0) goto L85
            X.AbstractC09560e7.A00(r14)
            java.lang.Object r8 = r13.A01
            X.6KN r8 = (X.C6KN) r8
            int r9 = r13.A04
            int r11 = r13.A03
            java.lang.Object r10 = r13.A05
            r12 = 4
            X.DRe r7 = new X.DRe
            r7.<init>(r8, r9, r10, r11, r12)
            r13.A00 = r5
            X.0sE r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A05(r8, r13, r7, r0)
        L27:
            if (r0 != r6) goto L88
            return r6
        L2a:
            if (r0 != 0) goto L85
            X.AbstractC09560e7.A00(r14)
            java.lang.Object r0 = r13.A01
            X.Mdz r0 = (X.C50868Mdz) r0
            X.0Ui r7 = r0.A0T
            java.lang.Integer r4 = X.C05F.A0C
            java.lang.Object r3 = r13.A05
            X.NfR r3 = (X.EnumC53170NfR) r3
            int r2 = r13.A03
            int r0 = r13.A04
            goto L55
        L40:
            if (r0 != 0) goto L85
            X.AbstractC09560e7.A00(r14)
            java.lang.Object r0 = r13.A01
            X.Mdz r0 = (X.C50868Mdz) r0
            X.0Ui r7 = r0.A0T
            java.lang.Integer r4 = X.C05F.A0N
            java.lang.Object r3 = r13.A05
            X.NfR r3 = (X.EnumC53170NfR) r3
            int r2 = r13.A04
            int r0 = r13.A03
        L55:
            X.Mtb r1 = new X.Mtb
            r1.<init>(r3, r2, r0)
            X.MWo r0 = new X.MWo
            r0.<init>(r1, r4)
            r13.A00 = r5
            java.lang.Object r0 = r7.emit(r0, r13)
            goto L27
        L66:
            if (r0 != 0) goto L85
            X.AbstractC09560e7.A00(r14)
            java.lang.Object r0 = r13.A01
            X.8K5 r0 = (X.C8K5) r0
            X.1Iq r4 = r0.A00
            java.lang.Object r3 = r13.A05
            X.5Km r3 = (X.C115525Km) r3
            int r2 = r13.A04
            int r1 = r13.A03
            X.NId r0 = new X.NId
            r0.<init>(r3, r2, r1)
            r13.A00 = r5
            java.lang.Object r0 = r4.EMz(r0, r13)
            goto L27
        L85:
            X.AbstractC09560e7.A00(r14)
        L88:
            X.0eB r6 = X.C0eB.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PZ4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PZ4) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ4(C8K5 c8k5, C115525Km c115525Km, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A02 = 0;
        this.A01 = c8k5;
        this.A05 = c115525Km;
        this.A04 = i;
        this.A03 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ4(EnumC53170NfR enumC53170NfR, C50868Mdz c50868Mdz, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A02 = i3;
        this.A01 = c50868Mdz;
        this.A05 = enumC53170NfR;
        if (1 - i3 != 0) {
            this.A03 = i;
            this.A04 = i2;
        } else {
            this.A04 = i;
            this.A03 = i2;
        }
    }
}
