package X;

import com.instagram.api.schemas.GenAIPersonaBannerDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HnS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39937HnS {
    public static Map A00(GenAIPersonaBannerDict genAIPersonaBannerDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (genAIPersonaBannerDict.BG4() != null) {
            A1I.put(AbstractC58317Pt9.A00(27), genAIPersonaBannerDict.BG4().F7o());
        }
        if (genAIPersonaBannerDict.getName() != null) {
            AbstractC37300Gc1.A14(genAIPersonaBannerDict.getName(), A1I);
        }
        if (genAIPersonaBannerDict.Bcd() != null) {
            A1I.put("persona_id", genAIPersonaBannerDict.Bcd());
        }
        if (genAIPersonaBannerDict.Bhp() != null) {
            A1I.put("profile_image_url", genAIPersonaBannerDict.Bhp());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
