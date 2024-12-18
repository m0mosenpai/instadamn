package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.F4z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34149F4z {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.FNz, java.lang.Object] */
    public static C34642FNz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("audience_type".equals(A0s)) {
                    obj.A00 = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A05 = A0m;
                } else if ("subtitle".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    obj.A03 = A0m2;
                } else if (AbstractC111324zv.A00(74).equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    obj.A02 = A0m3;
                } else if ("thread_igid".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    obj.A04 = A0m4;
                } else if ("creator_username".equals(A0s)) {
                    String A0m5 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m5, 0);
                    obj.A01 = A0m5;
                } else if (MSV.A00(1608).equals(A0s)) {
                    obj.A07 = c16l.A0d();
                } else if ("is_unread".equals(A0s)) {
                    obj.A06 = c16l.A0d();
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
