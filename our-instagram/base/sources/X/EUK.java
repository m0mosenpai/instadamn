package X;

/* loaded from: classes6.dex */
public class EUK extends C1P1 {
    public final AbstractC32317ELg A00;
    public final EVF A01;

    public final void A00(ED6 ed6) {
        String str;
        if (this instanceof Ef7) {
            int A03 = C0f9.A03(-1133134741);
            C35154Few.A00().A02(ed6.A00, ed6.A01, ed6.A04, ed6.A03);
            EfA efA = ((Ef7) this).A00;
            if (efA.isResumed()) {
                C35208Fg0 A00 = C35208Fg0.A00();
                AbstractC18680vv abstractC18680vv = ((AbstractC32317ELg) efA).A00;
                C14360o3.A0B(abstractC18680vv, 0);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(efA, abstractC18680vv), "instagram_gdpr_consent_flow_entry");
                if (A0f.isSampled()) {
                    String str2 = A00.A02;
                    if (str2 != null) {
                        A0f.AAP(AbstractC31187DnW.A00(), str2);
                        Integer num = A00.A00;
                        if (num != null) {
                            A0f.AAP("user_state", FVT.A01(num));
                            AbstractC31171DnF.A1G(A0f, A00.A01);
                            if (C35154Few.A00().A04 == C05F.A00) {
                                str = AbstractC31174DnI.A0s();
                            } else {
                                str = null;
                            }
                            A0f.AAP("guid", str);
                            AbstractC31171DnF.A1D(A0f, "instagram_terms_flow");
                            A0f.AAP("waterfall_id", C35154Few.A01());
                            A0f.Cht();
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                Integer num2 = C35154Few.A00().A02;
                Integer num3 = C05F.A00;
                if (num2 == num3) {
                    FRA fra = C35154Few.A00().A00.A02;
                    if (fra != null) {
                        C35208Fg0 A002 = C35208Fg0.A00();
                        AbstractC18680vv abstractC18680vv2 = ((AbstractC32317ELg) efA).A00;
                        AbstractC167007dF.A1K(abstractC18680vv2, num3);
                        C35208Fg0.A01(efA, abstractC18680vv2, A002, num3, null);
                        EVF evf = efA.A04;
                        String str3 = C35154Few.A00().A08;
                        if (str3 != null && str3.length() != 0) {
                            evf.A03.setText(str3);
                        }
                        efA.A00.setVisibility(0);
                        efA.A03.setText(fra.A01);
                        F80.A00(efA.requireContext(), efA.A02, fra.A03);
                    }
                } else if (!efA.A04()) {
                    efA.A03();
                }
            }
            C0f9.A0A(-562213158, A03);
            return;
        }
        int A0N = AbstractC167017dG.A0N(ed6, -136432631);
        super.onSuccess(ed6);
        C35154Few.A00().A02(ed6.A00, ed6.A01, ed6.A04, ed6.A03);
        C35154Few A003 = C35154Few.A00();
        Integer num4 = ed6.A02;
        synchronized (A003) {
            C35154Few.A0B.A03 = num4;
        }
        AbstractC32317ELg abstractC32317ELg = this.A00;
        if (!abstractC32317ELg.A04()) {
            abstractC32317ELg.A03();
        }
        C0f9.A0A(-1024848519, A0N);
    }

    public EUK(AbstractC32317ELg abstractC32317ELg, EVF evf) {
        this.A00 = abstractC32317ELg;
        this.A01 = evf;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1759241586);
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            C0w9.A07("Failed to request Consent Flow Data", A01);
        }
        if (abstractC115105If instanceof C115115Ig) {
            String errorMessage = ((InterfaceC40821up) ((C115115Ig) abstractC115105If).A00).getErrorMessage();
            C14360o3.A0A(errorMessage);
            C0w9.A03("GDPR Consent Flow error message", errorMessage);
        }
        C0f9.A0A(-1567401677, A0N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1.A00 == false) goto L8;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFinish() {
        /*
            r4 = this;
            r0 = 740347954(0x2c20d032, float:2.285294E-12)
            int r3 = X.C0f9.A03(r0)
            X.EVF r1 = r4.A01
            if (r1 == 0) goto L20
            r0 = 0
            r1.A01 = r0
            com.instagram.ui.widget.progressbutton.ProgressButton r2 = r1.A03
            r2.setShowProgressBar(r0)
            boolean r0 = r1.A01
            if (r0 != 0) goto L1c
            boolean r1 = r1.A00
            r0 = 1
            if (r1 != 0) goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.setEnabled(r0)
        L20:
            r0 = 490852434(0x1d41d052, float:2.5651036E-21)
            X.C0f9.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EUK.onFinish():void");
    }

    @Override // X.C1P1
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-841934259);
        A00((ED6) obj);
        C0f9.A0A(-1299679022, A03);
    }
}
