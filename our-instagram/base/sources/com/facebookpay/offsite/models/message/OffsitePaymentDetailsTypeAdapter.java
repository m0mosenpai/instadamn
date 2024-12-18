package com.facebookpay.offsite.models.message;

import X.AbstractC166997dE;
import X.AbstractC31175DnJ;
import X.AbstractC58317Pt9;
import X.C00O;
import X.C14360o3;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class OffsitePaymentDetailsTypeAdapter extends TypeAdapter {
    public final String fulfillmentType;
    public final Gson gson;
    public final TypeAdapter pickupInfoAdapter;
    public final TypeAdapter priceItemAdapter;
    public final TypeAdapter priceItemListAdapter;
    public final TypeAdapter promoCodeListAdapter;
    public final TypeAdapter redactedBillingAddressAdapter;
    public final TypeAdapter redactedShippingAddressAdapter;
    public final TypeAdapter shippingOptionsListAdapter;
    public final TypeAdapter summaryListAdapter;
    public static final Companion Companion = new Object();
    public static final OffsitePaymentDetailsTypeAdapter$Companion$priceItemTypeToken$1 priceItemTypeToken = new TypeToken<PaymentItem>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsTypeAdapter$Companion$priceItemTypeToken$1
    };
    public static final OffsitePaymentDetailsTypeAdapter$Companion$priceItemListTypeToken$1 priceItemListTypeToken = new TypeToken<ArrayList<PaymentItem>>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsTypeAdapter$Companion$priceItemListTypeToken$1
    };
    public static final OffsitePaymentDetailsTypeAdapter$Companion$summaryItemListTypeToken$1 summaryItemListTypeToken = new TypeToken<ArrayList<SummaryPaymentItem>>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsTypeAdapter$Companion$summaryItemListTypeToken$1
    };
    public static final OffsitePaymentDetailsTypeAdapter$Companion$shippingOptionsListTypeToken$1 shippingOptionsListTypeToken = new TypeToken<ArrayList<PaymentShippingOption>>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsTypeAdapter$Companion$shippingOptionsListTypeToken$1
    };
    public static final OffsitePaymentDetailsTypeAdapter$Companion$fulfillmentTypeToken$1 fulfillmentTypeToken = new TypeToken<PaymentFulfillmentOption>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsTypeAdapter$Companion$fulfillmentTypeToken$1
    };
    public static final OffsitePaymentDetailsTypeAdapter$Companion$fulfillmentPickupTypeToken$1 fulfillmentPickupTypeToken = new TypeToken<PaymentPickupOption>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsTypeAdapter$Companion$fulfillmentPickupTypeToken$1
    };
    public static final OffsitePaymentDetailsTypeAdapter$Companion$promoCodeListTypeToken$1 promoCodeListTypeToken = new TypeToken<ArrayList<PaymentOffer>>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsTypeAdapter$Companion$promoCodeListTypeToken$1
    };
    public static final OffsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1 addressTypeToken = new TypeToken<W3CShippingAddress>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1
    };
    public static final OffsitePaymentDetailsTypeAdapter$Companion$pickupInfoTypeToken$1 pickupInfoTypeToken = new TypeToken<PaymentPickupInfo>() { // from class: com.facebookpay.offsite.models.message.OffsitePaymentDetailsTypeAdapter$Companion$pickupInfoTypeToken$1
    };

    public OffsitePaymentDetailsTypeAdapter(Gson gson, String str) {
        C14360o3.A0B(gson, 1);
        this.gson = gson;
        this.fulfillmentType = str;
        this.priceItemAdapter = gson.A03(priceItemTypeToken);
        this.priceItemListAdapter = gson.A03(priceItemListTypeToken);
        this.summaryListAdapter = gson.A03(summaryItemListTypeToken);
        this.shippingOptionsListAdapter = gson.A03(shippingOptionsListTypeToken);
        this.promoCodeListAdapter = gson.A03(promoCodeListTypeToken);
        OffsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1 offsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1 = addressTypeToken;
        this.redactedShippingAddressAdapter = gson.A03(offsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1);
        this.redactedBillingAddressAdapter = gson.A03(offsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1);
        this.pickupInfoAdapter = gson.A03(pickupInfoTypeToken);
    }

    @Override // com.google.gson.TypeAdapter
    public PaymentDetails read(JsonReader jsonReader) {
        Object obj;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object A12 = AbstractC166997dE.A12(jsonReader, 0);
        Object arrayList = new ArrayList();
        Object arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        JsonObject jsonObject = (JsonObject) this.gson.A06(new TypeToken(JsonObject.class), jsonReader);
        JsonArray asJsonArray = jsonObject.getAsJsonArray("fulfillmentOptions");
        if (asJsonArray != null) {
            arrayList3 = parseFulfillmentOptionsList(asJsonArray, this.fulfillmentType);
        }
        JsonElement jsonElement = jsonObject.get("total");
        Object obj5 = null;
        if (jsonElement != null) {
            obj = this.priceItemAdapter.fromJsonTree(jsonElement);
        } else {
            obj = null;
        }
        JsonElement jsonElement2 = jsonObject.get("displayItems");
        if (jsonElement2 != null) {
            A12 = this.priceItemListAdapter.fromJsonTree(jsonElement2);
        }
        JsonElement jsonElement3 = jsonObject.get("summaryItems");
        if (jsonElement3 != null) {
            arrayList = this.summaryListAdapter.fromJsonTree(jsonElement3);
        }
        JsonElement jsonElement4 = jsonObject.get("shippingOptions");
        if (jsonElement4 != null) {
            arrayList2 = this.shippingOptionsListAdapter.fromJsonTree(jsonElement4);
        }
        JsonElement jsonElement5 = jsonObject.get("shippingOptionId");
        if (jsonElement5 != null) {
            str = jsonElement5.getAsString();
        } else {
            str = null;
        }
        JsonElement jsonElement6 = jsonObject.get("fulfillmentOptionId");
        if (jsonElement6 != null) {
            str2 = jsonElement6.getAsString();
        } else {
            str2 = null;
        }
        JsonElement jsonElement7 = jsonObject.get("shippingAddress");
        if (jsonElement7 != null) {
            obj2 = this.redactedShippingAddressAdapter.fromJsonTree(jsonElement7);
        } else {
            obj2 = null;
        }
        JsonElement jsonElement8 = jsonObject.get("billingAddress");
        if (jsonElement8 != null) {
            obj3 = this.redactedBillingAddressAdapter.fromJsonTree(jsonElement8);
        } else {
            obj3 = null;
        }
        JsonElement jsonElement9 = jsonObject.get("offers");
        if (jsonElement9 != null) {
            obj4 = this.promoCodeListAdapter.fromJsonTree(jsonElement9);
        } else {
            obj4 = null;
        }
        JsonElement jsonElement10 = jsonObject.get("pickupInfo");
        if (jsonElement10 != null) {
            obj5 = this.pickupInfoAdapter.fromJsonTree(jsonElement10);
        }
        if (obj == null) {
            C14360o3.A0F("total");
            throw C00O.createAndThrow();
        }
        return new PaymentDetails((PaymentItem) obj, (ArrayList) A12, (ArrayList) arrayList, (ArrayList) arrayList2, arrayList3, str, str2, (W3CShippingAddress) obj2, (W3CShippingAddress) obj3, (List) obj4, (PaymentPickupInfo) obj5, null, null);
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final ArrayList parseFulfillmentOptionsList(JsonArray jsonArray, String str) {
        Gson gson;
        TypeToken typeToken;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            if (str.equals("PICKUP")) {
                gson = this.gson;
                typeToken = fulfillmentPickupTypeToken;
            } else if (str.equals("SHIPPING")) {
                gson = this.gson;
                typeToken = fulfillmentTypeToken;
            } else {
                throw AbstractC31175DnJ.A0V("Invalid fulfillment type: ", str);
            }
            TypeAdapter A03 = gson.A03(typeToken);
            Iterator it = jsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(A03.fromJsonTree((JsonElement) it.next()));
            }
        }
        return arrayList;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public void write(JsonWriter jsonWriter, PaymentDetails paymentDetails) {
        throw new UnsupportedOperationException(AbstractC58317Pt9.A00(645));
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        write(jsonWriter, (PaymentDetails) obj);
        throw C00O.createAndThrow();
    }
}
