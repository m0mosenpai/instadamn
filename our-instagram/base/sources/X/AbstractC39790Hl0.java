package X;

import com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hl0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39790Hl0 {
    public static Map A00(InterfaceC104784ni interfaceC104784ni) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104784ni.Aj7() != null) {
            A1I.put("button_text", interfaceC104784ni.Aj7());
        }
        if (interfaceC104784ni.Awt() != null) {
            A1I.put("description_text", interfaceC104784ni.Awt());
        }
        if (interfaceC104784ni.Ayh() != null) {
            ShoppingIGFundedIncentivesShopAdsBannerStyles Ayh = interfaceC104784ni.Ayh();
            if (Ayh != null) {
                str = Ayh.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(901), str);
        }
        if (interfaceC104784ni.BHK() != null) {
            A1I.put("incentive_id", interfaceC104784ni.BHK());
        }
        if (interfaceC104784ni.C5n() != null) {
            A1I.put("terms_and_conditions_body", interfaceC104784ni.C5n());
        }
        if (interfaceC104784ni.C5o() != null) {
            A1I.put("terms_and_conditions_title", interfaceC104784ni.C5o());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
