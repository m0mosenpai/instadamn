package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class YBH implements C15A {
    @Override // X.C15A
    public final int Bdj() {
        return 2;
    }

    @Override // X.C15A
    public final int Bdk() {
        return 1;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "qualcomm");
            jSONObject.put("framework", "Codeaurora");
            jSONObject.put("extra", "");
            jSONObject.put("access", C84223pE.A02.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // X.C15A
    public final InterfaceC219914z ALj(C15C c15c, C15P c15p) {
        int[] AhH = c15c.AhH(c15p);
        if (AhH.length == 0) {
            return null;
        }
        return new C72194XVo(new C84223pE(), AhH, c15p.A00);
    }
}
