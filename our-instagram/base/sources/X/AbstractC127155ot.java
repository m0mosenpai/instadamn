package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.5ot, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127155ot {
    public static C127165ou parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C127165ou c127165ou = new C127165ou();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    String str = null;
                    String str2 = null;
                    HashMap hashMap = null;
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c127165ou.A01 = str2;
                    } else if ("scores".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    Double valueOf = Double.valueOf(c16l.A0U());
                                    if (valueOf != null) {
                                        hashMap2.put(A1P, valueOf);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        c127165ou.A03 = hashMap;
                    } else if ("rank_token".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c127165ou.A02 = str;
                    } else if ("ttl_secs".equals(A0q)) {
                        c127165ou.A00 = c16l.A0y();
                    }
                    c16l.A0z();
                } else {
                    return c127165ou;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
