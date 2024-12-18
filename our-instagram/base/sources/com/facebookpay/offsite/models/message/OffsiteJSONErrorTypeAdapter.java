package com.facebookpay.offsite.models.message;

import X.AbstractC166987dD;
import X.C14360o3;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class OffsiteJSONErrorTypeAdapter extends TypeAdapter {
    public static final Companion Companion = new Object();
    public static final OffsiteJSONErrorTypeAdapter$Companion$errorTypeToken$1 errorTypeToken = new TypeToken<PaymentDataError>() { // from class: com.facebookpay.offsite.models.message.OffsiteJSONErrorTypeAdapter$Companion$errorTypeToken$1
    };
    public final Gson gson;

    public OffsiteJSONErrorTypeAdapter(Gson gson) {
        C14360o3.A0B(gson, 1);
        this.gson = gson;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebookpay.offsite.models.message.PaymentDetailsUpdatedError, java.util.Map, java.util.HashMap] */
    @Override // com.google.gson.TypeAdapter
    public PaymentDetailsUpdatedError read(JsonReader jsonReader) {
        C14360o3.A0B(jsonReader, 0);
        ?? hashMap = new HashMap();
        jsonReader.A0N();
        while (jsonReader.A0S()) {
            hashMap.put(jsonReader.A0J(), this.gson.A03(errorTypeToken).read(jsonReader));
        }
        jsonReader.A0P();
        return hashMap;
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

    public void write(JsonWriter jsonWriter, PaymentDetailsUpdatedError paymentDetailsUpdatedError) {
        throw AbstractC166987dD.A1D("Use default gson builders to create JSON strings from Kotlin objects");
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        throw AbstractC166987dD.A1D("Use default gson builders to create JSON strings from Kotlin objects");
    }
}
