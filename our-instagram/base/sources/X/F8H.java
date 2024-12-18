package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F8H {
    public static E6L parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            ArrayList arrayList = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ssrcs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Long A0h = AbstractC31173DnH.A0h(c16l);
                            if (A0h != null) {
                                arrayList.add(A0h);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("enabled".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c16l, "MwsMedia");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("ssrcs", c16l, "MwsMedia");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("enabled", c16l, "MwsMedia");
                } else {
                    return new E6L(str, arrayList, num.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "MwsMedia");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
