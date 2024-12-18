package X;

/* renamed from: X.8uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201178uz {
    public static void A00(C201138uv c201138uv, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        Integer num = c201138uv.A01;
        if (num != null) {
            anonymousClass182.A0Q("age_ms", num.intValue());
        }
        String str = c201138uv.A03;
        if (str != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(4528), str);
        }
        anonymousClass182.A0Q("rssi_dbm", c201138uv.A00);
        String str2 = c201138uv.A04;
        if (str2 != null) {
            anonymousClass182.A0S("network_name", str2);
        }
        Integer num2 = c201138uv.A02;
        if (num2 != null) {
            anonymousClass182.A0Q("frequency_mhz", num2.intValue());
        }
        anonymousClass182.A0a();
    }
}
