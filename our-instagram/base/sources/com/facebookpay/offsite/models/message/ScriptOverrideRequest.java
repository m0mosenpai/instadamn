package com.facebookpay.offsite.models.message;

import X.AbstractC167017dG;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes10.dex */
public final class ScriptOverrideRequest {

    @SerializedName(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)
    public final String messageType;

    @SerializedName("script")
    public final String script;

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getScript() {
        return this.script;
    }

    public ScriptOverrideRequest(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.messageType = str;
        this.script = str2;
    }
}
