package X;

import com.instagram.api.schemas.ProfileBannerType;
import java.io.IOException;

/* renamed from: X.EvK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33732EvK {
    public static E84 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ProfileBannerType profileBannerType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("banner_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("banner_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    profileBannerType = (ProfileBannerType) ProfileBannerType.A01.get(A1P);
                    if (profileBannerType == null) {
                        profileBannerType = ProfileBannerType.A0F;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("banner_id", c16l, "ProfileBannerInfo");
            } else if (profileBannerType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("banner_type", c16l, "ProfileBannerInfo");
            } else {
                return new E84(profileBannerType, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
