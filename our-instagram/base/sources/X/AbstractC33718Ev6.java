package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Ev6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33718Ev6 {
    public static E7w parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            HashMap hashMap = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("friendship_status".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            String A1P = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                hashMap.put(A1P, null);
                            } else {
                                Boolean A0d = AbstractC166997dE.A0d(c16l);
                                if (A0d != null) {
                                    hashMap.put(A1P, A0d);
                                }
                            }
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("full_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("profile_pic_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("user_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (hashMap == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("friendship_status", c16l, "MutedUserImpl");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "MutedUserImpl");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("user_name", c16l, "MutedUserImpl");
                } else {
                    return new E7w(str, str2, str3, str4, hashMap);
                }
            } else {
                AbstractC166997dE.A1V("full_name", c16l, "MutedUserImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
