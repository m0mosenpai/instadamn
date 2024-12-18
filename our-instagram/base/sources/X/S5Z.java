package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.google.gson.JsonElement;

/* loaded from: classes10.dex */
public abstract class S5Z {
    public static final void A00(String str, JsonElement jsonElement) {
        AbstractC12120kG.A0I("Failed to parse swipe history entry", null, AbstractC25233BEq.A0p(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, jsonElement.toString(), AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str)));
    }
}
