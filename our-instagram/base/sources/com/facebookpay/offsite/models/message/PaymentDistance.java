package com.facebookpay.offsite.models.message;

import X.C14360o3;
import com.facebook.react.modules.intent.IntentModule;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class PaymentDistance {

    @SerializedName("unit")
    public final String unit;

    @SerializedName(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)
    public final double value;

    public PaymentDistance(double d, String str) {
        C14360o3.A0B(str, 2);
        this.value = d;
        this.unit = str;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final double getValue() {
        return this.value;
    }
}
