package X;

/* renamed from: X.MAi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50110MAi extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50110MAi(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i2;
        this.A03 = obj;
        this.A04 = z;
        this.A02 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z;
        int i;
        int i2;
        int i3 = this.A01;
        Object obj2 = this.A03;
        if (i3 != 0) {
            i = this.A02;
            z = this.A04;
            i2 = 1;
        } else {
            z = this.A04;
            i = this.A02;
            i2 = 0;
        }
        return new C50110MAi(obj2, interfaceC23621Ds, i, i2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            X.1JX r3 = X.C1JX.A02
            if (r0 == 0) goto L24
            int r0 = r14.A00
            r4 = 1
            if (r0 == 0) goto L12
            if (r0 == r4) goto L9c
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L12:
            X.AbstractC09560e7.A00(r15)
            java.lang.Object r5 = r14.A03
            X.1Ir r5 = (X.InterfaceC24741Ir) r5
            int r2 = r14.A02
            boolean r1 = r14.A04
            r0 = 6
            X.Mt8 r6 = new X.Mt8
            r6.<init>(r2, r1, r0)
            goto L80
        L24:
            int r0 = r14.A00
            r2 = 2
            r4 = 1
            if (r0 != 0) goto L9c
            X.AbstractC09560e7.A00(r15)
            java.lang.Object r6 = r14.A03
            X.Jmy r6 = (X.C44552Jmy) r6
            X.05A r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            X.MMu r1 = (X.InterfaceC50392MMu) r1
            boolean r0 = r1 instanceof X.C45166Jz7
            if (r0 == 0) goto L8c
            X.Jz7 r1 = (X.C45166Jz7) r1
            X.JwS r0 = r1.A00
            X.Jxu r0 = X.C44552Jmy.A00(r0)
        L45:
            if (r0 == 0) goto L95
            boolean r13 = r14.A04
            int r11 = r14.A02
            if (r13 == 0) goto L89
            X.Kca r5 = X.EnumC46198Kca.A05
        L4f:
            X.LJ7 r2 = r6.A00
            java.lang.Integer r1 = X.C05F.A0Y
            X.Jtw r1 = X.LJ7.A00(r5, r2, r1)
            X.AbstractC43594JPz.A1D(r1, r11)
            X.LJ7.A01(r1, r2)
            X.1Iq r5 = r6.A05
            com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository r1 = r6.A04
            java.lang.String r7 = r1.A03
            java.lang.Object r2 = r0.A01
            X.Jxj r2 = (X.C45114Jxj) r2
            int r12 = r2.A01
            java.lang.Object r1 = r0.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.String r8 = X.AbstractC43592JPx.A0w(r1)
            java.lang.Object r0 = r0.A04
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            java.lang.String r9 = X.AbstractC43592JPx.A0w(r0)
            java.lang.String r10 = r2.A05
            X.Jz5 r6 = new X.Jz5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
        L80:
            r14.A00 = r4
            java.lang.Object r0 = r5.EMz(r6, r14)
        L86:
            if (r0 != r3) goto L9f
            return r3
        L89:
            X.Kca r5 = X.EnumC46198Kca.A06
            goto L4f
        L8c:
            boolean r0 = r1 instanceof X.C45165Jz6
            if (r0 == 0) goto L95
            X.Jz6 r1 = (X.C45165Jz6) r1
            X.Jxu r0 = r1.A01
            goto L45
        L95:
            r14.A00 = r2
            java.lang.Object r0 = X.C44552Jmy.A02(r6, r14)
            goto L86
        L9c:
            X.AbstractC09560e7.A00(r15)
        L9f:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50110MAi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50110MAi) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
