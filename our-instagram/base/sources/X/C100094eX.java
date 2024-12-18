package X;

import android.os.Debug;
import android.os.SystemClock;

/* renamed from: X.4eX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100094eX {
    public static C100094eX A0E;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A00 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A01 = 0;
    public long A04 = 0;
    public long A07 = 0;

    public final void A00() {
        long parseLong;
        long parseLong2;
        long parseLong3;
        long parseLong4;
        long parseLong5;
        long parseLong6;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
            if (runtimeStat == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(runtimeStat);
            }
            String runtimeStat2 = Debug.getRuntimeStat("art.gc.gc-time");
            if (runtimeStat2 == null) {
                parseLong2 = 0;
            } else {
                parseLong2 = Long.parseLong(runtimeStat2);
            }
            String runtimeStat3 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
            if (runtimeStat3 == null) {
                parseLong3 = 0;
            } else {
                parseLong3 = Long.parseLong(runtimeStat3);
            }
            String runtimeStat4 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
            if (runtimeStat4 == null) {
                parseLong4 = 0;
            } else {
                parseLong4 = Long.parseLong(runtimeStat4);
            }
            String runtimeStat5 = Debug.getRuntimeStat("art.gc.bytes-allocated");
            if (runtimeStat5 == null) {
                parseLong5 = 0;
            } else {
                parseLong5 = Long.parseLong(runtimeStat5);
            }
            String runtimeStat6 = Debug.getRuntimeStat("art.gc.bytes-freed");
            if (runtimeStat6 == null) {
                parseLong6 = 0;
            } else {
                parseLong6 = Long.parseLong(runtimeStat6);
            }
            long j = this.A00;
            if (j > 0) {
                this.A05 = parseLong - this.A0C;
                this.A06 = parseLong2 - this.A0D;
                this.A02 = parseLong3 - this.A09;
                this.A03 = parseLong4 - this.A0A;
                this.A01 = parseLong5 - this.A08;
                this.A04 = parseLong6 - this.A0B;
                this.A07 = uptimeMillis - j;
            }
            this.A0C = parseLong;
            this.A0D = parseLong2;
            this.A09 = parseLong3;
            this.A0A = parseLong4;
            this.A08 = parseLong5;
            this.A0B = parseLong6;
            this.A00 = uptimeMillis;
        } catch (Throwable unused) {
        }
    }
}
