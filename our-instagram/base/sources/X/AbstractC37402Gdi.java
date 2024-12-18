package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gdi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37402Gdi {
    public static Map A00(InterfaceC37891pS interfaceC37891pS) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37891pS.AZM() != null) {
            A1I.put("ad_pod_id", interfaceC37891pS.AZM());
        }
        interfaceC37891pS.BHS();
        A1I.put("index_in_ad_pod", Integer.valueOf(interfaceC37891pS.BHS()));
        interfaceC37891pS.BXa();
        return AbstractC37301Gc2.A0r("num_ads_in_ad_pod", Integer.valueOf(interfaceC37891pS.BXa()), A1I);
    }
}
