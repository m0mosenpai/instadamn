package com.facebookpay.offsite.models.message;

import X.AbstractC166987dD;
import X.C00O;
import X.C14360o3;
import X.C58579Pxx;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class OffsitePaymentDetailsUpdatedResponseTypeAdapter extends TypeAdapter {
    public final Gson deserializerGson;
    public final TypeAdapter errorAdapter;
    public final String fulfillmentType;
    public final Gson gson;
    public final TypeAdapter messageTypeAdapter;
    public final TypeAdapter msgIdAdapter;
    public final TypeAdapter sourceMessageIdAdapter;
    public final TypeAdapter timestampAdapter;
    public static final Companion Companion = new Object();
    public static final OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$msgIdTypeToken$1 msgIdTypeToken = new TypeToken<String>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$msgIdTypeToken$1
    };
    public static final OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$timestampTypeToken$1 timestampTypeToken = new TypeToken<Long>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$timestampTypeToken$1
    };
    public static final OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$sourceMessageIdTypeToken$1 sourceMessageIdTypeToken = new TypeToken<String>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$sourceMessageIdTypeToken$1
    };
    public static final OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$messageTypeToken$1 messageTypeToken = new TypeToken<String>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$messageTypeToken$1
    };
    public static final OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$errorTypeToken$1 errorTypeToken = new TypeToken<PaymentError>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$errorTypeToken$1
    };

    public OffsitePaymentDetailsUpdatedResponseTypeAdapter(Gson gson, String str) {
        C14360o3.A0B(gson, 1);
        this.gson = gson;
        this.fulfillmentType = str;
        this.msgIdAdapter = gson.A03(msgIdTypeToken);
        this.timestampAdapter = gson.A03(timestampTypeToken);
        this.sourceMessageIdAdapter = gson.A03(sourceMessageIdTypeToken);
        this.messageTypeAdapter = gson.A03(messageTypeToken);
        this.errorAdapter = gson.A03(errorTypeToken);
        C58579Pxx c58579Pxx = new C58579Pxx();
        c58579Pxx.A07 = true;
        c58579Pxx.A01(new OffsitePaymentDetailsTypeAdapterFactory(str));
        this.deserializerGson = c58579Pxx.A00();
    }

    @Override // com.google.gson.TypeAdapter
    public PaymentDetailsUpdatedResponse read(JsonReader jsonReader) {
        Object obj;
        long j;
        Object obj2;
        Object obj3;
        Object obj4;
        C14360o3.A0B(jsonReader, 0);
        JsonObject jsonObject = (JsonObject) this.gson.A06(new TypeToken(JsonObject.class), jsonReader);
        JsonElement jsonElement = jsonObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        Object obj5 = null;
        if (jsonElement != null) {
            obj = this.msgIdAdapter.fromJsonTree(jsonElement);
        } else {
            obj = null;
        }
        JsonElement jsonElement2 = jsonObject.get("timestamp");
        if (jsonElement2 != null) {
            j = AbstractC166987dD.A0N(this.timestampAdapter.fromJsonTree(jsonElement2));
        } else {
            j = 0;
        }
        JsonElement jsonElement3 = jsonObject.get("sourceMessageId");
        if (jsonElement3 != null) {
            obj2 = this.sourceMessageIdAdapter.fromJsonTree(jsonElement3);
        } else {
            obj2 = null;
        }
        JsonElement jsonElement4 = jsonObject.get("content");
        if (jsonElement4 != null) {
            obj3 = this.deserializerGson.A05(jsonElement4, PaymentDetailsUpdate.class);
        } else {
            obj3 = null;
        }
        String str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        JsonElement jsonElement5 = jsonObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (jsonElement5 != null) {
            obj4 = this.messageTypeAdapter.fromJsonTree(jsonElement5);
        } else {
            obj4 = null;
        }
        JsonElement jsonElement6 = jsonObject.get("error");
        if (jsonElement6 != null) {
            obj5 = this.errorAdapter.fromJsonTree(jsonElement6);
        }
        if (obj == null) {
            str = "msgId";
        } else {
            String str2 = (String) obj;
            PaymentDetailsUpdate paymentDetailsUpdate = (PaymentDetailsUpdate) obj3;
            String str3 = (String) obj2;
            if (obj4 != null) {
                return new PaymentDetailsUpdatedResponse(str2, paymentDetailsUpdate, j, str3, (String) obj4, (PaymentError) obj5);
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

    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public void write(JsonWriter jsonWriter, PaymentDetailsUpdatedResponse paymentDetailsUpdatedResponse) {
        throw AbstractC166987dD.A1D("Use default gson builders to create JSON strings from Kotlin objects");
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        throw AbstractC166987dD.A1D("Use default gson builders to create JSON strings from Kotlin objects");
    }
}
