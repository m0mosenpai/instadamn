package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.SzQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64109SzQ implements InterfaceC65491TlC {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public C64109SzQ(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, Map map, boolean z) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A01 = list;
        this.A02 = map;
        this.A03 = z;
    }

    @Override // X.InterfaceC65491TlC
    public final void DGD(Throwable th, List list) {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        inAppPurchaseControllerCoro.A06.A0B(this.A01, list);
        InAppPurchaseControllerCoro.A0E(inAppPurchaseControllerCoro, EnumC61185Rgl.A0G);
    }

    @Override // X.InterfaceC65491TlC
    public final void DqS(QIy qIy, List list, List list2) {
        if (list != null && !list.isEmpty() && (list2 == null || list2.isEmpty())) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
            C63222SfT c63222SfT = inAppPurchaseControllerCoro.A06;
            List list3 = this.A01;
            Map map = this.A02;
            C14360o3.A0B(map, 2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C45126Jxv c45126Jxv = (C45126Jxv) it.next();
                Map map2 = (Map) map.get(c45126Jxv.A03);
                if (map2 == null) {
                    map2 = AbstractC06930Yk.A0E();
                }
                LinkedHashMap A03 = AbstractC06930Yk.A03(map2);
                A03.put("dcp_order_id", c45126Jxv.A01);
                c63222SfT.A00.Ci3(A03, null, "client_verify_dcppayment_success");
            }
            if (this.A03) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C45126Jxv c45126Jxv2 = (C45126Jxv) it2.next();
                    InterfaceC65490TlB interfaceC65490TlB = inAppPurchaseControllerCoro.A01;
                    if (interfaceC65490TlB != null) {
                        interfaceC65490TlB.DcY(c45126Jxv2);
                    }
                }
                return;
            }
            inAppPurchaseControllerCoro.A0J(new SLD(inAppPurchaseControllerCoro, map), list3, list, map);
            return;
        }
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = this.A00;
        inAppPurchaseControllerCoro2.A06.A0B(this.A01, list2);
        InAppPurchaseControllerCoro.A0E(inAppPurchaseControllerCoro2, EnumC61185Rgl.A0K);
    }
}
