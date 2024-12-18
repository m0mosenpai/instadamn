package X;

import com.instagram.shopping.model.productsource.ProductSourceOverrideState;

/* loaded from: classes7.dex */
public final class ILC {
    public final /* synthetic */ HCN A00;

    public ILC(HCN hcn) {
        this.A00 = hcn;
    }

    public final boolean A00(IIT iit) {
        String str;
        ProductSourceOverrideState productSourceOverrideState = this.A00.A06;
        if (productSourceOverrideState != null && (str = productSourceOverrideState.A02) != null && str.length() != 0 && !str.equals(iit.A02)) {
            return false;
        }
        return true;
    }
}
