package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FWw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34839FWw {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.FPs] */
    public static FPs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                A00(c16l, obj, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C16L c16l, FPs fPs, String str) {
        ArrayList arrayList = null;
        if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(str)) {
            String A0m = AbstractC167017dG.A0m(c16l);
            C14360o3.A0B(A0m, 0);
            fPs.A00 = A0m;
            return;
        }
        if (AbstractC31171DnF.A1a(str)) {
            String A0m2 = AbstractC167017dG.A0m(c16l);
            C14360o3.A0B(A0m2, 0);
            fPs.A01 = A0m2;
        } else {
            if (!AbstractC111324zv.A00(1318).equals(str)) {
                return;
            }
            if (c16l.A11() == C16R.A0C) {
                arrayList = AbstractC166987dD.A1E();
                while (c16l.A1J() != C16R.A08) {
                    C47L parseFromJson = I0Y.parseFromJson(c16l);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            C14360o3.A0B(arrayList, 0);
            fPs.A02 = arrayList;
        }
    }
}
