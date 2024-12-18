package X;

import android.content.Context;

/* renamed from: X.4N3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4N3 extends C4N4 {
    public final C4N2 A00;

    public C4N3(Context context, C74103Uo c74103Uo, C4N2 c4n2, C4N0 c4n0, Integer num) {
        super(context, c74103Uo, c4n0, num);
        this.A00 = c4n2;
        C4N8 A00 = this.A02.A00(this.A01, AnonymousClass001.A0R("rti.mqtt.", "mqtt_last_host"));
        if (System.currentTimeMillis() - A00.getLong("zero_rating_last_host_timestamp", 0L) < 86400000) {
            this.A06 = A00.getString("zero_rating_last_host", "");
        }
    }
}
