package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SLD {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ Map A01;

    public SLD(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Map map) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A01 = map;
    }

    public final void A00(C45126Jxv c45126Jxv) {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        InterfaceC65490TlB interfaceC65490TlB = inAppPurchaseControllerCoro.A01;
        if (interfaceC65490TlB != null) {
            interfaceC65490TlB.DcY(c45126Jxv);
        }
        inAppPurchaseControllerCoro.A06.A00.Ci3((Map) this.A01.get(c45126Jxv.A01), null, "client_execute_dcpiap_success");
    }
}
