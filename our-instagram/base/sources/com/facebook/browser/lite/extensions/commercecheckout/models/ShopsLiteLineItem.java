package com.facebook.browser.lite.extensions.commercecheckout.models;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@AutoGenJsonSerializer
@JsonDeserialize(using = ShopsLiteLineItemDeserializer.class)
@JsonSerialize(using = ShopsLiteLineItemSerializer.class)
@AutoGenJsonDeserializer
/* loaded from: classes10.dex */
public final class ShopsLiteLineItem {

    @JsonProperty("quantity")
    public final int quantity;

    @JsonProperty("variantId")
    public String variantId = "";

    @JsonProperty("requiresShipping")
    public final boolean requiresShipping = true;
}
