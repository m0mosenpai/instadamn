package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes4.dex */
public abstract class A2P {
    public static String A00(Integer num) {
        if (1 - num.intValue() != 0) {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }
        return "undo";
    }
}
