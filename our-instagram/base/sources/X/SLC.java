package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SLC {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ Map A01;

    public SLC(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Map map) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A01 = map;
    }

    public final void A00() {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        C63222SfT c63222SfT = inAppPurchaseControllerCoro.A06;
        Map map = this.A01;
        C14360o3.A0B(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        AbstractC63051SbX.A02("Mock purchase failed", linkedHashMap);
        c63222SfT.A00.Ci3(linkedHashMap, null, "client_create_dcppayment_fail");
        InAppPurchaseControllerCoro.A0E(inAppPurchaseControllerCoro, EnumC61185Rgl.A0Q);
    }
}
