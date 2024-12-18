package X;

/* loaded from: classes5.dex */
public final class DHX extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHX(Object obj, int i, boolean z, boolean z2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0097, code lost:
    
        r3.A07(r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r1 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c2, code lost:
    
        r3.A03(r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bd, code lost:
    
        r3.A04(r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r2 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (r1 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        r3.A08(r4, r5, r6, r7, r8);
     */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L66;
                default: goto L5;
            }
        L5:
            X.2EC r10 = (X.C2EC) r10
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            boolean r2 = r9.A02
            boolean r1 = r9.A03
            java.lang.Object r0 = r9.A01
            X.Dyu r0 = (X.C31835Dyu) r0
            X.0do r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            X.7FQ r3 = (X.C7FQ) r3
            java.lang.String r5 = r10.C7I()
            java.lang.String r6 = r10.C7q()
            int r7 = r10.C7g()
            int r8 = r10.AdZ()
            com.instagram.direct.prompts.DirectPromptTypes r4 = com.instagram.direct.prompts.DirectPromptTypes.A07
            if (r2 == 0) goto L37
            if (r1 == 0) goto L97
        L31:
            r3.A08(r4, r5, r6, r7, r8)
        L34:
            X.0eB r0 = X.C0eB.A00
            return r0
        L37:
            if (r1 == 0) goto Lc2
            goto Lbd
        L3b:
            X.5Ao r10 = (X.InterfaceC113515Ao) r10
            java.lang.Object r0 = r9.A01
            X.DiM r0 = (X.InterfaceC30909DiM) r0
            long r5 = r0.E6O()
            X.5At r1 = X.AbstractC47132KsR.A00
            boolean r0 = r9.A03
            if (r0 == 0) goto L63
            X.C5l r3 = X.EnumC27356C5l.SelectionStart
        L4d:
            boolean r0 = r9.A02
            if (r0 == 0) goto L60
            java.lang.Integer r4 = X.C05F.A00
        L53:
            boolean r7 = X.AbstractC119395aw.A02(r5)
            X.CVu r2 = new X.CVu
            r2.<init>(r3, r4, r5, r7)
            r10.EOx(r1, r2)
            goto L34
        L60:
            java.lang.Integer r4 = X.C05F.A0C
            goto L53
        L63:
            X.C5l r3 = X.EnumC27356C5l.SelectionEnd
            goto L4d
        L66:
            X.2EC r10 = (X.C2EC) r10
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            boolean r1 = r9.A02
            boolean r2 = r9.A03
            java.lang.Object r0 = r9.A01
            if (r1 == 0) goto L9b
            X.Dz7 r0 = (X.Dz7) r0
            X.0do r1 = r0.A0F
            java.lang.Object r3 = r1.getValue()
            X.7FQ r3 = (X.C7FQ) r3
            java.lang.String r5 = r10.C7I()
            java.lang.String r6 = r10.C7q()
            int r7 = r10.C7g()
            int r8 = r10.AdZ()
            java.lang.String r0 = r0.A0D
            com.instagram.direct.prompts.DirectPromptTypes r4 = X.C7D2.A01(r0)
            if (r2 == 0) goto L97
            goto L31
        L97:
            r3.A07(r4, r5, r6, r7, r8)
            goto L34
        L9b:
            X.Dz7 r0 = (X.Dz7) r0
            X.0do r1 = r0.A0F
            java.lang.Object r3 = r1.getValue()
            X.7FQ r3 = (X.C7FQ) r3
            java.lang.String r5 = r10.C7I()
            java.lang.String r6 = r10.C7q()
            int r7 = r10.C7g()
            int r8 = r10.AdZ()
            java.lang.String r0 = r0.A0D
            com.instagram.direct.prompts.DirectPromptTypes r4 = X.C7D2.A01(r0)
            if (r2 == 0) goto Lc2
        Lbd:
            r3.A04(r4, r5, r6, r7, r8)
            goto L34
        Lc2:
            r3.A03(r4, r5, r6, r7, r8)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHX.invoke(java.lang.Object):java.lang.Object");
    }
}
