package X;

import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutResponse;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import java.util.List;

/* loaded from: classes10.dex */
public final class T2J implements ECPHandler {
    public C2GS A00;
    public CheckoutResponse A01;
    public ECPPaymentResponseParams A02;
    public final C2GS A03;
    public final C2GS A04;
    public final C2GS A05;
    public final C2GS A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final C07X A09;
    public final InterfaceC58362lv A0A;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2GT, X.2GS] */
    public T2J(C07X c07x) {
        C14360o3.A0B(c07x, 1);
        this.A09 = c07x;
        this.A05 = AbstractC58318PtA.A0J();
        this.A06 = AbstractC58318PtA.A0J();
        this.A03 = new C2GT(C63406Sjd.A03(null));
        this.A00 = AbstractC58318PtA.A0J();
        this.A04 = new C2GT(C63406Sjd.A03(null));
        this.A07 = AbstractC09440dt.A01(C64990TbF.A00);
        this.A08 = AbstractC09440dt.A01(C64991TbG.A00);
        this.A0A = C63628Sqa.A00(this, 19);
    }

    @Override // X.XEU
    public final /* synthetic */ void CJP(C63406Sjd c63406Sjd) {
    }

    @Override // X.XEU
    public final void CJa(SIL sil, LoggingContext loggingContext, Integer num) {
        C2JO c2jo;
        Long l;
        if (loggingContext != null) {
            Wap A0H = AbstractC43592JPx.A0H();
            String str = sil.A01;
            C70073W1q c70073W1q = null;
            if (str != null) {
                l = AbstractC25228BEl.A13(str);
            } else {
                l = null;
            }
            OtcInput otcInput = sil.A00;
            if (otcInput != null) {
                c70073W1q = AbstractC63060Sbh.A01(otcInput);
            }
            Wap.A03(new C25531Mh(MSY.A0H(A0H.A00, "client_submit_ecpeventhandling_init"), 119), loggingContext, new MIO(null, l, loggingContext, AbstractC58320PtC.A1B(c70073W1q), "cancel_checkout", 5));
        }
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 3) {
            C63406Sjd.A0C(this.A03, "CHECKOUT_FAILED");
            CheckoutResponse checkoutResponse = this.A01;
            if (checkoutResponse != null) {
                this.A00.A0B(checkoutResponse);
            } else {
                this.A00.A0B(new CheckoutResponse(this.A02, C05F.A04, "CHECKOUT_FAILED", "Something else went wrong"));
            }
        } else {
            C63406Sjd.A0C(this.A03, "CHECKOUT_CANCEL");
            this.A00.A0B(new CheckoutResponse(this.A02, null, "CHECKOUT_CANCEL", null));
        }
        C62635SJs c62635SJs = (C62635SJs) this.A07.getValue();
        Be9 be9 = new Be9();
        be9.A07(sil.A04, AbstractC63083Sc6.A00());
        be9.A07(sil.A02, "product_id");
        C2JO c2jo2 = new C2JO();
        c2jo2.A09("CANCEL_CHECKOUT", "request_type");
        c2jo2.A09(sil.A01, "order_id");
        c2jo2.A09(sil.A03, "receiver_id");
        be9.A05("handle_checkout_event_list", AbstractC166987dD.A1J(c2jo2));
        be9.A07(String.valueOf(AbstractC62320S6q.A00.getAndIncrement()), "client_mutation_id");
        OtcInput otcInput2 = sil.A00;
        if (otcInput2 != null) {
            c2jo = AbstractC63060Sbh.A00(otcInput2);
        } else {
            c2jo = null;
        }
        be9.A06(c2jo, "one_time_checkout_input");
        AbstractC63246Sg0.A01(null, c62635SJs.A00(be9), new C63626SqY(4, sil, loggingContext, this));
        C63406Sjd.A0D(this.A06, null);
        C63406Sjd.A0D(this.A05, null);
        this.A00 = AbstractC58318PtA.A0J();
        this.A01 = null;
    }

    @Override // com.facebookpay.expresscheckout.handler.ECPHandler
    public final void ENN(C69478Vo1 c69478Vo1) {
        C14360o3.A0B(c69478Vo1, 0);
        if (!C63406Sjd.A0H(AbstractC58318PtA.A0S(this.A06))) {
            AbstractC63246Sg0.A01(null, ((C62635SJs) this.A07.getValue()).A00(WGr.A01(c69478Vo1)), C63628Sqa.A00(this, 18));
        }
    }

    public static final void A00(T2J t2j, Throwable th) {
        String str;
        C69076VhS c69076VhS;
        Integer num = C05F.A04;
        if (th instanceof C71764X1r) {
            C14360o3.A0C(th, "null cannot be cast to non-null type com.facebookpay.expresscheckout.exceptions.EcpPaymentDetailsException");
            List list = ((C71764X1r) th).A00;
            if (list != null && (c69076VhS = (C69076VhS) AbstractC001800i.A0J(list)) != null) {
                num = c69076VhS.A00;
                str = c69076VhS.A02;
            }
            str = "Something else went wrong";
        } else {
            if (th instanceof REZ) {
                C14360o3.A0C(th, "null cannot be cast to non-null type com.fbpay.util.exceptions.PaymentsUserFacingException");
                C64863TXo c64863TXo = (C64863TXo) th;
                if (c64863TXo.A00 == 2603076) {
                    num = C05F.A02;
                    str = c64863TXo.A01;
                }
            }
            str = "Something else went wrong";
        }
        t2j.A01 = new CheckoutResponse(t2j.A02, num, "CHECKOUT_FAILED", str);
    }

    @Override // X.XEU
    public final C2GS AHI() {
        return this.A00;
    }

    @Override // X.XEU
    public final void CJe() {
        C63406Sjd.A0C(this.A03, "CHECKOUT_COMPLETE");
        this.A00.A0B(new CheckoutResponse(this.A02, null, "CHECKOUT_COMPLETE", null));
    }

    @Override // X.XEU
    public final void CJf(boolean z) {
        ECPPaymentResponseParams eCPPaymentResponseParams = this.A02;
        if (eCPPaymentResponseParams != null) {
            C2FP.A01().A05.A00(eCPPaymentResponseParams.A0R, "TRANSACTION_COMPLETE");
        }
        C2GS c2gs = this.A03;
        C63406Sjd.A0C(c2gs, "PAYMENT_COMPLETE");
        if (!z) {
            C63406Sjd.A0C(c2gs, "CHECKOUT_COMPLETE");
            this.A00.A0B(new CheckoutResponse(this.A02, null, "CHECKOUT_COMPLETE", null));
        }
        C63406Sjd.A0D(this.A06, null);
        C63406Sjd.A0D(this.A05, null);
    }

    @Override // X.XEU
    public final C2GS CKC(ECPPaymentResponseParams eCPPaymentResponseParams) {
        this.A02 = eCPPaymentResponseParams;
        AbstractC63246Sg0.A01(this.A09, ((C62991SaF) this.A08.getValue()).A01(WGr.A00(eCPPaymentResponseParams, null)), this.A0A);
        return this.A05;
    }

    @Override // X.XEU
    public final C2GS E3o() {
        return this.A04;
    }

    @Override // com.facebookpay.expresscheckout.handler.ECPHandler
    public final void ERM(C64863TXo c64863TXo) {
        C63406Sjd.A0E(this.A03, "CHECKOUT_NOT_AVAILABLE", c64863TXo);
        this.A01 = new CheckoutResponse(this.A02, null, "CHECKOUT_NOT_AVAILABLE", null);
    }

    @Override // com.facebookpay.expresscheckout.handler.ECPHandler
    public final void Eg7(C63406Sjd c63406Sjd) {
        this.A06.A0B(c63406Sjd);
    }

    @Override // com.facebookpay.expresscheckout.handler.ECPHandler
    public final C2GS F8A() {
        return this.A06;
    }
}
