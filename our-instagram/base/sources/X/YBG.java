package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class YBG implements C15A {
    @Override // X.C15A
    public final int Bdj() {
        return 7;
    }

    @Override // X.C15A
    public final int Bdk() {
        return 8;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "huawei");
            jSONObject.put("framework", "PerfHub");
            jSONObject.put("extra", "");
            jSONObject.put("access", Y0x.A02.A04());
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
        int i = 8;
        if (AhH[0] >= 90) {
            i = 4;
        }
        AhH[0] = i;
        return new C72193XVn(new Y0x(), AhH, c15p.A00);
    }
}
