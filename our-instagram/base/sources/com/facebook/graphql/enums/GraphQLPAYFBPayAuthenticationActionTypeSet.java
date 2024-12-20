package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import X.AbstractC31175DnJ;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class GraphQLPAYFBPayAuthenticationActionTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[32];
        System.arraycopy(new String[]{"VERIFY_PIN_TO_DISABLE_BIO_HUB", "VERIFY_PIN_TO_DISABLE_PIN_HUB", "VERIFY_PIN_TO_ENABLE_BIO_HUB", "VERIFY_PIN_TO_ENABLE_PIN_HUB", "VERIFY_PIN_TO_PAY"}, AbstractC31175DnJ.A1b(new String[]{"CANCEL_OUT_OF_FLOW", "CHANGE_PIN_USING_OLD_PIN", "CONNECT_FROM_CHECKOUT_CVV_VERIFICATION", "CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION", "CONNECT_FROM_CHECKOUT_PIN_VERIFICATION", "CONNECT_FROM_HUB_CVV_VERIFICATION", "CONNECT_FROM_HUB_PAYPAL_VERIFICATION", "CONNECT_FROM_HUB_PIN_VERIFICATION", "CONNECT_WITH_CVV_AFTER_PIN_FAILURE_FROM_CHECKOUT_DIALOG", "CONNECT_WITH_CVV_AFTER_PIN_FAILURE_FROM_HUB_DIALOG", "CONNECT_WITH_PAYPAL_AFTER_PIN_FAILURE_FROM_CHECKOUT_DIALOG", "CONNECT_WITH_PAYPAL_AFTER_PIN_FAILURE_FROM_HUB_DIALOG", "CREATE_PIN_FROM_HUB", "CREATE_PIN_FROM_PAYMENT", "FORGOT_PIN_RECOVER_WITH_PASSWORD_HUB", "LEAVE_WITHOUT_ENTERING_CVV_TO_CONNECT_DIALOG", "LEAVE_WITHOUT_ENTERING_PIN_TO_CONNECT_DIALOG", "LEAVE_WITHOUT_LOG_IN_PAYPAL_TO_CONNECT_DIALOG", "LOCKED_PIN_RECOVER_WITH_PASSWORD_HUB", "LOCKED_PIN_RECOVER_WITH_PASSWORD_TO_PAY", "RESET_PIN_FROM_LEAVE_WITHOUT_RESETTING_DIALOG", "SETUP_PIN_TO_CREATE_BIO_HUB", "UNABLE_TO_CONNECT_FROM_CHECKOUT", "UNABLE_TO_CONNECT_FROM_HUB", "VERIFY_BIO_TO_DISABLE_BIO_HUB", "VERIFY_BIO_TO_PAY", "VERIFY_PIN_TO_CHECKOUT"}, strArr) ? 1 : 0, strArr, 27, 5);
        A00 = AbstractC16830sb.A05(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
