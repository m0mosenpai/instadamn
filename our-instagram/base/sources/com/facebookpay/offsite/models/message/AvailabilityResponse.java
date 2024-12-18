package com.facebookpay.offsite.models.message;

import X.AbstractC167007dF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AvailabilityResponse {

    @SerializedName("content")
    public final AvailableMessageContent content;

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

    public /* synthetic */ AvailabilityResponse(String str, AvailableMessageContent availableMessageContent, long j, String str2, String str3, PaymentError paymentError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, availableMessageContent, j, str2, (i & 16) != 0 ? MessageType$Companion.AVAILABLE_RESPONSE : str3, (i & 32) != 0 ? null : paymentError);
    }

    public final AvailableMessageContent getContent() {
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

    public AvailabilityResponse(String str, AvailableMessageContent availableMessageContent, long j, String str2, String str3, PaymentError paymentError) {
        AbstractC167007dF.A1G(str, 1, str3);
        this.msgId = str;
        this.content = availableMessageContent;
        this.timeStamp = j;
        this.sourceMessageId = str2;
        this.messageType = str3;
        this.error = paymentError;
    }
}
