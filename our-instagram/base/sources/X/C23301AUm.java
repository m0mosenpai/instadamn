package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AUm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23301AUm implements BCK {
    public final C23656Adr A00;

    public C23301AUm(C23656Adr c23656Adr) {
        C14360o3.A0B(c23656Adr, 1);
        this.A00 = c23656Adr;
    }

    @Override // X.BCK
    public final boolean AFf(JSONObject jSONObject) {
        if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) && "loggingEvent".equals(jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            return true;
        }
        return false;
    }

    @Override // X.BCK
    public final void CJB(JSONObject jSONObject) {
        if (AFf(jSONObject)) {
            try {
                Object obj = jSONObject.getJSONObject("data").get("logType");
                for (EnumC223029sh enumC223029sh : EnumC223029sh.values()) {
                    if (C14360o3.A0K(enumC223029sh.A01, obj)) {
                        C23656Adr.A00(enumC223029sh.A00, this.A00);
                        return;
                    }
                }
            } catch (JSONException e) {
                this.A00.A02(EnumC223239t9.A0c, "", AbstractC167017dG.A0n(e, "Can not parse platform event: ", AbstractC166987dD.A1C()));
            }
        }
    }
}
