package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.3wQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88163wQ {
    public static C88173wR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            C84433pm c84433pm = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("data".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("demotion_control".equals(A0q)) {
                    c84433pm = AbstractC84423pj.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("show_icon".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "FollowUpOption");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("text", "FollowUpOption");
                } else {
                    return new C88173wR(c84433pm, str, str2, str3, str4, bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("show_icon", "FollowUpOption");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C88173wR c88173wR) {
        anonymousClass182.A0d();
        String str = c88173wR.A01;
        if (str != null) {
            anonymousClass182.A0S("data", str);
        }
        C84433pm c84433pm = c88173wR.A00;
        if (c84433pm != null) {
            anonymousClass182.A0r("demotion_control");
            AbstractC84423pj.A00(anonymousClass182, c84433pm);
        }
        String str2 = c88173wR.A02;
        if (str2 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        anonymousClass182.A0T("show_icon", c88173wR.A05);
        String str3 = c88173wR.A03;
        if (str3 != null) {
            anonymousClass182.A0S("style", str3);
        }
        String str4 = c88173wR.A04;
        if (str4 != null) {
            anonymousClass182.A0S("text", str4);
        }
        anonymousClass182.A0a();
    }
}
