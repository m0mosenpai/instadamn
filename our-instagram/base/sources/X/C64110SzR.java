package X;

import com.android.billingclient.api.Purchase;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SzR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64110SzR implements InterfaceC65491TlC {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Map A03;

    public C64110SzR(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, List list2, Map map) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A03 = map;
        this.A01 = list;
        this.A02 = list2;
    }

    @Override // X.InterfaceC65491TlC
    public final void DGD(Throwable th, List list) {
        this.A00.A0M(EnumC61185Rgl.A0A, this.A01, AbstractC06930Yk.A0E());
    }

    @Override // X.InterfaceC65491TlC
    public final void DqS(QIy qIy, List list, List list2) {
        if (list2 != null && !list2.isEmpty()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list2) {
                String str = ((QIg) obj).A02;
                if (str != null && str.length() != 0) {
                    A1E.add(obj);
                }
            }
            LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(A1E));
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                A18.put(((QIg) next).A02, next);
            }
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
            Map map = this.A03;
            Iterator A14 = AbstractC166997dE.A14(A18);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                C63222SfT c63222SfT = inAppPurchaseControllerCoro.A06;
                Object key = A1K.getKey();
                C14360o3.A0B(map, 1);
                c63222SfT.A00.Ci3((Map) map.get(key), null, "client_verify_dcppayment_fail");
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj2 : list2) {
                QIg qIg = (QIg) obj2;
                C14360o3.A0B(qIg, 0);
                if (qIg.A01 != 2603009) {
                    A1E2.add(obj2);
                }
            }
            List list3 = this.A01;
            ArrayList A1E3 = AbstractC166987dD.A1E();
            for (Object obj3 : list3) {
                if (!A18.containsKey(((Purchase) obj3).A01())) {
                    A1E3.add(obj3);
                }
            }
            Iterator it2 = A1E3.iterator();
            while (it2.hasNext()) {
                Purchase purchase = (Purchase) it2.next();
                C63222SfT c63222SfT2 = inAppPurchaseControllerCoro.A06;
                String A01 = purchase.A01();
                C14360o3.A0B(map, 1);
                c63222SfT2.A00.Ci3((Map) map.get(A01), null, "client_verify_dcppayment_success");
            }
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            Iterator A142 = AbstractC166997dE.A14(A18);
            while (A142.hasNext()) {
                Map.Entry A1K2 = AbstractC166987dD.A1K(A142);
                QIg qIg2 = (QIg) A1K2.getValue();
                C14360o3.A0B(qIg2, 0);
                if (qIg2.A01 == 2603009) {
                    AbstractC43594JPz.A1S(A1I, A1K2);
                }
            }
            java.util.Set keySet = A1I.keySet();
            ArrayList A1E4 = AbstractC166987dD.A1E();
            for (Object obj4 : list3) {
                if (keySet.contains(((Purchase) obj4).A01())) {
                    A1E4.add(obj4);
                }
            }
            if (A1E3.size() != this.A02.size() && A1E4.size() != list2.size()) {
                if (AbstractC25226BEj.A1b(A1E4)) {
                    inAppPurchaseControllerCoro.A0J(null, A1E4, list, map);
                    C62949SYr c62949SYr = inAppPurchaseControllerCoro.A0D;
                    String str2 = qIy.A05;
                    C42201xA A00 = C62949SYr.A00(c62949SYr, str2);
                    EnumC61182Rgi enumC61182Rgi = EnumC61182Rgi.A05;
                    List list4 = (List) qIy.A03;
                    A00.accept(new QIy(EnumC61185Rgl.A0K, enumC61182Rgi, str2, qIy.A06, list4, (List) qIy.A01, A1E2));
                }
                inAppPurchaseControllerCoro.A0J(null, A1E3, list, map);
                EnumC61185Rgl enumC61185Rgl = EnumC61185Rgl.A0K;
                LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                AbstractC63051SbX.A02("Server verification returned failed purchases", A1I2);
                LinkedHashMap A03 = AbstractC06930Yk.A03(A1I2);
                LinkedHashMap A1I3 = AbstractC166987dD.A1I();
                JSONObject A0q = AbstractC31171DnF.A0q();
                int i = 0;
                for (Object obj5 : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    try {
                        A0q.put(String.valueOf(i), obj5);
                    } catch (JSONException e) {
                        C0K8.A0F("DCP", "Failed writing Purchase Error to JSON", e);
                    }
                    i = i2;
                }
                A1I3.put("purchase_errors", A0q.toString());
                A03.putAll(A1I3);
                inAppPurchaseControllerCoro.A0M(enumC61185Rgl, list3, A03);
                return;
            }
            C14360o3.A0B(map, 2);
            inAppPurchaseControllerCoro.A0J(null, list3, list, map);
            inAppPurchaseControllerCoro.A0M(EnumC61185Rgl.A0L, list3, null);
            return;
        }
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = this.A00;
        C63222SfT c63222SfT3 = inAppPurchaseControllerCoro2.A06;
        Map map2 = this.A03;
        C14360o3.A0B(map2, 0);
        Iterator A16 = AbstractC166997dE.A16(map2);
        while (A16.hasNext()) {
            c63222SfT3.A00.Ci3((Map) A16.next(), null, "client_verify_dcppayment_success");
        }
        List list5 = this.A01;
        C14360o3.A0B(list5, 0);
        inAppPurchaseControllerCoro2.A0J(null, list5, list, map2);
        inAppPurchaseControllerCoro2.A0M(EnumC61185Rgl.A0L, list5, null);
    }
}
