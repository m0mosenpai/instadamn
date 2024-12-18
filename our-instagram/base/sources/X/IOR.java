package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IOR {
    public static H46 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            String str5 = null;
            String str6 = null;
            Float f3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collection_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("effect_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("effect_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("facebook_places_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("is_collected".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("lat".equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if ("lng".equals(A0s)) {
                    f2 = AbstractC167007dF.A0b(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("placement_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("radius".equals(A0s)) {
                    f3 = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            if (f == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("lat", c16l, "LocationCoordinates");
            } else if (f2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("lng", c16l, "LocationCoordinates");
            } else {
                return new H46(bool, f3, str, str2, str3, str4, str5, str6, f.floatValue(), f2.floatValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H46 h46) {
        anonymousClass182.A0d();
        String str = h46.A04;
        if (str != null) {
            anonymousClass182.A0S("collection_id", str);
        }
        String str2 = h46.A05;
        if (str2 != null) {
            anonymousClass182.A0S("effect_id", str2);
        }
        String str3 = h46.A06;
        if (str3 != null) {
            anonymousClass182.A0S("effect_type", str3);
        }
        String str4 = h46.A07;
        if (str4 != null) {
            anonymousClass182.A0S("facebook_places_id", str4);
        }
        Boolean bool = h46.A02;
        if (bool != null) {
            anonymousClass182.A0T("is_collected", bool.booleanValue());
        }
        anonymousClass182.A0P("lat", h46.A00);
        anonymousClass182.A0P("lng", h46.A01);
        String str5 = h46.A08;
        if (str5 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str5);
        }
        String str6 = h46.A09;
        if (str6 != null) {
            anonymousClass182.A0S("placement_id", str6);
        }
        Float f = h46.A03;
        if (f != null) {
            anonymousClass182.A0P("radius", f.floatValue());
        }
        anonymousClass182.A0a();
    }
}
