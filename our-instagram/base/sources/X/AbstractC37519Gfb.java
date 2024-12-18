package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.venue.LocationDict;
import java.io.IOException;

/* renamed from: X.Gfb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37519Gfb {
    public static C38471qb parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            Float f2 = null;
            LocationDict locationDict = null;
            String str2 = null;
            String str3 = null;
            SimpleImageUrl simpleImageUrl = null;
            String str4 = null;
            String str5 = null;
            MultiAuthorStoryType multiAuthorStoryType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("challenge_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("lat".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("lng".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if ("location_dict".equals(A0q)) {
                    locationDict = AbstractC84373pU.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("pk".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("profile_pic_url".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("profile_pic_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("short_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    multiAuthorStoryType = (MultiAuthorStoryType) MultiAuthorStoryType.A01.get(A1P);
                    if (multiAuthorStoryType == null) {
                        multiAuthorStoryType = MultiAuthorStoryType.A0Y;
                    }
                }
                c16l.A0z();
            }
            if (str3 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("pk", c16l, "ReelMasOwnerClientDict");
                throw C00O.createAndThrow();
            }
            return new C38471qb(multiAuthorStoryType, simpleImageUrl, locationDict, f, f2, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38471qb c38471qb) {
        anonymousClass182.A0d();
        String str = c38471qb.A05;
        if (str != null) {
            anonymousClass182.A0S("challenge_id", str);
        }
        Float f = c38471qb.A03;
        if (f != null) {
            anonymousClass182.A0P("lat", f.floatValue());
        }
        Float f2 = c38471qb.A04;
        if (f2 != null) {
            anonymousClass182.A0P("lng", f2.floatValue());
        }
        LocationDict locationDict = c38471qb.A02;
        if (locationDict != null) {
            anonymousClass182.A0r("location_dict");
            AbstractC84373pU.A00(anonymousClass182, locationDict);
        }
        String str2 = c38471qb.A06;
        if (str2 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        }
        String str3 = c38471qb.A07;
        if (str3 != null) {
            anonymousClass182.A0S("pk", str3);
        }
        ImageUrl imageUrl = c38471qb.A01;
        if (imageUrl != null) {
            anonymousClass182.A0r("profile_pic_url");
            AbstractC222616c.A01(anonymousClass182, imageUrl);
        }
        String str4 = c38471qb.A08;
        if (str4 != null) {
            anonymousClass182.A0S("profile_pic_username", str4);
        }
        String str5 = c38471qb.A09;
        if (str5 != null) {
            anonymousClass182.A0S("short_name", str5);
        }
        MultiAuthorStoryType multiAuthorStoryType = c38471qb.A00;
        if (multiAuthorStoryType != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, multiAuthorStoryType.A00);
        }
        anonymousClass182.A0a();
    }
}
