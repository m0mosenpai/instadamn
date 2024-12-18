package X;

import com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class HoB {
    public static Map A00(C5FW c5fw) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5fw.getAccessToken() != null) {
            A1I.put("accessToken", c5fw.getAccessToken());
        }
        if (c5fw.AXu() != null) {
            A1I.put("accessTokenCreationTime", c5fw.AXu());
        }
        if (c5fw.AXv() != null) {
            A1I.put("accessTokenTTL", c5fw.AXv());
        }
        if (c5fw.AcA() != null) {
            A1I.put("apiKey", c5fw.AcA());
        }
        if (c5fw.Afl() != null) {
            A1I.put("bauProductUrl", c5fw.Afl());
        }
        if (c5fw.AjL() != null) {
            IGBuyWithPrimeExperienceTypes AjL = c5fw.AjL();
            if (AjL != null) {
                str = AjL.A00;
            } else {
                str = null;
            }
            A1I.put("buyWithPrimeExperienceType", str);
        }
        if (c5fw.Anw() != null) {
            A1I.put("clientID", c5fw.Anw());
        }
        if (c5fw.Bb3() != null) {
            A1I.put("pageName", c5fw.Bb3());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
