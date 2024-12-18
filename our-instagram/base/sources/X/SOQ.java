package X;

/* loaded from: classes10.dex */
public final class SOQ {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            SOQ soq = (SOQ) obj;
            if (soq.A01 != this.A01 || soq.A00 != this.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return AbstractC58321PtD.A08(this.A00, ((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return AnonymousClass001.A0Y("PeriodicityInfo{repeatIntervalMillis=", ", flexIntervalMillis=", '}', this.A01, this.A00);
    }

    public SOQ(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
