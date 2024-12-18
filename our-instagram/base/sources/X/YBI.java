package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class YBI implements C15A {
    public static boolean A00;

    @Override // X.C15A
    public final int Bdj() {
        return 4;
    }

    @Override // X.C15A
    public final int Bdk() {
        return 2;
    }

    public final String toString() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, MSV.A00(561));
            jSONObject.put("framework", "DVFSHelper");
            if (A00) {
                str = MSV.A00(245);
            } else {
                str = "";
            }
            jSONObject.put("extra", str);
            jSONObject.put("access", C15O.A01.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.15O, java.lang.Object] */
    @Override // X.C15A
    public final InterfaceC219914z ALj(C15C c15c, C15P c15p) {
        int[] AhH = c15c.AhH(c15p);
        if (AhH.length == 0) {
            return null;
        }
        boolean z = false;
        if (AhH[0] > 50 && A00) {
            z = true;
        }
        return new C72197XVr(new Object(), c15p.A00, z);
    }
}
