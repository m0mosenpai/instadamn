package X;

import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDD {
    public static Map A00(ClipsTrialDict clipsTrialDict) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (clipsTrialDict.Al7() != null) {
            A1I.put(AbstractC111324zv.A00(62), clipsTrialDict.Al7());
        }
        String str2 = null;
        if (clipsTrialDict.BAG() != null) {
            MediaTrialGraduationStrategy BAG = clipsTrialDict.BAG();
            if (BAG != null) {
                str = BAG.A00;
            } else {
                str = null;
            }
            A1I.put(MSV.A00(207), str);
        }
        if (clipsTrialDict.Cc9() != null) {
            A1I.put(AbstractC111324zv.A00(1060), clipsTrialDict.Cc9());
        }
        if (clipsTrialDict.C0I() != null) {
            MediaTrialStatus C0I = clipsTrialDict.C0I();
            if (C0I != null) {
                str2 = C0I.A00;
            }
            A1I.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
