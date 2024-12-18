package X;

import com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes;
import java.io.IOException;

/* renamed from: X.3vU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87623vU {
    public static C38715H3c parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            IGBuyWithPrimeExperienceTypes iGBuyWithPrimeExperienceTypes = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("accessToken".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("accessTokenCreationTime".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("accessTokenTTL".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("apiKey".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("bauProductUrl".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("buyWithPrimeExperienceType".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGBuyWithPrimeExperienceTypes = (IGBuyWithPrimeExperienceTypes) IGBuyWithPrimeExperienceTypes.A01.get(A1P);
                    if (iGBuyWithPrimeExperienceTypes == null) {
                        iGBuyWithPrimeExperienceTypes = IGBuyWithPrimeExperienceTypes.A06;
                    }
                } else if ("clientID".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("pageName".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38715H3c(iGBuyWithPrimeExperienceTypes, num, num2, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
