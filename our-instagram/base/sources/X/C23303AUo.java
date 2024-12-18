package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AUo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23303AUo implements BCK {
    public final /* synthetic */ C214619ez A00;

    public C23303AUo(C214619ez c214619ez) {
        this.A00 = c214619ez;
    }

    @Override // X.BCK
    public final boolean AFf(JSONObject jSONObject) {
        if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) && "onAR3DToggleSwitchVisibilityChanged".equals(jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            return true;
        }
        return false;
    }

    @Override // X.BCK
    public final void CJB(JSONObject jSONObject) {
        try {
            if (jSONObject.getJSONObject("data").getBoolean("newValue")) {
                C214619ez c214619ez = this.A00;
                Integer num = c214619ez.A09;
                if (num == null) {
                    C14360o3.A0F("effectMode");
                    throw C00O.createAndThrow();
                }
                if (num == C05F.A0C && c214619ez.A04() == C05F.A01) {
                    C176567tE.A00(new RunnableC24294Apz(c214619ez));
                }
            }
        } catch (JSONException e) {
            this.A00.A02().A02(EnumC223239t9.A0c, "", AbstractC167017dG.A0n(e, "Can not parse platform event: ", AbstractC166987dD.A1C()));
        }
    }
}
