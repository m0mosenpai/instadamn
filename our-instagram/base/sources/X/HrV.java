package X;

import com.instagram.api.schemas.ProductAffiliateInformationDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class HrV {
    public static Map A00(ProductAffiliateInformationDict productAffiliateInformationDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productAffiliateInformationDict.AaM() != null) {
            A1I.put("affiliate_campaign_id", productAffiliateInformationDict.AaM());
        }
        if (productAffiliateInformationDict.Aps() != null) {
            A1I.put(AbstractC111324zv.A00(835), productAffiliateInformationDict.Aps());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
