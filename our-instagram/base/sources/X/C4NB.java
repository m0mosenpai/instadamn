package X;

import android.content.Context;

/* renamed from: X.4NB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NB implements C4N5 {
    public final Context A00;

    @Override // X.C4N5
    public final String Abb() {
        C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
        return c74123Uq.A02().A00(this.A00, AnonymousClass001.A0R("rti.mqtt.", "mqtt_config")).getString("analytics_endpoint", "");
    }

    @Override // X.C4N5
    public final String BV7() {
        C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
        return c74123Uq.A02().A00(this.A00, AnonymousClass001.A0R("rti.mqtt.", "mqtt_config")).getString("host_name_ipv6", "");
    }

    public C4NB(Context context) {
        this.A00 = context;
    }
}
