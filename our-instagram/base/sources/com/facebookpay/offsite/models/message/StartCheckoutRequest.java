package com.facebookpay.offsite.models.message;

import X.AbstractC167027dH;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes10.dex */
public final class StartCheckoutRequest {

    @SerializedName("content")
    public final StartCheckoutContent content;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)
    public final String messageType;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_ID)
    public final String msgId;

    public final StartCheckoutContent getContent() {
        return this.content;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public StartCheckoutRequest(String str, String str2, StartCheckoutContent startCheckoutContent) {
        AbstractC167027dH.A13(str, str2, startCheckoutContent);
        this.msgId = str;
        this.messageType = str2;
        this.content = startCheckoutContent;
    }
}
