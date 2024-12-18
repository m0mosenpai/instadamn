package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* renamed from: X.SMo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62700SMo {
    public final Context A03;
    public final C74103Uo A04;
    public final C63306ShC A05;
    public final RealtimeSinceBootClock A06;
    public final boolean A07;
    public long A00 = -1;
    public long A02 = 0;
    public long A01 = -1;

    public final synchronized void A00() {
        long j;
        if (this.A07) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.A00;
            if (j2 < 0) {
                this.A00 = elapsedRealtime;
                this.A01 = elapsedRealtime;
            } else {
                long j3 = elapsedRealtime - j2;
                this.A00 = elapsedRealtime;
                if (j3 <= 10000) {
                    j = this.A02 + j3;
                } else {
                    j = this.A02 + 10000;
                }
                this.A02 = j;
                C4N8 A0V = AbstractC58319PtB.A0V(this.A03, this.A04, "mqtt_radio_active_time");
                if (elapsedRealtime - this.A01 > 20000) {
                    this.A02 += A0V.getLong("total_wake_ms", 0L);
                    C91M ARA = A0V.ARA();
                    ARA.E7E("total_wake_ms", this.A02);
                    ARA.AIY();
                    this.A02 = 0L;
                    this.A01 = elapsedRealtime;
                }
                if (elapsedRealtime - A0V.getLong("last_log_ms", elapsedRealtime) > 3600000) {
                    this.A05.A06("mqtt_radio_active_time", AbstractC62801SRv.A01("total_wake_ms", Long.toString(A0V.getLong("total_wake_ms", 0L))));
                    C91M ARA2 = A0V.ARA();
                    ARA2.EEh("total_wake_ms");
                    ARA2.E7E("last_log_ms", elapsedRealtime);
                    ARA2.AIb("EstimateRadioActiveTimeHelper", "Failed to reset total wake time and write last log time to preferences");
                }
            }
        }
    }

    public C62700SMo(Context context, C74103Uo c74103Uo, RealtimeSinceBootClock realtimeSinceBootClock, C63306ShC c63306ShC, boolean z) {
        this.A03 = context;
        this.A05 = c63306ShC;
        this.A06 = realtimeSinceBootClock;
        this.A07 = z;
        this.A04 = c74103Uo;
        C4N8 A0V = AbstractC58319PtB.A0V(context, c74103Uo, "mqtt_radio_active_time");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A0V.getLong("last_log_ms", elapsedRealtime) >= elapsedRealtime) {
            C91M ARA = A0V.ARA();
            ARA.E7E("last_log_ms", elapsedRealtime);
            ARA.AIb("EstimateRadioActiveTimeHelper", "Failed to write last log time to preferences");
        }
    }
}
