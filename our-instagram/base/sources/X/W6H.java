package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.expresscheckout.models.CheckoutAvailability;
import com.facebookpay.expresscheckout.models.CheckoutPayloadKeyValue;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.offsite.models.message.PaymentConfiguration;
import com.facebookpay.offsite.models.message.PaymentContainerType;
import com.facebookpay.offsite.models.message.PaymentDetails;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W6H {
    public ECPPaymentResponseParams A00;
    public PaymentDetails A01;
    public PaymentRequest A02;
    public PaymentRequest A03;
    public C69779VvG A04;
    public C63406Sjd A05;
    public Boolean A06;
    public String A07;
    public boolean A08;

    public W6H(PaymentRequest paymentRequest) {
        this.A02 = paymentRequest;
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A07 = null;
        this.A00 = null;
        this.A03 = null;
        this.A01 = null;
        this.A08 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W6H) {
                W6H w6h = (W6H) obj;
                if (!C14360o3.A0K(this.A02, w6h.A02) || !C14360o3.A0K(this.A05, w6h.A05) || !C14360o3.A0K(this.A04, w6h.A04) || !C14360o3.A0K(this.A06, w6h.A06) || !C14360o3.A0K(this.A07, w6h.A07) || !C14360o3.A0K(this.A00, w6h.A00) || !C14360o3.A0K(this.A03, w6h.A03) || !C14360o3.A0K(this.A01, w6h.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final PaymentReceiverInfo A00() {
        CheckoutAvailability checkoutAvailability;
        C63406Sjd c63406Sjd = this.A05;
        if (c63406Sjd != null && (checkoutAvailability = (CheckoutAvailability) c63406Sjd.A01) != null) {
            UY4 uy4 = checkoutAvailability.A00.A04;
            return new PaymentReceiverInfo(uy4.A07("strong_id__"), uy4.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), uy4.A09("image"), null);
        }
        return null;
    }

    public final PaymentMode A01() {
        CheckoutAvailability checkoutAvailability;
        EnumC68164VEi enumC68164VEi;
        int ordinal;
        PaymentRequestContent paymentRequestContent;
        PaymentConfiguration paymentConfiguration;
        PaymentMode paymentMode;
        PaymentRequest paymentRequest = this.A02;
        if (paymentRequest == null || (paymentRequestContent = paymentRequest.content) == null || (paymentConfiguration = paymentRequestContent.paymentConfiguration) == null || (paymentMode = paymentConfiguration.mode) == null) {
            C63406Sjd c63406Sjd = this.A05;
            if (c63406Sjd != null && (checkoutAvailability = (CheckoutAvailability) c63406Sjd.A01) != null && (enumC68164VEi = (EnumC68164VEi) checkoutAvailability.A00.A03.getOptionalEnumField(3, "payment_mode", EnumC68164VEi.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null && (ordinal = enumC68164VEi.ordinal()) != 1 && ordinal == 2) {
                return PaymentMode.TEST;
            }
            return PaymentMode.LIVE;
        }
        return paymentMode;
    }

    public final String A02() {
        CheckoutAvailability checkoutAvailability;
        Object obj;
        C63406Sjd c63406Sjd = this.A05;
        if (c63406Sjd != null) {
            checkoutAvailability = (CheckoutAvailability) c63406Sjd.A01;
        } else {
            checkoutAvailability = null;
        }
        if (checkoutAvailability == null) {
            return null;
        }
        Iterator it = checkoutAvailability.A00.A06.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((CheckoutPayloadKeyValue) obj).A00 == EnumC68194VFm.CLIENT_RECEIVER_ID) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CheckoutPayloadKeyValue checkoutPayloadKeyValue = (CheckoutPayloadKeyValue) obj;
        if (checkoutPayloadKeyValue == null) {
            return null;
        }
        return checkoutPayloadKeyValue.A01;
    }

    public final java.util.Set A05() {
        PaymentRequestContent paymentRequestContent;
        PaymentConfiguration paymentConfiguration;
        Map<PaymentContainerType, Map<String, Object>> map;
        java.util.Set<PaymentContainerType> keySet;
        PaymentRequest paymentRequest = this.A02;
        if (paymentRequest != null && (paymentRequestContent = paymentRequest.content) != null && (paymentConfiguration = paymentRequestContent.paymentConfiguration) != null && (map = paymentConfiguration.supportedContainers) != null && (keySet = map.keySet()) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(keySet);
            Iterator<PaymentContainerType> it = keySet.iterator();
            while (it.hasNext()) {
                A0q.add(VNI.A00(it.next().getType()));
            }
            return AbstractC001800i.A0k(A0q);
        }
        return null;
    }

    public final java.util.Set A06() {
        CheckoutAvailability checkoutAvailability;
        ImmutableList requiredCompactedEnumListField;
        C63406Sjd c63406Sjd = this.A05;
        if (c63406Sjd != null && (checkoutAvailability = (CheckoutAvailability) c63406Sjd.A01) != null && (requiredCompactedEnumListField = checkoutAvailability.A00.A03.getRequiredCompactedEnumListField(1, "supported_container_types", EnumC68165VEj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null) {
            return AbstractC001800i.A0k(WGr.A0F(requiredCompactedEnumListField));
        }
        return null;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        PaymentDetails paymentDetails = this.A01;
        if (paymentDetails != null) {
            i = paymentDetails.hashCode();
        }
        return A0M + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckoutSessionData(availabilityRequest=");
        sb.append(this.A02);
        sb.append(", availabilityResponse=");
        sb.append(this.A05);
        sb.append(", availabilityInfo=");
        sb.append(this.A04);
        sb.append(", isNUXUser=");
        sb.append(this.A06);
        sb.append(", orderId=");
        sb.append(this.A07);
        sb.append(", ecpPaymentResponseParams=");
        sb.append(this.A00);
        sb.append(", paymentRequest=");
        sb.append(this.A03);
        sb.append(", paymentDetails=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }

    public final String A03() {
        PaymentRequestContent paymentRequestContent;
        PaymentConfiguration paymentConfiguration;
        String A02 = A02();
        if (A02 != null) {
            return AbstractC001900j.A0L(A02, "::", A02);
        }
        PaymentRequest paymentRequest = this.A02;
        if (paymentRequest == null || (paymentRequestContent = paymentRequest.content) == null || (paymentConfiguration = paymentRequestContent.paymentConfiguration) == null) {
            return null;
        }
        return paymentConfiguration.partnerId;
    }

    public final String A04() {
        PaymentRequestContent paymentRequestContent;
        PaymentConfiguration paymentConfiguration;
        String A02 = A02();
        if (A02 != null) {
            return AbstractC001900j.A0K(A02, "::", A02);
        }
        PaymentRequest paymentRequest = this.A02;
        if (paymentRequest == null || (paymentRequestContent = paymentRequest.content) == null || (paymentConfiguration = paymentRequestContent.paymentConfiguration) == null) {
            return null;
        }
        return paymentConfiguration.partnerMerchantId;
    }

    public W6H() {
        this(null);
    }
}
