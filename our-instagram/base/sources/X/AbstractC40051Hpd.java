package X;

import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hpd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40051Hpd {
    public static Map A00(LoyaltyToplineInfoDict loyaltyToplineInfoDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (loyaltyToplineInfoDict.Cfr() != null) {
            A1I.put(AbstractC111324zv.A00(461), loyaltyToplineInfoDict.Cfr());
        }
        if (loyaltyToplineInfoDict.BPQ() != null) {
            A1I.put(AbstractC111324zv.A00(469), loyaltyToplineInfoDict.BPQ());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
