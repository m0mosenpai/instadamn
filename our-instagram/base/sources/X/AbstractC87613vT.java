package X;

import com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes;
import com.instagram.api.schemas.PartnerTypes;
import java.io.IOException;

/* renamed from: X.3vT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87613vT {
    public static C38714H3b parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            BuyWithIntegrationPostClickExperienceTypes buyWithIntegrationPostClickExperienceTypes = null;
            Long l = null;
            String str4 = null;
            PartnerTypes partnerTypes = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("accessToken".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("accessTokenTTL".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
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
                } else if (AbstractC111324zv.A00(4046).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    buyWithIntegrationPostClickExperienceTypes = (BuyWithIntegrationPostClickExperienceTypes) BuyWithIntegrationPostClickExperienceTypes.A01.get(A1P2);
                    if (buyWithIntegrationPostClickExperienceTypes == null) {
                        buyWithIntegrationPostClickExperienceTypes = BuyWithIntegrationPostClickExperienceTypes.A08;
                    }
                } else if (AbstractC58317Pt9.A00(891).equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("pageName".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("partnerType".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    partnerTypes = (PartnerTypes) PartnerTypes.A01.get(A1P);
                    if (partnerTypes == null) {
                        partnerTypes = PartnerTypes.A07;
                    }
                }
                c16l.A0z();
            }
            return new C38714H3b(buyWithIntegrationPostClickExperienceTypes, partnerTypes, num, l, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
