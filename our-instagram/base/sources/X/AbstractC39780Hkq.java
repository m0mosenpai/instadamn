package X;

import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hkq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39780Hkq {
    public static Map A00(BrandedContentGatingInfoIntf brandedContentGatingInfoIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Map As6 = brandedContentGatingInfoIntf.As6();
        if (As6 != null) {
            A1I.put("country_age_data", As6);
        }
        if (brandedContentGatingInfoIntf.As7() != null) {
            List<BrandedContentGatingCountryMinimumAge> As7 = brandedContentGatingInfoIntf.As7();
            ArrayList arrayList = null;
            if (As7 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (BrandedContentGatingCountryMinimumAge brandedContentGatingCountryMinimumAge : As7) {
                    if (brandedContentGatingCountryMinimumAge != null) {
                        arrayList.add(brandedContentGatingCountryMinimumAge.F7o());
                    }
                }
            }
            A1I.put("country_age_list", arrayList);
        }
        if (brandedContentGatingInfoIntf.As8() != null) {
            A1I.put("country_block_data", brandedContentGatingInfoIntf.As8());
        }
        if (brandedContentGatingInfoIntf.AwA() != null) {
            A1I.put("default_age", brandedContentGatingInfoIntf.AwA());
        }
        if (brandedContentGatingInfoIntf.BsW() != null) {
            A1I.put("selected_category", brandedContentGatingInfoIntf.BsW());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
