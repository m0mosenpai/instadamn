package X;

import com.android.billingclient.api.SkuDetails;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SsT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63713SsT implements InterfaceC65318Thu {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C63713SsT(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
    }

    @Override // X.InterfaceC65318Thu
    public final void Dmw(SYG syg, List list) {
        if (this.A00 != 0) {
            C14360o3.A0B(syg, 0);
            if (syg.A00 == 0) {
                if (list != null) {
                    InAppPurchaseControllerCoro inAppPurchaseControllerCoro = (InAppPurchaseControllerCoro) this.A02;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        SkuDetails skuDetails = (SkuDetails) it.next();
                        C14360o3.A0A(skuDetails);
                        InAppPurchaseControllerCoro.A09(skuDetails, inAppPurchaseControllerCoro);
                    }
                }
                SD8 sd8 = (SD8) this.A03;
                if (sd8 != null) {
                    ((InterfaceC65597Tng) this.A01).E7W(sd8, new C63710SsQ((InAppPurchaseControllerCoro) this.A02, (InterfaceC65347TiU) this.A04, list), false);
                    return;
                }
            }
            InAppPurchaseControllerCoro.A08(syg, (InterfaceC65347TiU) this.A04, list);
            return;
        }
        C14360o3.A0B(syg, 0);
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = (InAppPurchaseControllerCoro) this.A04;
        Collection collection = (Collection) this.A02;
        if (collection == null) {
            collection = C16930sl.A00;
        }
        if (list == null) {
            list = C16930sl.A00;
        }
        InAppPurchaseControllerCoro.A07(syg, (InterfaceC65345TiS) this.A01, inAppPurchaseControllerCoro2, AbstractC001800i.A0S(list, collection), (List) this.A03);
    }
}
