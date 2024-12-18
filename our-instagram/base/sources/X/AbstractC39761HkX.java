package X;

import com.instagram.api.schemas.AutoDubStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HkX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39761HkX {
    public static Map A00(JK9 jk9) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jk9.BL7() != null) {
            A1I.put("language", jk9.BL7());
        }
        if (jk9.C0G() != null) {
            AutoDubStatus C0G = jk9.C0G();
            if (C0G != null) {
                str = C0G.A00;
            } else {
                str = null;
            }
            A1I.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
