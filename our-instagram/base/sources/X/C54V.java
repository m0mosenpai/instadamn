package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;
import java.io.IOException;

/* renamed from: X.54V, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C54V {
    public static C1120954b parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            Boolean bool2 = null;
            C9BH c9bh = null;
            DirectAnimatedMediaUser directAnimatedMediaUser = null;
            Boolean bool3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_random".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_sticker".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("images".equals(A0q)) {
                    c9bh = C54W.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    directAnimatedMediaUser = C54Z.parseFromJson(c16l);
                } else if ("is_ai_generated".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "DirectAnimatedMediaResponseItem");
            } else if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_sticker", "DirectAnimatedMediaResponseItem");
            } else {
                return new C1120954b(c9bh, directAnimatedMediaUser, bool2, bool3, str, bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C1120954b c1120954b) {
        anonymousClass182.A0d();
        String str = c1120954b.A04;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        Boolean bool = c1120954b.A03;
        if (bool != null) {
            anonymousClass182.A0T("is_random", bool.booleanValue());
        }
        anonymousClass182.A0T("is_sticker", c1120954b.A05);
        C9BH c9bh = c1120954b.A00;
        if (c9bh != null) {
            anonymousClass182.A0r("images");
            anonymousClass182.A0d();
            GifUrlImpl gifUrlImpl = (GifUrlImpl) c9bh.A00;
            if (gifUrlImpl != null) {
                anonymousClass182.A0r("fixed_height");
                C54X.A00(anonymousClass182, gifUrlImpl);
            }
            anonymousClass182.A0a();
        }
        DirectAnimatedMediaUser directAnimatedMediaUser = c1120954b.A01;
        if (directAnimatedMediaUser != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            anonymousClass182.A0d();
            String str2 = directAnimatedMediaUser.A00;
            if (str2 != null) {
                anonymousClass182.A0S(AbstractC58357Ptx.A01(10, 8, 53), str2);
            }
            anonymousClass182.A0T("is_verified", directAnimatedMediaUser.A01);
            anonymousClass182.A0a();
        }
        Boolean bool2 = c1120954b.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("is_ai_generated", bool2.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
