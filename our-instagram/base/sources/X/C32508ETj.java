package X;

/* renamed from: X.ETj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32508ETj extends C1P1 {
    public final /* synthetic */ ELH A00;

    public C32508ETj(ELH elh) {
        this.A00 = elh;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1991505147);
        ELH.A02(this.A00);
        C0f9.A0A(-1690725575, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1421003028);
        super.onStart();
        ELH elh = this.A00;
        if (!elh.A0D.isShowing()) {
            C0fJ.A00(elh.A0D);
        }
        C0f9.A0A(-2061421166, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r1 != X.EnumC33395EpS.A07) goto L16;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2078298436(0x7be05144, float:2.3294455E36)
            int r2 = X.C0f9.A03(r0)
            X.EDS r7 = (X.EDS) r7
            r0 = -984681156(0xffffffffc54ef53c, float:-3311.3271)
            int r3 = X.C0f9.A03(r0)
            X.Faf r0 = r7.A00()
            if (r0 == 0) goto L79
            X.ELH r4 = r6.A00
            com.instagram.ui.text.FreeAutoCompleteTextView r0 = r4.A0E
            if (r0 == 0) goto L79
            boolean r0 = X.AbstractC13880nE.A10(r0)
            if (r0 == 0) goto L79
            X.Faf r0 = r7.A00()
            boolean r0 = r0.A02
            if (r0 == 0) goto L46
            java.lang.Integer r5 = X.C05F.A0C
            X.Faf r0 = r7.A00()
            java.lang.String r0 = r0.A01
            X.EpS r1 = X.AbstractC34342FCk.A00(r0)
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.EpS r0 = X.EnumC33395EpS.A05
            if (r1 == r0) goto L79
            X.EpS r0 = X.EnumC33395EpS.A03
            if (r1 == r0) goto L79
            X.EpS r0 = X.EnumC33395EpS.A07
            if (r1 == r0) goto L79
        L46:
            X.Faf r0 = r7.A00()
            java.lang.String r0 = r0.A00
            java.lang.Integer r0 = X.ELH.A00(r0)
            r4.A0H = r0
            X.Faf r0 = r7.A00()
            java.lang.String r0 = r0.A00
            r4.A0I = r0
            com.instagram.ui.text.FreeAutoCompleteTextView r1 = r4.A0E
            X.Faf r0 = r7.A00()
            java.lang.String r0 = r0.A00
            r1.setText(r0)
            X.Faf r0 = r7.A00()
            X.ELH.A04(r4, r0)
        L6c:
            r0 = 1080691319(0x406a0a77, float:3.6568887)
            X.C0f9.A0A(r0, r3)
            r0 = -562957419(0xffffffffde71f395, float:-4.3586106E18)
            X.C0f9.A0A(r0, r2)
            return
        L79:
            X.ELH r0 = r6.A00
            X.ELH.A02(r0)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32508ETj.onSuccess(java.lang.Object):void");
    }
}
