package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Pzj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58671Pzj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.SEs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static C62516SEs A00(C102814kI c102814kI, InterfaceC102764kD interfaceC102764kD, String str) {
        String Ep1;
        C102814kI c102814kI2 = new C102814kI(c102814kI);
        C62516SEs obj = new Object();
        if (interfaceC102764kD.E3x() != C05F.A0C) {
            interfaceC102764kD.EmB();
            obj = 0;
        } else {
            while (interfaceC102764kD.Csy() != C05F.A0N) {
                String E3u = interfaceC102764kD.E3u();
                boolean z = false;
                if (AbstractC102804kH.A00(E3u) >= 32) {
                    z = true;
                }
                interfaceC102764kD.Csy();
                if (!z) {
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(E3u)) {
                        if (interfaceC102764kD.E3y().isNull()) {
                            Ep1 = null;
                        } else {
                            Ep1 = interfaceC102764kD.E3y().Ep1();
                        }
                        obj.A01 = Ep1;
                    } else if ("payload".equals(E3u)) {
                        obj.A00 = AbstractC192958gb.A00(c102814kI2, interfaceC102764kD);
                    }
                }
                interfaceC102764kD.EmB();
            }
        }
        if (str != null) {
            AnonymousClass016.A18(c102814kI2.A03, new String[]{str, obj.A01});
        }
        return obj;
    }
}
