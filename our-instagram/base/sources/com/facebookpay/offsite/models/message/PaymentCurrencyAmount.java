package com.facebookpay.offsite.models.message;

import X.AbstractC167017dG;
import com.facebook.react.modules.intent.IntentModule;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class PaymentCurrencyAmount {

    @SerializedName("currency")
    public final String currency;

    @SerializedName(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)
    public final String value;

    public final String getCurrency() {
        return this.currency;
    }

    public final String getValue() {
        return this.value;
    }

    public PaymentCurrencyAmount(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.currency = str;
        this.value = str2;
    }
}
