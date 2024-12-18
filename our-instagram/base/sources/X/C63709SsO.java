package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.SsO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63709SsO implements InterfaceC65316Ths {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ InterfaceC23621Ds A01;

    public C63709SsO(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, InterfaceC23621Ds interfaceC23621Ds) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A01 = interfaceC23621Ds;
    }

    @Override // X.InterfaceC65316Ths
    public final void Dcc(SYG syg, List list) {
        InterfaceC23621Ds interfaceC23621Ds;
        AbstractC167017dG.A1N(syg, list);
        int i = syg.A00;
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        if (i == 0) {
            inAppPurchaseControllerCoro.A04 = list;
            inAppPurchaseControllerCoro.A06.A00.Ci3(C63222SfT.A00(syg, list), null, "client_load_iap_store_purchases_success");
            interfaceC23621Ds = this.A01;
        } else {
            InterfaceC65615To6 interfaceC65615To6 = inAppPurchaseControllerCoro.A06.A00;
            String str = syg.A01;
            C14360o3.A07(str);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            AbstractC63051SbX.A02(str, A1I);
            AbstractC63051SbX.A00(syg, A1I);
            interfaceC65615To6.Ci3(A1I, null, "client_load_iap_store_purchases_fail");
            interfaceC23621Ds = this.A01;
            list = C16930sl.A00;
        }
        interfaceC23621Ds.resumeWith(AbstractC166987dD.A1L(syg, list));
    }
}
