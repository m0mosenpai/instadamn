package X;

/* renamed from: X.AnO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24139AnO implements InterfaceC190628cK {
    public String A00;
    public final /* synthetic */ C9NL A01;

    @Override // X.InterfaceC190628cK
    public final void DOI() {
    }

    @Override // X.InterfaceC190628cK
    public final boolean DdB(C05R c05r) {
        return false;
    }

    public C24139AnO(C9NL c9nl) {
        this.A01 = c9nl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (r4.A0L.contains(r6[0]) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r2.equals(r10.A00) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        ((android.widget.Filter) r4.A0M.getValue()).filter(r5);
        r4.A0H.A00(r11);
        r1 = r4.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r1.A01 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        r1.A02.Clg();
        r1.A01 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if ((r4.A00 + r4.A0L.size()) < 10) goto L19;
     */
    @Override // X.InterfaceC190628cK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DkM(com.instagram.ui.text.ConstrainedEditText r11, int r12, int r13) {
        /*
            r10 = this;
            X.9NL r4 = r10.A01
            X.840 r0 = r4.A0F
            X.83z r8 = r0.A02
            X.83h r0 = r8.A01
            X.81l r1 = r0.A0Y
            r1.getClass()
            r3 = 1
            X.81W r0 = X.C81W.A0p
            r9 = 0
            boolean r0 = X.C1810981l.A05(r0, r1)
            if (r0 != 0) goto L8f
            r11.getClass()
            android.text.Editable r7 = r11.getText()
            int r0 = r7.length()
            if (r0 == 0) goto L8f
            java.lang.String r0 = X.AbstractC23019ADb.A00(r11, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3b
            X.A8C r1 = r4.A0I
            boolean r0 = r1.A00
            if (r0 != 0) goto L3b
            X.8c6 r0 = r1.A02
            r0.Clf()
            r1.A00 = r3
        L3b:
            java.lang.String r5 = X.AbstractC23019ADb.A00(r11, r9)
            java.lang.String r2 = r7.toString()
            boolean r0 = X.A16.A00(r5)
            if (r0 == 0) goto La7
            int r6 = X.C9NK.A00(r7)
            int r1 = android.text.Selection.getSelectionEnd(r7)
            if (r6 < 0) goto L90
            java.lang.Class<X.V78> r0 = X.V78.class
            java.lang.Object[] r6 = r7.getSpans(r6, r1, r0)
            X.V78[] r6 = (X.V78[]) r6
            int r0 = r6.length
            if (r0 <= 0) goto L90
            java.util.Set r1 = r4.A0L
            r0 = r6[r9]
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L90
        L68:
            java.lang.String r0 = r10.A00
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto La7
            X.0do r0 = r4.A0M
            java.lang.Object r0 = r0.getValue()
            android.widget.Filter r0 = (android.widget.Filter) r0
            r0.filter(r5)
            X.AlU r0 = r4.A0H
            r0.A00(r11)
            X.A8C r1 = r4.A0I
            boolean r0 = r1.A01
            if (r0 != 0) goto L8d
            X.8c6 r0 = r1.A02
            r0.Clg()
            r1.A01 = r3
        L8d:
            r10.A00 = r2
        L8f:
            return
        L90:
            boolean r0 = X.AbstractC227009zw.A00(r8)
            if (r0 == 0) goto La7
            X.C9NL.A00(r7, r4)
            int r1 = r4.A00
            java.util.Set r0 = r4.A0L
            int r0 = r0.size()
            int r1 = r1 + r0
            r0 = 10
            if (r1 >= r0) goto La7
            goto L68
        La7:
            X.9UL r1 = r4.A0G
            java.util.List r0 = r1.A01
            r0.clear()
            r1.notifyDataSetChanged()
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24139AnO.DkM(com.instagram.ui.text.ConstrainedEditText, int, int):void");
    }
}
