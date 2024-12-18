package com.facebookpay.offsite.models.message;

import X.AbstractC167017dG;
import X.InterfaceC47612Gm;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes10.dex */
public final class OffsiteTypeAdapterFactory implements InterfaceC47612Gm {
    public final String fulfillmentType;

    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    public OffsiteTypeAdapterFactory(String str) {
        this.fulfillmentType = str;
    }

    @Override // X.InterfaceC47612Gm
    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        AbstractC167017dG.A1N(gson, typeToken);
        if (PaymentRequestContent.class.isAssignableFrom(typeToken.rawType)) {
            return new OffsitePaymentRequestTypeAdapter(gson);
        }
        if (PaymentDetailsUpdatedResponse.class.isAssignableFrom(typeToken.rawType)) {
            return new OffsitePaymentDetailsUpdatedResponseTypeAdapter(gson, this.fulfillmentType);
        }
        return null;
    }
}
