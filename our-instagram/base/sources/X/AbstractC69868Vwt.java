package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Vwt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69868Vwt {
    public static C109874xF parseFromJson(C16L c16l) {
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
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("icon_glyph".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("icon_type".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("src".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C109874xF(num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C109874xF c109874xF) {
        anonymousClass182.A0d();
        Integer num = c109874xF.A00;
        if (num != null) {
            anonymousClass182.A0Q("icon_glyph", num.intValue());
        }
        Integer num2 = c109874xF.A01;
        if (num2 != null) {
            anonymousClass182.A0Q("icon_type", num2.intValue());
        }
        String str = c109874xF.A02;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        String str2 = c109874xF.A03;
        if (str2 != null) {
            anonymousClass182.A0S("src", str2);
        }
        anonymousClass182.A0a();
    }
}
