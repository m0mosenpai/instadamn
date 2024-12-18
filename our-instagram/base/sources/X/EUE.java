package X;

/* loaded from: classes6.dex */
public final class EUE extends C1P1 {
    public final /* synthetic */ EK2 A00;

    public EUE(EK2 ek2) {
        this.A00 = ek2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(12589703);
        EK2 ek2 = this.A00;
        C35016Fbp.A00(ek2.A02);
        C9GR.A0F(ek2.getActivity(), "fail_send_confirm_email", 2131962076);
        C0f9.A0A(139850705, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(144325240);
        super.onFinish();
        EK2 ek2 = this.A00;
        ek2.A05 = false;
        AbstractC31175DnJ.A0j(ek2.getActivity(), false);
        C0f9.A0A(1340933833, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(2060535815);
        super.onStart();
        EK2 ek2 = this.A00;
        ek2.A05 = true;
        AbstractC31175DnJ.A0j(ek2.getActivity(), true);
        C0f9.A0A(-447196089, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r7.A03 == null) goto L8;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = -783820011(0xffffffffd147db15, float:-5.364838E10)
            int r5 = X.C0f9.A03(r0)
            X.ED3 r10 = (X.ED3) r10
            r0 = -163285150(0xfffffffff6447762, float:-9.962027E32)
            int r4 = X.C0f9.A03(r0)
            boolean r0 = r10.A03
            if (r0 == 0) goto L6d
            X.EK2 r7 = r9.A00
            X.Fbp r0 = r7.A02
            X.02i r1 = r0.A00
            r0 = 857809457(0x33212231, float:3.751683E-8)
            r8 = 2
            r1.markerEnd(r0, r8)
            android.widget.EditText r0 = r7.A00
            if (r0 == 0) goto L2a
            java.lang.String r1 = r7.A03
            r0 = 1
            if (r1 != 0) goto L2b
        L2a:
            r0 = 0
        L2b:
            X.C18C.A0F(r0)
            X.AbstractC31364DqT.A03()
            com.instagram.common.session.UserSession r6 = r7.A01
            android.widget.EditText r0 = r7.A00
            r0.getClass()
            java.lang.String r3 = X.AbstractC167007dF.A0g(r0)
            java.lang.String r2 = r7.A03
            X.AbstractC167017dG.A1N(r6, r3)
            android.os.Bundle r1 = X.AbstractC31174DnI.A0E(r2, r8)
            java.lang.String r0 = "key_shared_email"
            r1.putString(r0, r3)
            X.AbstractC31173DnH.A1C(r1, r6)
            java.lang.String r0 = "send_source"
            r1.putString(r0, r2)
            X.Efr r2 = new X.Efr
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.AbstractC31173DnH.A0J(r1, r2, r7)
            com.instagram.common.session.UserSession r0 = r7.A01
            X.AbstractC31177DnL.A15(r2, r1, r0)
        L60:
            r0 = 128821017(0x7ada719, float:2.6128358E-34)
            X.C0f9.A0A(r0, r4)
            r0 = 1639489431(0x61b89f97, float:4.2571257E20)
            X.C0f9.A0A(r0, r5)
            return
        L6d:
            java.lang.String r0 = r10.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L97
            java.lang.String r0 = r10.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L97
            X.EK2 r3 = r9.A00
            X.Fbp r0 = r3.A02
            X.C35016Fbp.A00(r0)
            java.lang.String r1 = r10.A01
            java.lang.String r0 = r10.A00
            X.EHM r2 = X.AbstractC31181DnP.A0C(r1, r0)
            android.os.Handler r1 = r3.A09
        L8e:
            X.GPt r0 = new X.GPt
            r0.<init>(r2, r9, r10)
            r1.post(r0)
            goto L60
        L97:
            X.EK2 r3 = r9.A00
            X.Fbp r0 = r3.A02
            X.02i r2 = r0.A00
            r1 = 857809457(0x33212231, float:3.751683E-8)
            r0 = 2
            r2.markerEnd(r1, r0)
            android.os.Handler r1 = r3.A09
            r2 = 0
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EUE.onSuccess(java.lang.Object):void");
    }
}
