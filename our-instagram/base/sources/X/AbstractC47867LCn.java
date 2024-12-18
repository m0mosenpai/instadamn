package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;
import java.io.IOException;

/* renamed from: X.LCn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47867LCn {
    public static DirectAnimatedMedia parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            GifUrlImpl gifUrlImpl = null;
            Boolean bool2 = null;
            DirectAnimatedMediaUser directAnimatedMediaUser = null;
            Boolean bool3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("gif_url".equals(A0s)) {
                    gifUrlImpl = C54X.parseFromJson(c16l);
                } else if ("is_random".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("is_sticker".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    directAnimatedMediaUser = C54Z.parseFromJson(c16l);
                } else {
                    bool3 = AbstractC37303Gc4.A0K(c16l, bool3, A0s, AbstractC111324zv.A00(1031));
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "DirectAnimatedMedia");
            } else if (gifUrlImpl != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_sticker", c16l, "DirectAnimatedMedia");
                } else {
                    return new DirectAnimatedMedia(directAnimatedMediaUser, gifUrlImpl, bool2, bool3, str, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("gif_url", c16l, "DirectAnimatedMedia");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, DirectAnimatedMedia directAnimatedMedia) {
        anonymousClass182.A0d();
        String str = directAnimatedMedia.A05;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        if (gifUrlImpl != null) {
            anonymousClass182.A0r("gif_url");
            C54X.A00(anonymousClass182, gifUrlImpl);
        }
        Boolean bool = directAnimatedMedia.A04;
        if (bool != null) {
            anonymousClass182.A0T("is_random", bool.booleanValue());
        }
        anonymousClass182.A0T("is_sticker", directAnimatedMedia.A06);
        DirectAnimatedMediaUser directAnimatedMediaUser = directAnimatedMedia.A01;
        if (directAnimatedMediaUser != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            anonymousClass182.A0d();
            String str2 = directAnimatedMediaUser.A00;
            if (str2 != null) {
                anonymousClass182.A0S(AbstractC58357Ptx.A00(), str2);
            }
            anonymousClass182.A0T("is_verified", directAnimatedMediaUser.A01);
            anonymousClass182.A0a();
        }
        Boolean bool2 = directAnimatedMedia.A03;
        if (bool2 != null) {
            anonymousClass182.A0T(AbstractC111324zv.A00(1031), bool2.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
