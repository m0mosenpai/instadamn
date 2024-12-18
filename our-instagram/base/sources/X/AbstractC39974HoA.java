package X;

import com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes;
import com.instagram.api.schemas.PartnerTypes;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HoA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39974HoA {
    public static Map A00(C5FV c5fv) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5fv.getAccessToken() != null) {
            A1I.put("accessToken", c5fv.getAccessToken());
        }
        if (c5fv.AXv() != null) {
            A1I.put("accessTokenTTL", c5fv.AXv());
        }
        if (c5fv.AcA() != null) {
            A1I.put("apiKey", c5fv.AcA());
        }
        if (c5fv.Afl() != null) {
            A1I.put("bauProductUrl", c5fv.Afl());
        }
        String str2 = null;
        if (c5fv.AjJ() != null) {
            BuyWithIntegrationPostClickExperienceTypes AjJ = c5fv.AjJ();
            if (AjJ != null) {
                str = AjJ.A00;
            } else {
                str = null;
            }
            A1I.put("buyWithIntegrationPostClickExperienceType", str);
        }
        if (c5fv.BYS() != null) {
            A1I.put("oauthIntegrationId", c5fv.BYS());
        }
        if (c5fv.Bb3() != null) {
            A1I.put("pageName", c5fv.Bb3());
        }
        if (c5fv.Bbc() != null) {
            PartnerTypes Bbc = c5fv.Bbc();
            if (Bbc != null) {
                str2 = Bbc.A00;
            }
            A1I.put("partnerType", str2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
