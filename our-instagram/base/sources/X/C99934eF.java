package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.4eF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99934eF implements C15A {
    @Override // X.C15A
    public final int Bdj() {
        return 6;
    }

    @Override // X.C15A
    public final int Bdk() {
        return 8;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "huawei");
            jSONObject.put("framework", "UniPerf");
            jSONObject.put("extra", "");
            jSONObject.put("access", C99924eE.A02.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // X.C15A
    public final InterfaceC219914z ALj(C15C c15c, C15P c15p) {
        final int[] AhH = c15c.AhH(c15p);
        if (AhH.length == 0) {
            return null;
        }
        int i = 4112;
        if (AhH[0] >= 90) {
            i = 4099;
        }
        AhH[0] = i;
        final C99924eE c99924eE = new C99924eE();
        final int i2 = c15p.A00;
        return new AbstractC99974eJ(c99924eE, AhH, i2) { // from class: X.4eI
            public final C99924eE A00;

            @Override // X.AbstractC219814y
            public final void A04() {
                this.A00.A00(((AbstractC99974eJ) this).A00[0], -1);
            }

            @Override // X.AbstractC219814y
            public final boolean A05() {
                if (this.A00.A00(((AbstractC99974eJ) this).A00[0], this.A05) < 0) {
                    return false;
                }
                return true;
            }

            {
                super(i2, AhH);
                this.A00 = c99924eE;
            }
        };
    }
}
