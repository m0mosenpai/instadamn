package X;

import com.instagram.api.schemas.GenAIPersonaBannerDict;
import com.instagram.api.schemas.GenAIPersonaBannersResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HnU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39939HnU {
    public static Map A00(GenAIPersonaBannersResponse genAIPersonaBannersResponse) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (genAIPersonaBannersResponse.AfW() != null) {
            List<GenAIPersonaBannerDict> AfW = genAIPersonaBannersResponse.AfW();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (GenAIPersonaBannerDict genAIPersonaBannerDict : AfW) {
                if (genAIPersonaBannerDict != null) {
                    A1E.add(genAIPersonaBannerDict.F7o());
                }
            }
            A1I.put("banners", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
