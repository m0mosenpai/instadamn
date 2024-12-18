package com.facebookpay.offsite.models.message;

import X.AbstractC167027dH;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class PaymentResponseContent {

    @SerializedName("billingAddress")
    public final W3CShippingAddress billingAddress;

    @SerializedName("container")
    public final PaymentContainer container;

    @SerializedName("containerDescription")
    public final String containerDescription;

    @SerializedName("emailMarketingAllowed")
    public final Boolean emailMarketingAllowed;

    @SerializedName("fulfillmentOptionId")
    public final String fulfillmentOptionId;

    @SerializedName("offerCodes")
    public final ArrayList<String> offerCodes;

    @SerializedName("payerEmail")
    public final String payerEmail;

    @SerializedName("payerName")
    public final String payerName;

    @SerializedName("payerPhone")
    public final String payerPhone;

    @SerializedName("pickupEmail")
    public final String pickupEmail;

    @SerializedName("pickupName")
    public final String pickupName;

    @SerializedName("pickupPhone")
    public final String pickupPhone;

    @SerializedName("requestId")
    public final String requestId;

    @SerializedName("shippingAddress")
    public final W3CShippingAddress shippingAddress;

    @SerializedName("shippingOptionId")
    public final String shippingOptionId;

    public final W3CShippingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final PaymentContainer getContainer() {
        return this.container;
    }

    public final String getContainerDescription() {
        return this.containerDescription;
    }

    public final Boolean getEmailMarketingAllowed() {
        return this.emailMarketingAllowed;
    }

    public final String getFulfillmentOptionId() {
        return this.fulfillmentOptionId;
    }

    public final ArrayList getOfferCodes() {
        return this.offerCodes;
    }

    public final String getPayerEmail() {
        return this.payerEmail;
    }

    public final String getPayerName() {
        return this.payerName;
    }

    public final String getPayerPhone() {
        return this.payerPhone;
    }

    public final String getPickupEmail() {
        return this.pickupEmail;
    }

    public final String getPickupName() {
        return this.pickupName;
    }

    public final String getPickupPhone() {
        return this.pickupPhone;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final W3CShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public final String getShippingOptionId() {
        return this.shippingOptionId;
    }

    public PaymentResponseContent(String str, PaymentContainer paymentContainer, String str2, String str3, String str4, String str5, W3CShippingAddress w3CShippingAddress, W3CShippingAddress w3CShippingAddress2, String str6, String str7, String str8, String str9, String str10, ArrayList arrayList, Boolean bool) {
        AbstractC167027dH.A13(str, paymentContainer, str2);
        this.requestId = str;
        this.container = paymentContainer;
        this.containerDescription = str2;
        this.payerName = str3;
        this.payerEmail = str4;
        this.payerPhone = str5;
        this.shippingAddress = w3CShippingAddress;
        this.billingAddress = w3CShippingAddress2;
        this.shippingOptionId = str6;
        this.fulfillmentOptionId = str7;
        this.pickupName = str8;
        this.pickupEmail = str9;
        this.pickupPhone = str10;
        this.offerCodes = arrayList;
        this.emailMarketingAllowed = bool;
    }
}
