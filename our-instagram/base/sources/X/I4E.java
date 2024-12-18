package X;

import com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I4E {
    public static Map A00(ShoppingIncentiveMetadataIntf shoppingIncentiveMetadataIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (shoppingIncentiveMetadataIntf.BHK() != null) {
            A1I.put("incentive_id", shoppingIncentiveMetadataIntf.BHK());
        }
        if (shoppingIncentiveMetadataIntf.BSZ() != null) {
            A1I.put("merchant_id", shoppingIncentiveMetadataIntf.BSZ());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
