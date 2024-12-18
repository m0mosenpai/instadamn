package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.IRr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41346IRr {
    public static C38561qk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(221).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("image_url", c16l, "RingGlyph");
            } else if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "RingGlyph");
            } else {
                return new C38561qk(str, str3, str2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38561qk c38561qk, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        String str = c38561qk.A00;
        if (str != null) {
            anonymousClass182.A0S("image_url", str);
        }
        String str2 = c38561qk.A01;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(221), str2);
        }
        String str3 = c38561qk.A02;
        if (str3 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
