package X;

/* loaded from: classes9.dex */
public final class P4J implements InterfaceC58050Pob {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C50911Meg A01;

    public P4J(C38321qM c38321qM, C50911Meg c50911Meg) {
        this.A01 = c50911Meg;
        this.A00 = c38321qM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r13.length() > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r5 != null) goto L34;
     */
    @Override // X.InterfaceC58050Pob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dpl(X.C51761Mtk r18) {
        /*
            r17 = this;
            r1 = r17
            X.Meg r0 = r1.A01
            X.05A r2 = r0.A04
            X.1qM r1 = r1.A00
        L8:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            X.Mt5 r4 = (X.C51728Mt5) r4
            r7 = 2131966636(0x7f133aac, float:1.9570116E38)
            r0 = r18
            java.lang.Object r5 = r0.A00
            X.MrM r5 = (X.C51629MrM) r5
            X.1rF r0 = r1.A0C
            X.1sb r0 = r0.getInjected()
            r6 = 1
            if (r0 == 0) goto La0
            java.lang.Boolean r0 = r0.Bv2()
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r6)
            if (r0 == 0) goto La0
            if (r5 == 0) goto La0
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto La0
            int r0 = r0.length()
            if (r0 <= 0) goto La0
            r11 = 0
        L38:
            X.1rF r0 = r1.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L91
            java.lang.Boolean r0 = r0.Bv2()
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r6)
            if (r0 == 0) goto L91
            if (r5 == 0) goto L97
            java.lang.String r13 = r5.A01
            if (r13 == 0) goto L93
            int r0 = r13.length()
            if (r0 <= 0) goto L93
        L56:
            com.instagram.common.typedurl.ImageUrl r0 = r1.A1S()
            if (r0 == 0) goto L8f
            com.instagram.common.typedurl.SimpleImageUrl r6 = new com.instagram.common.typedurl.SimpleImageUrl
            r6.<init>(r0)
        L61:
            java.lang.Boolean r8 = r4.A01
            java.lang.Integer r12 = r4.A04
            java.util.List r4 = r4.A08
            X.P4L r0 = X.P4L.A00
            java.util.ArrayList r15 = X.AbstractC001800i.A0T(r0, r4)
            if (r5 == 0) goto L8d
            boolean r0 = r5.A02
        L71:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r7 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r0 = 6
            X.C14360o3.A0B(r15, r0)
            X.Mt5 r5 = new X.Mt5
            r14 = r7
            r16 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r2.AIi(r3, r5)
            if (r0 == 0) goto L8
            return
        L8d:
            r0 = 1
            goto L71
        L8f:
            r6 = 0
            goto L61
        L91:
            if (r5 == 0) goto L97
        L93:
            java.lang.String r0 = r5.A00
            if (r0 != 0) goto L9b
        L97:
            java.lang.Integer r0 = X.AbstractC25227BEk.A0p()
        L9b:
            java.lang.String r13 = java.lang.String.valueOf(r0)
            goto L56
        La0:
            r0 = 2131966637(0x7f133aad, float:1.9570118E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P4J.Dpl(X.Mtk):void");
    }

    @Override // X.InterfaceC58050Pob
    public final void onFailure() {
        Object value;
        C51728Mt5 c51728Mt5;
        C05A c05a = this.A01.A04;
        do {
            value = c05a.getValue();
            c51728Mt5 = (C51728Mt5) value;
        } while (!C51728Mt5.A00(c51728Mt5, value, AbstractC001800i.A0T(P4M.A00, c51728Mt5.A08), c05a));
    }
}
