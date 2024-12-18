package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.StringTreeSet;
import org.json.JSONObject;

/* renamed from: X.4tE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107694tE implements C15A {
    public static boolean A01;
    public final Context A00;

    @Override // X.C15A
    public final int Bdj() {
        return 1;
    }

    @Override // X.C15A
    public final int Bdk() {
        return 1;
    }

    public final String toString() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, AbstractC58317Pt9.A00(StringTreeSet.MAX_SYMBOL_COUNT));
            jSONObject.put("framework", "BoostFramework");
            if (A01) {
                str = AbstractC111324zv.A00(3276);
            } else {
                str = "";
            }
            jSONObject.put("extra", str);
            jSONObject.put("access", C84193pB.A02.A04());
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public C107694tE(Context context) {
        this.A00 = context;
    }

    @Override // X.C15A
    public final InterfaceC219914z ALj(C15C c15c, C15P c15p) {
        int[] AhH = c15c.AhH(c15p);
        if (AhH.length == 0) {
            return null;
        }
        return new XNF(new C84193pB(this.A00), AhH, c15p.A00);
    }
}
