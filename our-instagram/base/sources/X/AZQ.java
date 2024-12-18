package X;

/* loaded from: classes4.dex */
public final class AZQ implements InterfaceC203488z7 {
    public final /* synthetic */ AZU A00;
    public final /* synthetic */ C8KR A01;
    public final /* synthetic */ String A02;

    public AZQ(AZU azu, C8KR c8kr, String str) {
        this.A00 = azu;
        this.A01 = c8kr;
        this.A02 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        if (r0 <= r1) goto L38;
     */
    @Override // X.InterfaceC203488z7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DaC(java.lang.Object r12) {
        /*
            r11 = this;
            float[] r12 = (float[]) r12
            if (r12 == 0) goto Le1
            X.AZU r0 = r11.A00
            X.8KR r5 = r11.A01
            java.lang.String r9 = r11.A02
            int r1 = r12.length
            r3 = 0
            if (r1 == 0) goto Le1
            java.util.List r7 = r0.A00
            int r0 = r7.size()
            if (r1 != r0) goto Le1
            int r1 = r1 + (-1)
            X.17u r0 = new X.17u
            r0.<init>(r3, r1)
            java.util.Iterator r10 = r0.iterator()
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L96
            r8 = r10
            X.0sg r8 = (X.AbstractC16880sg) r8
            int r6 = r8.A00()
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L4a
            r4 = r12[r6]
        L36:
            int r2 = r8.A00()
            r1 = r12[r2]
            int r0 = java.lang.Float.compare(r4, r1)
            if (r0 >= 0) goto L44
            r6 = r2
            r4 = r1
        L44:
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L36
        L4a:
            X.AA9 r4 = new X.AA9
            r4.<init>()
            r4.A01 = r9
            java.lang.Object r0 = r7.get(r6)
            X.A7y r0 = (X.C22903A7y) r0
            long r0 = r0.A01
            long r0 = X.AbstractC166987dD.A0L(r0)
            int r2 = (int) r0
            r4.A00 = r2
            java.util.ArrayList r2 = X.AbstractC167007dF.A0i(r7)
            java.util.Iterator r1 = r7.iterator()
        L68:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r1.next()
            X.A7y r0 = (X.C22903A7y) r0
            int r0 = r0.A00
            X.AbstractC166997dE.A1W(r2, r0)
            goto L68
        L7a:
            r4.A02 = r2
            java.util.ArrayList r6 = X.AbstractC167007dF.A0i(r7)
            java.util.Iterator r2 = r7.iterator()
        L84:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r2.next()
            X.A7y r0 = (X.C22903A7y) r0
            long r0 = r0.A01
            X.AbstractC166997dE.A1X(r6, r0)
            goto L84
        L96:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L9c:
            r4.A05 = r6
            java.util.List r0 = X.AbstractC009903n.A0F(r12)
            r4.A04 = r0
            int r1 = r0.size()
            java.util.List r0 = r4.A05
            int r0 = r0.size()
            if (r1 != r0) goto Le1
            java.util.List r0 = r4.A05
            int r0 = r0.size()
            X.17u r1 = X.C17s.A0C(r3, r0)
            java.util.List r3 = r4.A02
            boolean r0 = X.AbstractC166987dD.A1b(r3)
            if (r0 == 0) goto Lde
            int r2 = r1.A00
            int r1 = r1.A01
            java.lang.Object r0 = X.AbstractC001800i.A0I(r3)
            int r0 = X.AbstractC166987dD.A0H(r0)
            if (r2 > r0) goto Le1
            if (r0 > r1) goto Le1
            java.lang.Object r0 = X.AbstractC001800i.A0K(r3)
            int r0 = X.AbstractC166987dD.A0H(r0)
            if (r2 > r0) goto Le1
            if (r0 > r1) goto Le1
        Lde:
            r5.A01(r4)
        Le1:
            X.AZU r0 = r11.A00
            java.util.List r0 = r0.A00
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZQ.DaC(java.lang.Object):void");
    }
}
