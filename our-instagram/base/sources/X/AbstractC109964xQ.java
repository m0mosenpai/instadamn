package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.4xQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109964xQ {
    public static C109974xR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("bio".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("biography".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("content_empty".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_anonymous_profile_picture".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_profile_picture_same".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("profile_picture_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("selected_audience_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("biography", "OpalInfo");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (bool2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_anonymous_profile_picture", "OpalInfo");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_profile_picture_same", "OpalInfo");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("selected_audience_count", "OpalInfo");
                } else {
                    return new C109974xR(num.intValue(), str, str2, str3, str4, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("content_empty", "OpalInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C109974xR c109974xR) {
        anonymousClass182.A0d();
        String str = c109974xR.A01;
        if (str != null) {
            anonymousClass182.A0S("bio", str);
        }
        String str2 = c109974xR.A02;
        if (str2 != null) {
            anonymousClass182.A0S("biography", str2);
        }
        anonymousClass182.A0T("content_empty", c109974xR.A05);
        anonymousClass182.A0T("is_anonymous_profile_picture", c109974xR.A06);
        anonymousClass182.A0T("is_profile_picture_same", c109974xR.A07);
        String str3 = c109974xR.A03;
        if (str3 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
        }
        String str4 = c109974xR.A04;
        if (str4 != null) {
            anonymousClass182.A0S("profile_picture_url", str4);
        }
        anonymousClass182.A0Q("selected_audience_count", c109974xR.A00);
        anonymousClass182.A0a();
    }
}
