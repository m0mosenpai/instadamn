package com.facebookpay.payments.model;

import X.AbstractC167017dG;
import com.fbpay.ptt.interfaces.SerializedName;

/* loaded from: classes10.dex */
public final class PayComponent {

    @SerializedName("amount")
    public final int amount;

    @SerializedName("cred_id")
    public final String credentialId;

    @SerializedName("currency")
    public final String currency;

    public final int getAmount() {
        return this.amount;
    }

    public final String getCredentialId() {
        return this.credentialId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public PayComponent(String str, int i, String str2) {
        AbstractC167017dG.A1Q(str, str2);
        this.credentialId = str;
        this.amount = i;
        this.currency = str2;
    }
}
