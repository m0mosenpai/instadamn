package X;

import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.api.schemas.ProfilePicture;
import com.instagram.api.schemas.ProfilePictureImpl;
import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;

/* renamed from: X.4HY, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4HY {
    public static AttributionUserImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            ProfilePictureImpl profilePictureImpl = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("instagram_user_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_verified".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("profile_picture".equals(A0q)) {
                    profilePictureImpl = C4HZ.parseFromJson(c16l);
                } else if (AbstractC37309GcB.A00().equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new AttributionUserImpl(profilePictureImpl, bool, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AttributionUserImpl attributionUserImpl) {
        anonymousClass182.A0d();
        String str = attributionUserImpl.A02;
        if (str != null) {
            anonymousClass182.A0S("instagram_user_id", str);
        }
        Boolean bool = attributionUserImpl.A01;
        if (bool != null) {
            anonymousClass182.A0T("is_verified", bool.booleanValue());
        }
        ProfilePicture profilePicture = attributionUserImpl.A00;
        if (profilePicture != null) {
            anonymousClass182.A0r("profile_picture");
            ProfilePictureImpl Eyg = profilePicture.Eyg();
            anonymousClass182.A0d();
            ImageUrl imageUrl = Eyg.A00;
            if (imageUrl != null) {
                anonymousClass182.A0r("uri");
                AbstractC222616c.A01(anonymousClass182, imageUrl);
            }
            anonymousClass182.A0a();
        }
        String str2 = attributionUserImpl.A03;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC37309GcB.A00(), str2);
        }
        anonymousClass182.A0a();
    }
}
