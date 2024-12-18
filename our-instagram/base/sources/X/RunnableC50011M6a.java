package X;

import com.android.billingclient.api.SkuDetails;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.M6a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50011M6a implements Runnable {
    public final /* synthetic */ SYG A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ Map A04;

    public RunnableC50011M6a(SYG syg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, Map map) {
        this.A00 = syg;
        this.A04 = map;
        this.A03 = interfaceC103384lE;
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC103384lE interfaceC103384lE;
        C6FW c6fw;
        Map map;
        String str;
        if (this.A00.A00 == 0 && (map = this.A04) != null) {
            interfaceC103384lE = this.A03;
            C6FX A0s = AbstractC25225BEi.A0s();
            LinkedHashMap A0y = AbstractC43594JPz.A0y(map);
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A0y.put(A1K.getKey(), ((SkuDetails) A1K.getValue()).A00.optString("price"));
            }
            A0s.A01(A0y);
            SkuDetails skuDetails = (SkuDetails) AbstractC001800i.A0A(map.values());
            if (skuDetails != null) {
                str = skuDetails.A00.optString(AbstractC58317Pt9.A00(341));
            } else {
                str = null;
            }
            A0s.A02(str);
            c6fw = A0s.A00();
        } else {
            interfaceC103384lE = this.A02;
            c6fw = new C6FW(AbstractC166987dD.A1J("Failed to quote"));
        }
        C131845xK.A00(this.A01, c6fw, interfaceC103384lE);
    }
}
