package X;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public class THT implements Closeable {
    public static final Map A07 = AbstractC166987dD.A1G();
    public double A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04 = 2147483647L;
    public long A05 = -2147483648L;
    public final String A06;

    public THT(String str) {
        this.A06 = str;
    }

    public static void A00(THT tht) {
        tht.A01 = 0;
        tht.A00 = 0.0d;
        tht.A02 = 0L;
        tht.A04 = 2147483647L;
        tht.A05 = -2147483648L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!(this instanceof RNE)) {
            long j = this.A02;
            if (j != 0) {
                long A0L = AbstractC166987dD.A0L(SystemClock.elapsedRealtimeNanos()) - j;
                long A0L2 = AbstractC166987dD.A0L(SystemClock.elapsedRealtimeNanos());
                long j2 = this.A03;
                if (j2 != 0 && A0L2 - j2 >= 1000000) {
                    A00(this);
                }
                this.A03 = A0L2;
                int i = this.A01 + 1;
                this.A01 = i;
                double d = this.A00 + A0L;
                this.A00 = d;
                long min = Math.min(this.A04, A0L);
                this.A04 = min;
                long max = Math.max(this.A05, A0L);
                this.A05 = max;
                if (i % 50 == 0) {
                    String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.A06, Long.valueOf(A0L), Integer.valueOf(i), Long.valueOf(min), Long.valueOf(max), Integer.valueOf((int) (d / i)));
                    C62846STt.A00();
                }
                if (this.A01 % 500 == 0) {
                    A00(this);
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Did you forget to call start()?");
        }
    }
}
