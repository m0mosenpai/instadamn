package com.facebookpay.offsite.models.message;

import X.AbstractC167017dG;
import X.InterfaceC47612Gm;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes10.dex */
public final class OffsitePaymentDetailsTypeAdapterFactory implements InterfaceC47612Gm {
    public final String fulfillmentType;

    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    public OffsitePaymentDetailsTypeAdapterFactory(String str) {
        this.fulfillmentType = str;
    }

    @Override // X.InterfaceC47612Gm
    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        AbstractC167017dG.A1N(gson, typeToken);
        if (PaymentDetails.class.isAssignableFrom(typeToken.rawType)) {
            return new OffsitePaymentDetailsTypeAdapter(gson, this.fulfillmentType);
        }
        if (PaymentDetailsUpdatedError.class.isAssignableFrom(typeToken.rawType)) {
            return new OffsiteJSONErrorTypeAdapter(gson);
        }
        return null;
    }
}
