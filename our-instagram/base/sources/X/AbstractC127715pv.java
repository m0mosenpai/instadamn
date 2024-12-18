package X;

/* renamed from: X.5pv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127715pv {
    public static void A00(C127645po c127645po, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        if (c127645po.A01 != null) {
            C16V.A03(anonymousClass182, "scan_results");
            for (C72778Xmx c72778Xmx : c127645po.A01) {
                if (c72778Xmx != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("age_ms", c72778Xmx.A00);
                    String str = c72778Xmx.A02;
                    if (str != null) {
                        anonymousClass182.A0S("hardware_address", str);
                    }
                    anonymousClass182.A0Q("rssi_dbm", c72778Xmx.A01);
                    String str2 = c72778Xmx.A03;
                    if (str2 != null) {
                        anonymousClass182.A0S("advertisement_payload_base64", str2);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool = c127645po.A00;
        if (bool != null) {
            anonymousClass182.A0T("enabled", bool.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
