package X;

import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.95u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2050595u {
    public long A01;
    public long A02;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final boolean A09;
    public boolean A03 = false;
    public int A00 = 2;
    public final C2050695w A08 = new C2050695w();

    public final void A00(int i) {
        if (!this.A03) {
            if (i <= 32767 && i >= -32768) {
                this.A00 = i;
                this.A03 = true;
                this.A01 = SystemClock.elapsedRealtime();
                this.A02 = SystemClock.elapsedRealtimeNanos();
                return;
            }
            throw new IllegalArgumentException("Action value must be between -32768 and 32767");
        }
        throw new RuntimeException(AnonymousClass001.A0n("Event with action: ", " and id: ", " already ended", i, this.A04));
    }

    public final void A01(String str, long j) {
        this.A08.A01.put(str, Long.valueOf(j));
    }

    public final void A02(String str, String str2) {
        this.A08.A02.put(str, str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event--->");
        sb.append("\n\tStartTime: ");
        long j = this.A06;
        sb.append(j);
        sb.append("\n\tEndTime: ");
        long j2 = this.A01;
        sb.append(j2);
        sb.append("\n\tDuration(Millis): ");
        sb.append(j2 - j);
        sb.append("\n\tDuration(Micros): ");
        sb.append((this.A02 - this.A07) / 1000);
        sb.append("\n\tId: ");
        sb.append(this.A04);
        sb.append("\n\tUniqueKey: ");
        sb.append(this.A05);
        sb.append("\n\tAction: ");
        sb.append(this.A00);
        sb.append("\n\t- StringParams:");
        C2050695w c2050695w = this.A08;
        for (Map.Entry entry : c2050695w.A02.entrySet()) {
            sb.append("\n\t\t");
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
        }
        sb.append("\n\t- DoubleParams:");
        for (Map.Entry entry2 : c2050695w.A00.entrySet()) {
            sb.append("\n\t\t");
            sb.append((String) entry2.getKey());
            sb.append(": ");
            sb.append(entry2.getValue());
        }
        sb.append("\n\t- LongParams:");
        for (Map.Entry entry3 : c2050695w.A01.entrySet()) {
            sb.append("\n\t\t");
            sb.append((String) entry3.getKey());
            sb.append(": ");
            sb.append(entry3.getValue());
        }
        return sb.toString();
    }

    public C2050595u(Integer num, int i, boolean z) {
        int intValue;
        this.A04 = i;
        if (num == null) {
            intValue = System.identityHashCode(this);
        } else {
            intValue = num.intValue();
        }
        this.A05 = intValue;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A01 = elapsedRealtime;
        this.A06 = elapsedRealtime;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.A02 = elapsedRealtimeNanos;
        this.A07 = elapsedRealtimeNanos;
        this.A09 = z;
    }
}
