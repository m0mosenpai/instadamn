package X;

import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I3x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40743I3x {
    public static Map A00(ProductLaunchInformation productLaunchInformation) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productLaunchInformation.AzZ() != null) {
            A1I.put(AbstractC111324zv.A00(903), productLaunchInformation.AzZ());
        }
        if (productLaunchInformation.BBz() != null) {
            A1I.put("has_launched", productLaunchInformation.BBz());
        }
        if (productLaunchInformation.CW6() != null) {
            A1I.put(AbstractC111324zv.A00(1046), productLaunchInformation.CW6());
        }
        if (productLaunchInformation.BMJ() != null) {
            A1I.put("launch_date", productLaunchInformation.BMJ());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
