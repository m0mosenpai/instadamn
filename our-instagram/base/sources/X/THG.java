package X;

/* loaded from: classes10.dex */
public final class THG implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;

    public THG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r3 != null) goto L18;
     */
    @Override // X.InterfaceC42241xE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L30;
                default: goto L5;
            }
        L5:
            X.QIy r7 = (X.QIy) r7
            java.lang.Object r1 = r7.A04
            X.Rgi r1 = (X.EnumC61182Rgi) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L1f
            java.lang.Object r2 = r6.A01
            X.TlC r2 = (X.InterfaceC65491TlC) r2
            java.lang.Object r1 = r7.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r7.A00
            java.util.List r0 = (java.util.List) r0
            r2.DqS(r7, r1, r0)
        L1e:
            return
        L1f:
            X.Rgi r0 = X.EnumC61182Rgi.A07
            if (r1 != r0) goto L1e
            java.lang.Object r2 = r6.A01
            X.TlC r2 = (X.InterfaceC65491TlC) r2
            java.lang.Object r1 = r7.A00
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            r2.DGD(r0, r1)
            return
        L30:
            com.facebook.msys.mca.MailboxNullable r7 = (com.facebook.msys.mca.MailboxNullable) r7
            java.lang.Object r3 = r7.value
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r2 = r6.A01
            X.SIX r2 = (X.SIX) r2
            if (r3 == 0) goto L58
            boolean r0 = r3 instanceof java.util.HashSet
            if (r0 == 0) goto L4d
            java.util.HashSet r3 = (java.util.HashSet) r3
            if (r3 == 0) goto L4d
        L44:
            X.Sab r0 = r2.A03
            android.content.Intent r1 = r0.A02
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BLACK_HOLE_LIST"
            r1.putExtra(r0, r3)
        L4d:
            X.SjR r5 = r2.A04
            androidx.fragment.app.Fragment r4 = r2.A02
            android.content.Intent r3 = r2.A01
            X.Sab r1 = r2.A03
            int r0 = r2.A00
            goto L84
        L58:
            java.util.HashSet r3 = X.AbstractC166987dD.A1H()
            goto L44
        L5d:
            com.facebook.msys.mca.MailboxNullable r7 = (com.facebook.msys.mca.MailboxNullable) r7
            java.lang.Object r3 = r7.value
            java.util.Set r3 = (java.util.Set) r3
            if (r3 == 0) goto L1e
            java.lang.Object r2 = r6.A01
            X.SIY r2 = (X.SIY) r2
            boolean r0 = r3 instanceof java.util.HashSet
            if (r0 == 0) goto L7a
            java.util.HashSet r3 = (java.util.HashSet) r3
            if (r3 == 0) goto L7a
            X.Sab r0 = r2.A03
            android.content.Intent r1 = r0.A02
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_BLACK_HOLE_LIST"
            r1.putExtra(r0, r3)
        L7a:
            X.SjR r5 = r2.A04
            androidx.fragment.app.Fragment r4 = r2.A02
            android.content.Intent r3 = r2.A01
            X.Sab r1 = r2.A03
            int r0 = r2.A00
        L84:
            X.C63397SjR.A01(r3, r4, r1, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.THG.accept(java.lang.Object):void");
    }
}
