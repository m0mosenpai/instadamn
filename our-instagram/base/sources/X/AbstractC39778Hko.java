package X;

import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hko, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39778Hko {
    public static Map A00(BrandedContentGatingCountryMinimumAge brandedContentGatingCountryMinimumAge) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (brandedContentGatingCountryMinimumAge.As9() != null) {
            A1I.put("country_code", brandedContentGatingCountryMinimumAge.As9());
        }
        if (brandedContentGatingCountryMinimumAge.BU7() != null) {
            A1I.put("minimum_age", brandedContentGatingCountryMinimumAge.BU7());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
