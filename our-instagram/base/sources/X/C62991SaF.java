package X;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.DexStore;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.PriceTableAnnotation$Companion;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.paymentmethod.model.APMCredential;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PayPalCredential;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.SaF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62991SaF {
    public final C62643SKa A01 = new C62643SKa();
    public final C62985Sa9 A00 = new C62985Sa9();

    public static final C58252li A00(SLG slg, C63019Saj c63019Saj, C62991SaF c62991SaF) {
        c63019Saj.A01(ImmutableList.of((Object) "PAY_BUTTON"));
        Q8J A00 = REV.A00(C2FP.A06(), C63573Spg.A00, new C63548SpG(0, slg, c63019Saj, c62991SaF), 1);
        C58252li A01 = c62991SaF.A00.A01(C63406Sjd.A03(null), AbstractC62191S1m.A00(c63019Saj));
        C14360o3.A0C(A01, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.FBPayComponentDataQueryResponse>>");
        C14360o3.A0A(A00);
        AbstractC63246Sg0.A02(A00, A01, new C63625SqX(4, A01, c63019Saj));
        return A01;
    }

    public final Q8J A02(OtcInput otcInput, SJJ sjj, String str, String str2, String str3) {
        C70073W1q c70073W1q;
        String str4;
        ArrayList arrayList;
        String str5;
        String str6;
        Map<VEM, Bundle> map;
        ArrayList<VEM> arrayList2;
        AbstractC167017dG.A1N(sjj, str);
        C14360o3.A0B(str2, 2);
        Wap A0H = AbstractC43592JPx.A0H();
        LoggingContext loggingContext = sjj.A02;
        PaymentMethod paymentMethod = sjj.A03;
        long parseLong = Long.parseLong(paymentMethod.AtA());
        EnumC72407Xcu AtB = paymentMethod.AtB();
        if (otcInput != null) {
            c70073W1q = AbstractC63060Sbh.A01(otcInput);
        } else {
            c70073W1q = null;
        }
        String str7 = null;
        LinkedHashMap A1B = AbstractC58320PtC.A1B(c70073W1q);
        C14360o3.A0B(AtB, 2);
        Wap.A03(AbstractC31171DnF.A0A(MSY.A0H(A0H.A00, "client_add_ecppaymentcontainer_init"), 19), loggingContext, new MI8(AtB, loggingContext, A1B, parseLong));
        A0H.A01.markerPoint(223884226, "CONTAINER_CREATION_INIT");
        TransactionInfo transactionInfo = sjj.A01;
        CurrencyAmount A03 = WGr.A03(transactionInfo);
        String AtA = paymentMethod.AtA();
        if (paymentMethod instanceof TokenizedCard) {
            str4 = "NETWORK_TOKEN";
        } else if (paymentMethod instanceof CreditCard) {
            str4 = "CREDIT_CARD";
        } else if (paymentMethod instanceof PayPalCredential) {
            str4 = "PAYPAL_BA";
        } else if (paymentMethod instanceof APMCredential) {
            str4 = "NEW_PAYPAL_CHECKOUT";
        } else {
            throw AbstractC166987dD.A12("Not supported credential type");
        }
        C2JO c2jo = new C2JO();
        c2jo.A09(A03.A01, "amount");
        c2jo.A09(A03.A00, "currency_code");
        C2JO c2jo2 = new C2JO();
        c2jo2.A09(AtA, "credential_id");
        c2jo2.A09(str4, "credential_type");
        c2jo2.A06(c2jo, "charge_amount");
        ArrayList A1M = AbstractC16960so.A1M(c2jo2);
        List list = sjj.A08;
        if (list != null && AbstractC166987dD.A1b(list)) {
            ArrayList<ECPOnsiteOffer> A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (obj instanceof ECPOnsiteOffer) {
                    A1E.add(obj);
                }
            }
            ArrayList A0i = AbstractC167007dF.A0i(A1E);
            for (ECPOnsiteOffer eCPOnsiteOffer : A1E) {
                String str8 = eCPOnsiteOffer.A01;
                C2JO c2jo3 = new C2JO();
                CurrencyAmount currencyAmount = eCPOnsiteOffer.A00;
                c2jo3.A09(currencyAmount.A01, "amount");
                c2jo3.A09(currencyAmount.A00, "currency_code");
                C2JO c2jo4 = new C2JO();
                c2jo4.A09(str8, "credential_id");
                c2jo4.A09(PriceTableAnnotation$Companion.OFFER, "credential_type");
                c2jo4.A06(c2jo3, "charge_amount");
                A0i.add(c2jo4);
            }
            A1M.addAll(A0i);
        }
        C2JO c2jo5 = new C2JO();
        ECPPaymentRequest eCPPaymentRequest = sjj.A00;
        c2jo5.A09(eCPPaymentRequest.A09, "payment_request_id");
        c2jo5.A09(sjj.A05, "order_id");
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(c04060Jx, str, "platform_trust_token"), c2jo5, "auth_factors");
        AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(c04060Jx, sjj.A06, "receiver_id"), c2jo5, "receiver_info");
        c2jo5.A05("credentials", A1M);
        c2jo5.A09(eCPPaymentRequest.A08, "payment_product_id");
        ECPPaymentConfiguration eCPPaymentConfiguration = eCPPaymentRequest.A03;
        if (eCPPaymentConfiguration != null && (arrayList2 = eCPPaymentConfiguration.A07) != null) {
            arrayList = AbstractC167007dF.A0i(arrayList2);
            Iterator<VEM> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().A01);
            }
        } else {
            arrayList = null;
        }
        c2jo5.A05("supported_container_types", arrayList);
        String str9 = transactionInfo.A05;
        if (str9 == null) {
            str9 = Locale.US.getCountry();
        }
        c2jo5.A09(str9, "country_code");
        if (eCPPaymentConfiguration != null) {
            str5 = eCPPaymentConfiguration.A04;
        } else {
            str5 = null;
        }
        c2jo5.A09(str5, "security_origin");
        if (eCPPaymentConfiguration != null) {
            str6 = eCPPaymentConfiguration.A03;
        } else {
            str6 = null;
        }
        c2jo5.A09(str6, "container_context_id");
        c2jo5.A08("is_guest_checkout", false);
        if (eCPPaymentConfiguration != null) {
            str7 = eCPPaymentConfiguration.A02.A00;
        }
        c2jo5.A09(str7, "payment_mode");
        c2jo5.A08("save_shipping_as_billing_address", Boolean.valueOf(sjj.A09));
        String str10 = sjj.A07;
        if (str10 != null) {
            c2jo5.A09(str10, "shipping_address_id");
        }
        if (eCPPaymentConfiguration != null && (map = eCPPaymentConfiguration.A08) != null) {
            ArrayList A0k = MSY.A0k(map);
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                C2JO c2jo6 = new C2JO();
                c2jo6.A09(((VEM) A1K.getKey()).A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, ((BaseBundle) A1K.getValue()).getString("webhookUri", ""), "webhook_uri");
                C0CA.A00(A0T, Boolean.valueOf(((BaseBundle) A1K.getValue()).getBoolean("requireCVV", false)), "require_cvv");
                AbstractC31173DnH.A1M(A0T, c2jo6, DexStore.CONFIG_FILENAME);
                A0k.add(c2jo6);
            }
            if (AbstractC166987dD.A1b(A0k)) {
                c2jo5.A05("supported_containers", A0k);
            }
        }
        Be9 be9 = new Be9();
        be9.A07(eCPPaymentRequest.A0A, AbstractC63083Sc6.A00());
        be9.A07(sjj.A04, "client_mutation_id");
        be9.A07(str2, "pay_button_click_id");
        be9.A06(AbstractC63060Sbh.A00(otcInput), "one_time_checkout_input");
        be9.A07(str3, "step_up_completed_token");
        be9.A05("request_payment_container_input_list", AbstractC16960so.A1M(c2jo5));
        Q8J A00 = REV.A00(C2FP.A06(), C63572Spf.A00, new C63545SpD(6, be9, this), 1);
        C63406Sjd.A0B(A00, new C63625SqX(3, otcInput, sjj));
        C14360o3.A0A(A00);
        return A00;
    }

    public final void A03(C62735SOb c62735SOb) {
        C62985Sa9.A00(this.A00, c62735SOb.A00, c62735SOb);
    }

    public final Q8J A01(Be9 be9) {
        Q8J A00 = REV.A00(C2FP.A06(), C63574Sph.A00, new C63545SpD(7, be9, this), 1);
        C14360o3.A0A(A00);
        return A00;
    }
}
