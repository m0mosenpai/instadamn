package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.mediasize.ImageInfoImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IOX {
    public static C38231qD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            ImageInfoImpl imageInfoImpl = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("expiring_at".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("image_versions2".equals(A0s)) {
                    imageInfoImpl = AbstractC39101rj.parseFromJson(c16l);
                } else if ("media_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("preview".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("expiring_at", c16l, "MediaPreviewClientDictImpl");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (imageInfoImpl == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("image_versions2", c16l, "MediaPreviewClientDictImpl");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("media_type", c16l, "MediaPreviewClientDictImpl");
                } else {
                    return new C38231qD(imageInfoImpl, str, str2, str3, l.longValue());
                }
            } else {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "MediaPreviewClientDictImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38231qD c38231qD) {
        anonymousClass182.A0d();
        anonymousClass182.A0R("expiring_at", c38231qD.A00);
        AbstractC37301Gc2.A1D(anonymousClass182, c38231qD.A02);
        AbstractC37303Gc4.A13(anonymousClass182, c38231qD.A01);
        AbstractC37301Gc2.A1G(anonymousClass182, c38231qD.A03);
        String str = c38231qD.A04;
        if (str != null) {
            anonymousClass182.A0S("preview", str);
        }
        anonymousClass182.A0a();
    }
}
