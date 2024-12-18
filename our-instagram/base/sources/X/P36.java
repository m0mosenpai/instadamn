package X;

import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* loaded from: classes9.dex */
public final class P36 implements InterfaceC57949Pmv {
    public final /* synthetic */ IgFormField A00;
    public final /* synthetic */ LeadGenFormBaseQuestion A01;
    public final /* synthetic */ AbstractC50822Mcy A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public P36(IgFormField igFormField, LeadGenFormBaseQuestion leadGenFormBaseQuestion, AbstractC50822Mcy abstractC50822Mcy, boolean z, boolean z2) {
        this.A02 = abstractC50822Mcy;
        this.A01 = leadGenFormBaseQuestion;
        this.A04 = z;
        this.A00 = igFormField;
        this.A03 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        if (X.AbstractC001900j.A0B(r11).length() > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x003b, code lost:
    
        if (r9.A04 != false) goto L19;
     */
    @Override // X.InterfaceC57949Pmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C54543O7v getState(X.C54543O7v r10, java.lang.CharSequence r11, boolean r12) {
        /*
            r9 = this;
            r8 = 0
            X.AbstractC167007dF.A1K(r10, r11)
            X.Mcy r2 = r9.A02
            boolean r0 = r2.A07
            if (r0 != 0) goto L2e
            if (r12 == 0) goto L2e
            java.lang.String r0 = r11.toString()
            java.lang.String r3 = r2.A0D(r0)
            java.lang.String r0 = r2.A03
            boolean r0 = X.C14360o3.A0K(r0, r3)
            if (r0 != 0) goto L2b
            int r0 = r3.length()
            if (r0 <= 0) goto L2b
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = r9.A01
            X.Pn4 r0 = r2.A02
            if (r0 == 0) goto L2b
            r0.Dxu(r1)
        L2b:
            r2.setLastKnownInput(r3)
        L2e:
            boolean r0 = r2.A04
            if (r0 == 0) goto L38
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = r9.A01
            boolean r0 = r0.A0I
            if (r0 != 0) goto L3d
        L38:
            boolean r0 = r9.A04
            r4 = 0
            if (r0 == 0) goto L3e
        L3d:
            r4 = 1
        L3e:
            boolean r0 = X.AbstractC001900j.A0T(r11)
            if (r0 == 0) goto Lcf
            boolean r0 = r2.A06
            if (r0 != 0) goto Lcf
            com.instagram.igds.components.form.IgFormField r3 = r9.A00
            java.lang.String r0 = ""
        L4c:
            r3.setLabelText(r0)
            boolean r0 = r2.A06
            if (r0 == 0) goto Lba
            java.text.SimpleDateFormat r0 = X.C55205OeH.A04
            android.content.Context r3 = X.AbstractC166997dE.A0L(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r5 = r9.A01
            java.lang.String r1 = r5.A05
            X.VEF r0 = r5.A03
            java.lang.String r0 = X.C55205OeH.A03(r3, r0, r1)
        L63:
            X.OV6 r3 = X.OV6.A00
            java.lang.String r1 = r11.toString()
            if (r1 != 0) goto L6d
            java.lang.String r1 = r5.A00
        L6d:
            boolean r1 = X.AbstractC001900j.A0T(r1)
            if (r1 == 0) goto L7a
            if (r4 == 0) goto L7a
        L75:
            java.lang.String r0 = "confirmed"
            r10.A01 = r0
        L79:
            return r10
        L7a:
            java.lang.String r1 = r11.toString()
            if (r1 != 0) goto L82
            java.lang.String r1 = r5.A00
        L82:
            boolean r1 = X.AbstractC001900j.A0T(r1)
            if (r1 == 0) goto L91
            if (r4 != 0) goto L91
            java.lang.String r1 = "error"
            r10.A01 = r1
        L8e:
            r10.A00 = r0
            return r10
        L91:
            boolean r7 = r9.A03
            r4 = 0
            X.0sl r6 = X.C16930sl.A00
            boolean r0 = r3.A00(r4, r5, r6, r7, r8)
            if (r0 != 0) goto Laf
            java.lang.String r0 = "error"
            r10.A01 = r0
            java.text.SimpleDateFormat r0 = X.C55205OeH.A04
            android.content.Context r2 = X.AbstractC166997dE.A0L(r2)
            java.lang.String r1 = r5.A05
            X.VEF r0 = r5.A03
            java.lang.String r0 = X.C55205OeH.A03(r2, r0, r1)
            goto L8e
        Laf:
            java.lang.CharSequence r0 = X.AbstractC001900j.A0B(r11)
            int r0 = r0.length()
            if (r0 <= 0) goto L79
            goto L75
        Lba:
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r5 = r9.A01
            boolean r0 = r2 instanceof com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView
            if (r0 == 0) goto Lcc
            android.content.Context r1 = r2.getContext()
            r0 = 2131964994(0x7f133442, float:1.9566785E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r1, r0)
            goto L63
        Lcc:
            java.lang.String r0 = r5.A0A
            goto L63
        Lcf:
            com.instagram.igds.components.form.IgFormField r3 = r9.A00
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r1 = r9.A01
            boolean r0 = r2 instanceof com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView
            if (r0 == 0) goto Le4
            android.content.Context r1 = r2.getContext()
            r0 = 2131964994(0x7f133442, float:1.9566785E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r1, r0)
            goto L4c
        Le4:
            java.lang.String r0 = r1.A0A
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P36.getState(X.O7v, java.lang.CharSequence, boolean):X.O7v");
    }
}
