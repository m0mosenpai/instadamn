package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.AUn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23302AUn implements BCK {
    public final /* synthetic */ C214619ez A00;

    public C23302AUn(C214619ez c214619ez) {
        this.A00 = c214619ez;
    }

    @Override // X.BCK
    public final boolean AFf(JSONObject jSONObject) {
        if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) && "onEffectInitilization".equals(jSONObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            return true;
        }
        return false;
    }

    @Override // X.BCK
    public final void CJB(JSONObject jSONObject) {
        String str;
        C214619ez c214619ez = this.A00;
        Integer A04 = c214619ez.A04();
        Integer num = C05F.A00;
        C22990ABp c22990ABp = ((C214899fR) c214619ez).A08;
        if (c22990ABp != null) {
            if (A04 == num) {
                num = C05F.A01;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "onAR3DToggleSwitchStateChanged");
            JSONObject jSONObject3 = new JSONObject();
            if (num.intValue() != 0) {
                str = "AR";
            } else {
                str = "3D";
            }
            jSONObject3.put("newValue", str);
            jSONObject2.put("data", jSONObject3);
            c22990ABp.A00(jSONObject2);
            return;
        }
        C14360o3.A0F("renderProvider");
        throw C00O.createAndThrow();
    }
}
