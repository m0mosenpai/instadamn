package X;

import com.instagram.api.schemas.IGBWPExperienceTypes;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ho8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39973Ho8 {
    public static Map A00(IGBWPIABPostClickDataExtensionDict iGBWPIABPostClickDataExtensionDict) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGBWPIABPostClickDataExtensionDict.getAccessToken() != null) {
            A1I.put("accessToken", iGBWPIABPostClickDataExtensionDict.getAccessToken());
        }
        if (iGBWPIABPostClickDataExtensionDict.AXu() != null) {
            A1I.put("accessTokenCreationTime", iGBWPIABPostClickDataExtensionDict.AXu());
        }
        if (iGBWPIABPostClickDataExtensionDict.AXv() != null) {
            A1I.put("accessTokenTTL", iGBWPIABPostClickDataExtensionDict.AXv());
        }
        if (iGBWPIABPostClickDataExtensionDict.AcA() != null) {
            A1I.put("apiKey", iGBWPIABPostClickDataExtensionDict.AcA());
        }
        if (iGBWPIABPostClickDataExtensionDict.Afl() != null) {
            A1I.put("bauProductUrl", iGBWPIABPostClickDataExtensionDict.Afl());
        }
        if (iGBWPIABPostClickDataExtensionDict.AjK() != null) {
            IGBWPExperienceTypes AjK = iGBWPIABPostClickDataExtensionDict.AjK();
            if (AjK != null) {
                str = AjK.A00;
            } else {
                str = null;
            }
            A1I.put("buyWithPrimeExperienceType", str);
        }
        if (iGBWPIABPostClickDataExtensionDict.Anw() != null) {
            A1I.put("clientID", iGBWPIABPostClickDataExtensionDict.Anw());
        }
        if (iGBWPIABPostClickDataExtensionDict.Bb3() != null) {
            A1I.put("pageName", iGBWPIABPostClickDataExtensionDict.Bb3());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
