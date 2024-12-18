package X;

import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UGK extends AbstractC65412xd {
    public final Map A00;

    @Override // X.AbstractC65412xd
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final boolean areContentsTheSame(C63406Sjd c63406Sjd, C63406Sjd c63406Sjd2) {
        BaseCheckoutItem baseCheckoutItem;
        AbstractC167007dF.A1K(c63406Sjd, c63406Sjd2);
        if (!c63406Sjd.equals(c63406Sjd2)) {
            return false;
        }
        Map map = this.A00;
        Object obj = c63406Sjd.A01;
        VG3 vg3 = null;
        if ((obj instanceof BaseCheckoutItem) && (baseCheckoutItem = (BaseCheckoutItem) obj) != null) {
            vg3 = baseCheckoutItem.BKB();
        }
        if (map.get(vg3) == null || c63406Sjd.A00 != c63406Sjd2.A00 || obj == null || !obj.equals(c63406Sjd2.A01)) {
            return false;
        }
        return true;
    }

    public UGK(Map map) {
        this.A00 = map;
    }

    @Override // X.AbstractC65412xd
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final boolean areItemsTheSame(C63406Sjd c63406Sjd, C63406Sjd c63406Sjd2) {
        BaseCheckoutItem baseCheckoutItem;
        AbstractC167017dG.A1N(c63406Sjd, c63406Sjd2);
        boolean z = false;
        if (c63406Sjd.equals(c63406Sjd2) && (!C63406Sjd.A0H(c63406Sjd) || c63406Sjd.A00 != c63406Sjd2.A00)) {
            Map map = this.A00;
            Object obj = c63406Sjd.A01;
            VG3 vg3 = null;
            if ((obj instanceof BaseCheckoutItem) && (baseCheckoutItem = (BaseCheckoutItem) obj) != null) {
                vg3 = baseCheckoutItem.BKB();
            }
            if (map.get(vg3) != null) {
                if (c63406Sjd.A00 == c63406Sjd2.A00) {
                    z = true;
                    if (!C14360o3.A0K(obj, c63406Sjd2.A01)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return z;
    }
}
