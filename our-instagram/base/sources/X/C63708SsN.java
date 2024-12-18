package X;

import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.SsN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63708SsN implements InterfaceC65315Thr {
    public final /* synthetic */ InterfaceC23621Ds A00;

    public C63708SsN(InterfaceC23621Ds interfaceC23621Ds) {
        this.A00 = interfaceC23621Ds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC65315Thr
    public final void DcX(SYG syg, List list) {
        Object obj;
        C14360o3.A0B(syg, 0);
        int i = syg.A00;
        InterfaceC23621Ds interfaceC23621Ds = this.A00;
        if (i == 0 && list != null) {
            obj = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
                C14360o3.A0A(purchaseHistoryRecord);
                ArrayList A12 = AbstractC166997dE.A12(purchaseHistoryRecord, 0);
                JSONObject jSONObject = purchaseHistoryRecord.A02;
                if (jSONObject.has("productIds")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            A12.add(optJSONArray.optString(i2));
                        }
                    }
                } else if (jSONObject.has("productId")) {
                    A12.add(jSONObject.optString("productId"));
                }
                Object obj2 = A12.get(0);
                C14360o3.A07(obj2);
                obj.add(obj2);
            }
        } else {
            obj = C16930sl.A00;
        }
        interfaceC23621Ds.resumeWith(obj);
    }
}
