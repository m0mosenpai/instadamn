package com.facebookpay.offsite.models.message;

import X.AbstractC167017dG;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class PaymentContainer {

    @SerializedName("containerData")
    public final String containerData;

    @SerializedName("containerId")
    public final String containerId;

    @SerializedName("containerType")
    public final PaymentContainerType containerType;

    @SerializedName(DatePickerDialogModule.ARG_MODE)
    public final PaymentMode mode;

    public final String getContainerData() {
        return this.containerData;
    }

    public final String getContainerId() {
        return this.containerId;
    }

    public final PaymentContainerType getContainerType() {
        return this.containerType;
    }

    public final PaymentMode getMode() {
        return this.mode;
    }

    public PaymentContainer(String str, PaymentMode paymentMode, String str2, PaymentContainerType paymentContainerType) {
        AbstractC167017dG.A1P(str, paymentMode);
        this.containerId = str;
        this.mode = paymentMode;
        this.containerData = str2;
        this.containerType = paymentContainerType;
    }

    public /* synthetic */ PaymentContainer(String str, PaymentMode paymentMode, String str2, PaymentContainerType paymentContainerType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, paymentMode, str2, (i & 8) != 0 ? null : paymentContainerType);
    }
}
