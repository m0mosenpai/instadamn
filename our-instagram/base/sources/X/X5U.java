package X;

import com.facebookpay.common.models.Distance;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem;

/* loaded from: classes11.dex */
public final class X5U extends C0YY implements InterfaceC16660sJ {
    public static final X5U A00 = new X5U();

    public X5U() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        double d;
        SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem;
        Distance distance;
        Object obj2 = AbstractC58319PtB.A0X(obj).A01;
        if ((obj2 instanceof SelectionPickupFulfillmentOptionItem) && (selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) obj2) != null && (distance = selectionPickupFulfillmentOptionItem.A02) != null) {
            d = distance.A00;
        } else {
            d = Double.MAX_VALUE;
        }
        return Double.valueOf(d);
    }
}
