package X;

import android.os.SystemClock;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.LVc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48204LVc implements InterfaceC65347TiU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C48204LVc(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    @Override // X.InterfaceC65347TiU
    public final void Dge(SYG syg, Map map) {
        InterfaceC24741Ir interfaceC24741Ir;
        if (this.A00 != 0) {
            C11T.A02(new RunnableC50011M6a(syg, (C6FQ) this.A01, (InterfaceC103384lE) this.A03, (InterfaceC103384lE) this.A02, map));
            return;
        }
        if (syg.A00 == 0 && map != null && !map.isEmpty()) {
            C45125Jxu c45125Jxu = (C45125Jxu) this.A02;
            List<C45048Jwd> list = (List) c45125Jxu.A04;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (C45048Jwd c45048Jwd : list) {
                SkuDetails skuDetails = (SkuDetails) map.get(c45048Jwd.A04);
                if (skuDetails != null) {
                    String str = c45048Jwd.A03;
                    String str2 = c45048Jwd.A05;
                    int i = c45048Jwd.A00;
                    int i2 = c45048Jwd.A01;
                    int i3 = c45048Jwd.A02;
                    JSONObject jSONObject = skuDetails.A00;
                    String optString = jSONObject.optString("productId");
                    C14360o3.A07(optString);
                    String optString2 = jSONObject.optString("price");
                    C14360o3.A07(optString2);
                    A1E.add(new C45063Jws(optString, str, str2, optString2, i, i2, i3, 0, jSONObject.optLong(AbstractC58317Pt9.A00(924))));
                }
            }
            C45127Jxw c45127Jxw = (C45127Jxw) c45125Jxu.A01;
            Integer num = (Integer) c45125Jxu.A00;
            C14360o3.A0B(num, 2);
            C47931LFa.A00 = SystemClock.uptimeMillis();
            C45125Jxu c45125Jxu2 = C47931LFa.A01;
            List list2 = (List) c45125Jxu2.A04;
            list2.clear();
            list2.addAll(A1E);
            c45125Jxu2.A01 = c45127Jxw;
            c45125Jxu2.A00 = num;
            interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
            interfaceC24741Ir.F8s(new C45156Jyw(c45127Jxw, num, A1E, c45125Jxu.A02, false));
        } else {
            interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
            interfaceC24741Ir.F8s(new C45155Jyv("iap_query_sku_price_failure", String.valueOf(syg.A00), syg.A01));
        }
        interfaceC24741Ir.AID(null);
    }
}
