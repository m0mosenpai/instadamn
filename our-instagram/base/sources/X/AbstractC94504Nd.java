package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.4Nd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC94504Nd {
    public static C94514Ne parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C94514Ne c94514Ne = new C94514Ne();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                String str2 = null;
                Integer num = null;
                Boolean valueOf = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    C14360o3.A0B(str2, 0);
                    c94514Ne.A02 = str2;
                } else if ("required".equals(A0q)) {
                    c94514Ne.A04 = c16l.A0d();
                } else if ("int_value".equals(A0q)) {
                    if (c16l.A11() == C16R.A0I) {
                        num = Integer.valueOf(c16l.A1D());
                    }
                    c94514Ne.A01 = num;
                } else if ("bool_value".equals(A0q)) {
                    C16R A11 = c16l.A11();
                    if (A11 == C16R.A0K || A11 == C16R.A0F) {
                        valueOf = Boolean.valueOf(c16l.A0d());
                    }
                    c94514Ne.A00 = valueOf;
                } else if ("string_value".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c94514Ne.A03 = str;
                }
                c16l.A0z();
            }
            return c94514Ne;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C94514Ne c94514Ne) {
        anonymousClass182.A0d();
        String str = c94514Ne.A02;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        anonymousClass182.A0T("required", c94514Ne.A04);
        Integer num = c94514Ne.A01;
        if (num != null) {
            anonymousClass182.A0Q("int_value", num.intValue());
        }
        Boolean bool = c94514Ne.A00;
        if (bool != null) {
            anonymousClass182.A0T("bool_value", bool.booleanValue());
        }
        String str2 = c94514Ne.A03;
        if (str2 != null) {
            anonymousClass182.A0S("string_value", str2);
        }
        anonymousClass182.A0a();
    }
}
