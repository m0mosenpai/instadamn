package com.facebook.graphql.enums;

import X.AbstractC16830sb;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class GraphQLMessengerPIITypeSet {
    public static final HashSet A00 = AbstractC16830sb.A05("ADDRESS", "DATE", PaymentDetailChangeTypes$Companion.EMAIL, "MULTI_CHOICE", "NUMBER", "PAYMENT_CARD", PaymentDetailChangeTypes$Companion.PHONE_NUMBER, "TEXT");

    public static final Set getSet() {
        return A00;
    }
}
