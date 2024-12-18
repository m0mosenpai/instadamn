package X;

import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponseImpl;
import java.io.IOException;

/* renamed from: X.3XM, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3XM {
    public static FanClubFanConsiderationPageFeatureEligibilityResponseImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("should_show_content_preview".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("should_show_social_context".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("should_show_content_preview", "FanClubFanConsiderationPageFeatureEligibilityResponseImpl");
            } else if (bool2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("should_show_social_context", "FanClubFanConsiderationPageFeatureEligibilityResponseImpl");
            } else {
                return new FanClubFanConsiderationPageFeatureEligibilityResponseImpl(bool.booleanValue(), bool2.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
