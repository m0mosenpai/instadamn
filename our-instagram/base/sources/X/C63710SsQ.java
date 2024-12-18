package X;

import com.android.billingclient.api.SkuDetails;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SsQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63710SsQ implements InterfaceC65318Thu {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ InterfaceC65347TiU A01;
    public final /* synthetic */ List A02;

    public C63710SsQ(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, InterfaceC65347TiU interfaceC65347TiU, List list) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A02 = list;
        this.A01 = interfaceC65347TiU;
    }

    @Override // X.InterfaceC65318Thu
    public final void Dmw(SYG syg, List list) {
        C14360o3.A0B(syg, 0);
        if (list != null) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SkuDetails skuDetails = (SkuDetails) it.next();
                C14360o3.A0A(skuDetails);
                InAppPurchaseControllerCoro.A09(skuDetails, inAppPurchaseControllerCoro);
            }
        }
        Collection collection = this.A02;
        if (collection == null) {
            collection = C16930sl.A00;
        }
        if (list == null) {
            list = C16930sl.A00;
        }
        InAppPurchaseControllerCoro.A08(syg, this.A01, AbstractC001800i.A0S(list, collection));
    }
}
