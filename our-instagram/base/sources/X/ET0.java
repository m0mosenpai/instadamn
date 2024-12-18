package X;

/* loaded from: classes6.dex */
public final class ET0 extends C1P1 {
    public final /* synthetic */ C33921is A00;
    public final /* synthetic */ C33891ip A01;

    public ET0(C33921is c33921is, C33891ip c33891ip) {
        this.A01 = c33891ip;
        this.A00 = c33921is;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (r12 != 61) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ET0.onSuccess(java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (r6 != 61) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r15) {
        /*
            r14 = this;
            r0 = -102558783(0xfffffffff9e313c1, float:-1.4738151E35)
            int r3 = X.AbstractC167017dG.A0N(r15, r0)
            X.1ip r0 = r14.A01
            int r1 = r0.A00
            com.instagram.direct.prompts.DirectPromptTypes r2 = X.C7D2.A00(r1)
            X.1is r1 = r14.A00
            X.0do r4 = r1.A04
            java.lang.Object r7 = r4.getValue()
            X.7FQ r7 = (X.C7FQ) r7
            com.instagram.model.direct.DirectThreadKey r4 = r0.C7Q()
            java.lang.String r8 = r4.A00
            com.instagram.model.direct.DirectThreadKey r4 = r0.C7Q()
            java.lang.String r9 = r4.A01
            int r6 = r0.A03
            int r5 = r0.A02
            r4 = 28
            if (r6 == r4) goto Ldb
            r4 = 29
            if (r6 == r4) goto Lc4
            r4 = 61
            if (r6 == r4) goto Ldb
        L35:
            com.instagram.direct.prompts.DirectPromptTypes r4 = com.instagram.direct.prompts.DirectPromptTypes.A06
            if (r2 != r4) goto L74
            int r5 = r0.A03
            r4 = 29
            if (r5 != r4) goto L74
            X.0do r1 = r1.A03
            java.lang.Object r4 = r1.getValue()
            X.Fzr r4 = (X.C36297Fzr) r4
            com.instagram.model.direct.DirectThreadKey r1 = r0.C7Q()
            java.lang.String r5 = r1.A00
            com.instagram.model.direct.DirectThreadKey r1 = r0.C7Q()
            java.lang.String r6 = r1.A01
            int r12 = r0.A02
            java.lang.String r1 = r0.A07()
            java.lang.String r0 = "daily_prompt_text"
            java.util.Map r11 = X.AbstractC167007dF.A0n(r0, r1)
            java.lang.String r7 = "daily_prompt_start_failure"
            java.lang.String r8 = "impression"
            java.lang.String r9 = "send_button"
            java.lang.String r10 = "daily_prompt_null_creation_sheet"
            X.C36297Fzr.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L6a:
            super.onFail(r15)
            r0 = -617038546(0xffffffffdb38bd2e, float:-5.19994E16)
            X.C0f9.A0A(r0, r3)
            return
        L74:
            com.instagram.direct.prompts.DirectPromptTypes r4 = com.instagram.direct.prompts.DirectPromptTypes.A05
            if (r2 != r4) goto L6a
            int r4 = r0.A03
            r2 = 29
            if (r4 != r2) goto L6a
            X.0do r2 = r1.A02
            X.Fzs r5 = X.AbstractC31172DnG.A0e(r2)
            com.instagram.model.direct.DirectThreadKey r2 = r0.C7Q()
            java.lang.String r7 = r2.A00
            com.instagram.model.direct.DirectThreadKey r2 = r0.C7Q()
            java.lang.String r8 = r2.A01
            int r0 = r0.A02
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = "challenge_start_failure"
            java.lang.String r10 = "impression"
            java.lang.String r11 = "challenge_start"
            java.lang.String r12 = "challenge_null_creation_sheet"
            r4 = 0
            r13 = r4
            X.C36298Fzs.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.instagram.common.session.UserSession r0 = r1.A00
            X.1My r2 = X.AbstractC25651Mw.A00(r0)
            java.lang.Object r0 = r15.A00()
            X.1un r0 = (X.InterfaceC40801un) r0
            if (r0 == 0) goto Lc2
            int r0 = r0.getStatusCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Lb9:
            X.FwG r0 = new X.FwG
            r0.<init>(r1)
            r2.E4s(r0)
            goto L6a
        Lc2:
            r1 = 0
            goto Lb9
        Lc4:
            X.Fzi r6 = X.AbstractC31179DnN.A0N(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.util.Map r13 = X.AbstractC31180DnO.A0t(r2)
            java.lang.String r10 = "direct_question_tab_send_error"
            java.lang.String r11 = "impression"
            java.lang.String r12 = "prompt"
            X.C36288Fzi.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L35
        Ldb:
            X.Fzn r6 = X.AbstractC31179DnN.A0O(r7)
            X.Ern r4 = X.EnumC33514Ern.A0N
            X.Erl r5 = X.EnumC33512Erl.THREAD_VIEW
            java.util.Map r9 = X.AbstractC31180DnO.A0t(r2)
            java.lang.String r7 = "direct_question_tab_send_error"
            java.lang.String r8 = "impression"
            X.C36293Fzn.A00(r4, r5, r6, r7, r8, r9)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ET0.onFail(X.5If):void");
    }
}
