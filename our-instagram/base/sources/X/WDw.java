package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.ShippingOption;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentContainer;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentCurrencyAmount;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentOptions;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentResponseContent;
import com.facebookpay.offsite.models.message.W3CShippingAddress;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class WDw {
    public static final CurrencyAmount A00(PaymentCurrencyAmount paymentCurrencyAmount) {
        C14360o3.A0B(paymentCurrencyAmount, 0);
        return new CurrencyAmount(paymentCurrencyAmount.currency, paymentCurrencyAmount.value);
    }

    public static final CheckoutConfiguration A01(EnumC68202VFu enumC68202VFu, EnumC68202VFu enumC68202VFu2, PaymentOptions paymentOptions, Boolean bool, Boolean bool2, Boolean bool3, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str2;
        Boolean bool4;
        Integer num;
        C14360o3.A0B(paymentOptions, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean A06 = C18U.A06(C06090Tz.A06, C2FP.A0D().A00, 36314489655724693L);
        if (paymentOptions.requestShipping || ((A06 && C14360o3.A0K(paymentOptions.shippingType, "PICKUP")) || C14360o3.A0K(paymentOptions.fulfillmentType, "PICKUP"))) {
            linkedHashSet.add(VDD.A06);
        }
        if (paymentOptions.requestShipping) {
            linkedHashSet.add(VDD.A0D);
        }
        if (paymentOptions.allowOfferCodes) {
            linkedHashSet.add(VDD.A08);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(VD7.A02);
        if (paymentOptions.requestPayerEmail) {
            linkedHashSet2.add(VD7.A03);
        }
        if (paymentOptions.requestPayerName) {
            linkedHashSet2.add(VD7.A04);
        }
        if (paymentOptions.requestPayerPhone) {
            linkedHashSet2.add(VD7.A05);
        }
        if (C14360o3.A0K(paymentOptions.requestPickupName, true)) {
            linkedHashSet2.add(VD7.A07);
        }
        if (C14360o3.A0K(paymentOptions.requestPickupEmail, true)) {
            linkedHashSet2.add(VD7.A06);
        }
        if (C14360o3.A0K(paymentOptions.requestPickupPhone, true)) {
            linkedHashSet2.add(VD7.A08);
        }
        java.util.Set unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        C14360o3.A07(unmodifiableSet);
        java.util.Set unmodifiableSet2 = Collections.unmodifiableSet(linkedHashSet2);
        C14360o3.A07(unmodifiableSet2);
        if (paymentOptions.requestPayerEmail) {
            str2 = paymentOptions.marketingPrivacyPolicyUrl;
        } else {
            str2 = null;
        }
        String str3 = paymentOptions.marketingPrivacyPolicyUrl;
        if (str3 != null && str3.length() != 0) {
            bool4 = paymentOptions.defaultMarketingEmailOptOut;
        } else {
            bool4 = null;
        }
        String str4 = paymentOptions.fulfillmentType;
        if (str4 != null) {
            num = AbstractC69840VwQ.A00(AbstractC65702TsY.A0f(str4));
        } else {
            num = null;
        }
        return new CheckoutConfiguration(null, enumC68202VFu, enumC68202VFu2, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(A06), bool4, Boolean.valueOf(z), bool, bool2, bool3, num, null, str, str2, unmodifiableSet, unmodifiableSet2, 1, true, false, z5);
    }

    public static final PaymentResponseContent A02(ECPPaymentResponseParams eCPPaymentResponseParams, PaymentRequest paymentRequest) {
        String str;
        PaymentMode paymentMode;
        PaymentContainerType paymentContainerType;
        W3CShippingAddress w3CShippingAddress;
        W3CShippingAddress w3CShippingAddress2;
        String str2;
        String str3;
        PaymentRequestContent paymentRequestContent;
        PaymentOptions paymentOptions;
        ShippingAddress shippingAddress;
        PaymentRequestContent paymentRequestContent2;
        PaymentConfiguration paymentConfiguration;
        C14360o3.A0B(eCPPaymentResponseParams, 0);
        if (paymentRequest == null || (paymentRequestContent2 = paymentRequest.content) == null || (paymentConfiguration = paymentRequestContent2.paymentConfiguration) == null || (str = paymentConfiguration.requestId) == null) {
            str = eCPPaymentResponseParams.A0Q;
        }
        String str4 = eCPPaymentResponseParams.A0A;
        if ("LIVE".equals(AbstractC65702TsY.A0f(eCPPaymentResponseParams.A0J))) {
            paymentMode = PaymentMode.LIVE;
        } else {
            paymentMode = PaymentMode.TEST;
        }
        String str5 = eCPPaymentResponseParams.A0I;
        String str6 = eCPPaymentResponseParams.A0C;
        if (str6 != null) {
            paymentContainerType = PaymentContainerType.Companion.fromString(str6);
        } else {
            paymentContainerType = null;
        }
        PaymentContainer paymentContainer = new PaymentContainer(str4, paymentMode, str5, paymentContainerType);
        String str7 = eCPPaymentResponseParams.A09;
        String str8 = eCPPaymentResponseParams.A0G;
        String str9 = eCPPaymentResponseParams.A0F;
        String str10 = eCPPaymentResponseParams.A0H;
        ShippingAddress shippingAddress2 = eCPPaymentResponseParams.A07;
        if (shippingAddress2 != null) {
            w3CShippingAddress = W6a.A00(shippingAddress2);
        } else {
            w3CShippingAddress = null;
        }
        if (paymentRequest != null && (paymentRequestContent = paymentRequest.content) != null && (paymentOptions = paymentRequestContent.paymentOptions) != null && paymentOptions.requestBillingAddress && (shippingAddress = eCPPaymentResponseParams.A06) != null) {
            w3CShippingAddress2 = W6a.A00(shippingAddress);
        } else {
            w3CShippingAddress2 = null;
        }
        ShippingOption shippingOption = eCPPaymentResponseParams.A02;
        if (shippingOption != null) {
            str2 = shippingOption.A03;
        } else {
            str2 = null;
        }
        FulfillmentOption fulfillmentOption = eCPPaymentResponseParams.A01;
        if (fulfillmentOption != null) {
            str3 = fulfillmentOption.A00();
        } else {
            str3 = null;
        }
        return new PaymentResponseContent(str, paymentContainer, str7, str8, str9, str10, w3CShippingAddress, w3CShippingAddress2, str2, str3, eCPPaymentResponseParams.A0L, eCPPaymentResponseParams.A0K, eCPPaymentResponseParams.A0N, null, Boolean.valueOf(eCPPaymentResponseParams.A0T));
    }

    public static final ArrayList A03(PaymentRequestContent paymentRequestContent, C09530e4... c09530e4Arr) {
        String name;
        ArrayList A12 = AbstractC166997dE.A12(paymentRequestContent, 0);
        int i = 0;
        while (true) {
            if (i < 2) {
                if (C14360o3.A0K(c09530e4Arr[i].A00, "PROCESSING_MODE")) {
                    break;
                }
                i++;
            } else {
                PaymentMode paymentMode = paymentRequestContent.paymentConfiguration.mode;
                if (paymentMode != null && (name = paymentMode.name()) != null) {
                    A12.add(new CheckoutSetupKeyValue("PROCESSING_MODE", name));
                }
            }
        }
        A12.add(new CheckoutSetupKeyValue("CONTAINER_CONTEXT", paymentRequestContent.paymentConfiguration.containerContext));
        String str = paymentRequestContent.paymentConfiguration.merchantName;
        if (str != null) {
            A12.add(new CheckoutSetupKeyValue("MERCHANT_NAME", str));
        }
        PaymentConfiguration paymentConfiguration = paymentRequestContent.paymentConfiguration;
        C14360o3.A0B(paymentConfiguration, 0);
        String str2 = paymentConfiguration.merchantName;
        String format = String.format(Locale.ROOT, "%s::%s", MSX.A1b(paymentConfiguration.partnerId, paymentConfiguration.partnerMerchantId, 2));
        C14360o3.A07(format);
        String str3 = new PaymentReceiverInfo(null, str2, null, format).A00;
        if (str3 != null) {
            A12.add(new CheckoutSetupKeyValue("CLIENT_RECEIVER_ID", str3));
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            C09530e4 c09530e4 = c09530e4Arr[i2];
            String str4 = (String) c09530e4.A01;
            if (str4 != null) {
                arrayList.add(new CheckoutSetupKeyValue((String) c09530e4.A00, str4));
            }
            i2++;
        } while (i2 < 2);
        AnonymousClass016.A18(A12, arrayList.toArray(new CheckoutSetupKeyValue[0]));
        return A12;
    }
}
