package X;

/* renamed from: X.9D6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9D6 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final float A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D6(C8NF c8nf, Integer num, InterfaceC23621Ds interfaceC23621Ds, float f, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A04 = c8nf;
        this.A03 = num;
        this.A01 = f;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A02;
        C8NF c8nf = (C8NF) this.A04;
        Integer num = (Integer) this.A03;
        float f = this.A01;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C9D6(c8nf, num, interfaceC23621Ds, f, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9D6) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r1 = r8.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r8.A00
            r6 = 1
            if (r1 == 0) goto L57
            if (r0 != 0) goto L7f
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r1 = r8.A04
            X.8NF r1 = (X.C8NF) r1
            X.05A r7 = r1.A07
            java.lang.Object r0 = r7.getValue()
            X.8NG r0 = (X.C8NG) r0
            java.util.List r4 = r1.A04
            int r3 = r0.A01
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            int r1 = r4.indexOf(r0)
            java.lang.Object r2 = r8.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r0 = X.C05F.A00
            if (r2 != r0) goto L50
            int r1 = r1 + 1
        L31:
            int r0 = r4.size()
            int r1 = r1 % r0
            java.lang.Object r0 = r4.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            float r0 = r8.A01
            X.8NG r4 = new X.8NG
            r4.<init>(r2, r0, r3, r1)
        L47:
            r8.A00 = r6
            java.lang.Object r0 = r7.emit(r4, r8)
            if (r0 != r5) goto L82
            return r5
        L50:
            int r1 = r1 - r6
            int r0 = r4.size()
            int r1 = r1 + r0
            goto L31
        L57:
            if (r0 != 0) goto L7f
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r0 = r8.A04
            X.8NF r0 = (X.C8NF) r0
            X.05A r7 = r0.A07
            java.lang.Object r1 = r7.getValue()
            X.8NG r1 = (X.C8NG) r1
            java.lang.Object r3 = r8.A03
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Integer r0 = X.C05F.A0C
            if (r3 != r0) goto L7c
            int r2 = r1.A02
        L72:
            int r1 = r1.A02
            float r0 = r8.A01
            X.8NG r4 = new X.8NG
            r4.<init>(r3, r0, r2, r1)
            goto L47
        L7c:
            int r2 = r1.A01
            goto L72
        L7f:
            X.AbstractC09560e7.A00(r9)
        L82:
            X.0eB r5 = X.C0eB.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9D6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
