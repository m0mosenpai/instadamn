package X;

import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict;
import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hnx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39968Hnx {
    public static Map A00(IGAdCreationOptimizationPayloadDict iGAdCreationOptimizationPayloadDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGAdCreationOptimizationPayloadDict.AZ8() != null) {
            List<IGAdCreativeOptimizationConfigByTypeDict> AZ8 = iGAdCreationOptimizationPayloadDict.AZ8();
            ArrayList arrayList = null;
            if (AZ8 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (IGAdCreativeOptimizationConfigByTypeDict iGAdCreativeOptimizationConfigByTypeDict : AZ8) {
                    if (iGAdCreativeOptimizationConfigByTypeDict != null) {
                        arrayList.add(iGAdCreativeOptimizationConfigByTypeDict.F7o());
                    }
                }
            }
            A1I.put("adCreativeOptimizationConfigByType", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
