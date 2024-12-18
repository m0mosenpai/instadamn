package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SAQ {
    public final C62600SIe A00;

    public SAQ(JSONObject jSONObject) {
        C62600SIe c62600SIe;
        jSONObject.getString("productId");
        jSONObject.optString(DialogModule.KEY_TITLE);
        jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        jSONObject.optString(DevServerEntity.COLUMN_DESCRIPTION);
        jSONObject.optString("basePlanId");
        JSONObject optJSONObject = jSONObject.optJSONObject("pricingPhase");
        if (optJSONObject == null) {
            c62600SIe = null;
        } else {
            c62600SIe = new C62600SIe(optJSONObject);
        }
        this.A00 = c62600SIe;
    }
}
