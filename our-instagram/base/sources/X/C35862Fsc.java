package X;

import com.android.billingclient.api.SkuDetails;
import java.util.Map;

/* renamed from: X.Fsc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35862Fsc implements InterfaceC65347TiU {
    public final /* synthetic */ String A00;
    public final /* synthetic */ InterfaceC24901Jp A01;

    public C35862Fsc(String str, InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = str;
        this.A01 = interfaceC24901Jp;
    }

    @Override // X.InterfaceC65347TiU
    public final void Dge(SYG syg, Map map) {
        String str;
        InterfaceC24901Jp interfaceC24901Jp;
        Object obj;
        SkuDetails skuDetails;
        if (map != null && (skuDetails = (SkuDetails) map.get(this.A00)) != null) {
            str = skuDetails.A00.optString("price");
        } else {
            str = null;
        }
        if (syg.A00 == 0 && str != null) {
            interfaceC24901Jp = this.A01;
            obj = new C32928Ee9(str);
        } else {
            interfaceC24901Jp = this.A01;
            obj = C32930EeB.A00;
        }
        interfaceC24901Jp.resumeWith(obj);
    }
}
