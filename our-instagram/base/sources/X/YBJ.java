package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class YBJ implements C15A {
    public static boolean A00;

    private int A00(C919349x c919349x, int[] iArr, int i) {
        if (i != 3) {
            try {
                int length = iArr.length;
                if (length == 4) {
                    if (A00) {
                        return c919349x.A03(iArr[0], iArr[1], iArr[2], iArr[3]);
                    }
                } else if (length == 2) {
                    return c919349x.A02(iArr[0], iArr[1]);
                }
            } catch (UnsatisfiedLinkError unused) {
                return A00(c919349x, iArr, i + 1);
            }
        }
        return -1;
    }

    @Override // X.C15A
    public final int Bdj() {
        return 5;
    }

    @Override // X.C15A
    public final int Bdk() {
        return 4;
    }

    public final String toString() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, MSV.A00(513));
            jSONObject.put("framework", "PerfService");
            if (A00) {
                str = "BL";
            } else {
                str = "";
            }
            jSONObject.put("extra", str);
            jSONObject.put("access", C919349x.A02.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // X.C15A
    public final InterfaceC219914z ALj(C15C c15c, C15P c15p) {
        C919349x c919349x;
        int A002;
        int[] AhH = c15c.AhH(c15p);
        if (AhH.length < 2 || (A002 = A00((c919349x = new C919349x()), AhH, 0)) < 0) {
            return null;
        }
        return new C72196XVq(c919349x, AhH, c15p.A00, A002);
    }
}
