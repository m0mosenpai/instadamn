package X;

/* loaded from: classes6.dex */
public final class FPP {
    public final /* synthetic */ AbstractC32549EUz A00;

    public FPP(AbstractC32549EUz abstractC32549EUz) {
        this.A00 = abstractC32549EUz;
    }

    public final void A00(AbstractC115105If abstractC115105If) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC32549EUz abstractC32549EUz = this.A00;
        C33629Etf c33629Etf = abstractC32549EUz.A04;
        if (c33629Etf != null && c33629Etf.A02) {
            c33629Etf.A00();
        }
        String Bp0 = abstractC32549EUz.A01.Bp0();
        int Ad9 = abstractC32549EUz.A01.Ad9();
        Integer num2 = null;
        if (abstractC115105If instanceof C115115Ig) {
            EDQ edq = (EDQ) ((C115115Ig) abstractC115105If).A00;
            if (!edq.isFeedbackRequired()) {
                if (edq.hasErrorType("too_easy_password") && abstractC32549EUz.A05) {
                    C193328hC A0H = AbstractC31171DnF.A0H(abstractC32549EUz.A00);
                    A0H.A0A(2131961880);
                    C34939FaP c34939FaP = edq.A00;
                    if (c34939FaP != null) {
                        str4 = c34939FaP.A00;
                    } else {
                        str4 = null;
                    }
                    A0H.A0r(str4);
                    AbstractC31176DnK.A17(DialogInterfaceOnClickListenerC35454FkB.A00(this, 61), A0H, 2131955011);
                } else {
                    C34939FaP c34939FaP2 = edq.A00;
                    if (c34939FaP2 != null) {
                        str3 = c34939FaP2.A00;
                    } else {
                        str3 = null;
                    }
                    abstractC32549EUz.A04(str3, AbstractC33652Eu2.A00(edq.mErrorSource));
                }
            }
            C07270a1 c07270a1 = abstractC32549EUz.A08;
            String str5 = abstractC32549EUz.A09.A00;
            C34939FaP c34939FaP3 = edq.A00;
            if (c34939FaP3 != null) {
                str = c34939FaP3.A01;
                str2 = c34939FaP3.A00;
            } else {
                str = null;
                str2 = null;
            }
            Boolean A0b = AbstractC166997dE.A0b();
            String status = edq.getStatus();
            if (Ad9 > -1) {
                num2 = Integer.valueOf(Ad9);
            }
            FD8.A00(c07270a1, A0b, Boolean.valueOf(edq.isCheckpointRequired()), Boolean.valueOf(edq.isConsentRequired()), Boolean.valueOf(edq.isFeedbackRequired()), Boolean.valueOf(edq.isLoginRequired()), Boolean.valueOf(edq.isNoContent()), Boolean.valueOf(edq.isViolatingBrandedContentPolicy()), Boolean.valueOf(edq.A05), num2, Integer.valueOf(edq.mStatusCode), str5, str, str2, status, Bp0, edq.mErrorType, edq.getErrorMessage(), abstractC32549EUz.A0B);
            return;
        }
        abstractC32549EUz.A04(abstractC32549EUz.A07.getString(2131968430), C05F.A00);
        Throwable A01 = abstractC115105If.A01();
        if (A01 == null) {
            return;
        }
        String name = A01.getClass().getName();
        C07270a1 c07270a12 = abstractC32549EUz.A08;
        String str6 = abstractC32549EUz.A09.A00;
        if (Ad9 > -1) {
            num = Integer.valueOf(Ad9);
        } else {
            num = null;
        }
        AbstractC167007dF.A1D(c07270a12, 0, str6);
        FD8.A00(c07270a12, false, null, null, null, null, null, null, null, num, null, str6, null, null, name, Bp0, null, null, null);
        C0w9.A03("CreateAccountCallback", AnonymousClass001.A0u("Exception ", name, ": ", A01.getMessage()));
    }
}
