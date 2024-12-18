package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.Rsy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61743Rsy {
    public static final void A00(String str, JSONObject jSONObject) {
        jSONObject.accumulate(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS, AbstractC31171DnF.A0q().put("prf", AbstractC31171DnF.A0q().put("eval", AbstractC31171DnF.A0q().put("first", str))));
    }
}
