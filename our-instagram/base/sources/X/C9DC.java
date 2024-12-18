package X;

/* renamed from: X.9DC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DC extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DC(C1ON c1on, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A02 = i3;
        this.A05 = c1on;
        this.A04 = i;
        this.A03 = i2;
        this.A07 = z;
        this.A06 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A02;
        C1ON c1on = (C1ON) this.A05;
        int i3 = this.A04;
        int i4 = this.A03;
        boolean z = this.A07;
        boolean z2 = this.A06;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C9DC c9dc = new C9DC(c1on, interfaceC23621Ds, i3, i4, i, z, z2);
        c9dc.A01 = obj;
        return c9dc;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DC) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0044 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r1 = r8.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A00
            r7 = 1
            if (r1 == 0) goto L45
            if (r0 != 0) goto L68
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r5 = r8.A01
            X.3Iw r5 = (X.InterfaceC71543Iw) r5
            r0 = 32
            X.J7Q r1 = new X.J7Q
            r1.<init>(r5, r0)
            java.lang.String r0 = "LoadingFlow loading"
            X.AbstractC12430kl.A00(r0, r1)
            java.lang.Object r4 = r8.A05
            X.1ON r4 = (X.C1ON) r4
            r1 = 4
            X.9Ht r0 = new X.9Ht
            r0.<init>(r5, r1)
            r4.A00 = r0
            int r3 = r8.A04
            int r2 = r8.A03
            boolean r1 = r8.A07
            boolean r0 = r8.A06
            X.C1GJ.A06(r4, r3, r2, r1, r0)
            r1 = 33
        L37:
            X.J7Q r0 = new X.J7Q
            r0.<init>(r4, r1)
            r8.A00 = r7
            java.lang.Object r0 = X.AbstractC71523Is.A00(r8, r0, r5)
            if (r0 != r6) goto L6b
            return r6
        L45:
            if (r0 != 0) goto L68
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r5 = r8.A01
            X.3Iw r5 = (X.InterfaceC71543Iw) r5
            java.lang.Object r4 = r8.A05
            X.1ON r4 = (X.C1ON) r4
            r1 = 3
            X.9Ht r0 = new X.9Ht
            r0.<init>(r5, r1)
            r4.A00 = r0
            int r3 = r8.A04
            int r2 = r8.A03
            boolean r1 = r8.A07
            boolean r0 = r8.A06
            X.C1GJ.A06(r4, r3, r2, r1, r0)
            r1 = 31
            goto L37
        L68:
            X.AbstractC09560e7.A00(r9)
        L6b:
            X.0eB r6 = X.C0eB.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DC.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
