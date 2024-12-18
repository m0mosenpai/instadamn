package X;

/* loaded from: classes11.dex */
public final class W5Q {
    public static final W5Q A02 = new W5Q(0, 0);
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            W5Q w5q = (W5Q) obj;
            if (this.A01 != w5q.A01 || this.A00 != w5q.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0t("[timeUs=", AbstractC43591JPw.A00(58), "]", this.A01, this.A00);
    }

    public W5Q(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
