package X;

import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;

/* loaded from: classes11.dex */
public abstract class VND {
    public static final void A00(BaseSelectionCheckoutItem baseSelectionCheckoutItem, String str, boolean z) {
        Integer num;
        C14360o3.A0B(baseSelectionCheckoutItem, 0);
        if (C14360o3.A0K(baseSelectionCheckoutItem.getId(), str) && !z) {
            num = C05F.A0C;
        } else {
            num = C05F.A0N;
        }
        baseSelectionCheckoutItem.Eda(num);
    }
}
