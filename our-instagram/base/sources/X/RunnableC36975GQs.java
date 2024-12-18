package X;

import com.android.billingclient.api.SkuDetails;
import java.util.Map;

/* renamed from: X.GQs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36975GQs implements Runnable {
    public final /* synthetic */ SYG A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public RunnableC36975GQs(SYG syg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, String str, Map map) {
        this.A00 = syg;
        this.A03 = interfaceC103384lE;
        this.A05 = map;
        this.A04 = str;
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC103384lE interfaceC103384lE;
        C6FW c6fw;
        String str;
        SkuDetails skuDetails;
        if (this.A00.A00 == 0) {
            interfaceC103384lE = this.A03;
            C6FX A0s = AbstractC25225BEi.A0s();
            Map map = this.A05;
            if (map != null && (skuDetails = (SkuDetails) map.get(this.A04)) != null) {
                str = skuDetails.A00.optString("price");
            } else {
                str = null;
            }
            A0s.A01(str);
            c6fw = A0s.A00();
        } else {
            interfaceC103384lE = this.A02;
            c6fw = C6FW.A01;
        }
        C131845xK.A00(this.A01, c6fw, interfaceC103384lE);
    }
}
