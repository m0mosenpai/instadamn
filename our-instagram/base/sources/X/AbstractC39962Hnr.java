package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Hnr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39962Hnr {
    public static H3W parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(472);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("follower_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("hallpass_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("color", c16l, "Hallpass");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("hallpass_id", c16l, "Hallpass");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "Hallpass");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "Hallpass");
                } else {
                    return new H3W(str, num.intValue(), str2, num2.intValue(), str3);
                }
            } else {
                AbstractC166997dE.A1V("follower_count", c16l, "Hallpass");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
