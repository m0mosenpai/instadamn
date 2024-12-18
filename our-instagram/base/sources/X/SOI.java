package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class SOI {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof SOI) || j != ((SOI) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A1C;
        String str;
        long j = this.A00;
        if (j < 1000) {
            A1C = AbstractC166987dD.A1C();
            A1C.append(j);
            str = " ns";
        } else {
            A1C = AbstractC166987dD.A1C();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (j < 10000000) {
                A1C.append(timeUnit.toMicros(j));
                str = " µs";
            } else {
                A1C.append(timeUnit.toMillis(j));
                str = " ms";
            }
        }
        return AbstractC166997dE.A0x(str, A1C);
    }

    public /* synthetic */ SOI(long j) {
        this.A00 = j;
    }
}
