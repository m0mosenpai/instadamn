package com.facebookpay.offsite.models.message;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class PaymentPickupInfo {

    @SerializedName("pickupEmail")
    public final String pickupEmail;

    @SerializedName("pickupName")
    public final String pickupName;

    @SerializedName("pickupNotes")
    public final String pickupNotes;

    @SerializedName("pickupPhone")
    public final String pickupPhone;

    @SerializedName("pickupRadiusZipCode")
    public final String pickupRadiusZipCode;

    public final String getPickupEmail() {
        return this.pickupEmail;
    }

    public final String getPickupName() {
        return this.pickupName;
    }

    public final String getPickupNotes() {
        return this.pickupNotes;
    }

    public final String getPickupPhone() {
        return this.pickupPhone;
    }

    public final String getPickupRadiusZipCode() {
        return this.pickupRadiusZipCode;
    }

    public PaymentPickupInfo(String str, String str2, String str3, String str4, String str5) {
        this.pickupRadiusZipCode = str;
        this.pickupName = str2;
        this.pickupEmail = str3;
        this.pickupPhone = str4;
        this.pickupNotes = str5;
    }
}
