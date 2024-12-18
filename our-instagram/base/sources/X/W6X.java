package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes11.dex */
public abstract class W6X {
    public static Integer A00(String str) {
        if (str.equals("INVALID_OFFER_CODE")) {
            return C05F.A00;
        }
        if (str.equals("INVALID_PAYMENT_DATA")) {
            return C05F.A01;
        }
        if (str.equals("INVALID_SHIPPING_ADDRESS")) {
            return C05F.A0C;
        }
        if (str.equals("INVALID_SHIPPING_OPTION")) {
            return C05F.A0N;
        }
        if (str.equals("INVALID_FULFILLMENT_OPTION")) {
            return C05F.A0Y;
        }
        if (str.equals("PAYPAL_AUTHORIZATION_ERROR")) {
            return C05F.A0j;
        }
        if (str.equals("INVALID_BILLING_ADDRESS")) {
            return C05F.A0u;
        }
        if (str.equals("OUT_OF_SERVICE_AREA")) {
            return C05F.A15;
        }
        if (str.equals("OTHER_ERROR")) {
            return C05F.A1F;
        }
        if (str.equals("TIMEOUT")) {
            return C05F.A1I;
        }
        if (str.equals("PRODUCT_OWNED")) {
            return C05F.A02;
        }
        if (str.equals("UPDATE_ORDER_ERROR")) {
            return C05F.A03;
        }
        if (str.equals("GENERIC_FAILURE")) {
            return C05F.A04;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_PAYMENT_DATA";
            case 2:
                return "INVALID_SHIPPING_ADDRESS";
            case 3:
                return "INVALID_SHIPPING_OPTION";
            case 4:
                return "INVALID_FULFILLMENT_OPTION";
            case 5:
                return "PAYPAL_AUTHORIZATION_ERROR";
            case 6:
                return "INVALID_BILLING_ADDRESS";
            case 7:
                return "OUT_OF_SERVICE_AREA";
            case 8:
                return "OTHER_ERROR";
            case 9:
                return "TIMEOUT";
            case 10:
                return "PRODUCT_OWNED";
            case 11:
                return "UPDATE_ORDER_ERROR";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "GENERIC_FAILURE";
            default:
                return "INVALID_OFFER_CODE";
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_PAYMENT_DATA";
            case 2:
                return "INVALID_SHIPPING_ADDRESS";
            case 3:
                return "INVALID_SHIPPING_OPTION";
            case 4:
                return "INVALID_FULFILLMENT_OPTION";
            case 5:
                return "PAYPAL_AUTHORIZATION_ERROR";
            case 6:
                return "INVALID_BILLING_ADDRESS";
            case 7:
                return "OUT_OF_SERVICE_AREA";
            case 8:
                return "OTHER_ERROR";
            case 9:
                return "TIMEOUT";
            case 10:
                return "PRODUCT_OWNED";
            case 11:
                return "UPDATE_ORDER_ERROR";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "GENERIC_FAILURE";
            default:
                return "INVALID_OFFER_CODE";
        }
    }
}
