package com.facebookpay.offsite.models.message;

import X.AbstractC167017dG;
import X.C14360o3;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class PaymentDetailsChangedEvent {

    @SerializedName("content")
    public final PaymentDetailsChangedContent content;

    @SerializedName("error")
    public final PaymentError error;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)
    public final String messageType;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_ID)
    public final String msgId;

    @SerializedName("sourceMessageId")
    public final String sourceMessageId;

    @SerializedName("timestamp")
    public final long timeStamp;

    public /* synthetic */ PaymentDetailsChangedEvent(String str, PaymentDetailsChangedContent paymentDetailsChangedContent, long j, String str2, String str3, PaymentError paymentError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, paymentDetailsChangedContent, j, str2, (i & 16) != 0 ? MessageType$Companion.PAYMENT_DETAILS_CHANGED : str3, (i & 32) != 0 ? null : paymentError);
    }

    public final PaymentDetailsChangedContent getContent() {
        return this.content;
    }

    public final PaymentError getError() {
        return this.error;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final String getSourceMessageId() {
        return this.sourceMessageId;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public PaymentDetailsChangedEvent(String str, PaymentDetailsChangedContent paymentDetailsChangedContent, long j, String str2, String str3, PaymentError paymentError) {
        AbstractC167017dG.A1P(str, paymentDetailsChangedContent);
        C14360o3.A0B(str3, 5);
        this.msgId = str;
        this.content = paymentDetailsChangedContent;
        this.timeStamp = j;
        this.sourceMessageId = str2;
        this.messageType = str3;
        this.error = paymentError;
    }
}
