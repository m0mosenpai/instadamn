package com.facebookpay.offsite.models.message;

import X.C14360o3;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes10.dex */
public final class AvailableMessageContent {

    @SerializedName("availability")
    public final String availability;

    @SerializedName("flags")
    public final String flags;

    @SerializedName("isProactiveCheckoutAvailable")
    public final boolean isProactiveCheckoutAvailable;

    public AvailableMessageContent(String str, boolean z, String str2) {
        C14360o3.A0B(str, 1);
        this.availability = str;
        this.isProactiveCheckoutAvailable = z;
        this.flags = str2;
    }

    public final String getAvailability() {
        return this.availability;
    }

    public final String getFlags() {
        return this.flags;
    }

    public final boolean isProactiveCheckoutAvailable() {
        return this.isProactiveCheckoutAvailable;
    }
}
