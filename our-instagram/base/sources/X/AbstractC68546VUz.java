package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68546VUz {
    public static C69358Vm4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69358Vm4 c69358Vm4 = new C69358Vm4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("__typename".equals(A0s)) {
                    c69358Vm4.A03 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    c69358Vm4.A00 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    c69358Vm4.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("tag".equals(A0s)) {
                    c69358Vm4.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("url".equals(A0s)) {
                    c69358Vm4.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("android_urls".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c69358Vm4.A05 = arrayList;
                }
                c16l.A0z();
            }
            return c69358Vm4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
