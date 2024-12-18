package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.AbstractC166987dD;
import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.ArrayList;

@AutoGenJsonSerializer
@JsonDeserialize(using = ShopsLiteContentModelDeserializer.class)
@JsonSerialize(using = ShopsLiteContentModelSerializer.class)
@AutoGenJsonDeserializer
/* loaded from: classes10.dex */
public final class ShopsLiteContentModel {

    @JsonProperty("fallbackCheckoutUrl")
    public String fallbackCheckoutUrl;

    @JsonProperty("lineItems")
    public final ArrayList<ShopsLiteLineItem> lineItems = AbstractC166987dD.A1E();

    @JsonProperty("merchantDomain")
    public final String merchantDomain;

    @JsonProperty("sourceUrl")
    public final String sourceUrl;

    @JsonProperty("visitToken")
    public final String visitToken;
}
