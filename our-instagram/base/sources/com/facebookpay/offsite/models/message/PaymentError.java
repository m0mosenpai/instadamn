package com.facebookpay.offsite.models.message;

import X.AbstractC167017dG;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.gson.annotations.SerializedName;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes11.dex */
public final class PaymentError {

    @SerializedName(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)
    public final String code;

    @SerializedName(DialogModule.KEY_MESSAGE)
    public final String message;

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public PaymentError(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.code = str;
        this.message = str2;
    }
}
