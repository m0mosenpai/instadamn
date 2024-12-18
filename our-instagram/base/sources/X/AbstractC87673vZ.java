package X;

import com.instagram.api.schemas.SponsoredAdsDisclaimerType;
import java.io.IOException;

/* renamed from: X.3vZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87673vZ {
    public static C106594rE parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            SponsoredAdsDisclaimerType sponsoredAdsDisclaimerType = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("bold_style_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("has_bold_style_text".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("label".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("label_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    sponsoredAdsDisclaimerType = (SponsoredAdsDisclaimerType) SponsoredAdsDisclaimerType.A01.get(A1P);
                    if (sponsoredAdsDisclaimerType == null) {
                        sponsoredAdsDisclaimerType = SponsoredAdsDisclaimerType.A05;
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("has_bold_style_text", "SponsoredAdsDisclaimer");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (sponsoredAdsDisclaimerType == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("label_type", "SponsoredAdsDisclaimer");
                } else {
                    return new C106594rE(sponsoredAdsDisclaimerType, str2, str, bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("label", "SponsoredAdsDisclaimer");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
