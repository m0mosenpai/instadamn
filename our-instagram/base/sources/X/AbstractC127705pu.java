package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.5pu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127705pu {
    public static void A00(C127635pn c127635pn, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        if (c127635pn.A02 != null) {
            C16V.A03(anonymousClass182, "scan_results");
            for (C201138uv c201138uv : c127635pn.A02) {
                if (c201138uv != null) {
                    AbstractC201178uz.A00(c201138uv, anonymousClass182);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c127635pn.A00 != null) {
            anonymousClass182.A0r(RealtimeConstants.MQTT_CONNECTED);
            AbstractC201178uz.A00(c127635pn.A00, anonymousClass182);
        }
        Boolean bool = c127635pn.A01;
        if (bool != null) {
            anonymousClass182.A0T("enabled", bool.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
