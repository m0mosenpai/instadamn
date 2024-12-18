package X;

import com.android.billingclient.api.SkuDetails;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Oot, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55727Oot implements InterfaceC65347TiU {
    public final /* synthetic */ C54751OHg A00;
    public final /* synthetic */ C51646Mrd A01;

    public C55727Oot(C54751OHg c54751OHg, C51646Mrd c51646Mrd) {
        this.A01 = c51646Mrd;
        this.A00 = c54751OHg;
    }

    @Override // X.InterfaceC65347TiU
    public final void Dge(SYG syg, Map map) {
        SkuDetails skuDetails;
        if (syg.A00 == 0) {
            C51646Mrd c51646Mrd = this.A01;
            HashMap hashMap = c51646Mrd.A0B;
            List A00 = this.A00.A00();
            if (A00 != null) {
                for (Object obj : A00) {
                    if (map != null && (skuDetails = (SkuDetails) map.get(obj)) != null) {
                        JSONObject jSONObject = skuDetails.A00;
                        if (jSONObject.optString("price") != null) {
                            hashMap.put(obj, jSONObject.optString("price"));
                        }
                        String A002 = AbstractC58317Pt9.A00(341);
                        if (jSONObject.optString(A002) != null) {
                            c51646Mrd.A0A.put(obj, jSONObject.optString(A002));
                        }
                    }
                }
            }
        }
        C51646Mrd c51646Mrd2 = this.A01;
        c51646Mrd2.A0D = false;
        this.A00.A00.A0A(c51646Mrd2);
    }
}
