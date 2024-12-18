package X;

import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.logging.LoggingContext;
import java.util.List;

/* loaded from: classes11.dex */
public final class UvL extends AbstractC129435t5 {
    public final SelectionActionViewItem A00;
    public final LoggingContext A01;
    public final List A02;
    public final boolean A03;

    @Override // X.AbstractC129435t5
    public final boolean A0H() {
        return AbstractC25229BEm.A1a(this.A04.get(super.A02), this.A05.A02());
    }

    public final void A0I(BaseCheckoutItem baseCheckoutItem) {
        BaseSelectionCheckoutItem baseSelectionCheckoutItem;
        BaseSelectionCheckoutItem baseSelectionCheckoutItem2;
        C58252li c58252li = this.A05;
        Object A02 = c58252li.A02();
        if ((A02 instanceof BaseSelectionCheckoutItem) && (baseSelectionCheckoutItem2 = (BaseSelectionCheckoutItem) A02) != null) {
            baseSelectionCheckoutItem2.Eda(C05F.A0N);
        }
        if ((baseCheckoutItem instanceof BaseSelectionCheckoutItem) && (baseSelectionCheckoutItem = (BaseSelectionCheckoutItem) baseCheckoutItem) != null) {
            baseSelectionCheckoutItem.Eda(C05F.A0C);
        }
        c58252li.A0B(baseCheckoutItem);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UvL(BaseCheckoutItem baseCheckoutItem, LoggingContext loggingContext, List list, int i, int i2, boolean z, boolean z2) {
        super(i, true, z);
        AbstractC37302Gc3.A1U(list, baseCheckoutItem);
        C14360o3.A0B(loggingContext, 6);
        this.A02 = list;
        this.A01 = loggingContext;
        this.A03 = z2;
        this.A00 = new SelectionActionViewItem(VG3.A0n, null, Integer.valueOf(i2), null, null);
        this.A04.put(i, baseCheckoutItem);
        A0I(baseCheckoutItem);
    }
}
