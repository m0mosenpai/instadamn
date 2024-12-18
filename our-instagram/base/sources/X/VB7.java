package X;

/* loaded from: classes11.dex */
public final class VB7 extends AnonymousClass522 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB7(C66637URb c66637URb, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = c66637URb;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L12;
                case 1: goto L9;
                case 2: goto L4e;
                case 3: goto L46;
                case 4: goto L20;
                default: goto L5;
            }
        L5:
            super.onClick(r8)
        L8:
            return
        L9:
            java.lang.Object r0 = r7.A01
            X.URb r0 = (X.C66637URb) r0
            X.W1S r0 = r0.A01
            X.0sZ r0 = r0.A00
            goto L1a
        L12:
            java.lang.Object r0 = r7.A01
            X.URa r0 = (X.C66636URa) r0
            X.W1R r0 = r0.A01
            X.0sZ r0 = r0.A00
        L1a:
            if (r0 == 0) goto L8
            r0.invoke()
            return
        L20:
            java.lang.Object r4 = r7.A01
            X.V11 r4 = (X.V11) r4
            X.WUb r2 = r4.A03
            if (r2 == 0) goto L2f
            X.VG4 r1 = X.VG4.A0B
            java.lang.String r0 = "fb_placement_learn_more"
            r2.A0G(r1, r0)
        L2f:
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.0do r0 = r4.A0N
            java.lang.Object r2 = r0.getValue()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2Fb r1 = X.C2Fb.A35
            java.lang.String r0 = "https://www.facebook.com/help/instagram/663506574978989"
            X.SjR r1 = X.AbstractC25228BEl.A0y(r3, r2, r1, r0)
            java.lang.String r0 = "promote_audience"
            goto L69
        L46:
            java.lang.Object r0 = r7.A01
            X.XEK r0 = (X.XEK) r0
            r0.DpE()
            return
        L4e:
            r6 = 0
            X.C14360o3.A0B(r8, r6)
            android.content.Context r2 = X.AbstractC166997dE.A0L(r8)
            java.lang.Object r0 = r7.A01
            X.V0x r0 = (X.C67890V0x) r0
            com.instagram.common.session.UserSession r3 = r0.A03
            if (r3 == 0) goto L6f
            X.2Fb r4 = X.C2Fb.A35
            java.lang.String r5 = "https://www.facebook.com/business/help/605021638170961/"
            X.SjR r1 = new X.SjR
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r0 = "promote_beneficiary_and_payer_view"
        L69:
            r1.A0S = r0
            r1.A0A()
            return
        L6f:
            java.lang.String r0 = "session"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VB7.onClick(android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB7(C66636URa c66636URa, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = c66636URa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB7(C67890V0x c67890V0x, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = c67890V0x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB7(V11 v11, int i) {
        super(Integer.valueOf(i));
        this.A00 = 4;
        this.A01 = v11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB7(XEK xek, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A01 = xek;
    }
}
