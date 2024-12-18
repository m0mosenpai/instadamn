package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.OWr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55018OWr {
    public final String A00;
    public final JSONObject A01;

    public C55018OWr(String str, JSONObject jSONObject) {
        C14360o3.A0B(jSONObject, 1);
        this.A01 = jSONObject;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C55018OWr) {
                C55018OWr c55018OWr = (C55018OWr) obj;
                if (!C14360o3.A0K(this.A01, c55018OWr.A01) || !C14360o3.A0K(this.A00, c55018OWr.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C55018OWr c55018OWr, C55143Od2 c55143Od2) {
        JSONObject jSONObject = c55018OWr.A01;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "odr_pose_data_event");
        jSONObject2.put("data", jSONObject);
        c55143Od2.A0D.A02.A00(jSONObject2);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SceneAssets(sceneJSONObject=");
        A1C.append(this.A01);
        A1C.append(", posePath=");
        return AbstractC25236BEt.A0Y(this.A00, A1C);
    }
}
