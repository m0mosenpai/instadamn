package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf;
import java.util.LinkedHashMap;

/* renamed from: X.H7e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38814H7e extends C0T6 implements JK4 {
    public final IgFundedIncentive A00;

    public C38814H7e(IgFundedIncentive igFundedIncentive) {
        C14360o3.A0B(igFundedIncentive, 1);
        this.A00 = igFundedIncentive;
    }

    @Override // X.JK4
    public final C38814H7e F5c() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38814H7e) && C14360o3.A0K(this.A00, ((C38814H7e) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.JK4
    public final /* bridge */ /* synthetic */ IgFundedIncentiveIntf BHJ() {
        return this.A00;
    }

    @Override // X.JK4
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (BHJ() != null) {
            A0X.put("incentive_details", BHJ().F7o());
        }
        return AbstractC37300Gc1.A05("XDTShoppingNetegoInStoryIncentiveDestination", AbstractC06930Yk.A0B(A0X));
    }
}
