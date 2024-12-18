package X;

import com.facebook.messaging.analytics.search.universal.qpllatency.QPLSearchLatencyLoggingJni;

/* loaded from: classes6.dex */
public final class FPY {
    public Integer A00;
    public final QPLSearchLatencyLoggingJni A01 = new QPLSearchLatencyLoggingJni();

    public final void A00(boolean z, int i) {
        Integer num = this.A00;
        if (num != null) {
            QPLSearchLatencyLoggingJni qPLSearchLatencyLoggingJni = this.A01;
            int intValue = num.intValue();
            if (!z) {
                qPLSearchLatencyLoggingJni.cacheQueryEnd(intValue, "banyan", i);
            } else {
                qPLSearchLatencyLoggingJni.networkQueryEnd(intValue, "server_entities_named_dsq1", i);
            }
        }
    }
}
