package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.VzB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69991VzB {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Uz4, X.1um, X.1ul] */
    public static C67831Uz4 parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    int A1D = c16l.A1D();
                    Integer[] A00 = C05F.A00(6);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (VXW.A00(num) == A1D) {
                                break;
                            }
                            i++;
                        } else {
                            num = null;
                            break;
                        }
                    }
                    c40791um.A01 = num;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A0s)) {
                    c40791um.A00 = AbstractC68599VXa.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
