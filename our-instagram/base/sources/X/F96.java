package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F96 {
    public static C26000Beo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
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
                } else if ("start".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "end");
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c16l, "TextLink");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("start", c16l, "TextLink");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("end", c16l, "TextLink");
                } else {
                    return new C26000Beo(str, str2, num.intValue(), num2.intValue());
                }
            } else {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "TextLink");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
