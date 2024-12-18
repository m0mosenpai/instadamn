package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HlF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39805HlF {
    public static Map A00(InterfaceC104824nn interfaceC104824nn) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104824nn.AYb() != null) {
            A1I.put("actionLink", interfaceC104824nn.AYb());
        }
        if (interfaceC104824nn.AYc() != null) {
            A1I.put("actionLinkFallback", interfaceC104824nn.AYc());
        }
        if (interfaceC104824nn.B4G() != null) {
            A1I.put("fallbackCTALabel", interfaceC104824nn.B4G());
        }
        if (interfaceC104824nn.B4K() != null) {
            A1I.put("fallbackDestination", interfaceC104824nn.B4K());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
