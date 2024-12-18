package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.4mR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4mR implements C15A {
    @Override // X.C15A
    public final int Bdj() {
        return 10;
    }

    @Override // X.C15A
    public final int Bdk() {
        return 4;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mediatek");
            jSONObject.put("framework", "PowerHalMgr");
            jSONObject.put("extra", "");
            jSONObject.put("access", C49y.A03.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // X.C15A
    public final InterfaceC219914z ALj(C15C c15c, C15P c15p) {
        C49y c49y;
        int A00;
        int[] AhH = c15c.AhH(c15p);
        int length = AhH.length;
        if (length < 2 || (A00 = (c49y = new C49y()).A00()) == -1) {
            return null;
        }
        if (length == 4) {
            c49y.A03(A00, 1, 1, AhH[0]);
            c49y.A03(A00, 3, 1, AhH[1]);
            c49y.A03(A00, 1, 0, AhH[2]);
            c49y.A03(A00, 3, 0, AhH[3]);
        } else {
            if (length != 2) {
                return null;
            }
            c49y.A03(A00, 1, 0, AhH[0]);
            c49y.A03(A00, 3, 0, AhH[1]);
        }
        return new XNU(c49y, AhH, c15p.A00, A00);
    }
}
