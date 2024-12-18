package X;

/* renamed from: X.Coh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28873Coh implements InterfaceC30915DiS {
    public final long A00;
    public final InterfaceC1128957x A01;
    public final InterfaceC16620sF A02;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        if (r4 > r10) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
    
        if (r6 < 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        r11 = 0;
     */
    @Override // X.InterfaceC30915DiS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AFF(X.C28268CdD r18, X.AnonymousClass583 r19, long r20, long r22) {
        /*
            r17 = this;
            r8 = 0
            r15 = r19
            r9 = r18
            int r12 = X.AbstractC167007dF.A06(r8, r9, r15)
            r13 = r17
            X.57x r3 = r13.A01
            r0 = 1090519040(0x41000000, float:8.0)
            int r7 = r3.EL8(r0)
            long r0 = r13.A00
            r10 = 32
            float r2 = X.AbstractC25227BEk.A01(r0)
            int r2 = r3.EL8(r2)
            float r0 = X.AbstractC25232BEp.A00(r0)
            int r16 = r3.EL8(r0)
            int r6 = r9.A01
            int r5 = r6 + r2
            int r4 = r9.A02
            int r3 = r4 - r2
            long r0 = r22 >> r10
            int r2 = (int) r0
            int r3 = r3 - r2
            long r0 = r20 >> r10
            int r10 = (int) r0
            int r11 = r10 - r2
            X.583 r14 = X.AnonymousClass583.Ltr
            r0 = 3
            r1 = 1
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            if (r15 != r14) goto Lcc
            X.AbstractC25235BEs.A1R(r0, r5, r8)
            X.AbstractC25235BEs.A1R(r0, r3, r1)
            if (r6 >= 0) goto L49
        L48:
            r11 = 0
        L49:
            X.AbstractC25235BEs.A1R(r0, r11, r12)
            X.0s6 r4 = X.AbstractC13190m5.A00(r0)
        L50:
            boolean r0 = r4.hasNext()
            r5 = 0
            if (r0 == 0) goto Lca
            java.lang.Object r1 = r4.next()
            int r0 = X.AbstractC166987dD.A0H(r1)
            if (r0 < 0) goto L50
            int r0 = r0 + r2
            if (r0 > r10) goto L50
        L64:
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = X.AbstractC25227BEk.A06(r1, r3)
            int r0 = r9.A00
            int r0 = r0 + r16
            int r3 = java.lang.Math.max(r0, r7)
            int r0 = r9.A03
            int r8 = r0 - r16
            int r6 = X.C119055aN.A00(r22)
            int r8 = r8 - r6
            int r1 = r6 / r12
            int r0 = r0 - r1
            int r12 = X.C119055aN.A00(r20)
            int r11 = r12 - r6
            int r11 = r11 - r7
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r10, r3, r1, r0}
            X.0s6 r10 = X.AbstractC13190m5.A00(r0)
        L9d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r3 = r10.next()
            int r1 = X.AbstractC166987dD.A0H(r3)
            if (r1 < r7) goto L9d
            int r1 = r1 + r6
            int r0 = r12 - r7
            if (r1 > r0) goto L9d
            r5 = r3
        Lb3:
            java.lang.Number r5 = (java.lang.Number) r5
            int r3 = X.AbstractC25227BEk.A06(r5, r8)
            X.0sF r1 = r13.A02
            int r2 = r2 + r4
            int r6 = r6 + r3
            X.CdD r0 = new X.CdD
            r0.<init>(r4, r3, r2, r6)
            r1.invoke(r9, r0)
            long r0 = X.AbstractC113765Bo.A00(r4, r3)
            return r0
        Lca:
            r1 = r5
            goto L64
        Lcc:
            X.AbstractC25235BEs.A1R(r0, r3, r8)
            X.AbstractC25235BEs.A1R(r0, r5, r1)
            if (r4 <= r10) goto L48
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28873Coh.AFF(X.CdD, X.583, long, long):long");
    }

    public C28873Coh(InterfaceC1128957x interfaceC1128957x, InterfaceC16620sF interfaceC16620sF, long j) {
        AbstractC167017dG.A1R(interfaceC1128957x, interfaceC16620sF);
        this.A00 = j;
        this.A01 = interfaceC1128957x;
        this.A02 = interfaceC16620sF;
    }
}
