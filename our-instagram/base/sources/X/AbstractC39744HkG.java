package X;

import com.instagram.api.schemas.AppInstallCTAInfo;
import java.io.IOException;

/* renamed from: X.HkG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39744HkG {
    public static AppInstallCTAInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("android_package".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ios_content_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("android_package", c16l, "AppInstallCTAInfo");
            } else if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("ios_content_id", c16l, "AppInstallCTAInfo");
            } else {
                return new AppInstallCTAInfo(str, str2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
