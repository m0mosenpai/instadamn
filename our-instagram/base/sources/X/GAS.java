package X;

/* loaded from: classes6.dex */
public final class GAS implements GZK {
    public final /* synthetic */ EMT A00;
    public final /* synthetic */ String A01;

    public GAS(EMT emt, String str) {
        this.A00 = emt;
        this.A01 = str;
    }

    @Override // X.GZK
    public final void DFf() {
        EMT emt = this.A00;
        EVN evn = emt.A02;
        if (evn != null) {
            evn.A00();
        }
        C9GR.A01(emt.requireContext(), "cp_acquisition_email", 2131974293, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
    
        if (r14 != null) goto L32;
     */
    @Override // X.GZK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dq1(X.R1L r14) {
        /*
            r13 = this;
            X.EMT r6 = r13.A00
            X.EVN r0 = r6.A02
            if (r0 == 0) goto L9
            r0.A00()
        L9:
            r7 = 1
            if (r14 == 0) goto L9b
            X.Qsf r1 = r14.A0E()
            if (r1 == 0) goto L70
            r12 = 0
            java.lang.String r0 = "auto_confirmed"
            boolean r0 = r1.getRequiredBooleanField(r12, r0)
            if (r0 != r7) goto L70
            X.0do r0 = r6.A06
            X.0ll r11 = X.AbstractC166987dD.A0o(r0)
            java.lang.String r10 = "cp_acquisition_email"
            java.lang.String r9 = "email"
            double r3 = X.AbstractC31174DnI.A00(r11, r12)
            double r1 = X.AbstractC31171DnF.A00()
            X.0wW r5 = X.AbstractC12220kQ.A02(r11)
            java.lang.String r0 = "contact_point_auto_confirmed"
            X.0Ai r8 = X.AbstractC166987dD.A0f(r5, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L68
            X.AbstractC31177DnL.A1B(r8, r3, r1)
            X.C14360o3.A0B(r11, r12)
            java.lang.String r5 = X.AbstractC31179DnN.A0c(r11)
            if (r5 != 0) goto L4b
            java.lang.String r5 = ""
        L4b:
            java.lang.String r0 = "source"
            r8.AAP(r0, r5)
            X.AbstractC31178DnM.A19(r8, r10)
            X.AbstractC31176DnK.A1K(r8, r3)
            java.lang.String r3 = "waterfall_log_in"
            java.lang.String r0 = "module"
            X.AbstractC31177DnL.A1G(r8, r0, r3, r1)
            X.AbstractC35274Fh9.A05(r8)
            java.lang.String r0 = "contact_point_type"
            r8.AAP(r0, r9)
            r8.Cht()
        L68:
            X.GbH r0 = r6.A01
            if (r0 == 0) goto L6f
            r0.CnE(r7)
        L6f:
            return
        L70:
            X.Qsf r1 = r14.A0E()
            if (r1 == 0) goto L9b
            java.lang.String r0 = "code_sent"
            boolean r0 = r1.getRequiredBooleanField(r7, r0)
            if (r0 != r7) goto L9b
            java.lang.String r2 = r13.A01
            android.os.Bundle r1 = X.AbstractC166987dD.A0b()
            java.lang.String r0 = "nux_contact_point"
            r1.putString(r0, r2)
            X.AbstractC31172DnG.A1A()
            X.EMS r2 = new X.EMS
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.AbstractC31173DnH.A0J(r1, r2, r6)
            X.0do r0 = r6.A06
            X.AbstractC31179DnN.A0y(r2, r1, r0)
            return
        L9b:
            X.0do r0 = r6.A06
            X.0ll r5 = X.AbstractC166987dD.A0o(r0)
            java.lang.String r4 = "cp_acquisition_email"
            r3 = 0
            if (r14 == 0) goto Lce
            X.Qsf r1 = r14.A0E()
            if (r1 == 0) goto Lce
            java.lang.String r0 = "error"
            java.lang.String r2 = r1.A09(r0)
        Lb2:
            X.Qsf r1 = r14.A0E()
            if (r1 == 0) goto Lbe
            java.lang.String r0 = "exception"
            java.lang.String r3 = r1.A0A(r0)
        Lbe:
            java.lang.String r0 = "email"
            X.FD3.A00(r5, r4, r0, r2, r3)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131974293(0x7f135895, float:1.9585646E38)
            X.C9GR.A01(r1, r4, r0, r7)
            return
        Lce:
            r2 = r3
            if (r14 == 0) goto Lbe
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAS.Dq1(X.R1L):void");
    }
}
