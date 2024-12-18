package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HrP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40155HrP {
    public static Map A00(InterfaceC106814ri interfaceC106814ri) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC106814ri.AnR() != null) {
            A1I.put("checkout_style", interfaceC106814ri.AnR());
        }
        if (interfaceC106814ri.getCurrentPrice() != null) {
            A1I.put("current_price", interfaceC106814ri.getCurrentPrice());
        }
        if (interfaceC106814ri.getExternalUrl() != null) {
            A1I.put("external_url", interfaceC106814ri.getExternalUrl());
        }
        if (interfaceC106814ri.getFullPrice() != null) {
            A1I.put("full_price", interfaceC106814ri.getFullPrice());
        }
        User BSW = interfaceC106814ri.BSW();
        if (BSW != null) {
            AbstractC37301Gc2.A1Q(BSW, A1I);
        }
        if (interfaceC106814ri.getName() != null) {
            AbstractC37300Gc1.A14(interfaceC106814ri.getName(), A1I);
        }
        if (interfaceC106814ri.getProductId() != null) {
            A1I.put("product_id", interfaceC106814ri.getProductId());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
