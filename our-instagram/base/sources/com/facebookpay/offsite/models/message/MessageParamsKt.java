package com.facebookpay.offsite.models.message;

import X.AbstractC001800i;
import X.AbstractC009903n;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C14360o3;
import X.C16930sl;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class MessageParamsKt {
    public static final String formatCurrency(PaymentCurrencyAmount paymentCurrencyAmount) {
        C14360o3.A0B(paymentCurrencyAmount, 0);
        return AnonymousClass001.A0R(Currency.getInstance(paymentCurrencyAmount.currency).getSymbol(), paymentCurrencyAmount.value);
    }

    public static final List getErrors(PaymentDetailsUpdate paymentDetailsUpdate) {
        C14360o3.A0B(paymentDetailsUpdate, 0);
        List<PaymentDataError> list = paymentDetailsUpdate.errors;
        if (list != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (PaymentDataError paymentDataError : list) {
                if (!AbstractC009903n.A0O(paymentDataError.reason, PaymentDataErrorReason.values())) {
                    paymentDataError = new PaymentDataError(PaymentDataErrorReason.OTHER_ERROR, paymentDataError.field, paymentDataError.message);
                }
                A0q.add(paymentDataError);
            }
            return A0q;
        }
        List mapKeyToErrorField = mapKeyToErrorField(paymentDetailsUpdate.shippingAddressErrors);
        List mapKeyToErrorField2 = mapKeyToErrorField(paymentDetailsUpdate.offerCodeErrors);
        if (mapKeyToErrorField != null) {
            if (mapKeyToErrorField2 == null) {
                mapKeyToErrorField2 = C16930sl.A00;
            }
            return AbstractC001800i.A0S(mapKeyToErrorField2, mapKeyToErrorField);
        }
        return mapKeyToErrorField2;
    }

    public static final List mapKeyToErrorField(PaymentDetailsUpdatedError paymentDetailsUpdatedError) {
        PaymentDataErrorReason paymentDataErrorReason;
        PaymentDataErrorField paymentDataErrorField;
        if (paymentDetailsUpdatedError == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(paymentDetailsUpdatedError.size());
        Iterator A14 = AbstractC166997dE.A14(paymentDetailsUpdatedError);
        while (A14.hasNext()) {
            Map.Entry entry = (Map.Entry) A14.next();
            if (AbstractC009903n.A0O(((PaymentDataError) entry.getValue()).reason, PaymentDataErrorReason.values())) {
                paymentDataErrorReason = ((PaymentDataError) entry.getValue()).reason;
            } else {
                paymentDataErrorReason = PaymentDataErrorReason.OTHER_ERROR;
            }
            PaymentDataErrorField[] values = PaymentDataErrorField.values();
            int i = 0;
            int length = values.length;
            while (true) {
                if (i < length) {
                    paymentDataErrorField = values[i];
                    if (!C14360o3.A0K(paymentDataErrorField.name(), entry.getKey())) {
                        i++;
                    }
                } else {
                    paymentDataErrorField = PaymentDataErrorField.unknown;
                    break;
                }
            }
            arrayList.add(new PaymentDataError(paymentDataErrorReason, paymentDataErrorField, ((PaymentDataError) entry.getValue()).message));
        }
        return AbstractC001800i.A0a(arrayList);
    }
}
