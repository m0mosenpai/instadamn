package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf;
import com.instagram.model.shopping.incentives.igfunded.ImmutablePandoIgFundedIncentive;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HWW extends C17T implements JK4 {
    @Override // X.JK4
    public final IgFundedIncentiveIntf BHJ() {
        return (IgFundedIncentiveIntf) A04(-342910098, ImmutablePandoIgFundedIncentive.class);
    }

    @Override // X.JK4
    public final C38814H7e F5c() {
        return new C38814H7e(BHJ().F66());
    }

    @Override // X.JK4
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (BHJ() != null) {
            A0X.put("incentive_details", BHJ().F7o());
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
