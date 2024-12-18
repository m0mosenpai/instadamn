package com.facebookpay.offsite.models.message;

import X.AbstractC167017dG;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes10.dex */
public final class BaseMessage {

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)
    public final String messageType;

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_ID)
    public final String msgId;

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public BaseMessage(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.msgId = str;
        this.messageType = str2;
    }
}
