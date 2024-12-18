package X;

import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I3a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40720I3a {
    public static Map A00(IgFundedIncentiveBannerButtonIntf igFundedIncentiveBannerButtonIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (igFundedIncentiveBannerButtonIntf.Awy() != null) {
            IgFundedIncentiveButtonDestinationType Awy = igFundedIncentiveBannerButtonIntf.Awy();
            C14360o3.A0B(Awy, 0);
            A1I.put("destination", Awy.A00);
        }
        if (igFundedIncentiveBannerButtonIntf.C38() != null) {
            IgFundedIncentiveBannerButtonStyleType C38 = igFundedIncentiveBannerButtonIntf.C38();
            C14360o3.A0B(C38, 0);
            A1I.put("style", C38.A00);
        }
        if (igFundedIncentiveBannerButtonIntf.getText() != null) {
            AbstractC37300Gc1.A15(igFundedIncentiveBannerButtonIntf.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
