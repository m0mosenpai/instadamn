package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.43F, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C43F {
    public static C43G parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("fb_account_creation_time".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_valid".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("link_time".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("profile_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "LinkedFBUserImpl");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "LinkedFBUserImpl");
                } else {
                    return new C43G(num, num2, str, str2, str3, bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("is_valid", "LinkedFBUserImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
