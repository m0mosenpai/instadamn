package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4NW, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4NW {
    public static C4NP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C4NP c4np = new C4NP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c4np.A00 = str;
                } else if ("parameters".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C94514Ne parseFromJson = AbstractC94504Nd.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c4np.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c4np;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C4NP c4np) {
        anonymousClass182.A0d();
        String str = c4np.A00;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        C16V.A03(anonymousClass182, "parameters");
        for (C94514Ne c94514Ne : c4np.A01) {
            if (c94514Ne != null) {
                AbstractC94504Nd.A00(anonymousClass182, c94514Ne);
            }
        }
        anonymousClass182.A0Z();
        anonymousClass182.A0a();
    }
}
