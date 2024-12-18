package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes6.dex */
public abstract class F8P {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            case 2:
                return "interest_topic";
            default:
                return "tag";
        }
    }
}
