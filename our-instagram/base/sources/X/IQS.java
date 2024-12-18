package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GuideMediaType;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IQS {
    public static H7P parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            H7O h7o = null;
            GuideMediaType guideMediaType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("content".equals(A0s)) {
                    h7o = I0B.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    guideMediaType = (GuideMediaType) GuideMediaType.A01.get(A1P);
                    if (guideMediaType == null) {
                        guideMediaType = GuideMediaType.A06;
                    }
                }
                c16l.A0z();
            }
            if (h7o == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("content", c16l, "GuideMedia");
            } else if (guideMediaType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c16l, "GuideMedia");
            } else {
                return new H7P(guideMediaType, h7o);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H7P h7p) {
        anonymousClass182.A0d();
        H7O h7o = h7p.A01;
        if (h7o != null) {
            anonymousClass182.A0r("content");
            anonymousClass182.A0d();
            C38321qM c38321qM = h7o.A01;
            if (c38321qM != null) {
                anonymousClass182.A0r("ig_media_content");
                C38801rC c38801rC = C38321qM.A0h;
                C38801rC.A07(anonymousClass182, c38321qM);
            }
            H3V h3v = h7o.A00;
            if (h3v != null) {
                anonymousClass182.A0r("product_image_content");
                anonymousClass182.A0d();
                AbstractC37301Gc2.A1I(anonymousClass182, h3v.A02);
                ProductImageContainer productImageContainer = h3v.A00;
                if (productImageContainer != null) {
                    anonymousClass182.A0r("photo");
                    AbstractC111144zV.A00(anonymousClass182, productImageContainer.F6D());
                }
                ProductDetailsProductItemDict productDetailsProductItemDict = h3v.A01;
                if (productDetailsProductItemDict != null) {
                    anonymousClass182.A0r("product");
                    AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
                }
                String str = h3v.A03;
                if (str != null) {
                    anonymousClass182.A0S("product_id", str);
                }
                String str2 = h3v.A04;
                if (str2 != null) {
                    anonymousClass182.A0S("product_image_id", str2);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        GuideMediaType guideMediaType = h7p.A00;
        if (guideMediaType != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, guideMediaType.A00);
        }
        anonymousClass182.A0a();
    }
}
