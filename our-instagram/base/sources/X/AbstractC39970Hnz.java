package X;

import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hnz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39970Hnz {
    public static Map A00(IGAdCreativeOptimizationConfigByTypeDict iGAdCreativeOptimizationConfigByTypeDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGAdCreativeOptimizationConfigByTypeDict.BZJ() != null) {
            A1I.put("optimizationType", iGAdCreativeOptimizationConfigByTypeDict.BZJ());
        }
        if (iGAdCreativeOptimizationConfigByTypeDict.BZM() != null) {
            A1I.put("optionValue", iGAdCreativeOptimizationConfigByTypeDict.BZM());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
