package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class XMG implements C15A {
    public static boolean A01;
    public final Context A00;

    @Override // X.C15A
    public final int Bdj() {
        return 8;
    }

    @Override // X.C15A
    public final int Bdk() {
        return 1;
    }

    public final String toString() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "qualcomm");
            jSONObject.put("framework", "QPerformance");
            if (A01) {
                str = AbstractC111324zv.A00(3276);
            } else {
                str = "";
            }
            jSONObject.put("extra", str);
            jSONObject.put("access", C84213pD.A03.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public XMG(Context context) {
        this.A00 = context;
    }

    @Override // X.C15A
    public final InterfaceC219914z ALj(C15C c15c, C15P c15p) {
        int[] AhH = c15c.AhH(c15p);
        if (AhH.length == 0) {
            return null;
        }
        return new C72195XVp(new C84213pD(this.A00), AhH, c15p.A00);
    }
}
