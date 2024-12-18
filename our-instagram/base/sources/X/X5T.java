package X;

import com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem;

/* loaded from: classes11.dex */
public final class X5T extends C0YY implements InterfaceC16660sJ {
    public static final X5T A00 = new X5T();

    public X5T() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem;
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        C14360o3.A0B(c63406Sjd, 0);
        Object obj2 = c63406Sjd.A01;
        if (obj2 instanceof SelectionPickupFulfillmentOptionItem) {
            selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) obj2;
        } else {
            selectionPickupFulfillmentOptionItem = null;
        }
        boolean z = false;
        if (selectionPickupFulfillmentOptionItem != null) {
            z = AbstractC166997dE.A1Z(selectionPickupFulfillmentOptionItem.A05, false);
        }
        return Boolean.valueOf(z);
    }
}
