package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I0o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40656I0o {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.IMm] */
    public static C41221IMm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("pk".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A01 = A0m;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    User A0S = AbstractC31171DnF.A0S(c16l, false);
                    C14360o3.A0B(A0S, 0);
                    obj.A00 = A0S;
                } else if ("image_urls".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    obj.A02 = arrayList;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
