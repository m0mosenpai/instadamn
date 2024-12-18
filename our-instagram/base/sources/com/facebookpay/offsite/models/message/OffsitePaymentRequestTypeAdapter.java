package com.facebookpay.offsite.models.message;

import X.AbstractC166987dD;
import X.C00O;
import X.C14360o3;
import X.C58579Pxx;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class OffsitePaymentRequestTypeAdapter extends TypeAdapter {
    public final Gson gson;
    public final TypeAdapter paymentConfigurationAdapter;
    public final TypeAdapter paymentOptionsAdapter;
    public static final Companion Companion = new Object();
    public static final OffsitePaymentRequestTypeAdapter$Companion$paymentOptionsTypeToken$1 paymentOptionsTypeToken = new TypeToken<PaymentOptions>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentRequestTypeAdapter$Companion$paymentOptionsTypeToken$1
    };
    public static final OffsitePaymentRequestTypeAdapter$Companion$paymentConfigurationTypeToken$1 paymentConfigurationTypeToken = new TypeToken<PaymentConfiguration>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentRequestTypeAdapter$Companion$paymentConfigurationTypeToken$1
    };

    public OffsitePaymentRequestTypeAdapter(Gson gson) {
        C14360o3.A0B(gson, 1);
        this.gson = gson;
        this.paymentOptionsAdapter = gson.A03(paymentOptionsTypeToken);
        this.paymentConfigurationAdapter = gson.A03(paymentConfigurationTypeToken);
    }

    @Override // com.google.gson.TypeAdapter
    public PaymentRequestContent read(JsonReader jsonReader) {
        Object obj;
        Object A05;
        C14360o3.A0B(jsonReader, 0);
        JsonObject jsonObject = (JsonObject) this.gson.A06(new TypeToken(JsonObject.class), jsonReader);
        String str = "paymentOptions";
        JsonElement jsonElement = jsonObject.get("paymentOptions");
        Object obj2 = null;
        if (jsonElement != null) {
            obj = this.paymentOptionsAdapter.fromJsonTree(jsonElement);
        } else {
            obj = null;
        }
        JsonElement jsonElement2 = jsonObject.get("paymentConfiguration");
        if (jsonElement2 != null) {
            obj2 = this.paymentConfigurationAdapter.fromJsonTree(jsonElement2);
        }
        C58579Pxx c58579Pxx = new C58579Pxx();
        c58579Pxx.A07 = true;
        if (obj != null) {
            PaymentOptions paymentOptions = (PaymentOptions) obj;
            c58579Pxx.A01(new OffsitePaymentDetailsTypeAdapterFactory(paymentOptions.fulfillmentType));
            Gson A00 = c58579Pxx.A00();
            str = "paymentDetails";
            JsonElement jsonElement3 = jsonObject.get("paymentDetails");
            if (jsonElement3 != null && (A05 = A00.A05(jsonElement3, PaymentDetails.class)) != null) {
                PaymentDetails paymentDetails = (PaymentDetails) A05;
                if (obj2 == null) {
                    C14360o3.A0F("paymentConfiguration");
                    throw C00O.createAndThrow();
                }
                return new PaymentRequestContent(paymentDetails, paymentOptions, (PaymentConfiguration) obj2);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final Gson getGson() {
        return this.gson;
    }

    public void write(JsonWriter jsonWriter, PaymentRequestContent paymentRequestContent) {
        throw AbstractC166987dD.A1D("Use default gson builders to create JSON strings from Kotlin objects");
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        throw AbstractC166987dD.A1D("Use default gson builders to create JSON strings from Kotlin objects");
    }
}
