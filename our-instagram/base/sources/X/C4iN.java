package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.samsung.android.os.SemPerfManager;
import org.json.JSONObject;

/* renamed from: X.4iN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4iN implements C15A {
    public static boolean A00;

    @Override // X.C15A
    public final int Bdj() {
        return 3;
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
            jSONObject.put("framework", "SemPerfManager");
            if (A00) {
                str = MSV.A00(245);
            } else {
                str = "";
            }
            jSONObject.put("extra", str);
            jSONObject.put("access", C15L.A01.A04());
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
        final boolean z = false;
        if (AhH[0] > 50 && A00) {
            z = true;
        }
        final int i = c15p.A00;
        return new AbstractC99974eJ(i, z) { // from class: X.4iO
            public final boolean A00;

            @Override // X.AbstractC219814y
            public final void A04() {
                if (this.A00) {
                    SemPerfManager.onSmoothScrollEvent(false);
                } else {
                    SemPerfManager.onScrollEvent(false);
                }
            }

            @Override // X.AbstractC219814y
            public final boolean A05() {
                if (this.A00) {
                    SemPerfManager.onSmoothScrollEvent(true);
                    return true;
                }
                SemPerfManager.onScrollEvent(true);
                return true;
            }

            {
                this.A00 = z;
            }
        };
    }
}
